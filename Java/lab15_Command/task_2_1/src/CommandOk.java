public class CommandOk implements Command {

    @Override
    public void execute(Invoker invoker) {
        System.out.println(invoker.getWho() + ":дія ОК");
    }
}
