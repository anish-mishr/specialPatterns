package specialPatterns;
import java.util.*;
/*
 * @author Anish
 *
 */

public class RigthTriangleDown {
//	This Program prints Right Triangle DownWards
	public static void printStars(int n) {		// Static Method
		int rows, cols;
//		<--			Driver Code		-->
		for(rows=n-1;rows>=0;rows--) {
			for(cols=0;cols<=rows;cols++) {
				System.out.print("* "); // prints the star
			}
			System.out.println();//prints a new line
		}
	}
//	MAIN METHOD
	public static void main(String[] args) {
//		Program to Print Right Triangle
		// Sample Pattern
/*
 		* * * *
 		* * *
 		* *
 		* 
 */
		int hght;
		System.out.print(" How many lines (*) should be printed in pyramid :");
		Scanner sc = new Scanner(System.in);
		
//		Get the height of Triangle from user
		hght = sc.nextInt(); // Stores the user input
		sc.close();
		System.out.println("\t <=====   =====   =====>\t");
		printStars(hght);		//calls the Static Method for further Operations
	}
}
