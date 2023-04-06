@FunctionalInterface
public interface Command {
    void execute(Invoker invoker);
}
