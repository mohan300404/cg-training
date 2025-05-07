import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:");
		double radius=scanner.nextDouble();
		double area = Math.PI*Math.pow(radius,2);
        System.out.println(area);
		scanner.close();
    }
}