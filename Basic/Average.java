import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1:");
		double n1=scanner.nextDouble();
		System.out.println("Enter number2:");
		double n2=scanner.nextDouble();
		System.out.println("Enter number3:");
		double n3=scanner.nextDouble();
		double average = (n1+n2+n3)/3;
        System.out.println(average);
		scanner.close();
    }
}