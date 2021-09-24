import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Contacts {

    public void readFromFile(Path filePath) {
        List<String> fileLines = new ArrayList<>();
        try {
            fileLines = Files.readAllLines(filePath);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        for (String line : fileLines) {
            System.out.println(line);
        }
    }

    private void currentContacts(Path filePath) {
        List<String> contacts = new ArrayList<>();
        try {
            contacts = Files.readAllLines(filePath);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
