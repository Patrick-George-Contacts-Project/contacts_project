import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class LoadContacts {
//public ArrayList<String> currentContacts;

    private String name;
    public List<String> currentContacts = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCurrentContacts() {
        return currentContacts;
    }

    public void setCurrentContacts(List<String> currentContacts) {
        this.currentContacts = currentContacts;
    }

    public void createContacts() {

        Path filePath = Paths.get("src/data", "contacts.txt");
        try {
            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


        try {
            currentContacts = Files.readAllLines(filePath);
        } catch (
                IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public void showContacts() {
        createContacts();
        for (String item : currentContacts) {
            System.out.println(item);
        }
    }

    public boolean searchContact(String name) {
        Iterator<String> listIterator = currentContacts.iterator();
        while (listIterator.hasNext()){
            String item = listIterator.next();
            if (item.contains(name)){
                return true;
            }
        }
        return false;
    }

  }

