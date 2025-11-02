// Define the Encryptable interface
interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

// AES class implementing Encryptable
class AES implements Encryptable {
    public String encrypt(String data) {
        // Simple simulated AES encryption (reversing string + key marker)
        String encrypted = new StringBuilder(data).reverse().toString() + "_AES";
        System.out.println("Encrypting using AES...");
        return encrypted;
    }

    public String decrypt(String encryptedData) {
        // Remove AES marker and reverse again
        if (encryptedData.endsWith("_AES")) {
            String core = encryptedData.substring(0, encryptedData.length() - 4);
            return new StringBuilder(core).reverse().toString();
        } else {
            return "Invalid AES data!";
        }
    }
}

// RSA class implementing Encryptable
class RSA implements Encryptable {
    public String encrypt(String data) {
        // Simple simulated RSA encryption (shift characters by +2)
        StringBuilder encrypted = new StringBuilder();
        for (char c : data.toCharArray()) {
            encrypted.append((char) (c + 2));
        }
        System.out.println("Encrypting using RSA...");
        return encrypted.toString() + "_RSA";
    }

    public String decrypt(String encryptedData) {
        // Remove RSA marker and shift characters back by -2
        if (encryptedData.endsWith("_RSA")) {
            String core = encryptedData.substring(0, encryptedData.length() - 4);
            StringBuilder decrypted = new StringBuilder();
            for (char c : core.toCharArray()) {
                decrypted.append((char) (c - 2));
            }
            return decrypted.toString();
        } else {
            return "Invalid RSA data!";
        }
    }
}

// Main class
class Program279 {
    public static void main(String[] args) {
        String message = "JavaProgramming";

        // Create Encryptable objects
        Encryptable aes = new AES();
        Encryptable rsa = new RSA();

        // AES encryption and decryption
        String aesEncrypted = aes.encrypt(message);
        System.out.println("AES Encrypted: " + aesEncrypted);
        System.out.println("AES Decrypted: " + aes.decrypt(aesEncrypted));

        System.out.println();

        // RSA encryption and decryption
        String rsaEncrypted = rsa.encrypt(message);
        System.out.println("RSA Encrypted: " + rsaEncrypted);
        System.out.println("RSA Decrypted: " + rsa.decrypt(rsaEncrypted));
    }
}
