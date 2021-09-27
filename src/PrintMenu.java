public class PrintMenu {

    public static void printMenu() {
        System.out.println("\n📖 Main Menu");
        System.out.println(Colors.ANSI_BLUE + "1. " + Colors.ANSI_CYAN + "View contacts." + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "2. " + Colors.ANSI_CYAN + "Add a new contact." + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "3. " + Colors.ANSI_CYAN + "Search a contact by name." + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "4. " + Colors.ANSI_CYAN + "Delete an existing contact." + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "5. " + Colors.ANSI_CYAN + "Exit." + Colors.ANSI_RESET);
        System.out.println("Enter an option (1, 2, 3, 4 or 5)");
        System.out.print("> ");
    }
}

