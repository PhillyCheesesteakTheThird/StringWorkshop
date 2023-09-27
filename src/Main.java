import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your starting string?");
        String response = scanner.nextLine();
        menuPrinter(response);
        response = scanner.nextLine();

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
}
