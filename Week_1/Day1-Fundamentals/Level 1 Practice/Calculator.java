import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number1:");
		double number1 = scanner.nextDouble();
		System.out.println("Enter Number2:");
		double number2 = scanner.nextDouble();
		double add = number1 + number2;
		double sub = number1 - number2;
		double mul = number1 * number2;
		double div = number1 / number2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers" + number1 + " and " + number2 + " is " +add+ " , "+sub+ " , " +mul+ " and " +div);
		scanner.close();
	}
}