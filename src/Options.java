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
        System.out.println("\u001B[31mThanks for using Contact Keeper!!!!\u001B[0m");

    }

    private void deleteContact() {
        System.out.println("Please enter the number for the contact you want to remove: ");
        int contactNumber = sc.nextInt();
        if(contactNumber < contacts.getCurrentContacts().size()) {
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
        System.out.println("Enter new contact info: ");
        String newContact = sc.nextLine();
        contacts.getCurrentContacts().add(newContact);
        contacts.showContacts();
    }
}
