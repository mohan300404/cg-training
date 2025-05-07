import java.util.Scanner;

public class Addtwonos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no1:");
		int n1=scanner.nextInt();
        System.out.println("Enter no2:");
		int n2=scanner.nextInt();
		int sum = n1+n2;
        System.out.println(sum);
    scanner.close();
	}
}