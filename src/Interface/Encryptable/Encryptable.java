// Write a Java program to create an interface Encryptable with methods encrypt (String data) and
// decrypt (String encryptedData) that define encryption and decryption operations. Create two classes AES and
// RSA that implement the Encryptable interface and provide their own encryption and decryption algorithms.
package Interface.Encryptable;
interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}