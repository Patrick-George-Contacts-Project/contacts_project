import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Options {
    public void optionsMenu() {


        Contacts contacts = new Contacts();

        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        do {
            sc.nextLine();
            if (userInput == 1) {
                contacts.showContacts();
            } else if (userInput == 2) {
                System.out.println("Enter new contact info: ");

                String newContact = sc.nextLine();
                contacts.getCurrentContacts().add(newContact);
                contacts.showContacts();
            } else if (userInput == 3) {
                System.out.println("Input a contact name:");

                String contactName = sc.nextLine();
                List<String> matches = contacts.searchContact(contactName);
                if (matches.isEmpty()) {
                    System.out.println("Contact Not Present");
                } else {
                    for (String match : matches) {
                        System.out.println(match);
                    }
                }


            } else if (userInput == 4) {
                System.out.println("Please enter the number for the contact you want to remove: ");

                Integer contactNumber = sc.nextInt();
                contacts.removeContact(contactNumber);
                contacts.showContacts();
            } else if (userInput == 5) {
                break;
            }
            PrintMenu.printMenu();
            userInput = sc.nextInt();
        } while (userInput != 5);
        System.out.println("\u001B[31mThanks for using Contact Keeper!!!!\u001B[0m");

    }
}
