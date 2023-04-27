public class File {

    final private String fileName;
    private EncryptionStrategy encryption = new AESEncryption();

    public void setEncryption(EncryptionStrategy encryption){
        this.encryption = encryption;
    }

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void encrypt() {
        if (encryption == null){
            throw new IllegalArgumentException("Encryption is not set");
        }
        encryption.encrypt(fileName);
    }

}
