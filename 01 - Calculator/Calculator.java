import java.util.Scanner;

public class Calculator {
    protected static double sum(double num1, double num2) {
        return num1 + num2;
    }

    protected static double difference(double num1, double num2) {
        return num1 - num2;
    }

    protected static double product(double num1, double num2) {
        return num1 * num2;
    }
    
    protected static double quotient(double num1, double num2) {
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MY FIRST CALCULATOR USING JAVA\n");
        System.out.print("Please, input the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Now you can input the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Witch operation would you like to calculate? (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();

        double result = 0;
        switch (operator) {
            case '+':
                result = sum(num1, num2);
                break;
            case '-':
                result = difference(num1, num2);
                break;
            case '*':
                result = product(num1, num2);
                break;
            case '/':
                result = quotient(num1, num2);
                break;
            default:
                break;
        }

        System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);
    }
}
