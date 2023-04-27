public class DESEncryption implements EncryptionStrategy {
    @Override
    public void encrypt(String fileName) {
        System.out.println("Applying DES encryption to " + fileName);
    }
}
