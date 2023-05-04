public abstract class AbstractClass {

     final public void templateMethod() {
        step1();
        if (step2()){
            step3();
            hook1();
        } else {
            step4();
            hook2();
        }
    }

    protected void step1(){
        System.out.println("Default method step1");
    }
    protected boolean step2(){
        return true;
    }
    abstract protected void step3();
    abstract protected void step4();

    protected void hook1(){
    }

    protected void hook2(){
    }
}
