import java.util.Scanner;

public class BmiCalculator {
    protected static double bmi(double height, double weight) {
        return weight / (height * height);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BMI CALCULATOR\n");
        System.out.print("Please, input the height: ");
        double height = scanner.nextDouble();

        System.out.print("Now you can input the weight: ");
        double weight = scanner.nextDouble();

        scanner.close();

        System.out.printf("Your BMI is %.2f%n", bmi(height, weight));
    }
}
