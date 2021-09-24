import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Options extends LoadContacts{
    public void optionsMenu() {


        LoadContacts currentList = new LoadContacts();

        PrintMenu newMenu = new PrintMenu();
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();
        do {
            if (userInput == 1) {
                currentList.showContacts();
                newMenu.printMenu();
                userInput = sc.nextInt();
            } else if (userInput == 2) {
                System.out.println("Enter new contact info: ");
                sc.nextLine();
                String newContact = sc.nextLine();

                showContacts();

                newMenu.printMenu();
                userInput = sc.nextInt();
            } else if (userInput == 3) {
                System.out.println("Input a contact name.");
                sc.nextLine();
                String contactName = sc.nextLine();
                if(currentList.searchContact(contactName) == true) {
                    System.out.println("Contact Exists");
                } else {
                    System.out.println("Contact Not Present");
                }
                System.out.println("Press Enter");
                sc.nextLine();
                newMenu.printMenu();
                userInput = sc.nextInt();
            } else if (userInput == 4) {
                System.out.println("Option 4");
                newMenu.printMenu();
                userInput = sc.nextInt();
            } else if (userInput == 5) {
                break;
            }
        } while (userInput != 5);
        System.out.println("Thanks for using Contact Keeper");
    }
}
