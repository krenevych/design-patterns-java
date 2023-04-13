public interface Component {
    void broadcastMessage(String message); // як правило Команда (в контексті шаблону проєктування Команда)
    void handleMessage(Component componentFrom, String message);
}
