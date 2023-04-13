public interface Mediator {
    void broadcast(Component componentFrom,
                   String message);
}
