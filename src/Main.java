import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your starting string?");
        String response = scanner.nextLine();
        //On launch isTrue is set to true, running the exit method sets it to false, and kills the program
        while(isTrue) {
            //Method for printing the possible string workshop options
            menuPrinter(response);
            String stringProcess = scanner.nextLine();
            //Handles user menu selection
            //I originally had this written as an if, but intelliJ "corrected" it to a switch statement.
            //Honestly looks slightly cleaner, so I'll keep it
            switch (stringProcess) {
                case "A" -> response = addToString(response);
                case "B" -> checkStringForSubstring(response);
                case "C" -> lengthOfString(response);
                case "D" -> substringPostPrefix(response);
                case "E" -> substringPreSuffix(response);
                case "F" -> substringPostAndPrePrefix(response);
                default -> isTrue = exit();
            }
        }
    }
    public static void menuPrinter(String input){
        System.out.println("Your string is: \n");
        System.out.println(input + "\n");
        System.out.println("What would you like to do with your string?");
        System.out.println("A) Add more content to the string");
        System.out.println("B) Check if string contains a substring");
        System.out.println("C) Output the length of a string");
        System.out.println("D) Output the substring after a given prefix");
        System.out.println("E) Output the substring before a given prefix");
        System.out.println("F) Output the substring between a given prefix and suffix");
        System.out.println("G) Exit the program");

    }
    public static String addToString(String string) throws InterruptedException {
        //Combines user input string with user newString
        Scanner scanner = new Scanner(System.in);
        System.out.println("What string would you like to add to your base string?");
        String newString = scanner.nextLine();
        System.out.println("Here is your new string!");
        //Prints the old string concatted with the newString
        System.out.println(string + newString);
        Thread.sleep(2000);
        return string+newString;

    }

    public static void checkStringForSubstring(String string) throws InterruptedException {
        //Checks string for a substring using .contains()
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the substring you want to check for?");
        String substring = scanner.nextLine();
        if(string.contains(substring)) {
            System.out.println("Nice! The substring '" + substring + "' is present in the original string!");
        }
        else {
            System.out.println("Bummer! The substring '" + substring + "' is not present in the original string");
        }
        Thread.sleep(2000);

    }

    public static void lengthOfString(String string) throws InterruptedException {
        //Prints string length using .length()
        System.out.print("The length of your string is: ");
        System.out.println(string.length());
        Thread.sleep(2000);

    }

    public static void substringPostPrefix(String string) throws InterruptedException {
        //Returns a substring after a given prefix
        Scanner scanner = new Scanner(System.in);
        System.out.println("What prefix do you want to be mark the start of your substring?");
        String prefix = scanner.nextLine();
        //If prefix not in string, prints error
        //If prefix is in string, it prints the text following the prefix--excluding the prefix itself
        if (string.contains(prefix)) {
            //Prints the substring excluding the prefix by adding the length of the prefix to the starting index of the substring
            System.out.println("Here is the substring following the provided prefix '" + prefix + "': ");
            System.out.println(string.substring(string.indexOf(prefix) + prefix.length()));
        }
        else {
            System.out.println("I'm sorry but it appears there is no substring '" + prefix+ "' present in the original string:");
            System.out.println(string);
        }
        Thread.sleep(2000);


    }

    public static void substringPreSuffix(String string) throws InterruptedException {
        //Prints a substring preceding a given suffix. Excludes the suffix itself
        Scanner scanner = new Scanner(System.in);
        System.out.println("What prefix do you want to mark the end of your substring?");
        String suffix = scanner.nextLine();
        if (string.contains(suffix)) {
            System.out.println("Here is the substring preceding the provided prefix '" + suffix + "': ");
            System.out.println(string.substring(0, string.indexOf(suffix)));
        }
        else {
            System.out.println("I'm sorry but it appears there is no substring '" + suffix + "' present in the original string: ");
            System.out.println(string);
        }
        Thread.sleep(2000);
    }

    public static void substringPostAndPrePrefix(String string) throws InterruptedException {
        //Returns both sides of the string surrounding a prefix--excluding the prefix itself
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your prefix?");
        String prefix = scanner.nextLine();
        System.out.println("What is your suffix?");
        String suffix = scanner.nextLine();

        if (string.contains(prefix) & (string.contains(suffix))) {
            //Uses the same techniques as substringPostPrefix method and substringPreSuffix method, just prints the two results concatted together
            System.out.println("Here is the substring between the provided prefix '" + prefix + "', and suffix '" + suffix + "': ");
            String substring = string.substring(string.indexOf(prefix) + prefix.length(), string.indexOf(suffix) -1);
            System.out.println(substring);
        }
        else {
            System.out.println("I'm sorry but it appears either your prefix '" + prefix+ "' or your suffix  '" + suffix + "' is missing from the original string: ");
            System.out.println(string);
        }
        Thread.sleep(2000);
    }

    public static boolean exit(){
        //Closes the program
        return false;

    }
}
