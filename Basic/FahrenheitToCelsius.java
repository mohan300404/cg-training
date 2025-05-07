import java.util.Scanner;

public class FahrenheitToCelsius{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "degree F is equal to " + celsius + "degree C");
        scanner.close();
    }
} 