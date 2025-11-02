import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Program299 {

    // Simple concurrent crawler using only JDK (Java 11+)
    static class Crawler {
        private final ExecutorService pool;
        private final HttpClient http;
        private final Set<String> visited = ConcurrentHashMap.newKeySet();
        private final AtomicInteger pendingTasks = new AtomicInteger(0);

        private final int maxDepth;
        private final int maxPages;

        // Basic href extractor (not a full HTML parser—good enough for demo)
        private static final Pattern LINK_PATTERN =
                Pattern.compile("(?i)href\\s*=\\s*\"([^\"]+)\"");

        Crawler(int threads, int maxDepth, int maxPages) {
            this.pool = Executors.newFixedThreadPool(threads);
            this.http = HttpClient.newBuilder()
                    .followRedirects(HttpClient.Redirect.NORMAL)
                    .connectTimeout(Duration.ofSeconds(5))
                    .build();
            this.maxDepth = maxDepth;
            this.maxPages = maxPages;
        }

        public void crawl(List<String> seeds) {
            for (String url : seeds) {
                schedule(url, 0, null);
            }

            // Wait for all scheduled tasks to finish
            try {
                while (pendingTasks.get() > 0) {
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                pool.shutdown();
            }
        }

        private void schedule(String url, int depth, URI parent) {
            if (depth > maxDepth) return;

            // Normalize/resolve relative links if needed
            String normalized = normalize(url, parent);
            if (normalized == null) return;

            // Enforce scheme and deduplicate
            if (!normalized.startsWith("http://") && !normalized.startsWith("https://")) return;
            if (!visited.add(normalized)) return; // already seen
            if (visited.size() > maxPages) return; // stop expanding after cap

            pendingTasks.incrementAndGet();

            pool.submit(() -> {
                try {
                    fetchAndProcess(normalized, depth);
                } finally {
                    pendingTasks.decrementAndGet();
                }
            });
        }

        private void fetchAndProcess(String url, int depth) {
            try {
                HttpRequest req = HttpRequest.newBuilder(URI.create(url))
                        .timeout(Duration.ofSeconds(8))
                        .header("User-Agent", "SimpleCrawler/1.0 (+java)")
                        .GET()
                        .build();

                HttpResponse<String> resp = http.send(req, HttpResponse.BodyHandlers.ofString());
                int code = resp.statusCode();
                System.out.printf("[Depth %d] %s  -> HTTP %d%n", depth, url, code);

                if (code >= 200 && code < 300) {
                    String body = resp.body();
                    // Extract and schedule links
                    Matcher m = LINK_PATTERN.matcher(body);
                    while (m.find()) {
                        if (visited.size() >= maxPages) break;
                        String link = m.group(1).trim();
                        schedule(link, depth + 1, req.uri());
                    }
                }
            } catch (HttpTimeoutException te) {
                System.out.printf("[Timeout] %s%n", url);
            } catch (Exception e) {
                System.out.printf("[Error] %s  (%s)%n", url, e.getClass().getSimpleName());
            }
        }

        private static String normalize(String url, URI base) {
            try {
                if (base == null) {
                    return URI.create(url).toString();
                } else {
                    return base.resolve(url).toString();
                }
            } catch (Exception e) {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        // Configuration
        int threads   = Math.max(2, Runtime.getRuntime().availableProcessors());
        int maxDepth  = 2;   // how deep to follow links
        int maxPages  = 100; // global cap to avoid runaway crawling

        // Seed URLs (you can edit or accept from args/input)
        List<String> seeds = new ArrayList<>();
        seeds.add("https://example.com/");
        seeds.add("https://www.wikipedia.org/");

        System.out.printf("Starting crawl with %d threads, depth=%d, maxPages=%d%n",
                threads, maxDepth, maxPages);

        Crawler crawler = new Crawler(threads, maxDepth, maxPages);
        crawler.crawl(seeds);

        System.out.println("Crawl complete.");
    }
}
