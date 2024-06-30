import java.util.Scanner;

public class TemperatureConversion {
    protected static double toCelsius(double value) {
        return (value - 32) * 5/9;
    }

    protected static double toFahrenheit(double value) {
        return (value * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Conversion\n");

        int kind = 0;

        do {
            System.out.println("1 => Cesius to Fahrenheit");
            System.out.println("2 => Fahrenheit to Celsius");
            System.out.print("Which kind of convertion do you want to do? ");
            kind = scanner.nextInt();
        } while (kind < 1 || kind > 2);

        System.out.print("Please, input your temperature in " + (kind == 1 ? "Celsius" : "Fahrenheit") + " º: ");
        double value = scanner.nextDouble();

        scanner.close();
        
        System.out.printf("Converting you temperature to %s we have %.2fº", (kind == 2 ? "Celsius" : "Fahrenheit"), (kind == 1 ? toFahrenheit(value) : toCelsius(value)));
    }
}
