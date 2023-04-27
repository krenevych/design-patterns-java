public class RSAEncryption implements EncryptionStrategy {
    @Override
    public void encrypt(String fileName) {
        System.out.println("Applying RSA encryption to " + fileName);
    }
}
