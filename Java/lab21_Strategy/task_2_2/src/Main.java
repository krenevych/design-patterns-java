public class Main {

  public static void main(String[] args) {
    File file = new File("test.pdf");
    file.setEncryption(new AES());
    file.encrypt();
    file.setEncryption(new DES());
    file.encrypt();
  }

}
