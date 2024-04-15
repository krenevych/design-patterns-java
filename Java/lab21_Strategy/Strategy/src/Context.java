public class Context {
    private Strategy strategy;
    private String data = "";

    public void setData(String data) {
        this.data = data;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void doSomething(){
        if (strategy != null){
            strategy.execute(data);
        }
    }

}
