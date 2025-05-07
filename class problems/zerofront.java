import java.util.Scanner;
import java.util.Arrays;

public class zerofront {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		int[] a = {2,3,4,0,6,-3,6,0,7,4,7,0};
		int n = a.length;
		int index = n-1;
		int[] b = new int[n];
		for (int i=n-1; i>=0; i--) {
		    if (a[i] != 0) {
			    b[index]=a[i];
				index--;
			}
		}
		System.out.println(Arrays.toString(b));
		scanner.close();
	}
}