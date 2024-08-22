package Interface.Encryptable;
public class Main {
    public static void main(String[] args) {
        Encryptable aes = new AES();
        String encryptedDataAES = aes.encrypt("Java Interfaces.");
        System.out.println("AES Encrypted: " + encryptedDataAES);
        String decryptedDataAES = aes.decrypt(encryptedDataAES);
        System.out.println("AES decrypted: " + decryptedDataAES);
        Encryptable rsa = new RSA();
        String encryptedDataRSA = rsa.encrypt("Java Interfaces.");
        System.out.println("RSA Encrypted: " + encryptedDataRSA);
        String decryptedDataRSA = rsa.decrypt(encryptedDataRSA);
        System.out.println("RSA decrypted: " + decryptedDataRSA);
    }
}