import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1:");
		double n1=scanner.nextDouble();
		System.out.println("Enter number2:");
		double n2=scanner.nextDouble();
		double power = Math.pow(n1,n2);
        System.out.println(power);
		scanner.close();
    }
}