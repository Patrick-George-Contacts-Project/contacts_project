import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class LoadContacts {
//public ArrayList<String> currentContacts;

    public String name;
//    public static List<String> currentContacts;
//        WHAT EVEN IS THIS CRAP
    public static List<String> currentContacts = new ArrayList<>();
        try {
        List<String> currentContacts = Files.readAllLines(filePath);
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }

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
   Path filePath = Paths.get("src/data", "contacts.txt");

    public void createContacts() {


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

