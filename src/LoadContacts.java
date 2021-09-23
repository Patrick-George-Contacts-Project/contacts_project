import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LoadContacts {

    public void showContacts() {

        Path filePath = Paths.get("src/data", "contacts.txt");
        try {
            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        List<String> currentContacts = new ArrayList<>();
        try {
            currentContacts = Files.readAllLines(filePath);
        } catch (
                IOException ioe) {
            ioe.printStackTrace();
        }
        for (String item : currentContacts) {
            System.out.println(item);
        }
    }
}
