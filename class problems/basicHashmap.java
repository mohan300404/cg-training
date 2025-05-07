import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class basicHashmap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> price = new HashMap<>();
        Map<String, Integer> kilos = new HashMap<>();
        int n = input.nextInt();
        int total=0;
        int tkgs=0;
        for (int i=0; i<n; i++){
            String b = input.next();
            int p = input.nextInt();
            int k = input.nextInt();
            price.put(b,p);
            kilos.put(b,k);
        }
        for (String k:kilos.keySet()) {
            int x=kilos.get(k);
            int y=price.get(k);
            total+=x*y;
        }
        for (String j:kilos.keySet()){
            int z=kilos.get(j);
            tkgs+=z;
        }
        System.out.println(price);
        System.out.println(kilos);
        System.out.println("Total Price "+total+"rs.");
        System.out.println("Total Kilos "+tkgs+"kgs");
        input.close();
    }
}