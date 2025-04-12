import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = null;

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            arr = new int[size];

            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Enter the index to retrieve: ");
            int index = scanner.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.");
        } catch (NullPointerException e) {
            System.out.println("Error: Array is null.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
