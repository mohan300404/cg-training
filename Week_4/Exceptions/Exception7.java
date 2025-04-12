import java.util.Scanner;

public class Exception7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try{
            int res = num1/num2;
            System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println("Number cannot be divided by zero.");
        }finally{
            System.out.println("Opertaion completed.");
            sc.close();
        }
    }
}
