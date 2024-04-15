public class File {

    final private String fileName;
    private Encryption encryption;
    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void encrypt() {
        if (encryption != null){
            encryption.encrypt(fileName);
        }
    }

}
