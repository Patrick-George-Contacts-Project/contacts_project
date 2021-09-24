import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactsTest {

    public static void main(String[] args) {


        Path directoryPath = Paths.get("src/data");
        try {
            if (Files.notExists(directoryPath)) {
                Files.createDirectories(directoryPath);
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        LoadContacts contacts = new LoadContacts();

        LoadContacts create = new LoadContacts();
        create.createContacts();


        Path menuPath = Paths.get("src/data", "menu.txt");
        Menu menu = new Menu();
        menu.readFromFile(menuPath);

        System.out.printf("Enter choice> ");



        Options options = new Options();
        options.optionsMenu();
//
//
//
//        List<String> contacts = Arrays.asList(
//                "\nName | Phone number",
//                "---------------",
//                "Jack Blank | 1231231234",
//                "Jane Doe | 2342342345",
//                "Sam Space | 3453453456"
//        );
//
//        try {
//            Files.write(filePath, contacts);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//
//        Contacts reader = new Contacts();
//        reader.readFromFile(filePath);

//        try {
//            Files.writeString(filePath, "Tony Stark | 9095551234", StandardOpenOption.APPEND);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//        reader.readFromFile(filePath);

        //            try {
//                Files.writeString(filePath, newContact, StandardOpenOption.APPEND);
//            } catch (IOException ioe) {
//                ioe.printStackTrace();
//            }
    }
}
