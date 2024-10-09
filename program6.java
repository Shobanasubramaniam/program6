import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter the string (containing consecutive lowercase letters except one): ");
        String input = scanner.nextLine();

        // Sort the input string to ensure letters are in order
        char[] letters = input.toCharArray();
        java.util.Arrays.sort(letters);

        // Find the missing letter by comparing consecutive characters
        char missingLetter = ' ';
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i + 1] != letters[i] + 1) {
                missingLetter = (char) (letters[i] + 1);
                break;
            }
        }

        // If no missing letter is found between characters, check the last missing letter
        if (missingLetter == ' ') {
            missingLetter = (char) (letters[letters.length - 1] + 1);
        }

        // Output the missing letter
        System.out.println("The missing letter is: " + missingLetter);

        scanner.close();
    }
}
