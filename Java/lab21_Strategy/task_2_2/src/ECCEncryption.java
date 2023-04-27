public class ECCEncryption implements EncryptionStrategy {
    @Override
    public void encrypt(String fileName) {
        System.out.println("Applying ECC encryption to " + fileName);
    }
}
