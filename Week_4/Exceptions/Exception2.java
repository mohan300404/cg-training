import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try{
            int res = num1/num2;
            System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println("Number cannot be divided by zero.");
        }catch(InputMismatchException  e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
