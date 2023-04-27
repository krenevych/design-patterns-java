public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    private String data = "";
    public void setData(String data){
        this.data = data;
    }

    void doSomething(){
        if (strategy != null){
            strategy.execute(data);
        } else {
            throw new IllegalArgumentException("Strategy is not set!");
        }
    }

}
