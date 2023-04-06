public class CommandCancel implements Command {

    @Override
    public void execute(Invoker invoker) {
        System.out.println(invoker.getWho() + ": дія Cancel");
    }
}
