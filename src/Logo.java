import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logo {

    public static void printLogo() {
        Path menuPath = Paths.get("src/data", "logo.txt");
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