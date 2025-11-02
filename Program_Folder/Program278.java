// Define the Searchable interface
interface Searchable {
    void search(String keyword);
}

// Document class implementing Searchable
class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void search(String keyword) {
        System.out.println("Searching in Document...");
        if (content.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Keyword \"" + keyword + "\" found in the document!");
        } else {
            System.out.println("Keyword \"" + keyword + "\" not found in the document.");
        }
    }
}

// WebPage class implementing Searchable
class WebPage implements Searchable {
    private String htmlContent;

    public WebPage(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public void search(String keyword) {
        System.out.println("Searching in WebPage...");
        if (htmlContent.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Keyword \"" + keyword + "\" found in the web page!");
        } else {
            System.out.println("Keyword \"" + keyword + "\" not found in the web page.");
        }
    }
}

// Main class
class Program278 {
    public static void main(String[] args) {
        // Create a Document and WebPage object
        Document doc = new Document("Java is a powerful programming language.");
        WebPage web = new WebPage("<html><body>Learn Java programming online!</body></html>");

        // Search for a keyword in both
        doc.search("Java");
        System.out.println();
        web.search("Python");
    }
}
