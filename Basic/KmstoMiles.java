import java.util.Scanner;

public class KmstoMiles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in Kilometers:");
		double d=scanner.nextDouble();
		double miles = d*0.621371;
        System.out.println(miles);
		scanner.close();
    }
}