import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your starting string?");
        String response = scanner.nextLine();
        while(isTrue) {
            menuPrinter(response);
            String stringProcess = scanner.nextLine();
            if (stringProcess.equals("A")) {
                addToString(response);
            } else if (stringProcess.equals("B")) {
                checkStringForSubstring(response);
            } else if (stringProcess.equals("C")) {
                lengthOfString(response);
            } else if (stringProcess.equals("D")) {
                substringPostPrefix(response);
            } else if (stringProcess.equals("E")) {
                substringPrePrefix(response);
            } else if (stringProcess.equals("F")) {
                substringPostAndPrePrefix(response);
            } else {
                isTrue = exit();
            }
        }







    }
    public static void menuPrinter(String input){
        System.out.println("The string you inputted is: \n");
        System.out.println(input + "\n");
        System.out.println("What would you like to do with your string?");
        System.out.println("A) Add more content to the string");
        System.out.println("B) Check if string contains a substring");
        System.out.println("C) Output the length of a string");
        System.out.println("D) Output the substring after a given prefix");
        System.out.println("E) Output the substring before a given prefix");
        System.out.println("F) Output the substring before and after a given prefix and suffix");
        System.out.println("G) Exit the program");

    }
    public static void addToString(String string) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What string would you like to add to your base string?");
        String newString = scanner.nextLine();
        System.out.println("Here is your new string!");
        System.out.println(string + newString);
        Thread.sleep(2000);

    }

    public static void checkStringForSubstring(String string) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the substring you want to check for?");
        String substring = scanner.nextLine();
        if(string.contains(substring)) {
            System.out.println("Nice! Your substring '" + substring + "' is present in your original string!");
        }
        else {
            System.out.println("Bummer! Your substring '" + substring + "' is not present in the original string");
        }
        Thread.sleep(2000);

    }

    public static void lengthOfString(String string) throws InterruptedException {
        System.out.print("The length of your string is: ");
        System.out.println(string.length());
        Thread.sleep(2000);

    }

    public static void substringPostPrefix(String string) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What prefix do you want to be mark the start of your substring?");
        String prefix = scanner.nextLine();
        if (string.contains(prefix)) {
            System.out.println("Here is the substring following the provided prefix '" + prefix + "': ");
            System.out.println(string.substring(string.indexOf(prefix) + prefix.length()));
        }
        else {
            System.out.println("I'm sorry but it appears there is no substring '" + prefix+ "' present in the original string:");
            System.out.println(string);
        }
        Thread.sleep(2000);


    }

    public static void substringPrePrefix(String string) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What prefix do you want to mark the end of your substring?");
        String prefix = scanner.nextLine();
        if (string.contains(prefix)) {

            System.out.println("Here is the substring preceding the provided prefix '" + prefix + "': ");
            System.out.println(string.substring(0, string.indexOf(prefix)));
        }
        else {
            System.out.println("I'm sorry but it appears there is no substring '" + prefix+ "' present in the original string: ");
            System.out.println(string);

        }
        Thread.sleep(2000);


    }

    public static void substringPostAndPrePrefix(String string) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What string do you want to mark the seperation of your string?");
        String stringSeperator = scanner.nextLine();
        if (string.contains(stringSeperator)) {

            System.out.println("Here is the substring preceding and following the the provided prefix '" + stringSeperator + "': ");
            String preceding = string.substring(0, string.indexOf(stringSeperator));
            String following = string.substring(string.indexOf(stringSeperator) + stringSeperator.length());
            System.out.println(preceding + following);
        }
        else {
            System.out.println("I'm sorry but it appears there is no substring '" + stringSeperator+ "' present in the original string: ");
            System.out.println(string);
        }
        Thread.sleep(2000);


    }

    public static boolean exit(){
        return false;

    }





}
