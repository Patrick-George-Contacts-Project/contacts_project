import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public void readFromFile(Path menuPath) {
        List<String> fileLines = new ArrayList<>();
        try {
            fileLines = Files.readAllLines(menuPath);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        for (String line : fileLines) {
            System.out.println(line);
        }
    }
}