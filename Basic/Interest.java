import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
		double P=scanner.nextDouble();
		System.out.println("Enter Rate of Interest:");
		double R=scanner.nextDouble();
		System.out.println("Enter Time:");
		double T=scanner.nextDouble();
		double SI = (P*R*T)/100;
        System.out.println(SI);
		scanner.close();
    }
}