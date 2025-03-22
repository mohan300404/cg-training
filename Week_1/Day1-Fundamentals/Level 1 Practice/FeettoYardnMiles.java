import java.util.Scanner;

public class FeettoYardnMiles{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
	    double distanceInFeet = scanner.nextInt();
		double yard = distanceInFeet / 3;
		double mile = yard / 1760;
		System.out.println("The distance in feet is " + distanceInFeet + " and in yards it is " + yard + " and in miles it is " + mile);
	scanner.close();
	}
}