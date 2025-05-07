import java.util.Scanner;

public class Perimeter{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length:");
		double l=scanner.nextDouble();
		System.out.println("Enter width:");
		double w=scanner.nextDouble();
		double perimeter = 2*(l+w);
        System.out.println(perimeter);
		scanner.close();
    }
}