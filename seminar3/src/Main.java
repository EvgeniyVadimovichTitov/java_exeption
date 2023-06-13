import controller.Controller;
import model.FileOperation;
import model.Mapper;
import model.RepositoryFile;
import view.View;

public class Main {

    public static void main(String[] args) {
        View v = new View(new Controller(new RepositoryFile(new Mapper(), new FileOperation())));
        v.run();

    }
}