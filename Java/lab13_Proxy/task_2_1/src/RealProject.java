/**
 * Конкретний реальний проект, що реалізує інтерфейс Project
 */
public class RealProject implements Project {

    /**
     * Адреса проєкту на віддаленому сервері
     */
    private final String url;

    public RealProject(String url) {
        this.url = url;
        System.out.println("Loading project " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("\nRunning project " + url + "...");
    }
}
