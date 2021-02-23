package specialPatterns;
import java.util.*;
/*
 * @author Anish
 *
 */

public class Pyramid {
// This program prints Pyramid of Stars
	public static void printStars(int n) {	//Static Method
		int rows, cols, space;
//		<--			Driver Code		-->
		for(rows=0;rows<n;rows++) {
			
			for(space=n-rows;space>0;space--) // Space Printing Logic
				System.out.print(" ");   //	Prints Space 
			
			for(cols=0;cols<=rows;cols++) {
				System.out.print("* "); // prints the star
			}
			System.out.println();//prints a new line
		}
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Program to Print Pyramid
		// Sample Pattern
/*
 	    * 
 	   * * 
 	  * * * 
 	 * * * * 
 	* * * * *
 */
		int hght;
		System.out.print(" How many lines (*) should be printed in pyramid :");
		Scanner sc = new Scanner(System.in);
		
//		Get the height of pyramid from user
		hght = sc.nextInt(); // Stores the user input
		sc.close();
		System.out.println("\t <=====   =====   =====>\t");
		printStars(hght);		//calls the Static Method for further Operations
	}

}
