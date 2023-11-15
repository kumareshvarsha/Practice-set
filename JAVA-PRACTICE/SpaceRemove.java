import java.util.Scanner;

public class SpaceRemove {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();

        // Remove all spaces from the input string
        String stringWithoutSpaces = input.replaceAll("\\s", "");

        System.out.println("String without spaces: " + stringWithoutSpaces);
    }
}
