import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindromer\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word for checking: ");
        String word = scanner.nextLine().toLowerCase(), newWord = "";

        scanner.close();

        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }

        System.out.printf("%s is %spalindrome, because its invertion is equal to '%s'.", word, (word.equals(newWord) ? "" : "not "), newWord);
    }
}
