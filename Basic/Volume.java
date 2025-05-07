import java.util.Scanner;

public class Volume{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:");
		double radius=scanner.nextDouble();
		System.out.println("Enter height:");
		double height=scanner.nextDouble();
		double volume = Math.PI*Math.pow(radius,2)*height;
        System.out.println(volume);
		scanner.close();
    }
}