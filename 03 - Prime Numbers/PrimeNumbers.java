import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime Numbers\n");

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isPrime = true;

        while (number < 1 || number > 32000) {
            System.out.print("Enter a number between 1 and 32000: ");
            number = scanner.nextInt();
        }
        
        scanner.close();

        if (number > 3) {
            for (int i = 2; i <= (int) (number / 2); i++) {
                if(number % i == 0) {
                    isPrime = false;
                }
            }
        }

        System.out.printf("The number %d is %sprime.", number, (isPrime ? "" : "not "));
    }
}