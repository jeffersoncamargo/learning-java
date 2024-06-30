import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Prime Numbers\n");

        Scanner scanner = new Scanner(System.in);
        int quantity = 0;
        int number = 1;
        int previous = 0;

        while (quantity < 1 || quantity > 1000) {
            System.out.print("How many numbers of the Fibonacci sequence do you want to see? Enter a number between 1 and 1000: ");
            quantity = scanner.nextInt();
        }

        scanner.close();
        
        for (int i = 1; i <= (int) quantity; i++) {
            System.out.printf("%s%d", (i > 1 ? ", " : ""), number);

            int tmp = previous;
            previous = number;
            number += tmp;
        }
    }
}
