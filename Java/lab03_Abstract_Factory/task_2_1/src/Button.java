abstract public class Button {

    public void setTitle(String title) {
        this.title = title;
    }

    private String title = "Button";


    public void press(){
        System.out.printf("Button %s pressed%n", title);
    }

}
