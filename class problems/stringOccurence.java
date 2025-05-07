import java.util.HashMap;
import java.util.Map;

public class stringOccurence {
    public static void main(String[] args) {
        Map<Character, Integer> character = new HashMap<>();
        String a = "sssaaanjwasdad";
        int len = a.length();
        for (int i=0; i<len; i++){
            char c = a.charAt(i);
            character.put(c,character.getOrDefault(c,0)+1);            
        }
        System.out.println(character);
        for (char k:character.keySet()) {
            int x=character.get(k);
            System.out.println(k+" : "+x);
        }   
    }
}
