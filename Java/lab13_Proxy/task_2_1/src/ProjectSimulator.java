import java.util.Random;

public class ProjectSimulator {

    interface ProjectFactory{
        Project createProject(String url);
    }

    static class RealProjectFactory implements ProjectFactory{

        @Override
        public Project createProject(String url) {
            return new RealProject(url);
        }
    }

    static class ProjectProjectFactory implements ProjectFactory{

        @Override
        public Project createProject(String url) {
            return new ProxyProject(url);
        }
    }

    public static void main(String[] args) {

//        ProjectFactory factory = new RealProjectFactory();
        ProjectFactory factory = new ProjectProjectFactory();


        Project[] projects = {
                factory.createProject("github.com/krenevych/project1"),
                factory.createProject("github.com/krenevych/project2"),
                factory.createProject("github.com/krenevych/project3"),
                factory.createProject("github.com/krenevych/project4"),
                factory.createProject("github.com/krenevych/project5"),
                factory.createProject("github.com/krenevych/project6"),
        };

        Random random = new Random();
        int projectNum = random.nextInt(projects.length);
        projects[projectNum].run();
    }
}
