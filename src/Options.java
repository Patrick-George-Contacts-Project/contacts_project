import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Options extends LoadContacts{
    public void optionsMenu() {
        LoadContacts load = new LoadContacts();
        CodedMenu newMenu = new CodedMenu();
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        while (userInput != 5) {
            if (userInput == 1) {
                load.showContacts();
                newMenu.menuButCOded();
                userInput = sc.nextInt();
            } else if (userInput == 2) {
                System.out.println("Enter new contact info: ");
            } else if (userInput == 3) {
//                Path filePath = Paths.get("src/data", "contacts.txt");
////                List<String> currentContacts = new ArrayList<>();
//                try {
//                    currentContacts = Files.readAllLines(filePath);
//                } catch (
//                        IOException ioe) {
//                    ioe.printStackTrace();
                }
                System.out.println("Input a contact name.");
                String contactName = sc.nextLine();
                boolean ans =  currentContacts.contains(contactName);
                if (ans){
                    System.out.println(cu);
                }
            } else if (userInput == 4) {
                System.out.println("Option 4");
            } else if (userInput == 5) {
                System.out.println("Thanks for using Contact Keeper");
            }
        }
    }
}
