import java.util.List;
import java.util.Scanner;

public class Options {
    public void optionsMenu() {


        Contacts contacts = new Contacts();

        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();
        do {
            if (userInput == 1) {
                contacts.showContacts();
            } else if (userInput == 2) {
                System.out.println("Enter new contact info: ");
                sc.nextLine();
                String newContact = sc.nextLine();
                contacts.getCurrentContacts().add(newContact);
                contacts.showContacts();
            } else if (userInput == 3) {
                System.out.println("Input a contact name.");
                sc.nextLine();
                String contactName = sc.nextLine();
                List<String> matches = contacts.searchContact(contactName);
                if (matches.isEmpty()) {
                    System.out.println("Contact Not Present");
                } else {
                    matches.forEach(match -> System.out.println(match));
                }
                System.out.println("Press Enter");
                sc.nextLine();
            } else if (userInput == 4) {
                System.out.println("Please enter the contact you want to remove");
                sc.nextLine();
                Integer contactNumber = sc.nextInt();
                contacts.removeContact(contactNumber);
                contacts.showContacts();
            } else if (userInput == 5) {
                break;
            }
            PrintMenu.printMenu();
            userInput = sc.nextInt();
        } while (userInput != 5);
        System.out.println("Thanks for using Contact Keeper");
    }
}
