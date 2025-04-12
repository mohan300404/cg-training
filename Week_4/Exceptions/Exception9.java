import java.util.Scanner;

public class Exception9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter the index: ");
        int index = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        try {
            int value = arr[index];
            try {
                int result = value / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index");
        }

        sc.close();
    }
}
