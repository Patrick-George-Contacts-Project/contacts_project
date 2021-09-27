import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Contacts {

    private List<String> currentContacts;

    public Contacts() {
        createContacts();
    }

    public List<String> getCurrentContacts() {
        return currentContacts;
    }

    public void createContacts() {
        Path directoryPath = Paths.get("src/data");
        Path filePath = Paths.get("src/data", "contacts.txt");
        try {
            if (Files.notExists(directoryPath)) {
                Files.createDirectories(directoryPath);
            }
            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
            }
            currentContacts = Files.readAllLines(filePath);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public void showContacts() {
        System.out.println("\nName\t\t | Phone Number");
        System.out.println("========================");
        for (int i = 0; i < currentContacts.size(); i++) {
            System.out.println((i + 1) + ": " + currentContacts.get(i));
        }

    }

    public List<String> searchContact(String userInput) {
        List<String> matches = new ArrayList<>();
        for (String contact : currentContacts) {
            if (contact.toLowerCase().contains(userInput.toLowerCase())) {
                matches.add(contact);
            }
        }
        return matches;
    }

    public void removeContact(Integer contactNumber) {
        currentContacts.remove(contactNumber - 1);

    }

  }

