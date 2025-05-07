import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class cricket {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Enter a no.");
    int out = 0;
    int total = 0;
    ArrayList<Integer> scores = new ArrayList<>();

    while (out<10) {
        int num = rand.nextInt(8) - 1;
        if (num == 1){
            continue;
        }
        else if (num == -1){
            out+=1;
        }
        else if(num == 0){
            scores.add(0);
        }
        else {
            scores.add(num);
            total+= num;
        }        
    }
    

    sc.close();
    }
}
