public class PrintMenu {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void printMenu() {
        System.out.println("\n📖 Main Menu");
        System.out.println(ANSI_BLUE + "1. " + ANSI_CYAN + "View contacts." + ANSI_RESET);
        System.out.println(ANSI_BLUE + "2. " + ANSI_CYAN + "Add a new contact." + ANSI_RESET);
        System.out.println(ANSI_BLUE + "3. " + ANSI_CYAN + "Search a contact by name." + ANSI_RESET);
        System.out.println(ANSI_BLUE + "4. " + ANSI_CYAN + "Delete an existing contact." + ANSI_RESET);
        System.out.println(ANSI_BLUE + "5. " + ANSI_CYAN + "Exit." + ANSI_RESET);
        System.out.println("Enter an option (1, 2, 3, 4 or 5)");
        System.out.print("> ");
    }
}

