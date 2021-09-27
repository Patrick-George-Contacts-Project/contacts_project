import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class Options {

    private Contacts contacts = new Contacts();
    private Scanner sc = new Scanner(System.in);

    public void optionsMenu() {

        int userInput;
        do {
            PrintMenu.printMenu();
            userInput = sc.nextInt();
            sc.nextLine();
            if (userInput == 1) {
                contacts.showContacts();
            } else if (userInput == 2) {
                addContact();
            } else if (userInput == 3) {
                searchContact();
            } else if (userInput == 4) {
                deleteContact();
            }
        } while (userInput != 5);
        System.out.println(Colors.ANSI_PURPLE + "Thanks for using Contact Keeper!!!!" + Colors.ANSI_RESET);
        contacts.saveContacts();
    }

    private void deleteContact() {
        System.out.println("Please enter the number for the contact you want to remove: ");
        int contactNumber = sc.nextInt();
        if(contactNumber < contacts.getCurrentContacts().size() + 1 ) {
            contacts.removeContact(contactNumber);
        } else {
            System.out.println("Contact not found.");
        }
        contacts.showContacts();
    }

    private void searchContact() {
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
    }

    private void addContact() {
        System.out.println("Enter new contact name: ");
        String newContact = sc.nextLine();
        System.out.println("Enter new phone number ");
        String newNumber = sc.nextLine();
        contacts.getCurrentContacts().add(newContact + " | " + newNumber);
        contacts.showContacts();
    }
}
