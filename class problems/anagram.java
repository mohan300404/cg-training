import java.util.HashMap;
import java.util.Map;

public class anagram {
    public static void main(String[] args) {
        Map<Character, Integer> ms1 = new HashMap<>();
        Map<Character, Integer> ms2 = new HashMap<>();
        String s1 = "silent";
        String s2 = "listen";
        int ls1 = s1.length();
        int ls2 = s2.length();

        if (ls1!=ls2){
            System.out.println("Not Anagram");
        } else {
            for (int i=0;i<ls1;i++){
            char cs1 = s1.charAt(i);
            char cs2 = s2.charAt(i);
            ms1.put(cs1, ms1.getOrDefault(cs1,0)+1);
            ms2.put(cs2, ms2.getOrDefault(cs2,0)+1);
        }
        if (ms1.equals(ms2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        }
        System.out.println(ms1);
        System.out.println(ms2);
    }
}
