package specialPatterns;
import java.util.Scanner;

public class PyramidReversed {
// This program prints Reversed Pyramid of Stars
		public static void printStars(int n) {	//Static Method
			int rows, cols, space;
//			<--			Driver Code		-->
			for(rows=0;rows<n;rows++) {
				
				for(space=0;space<=rows;space++) // Space Printing Logic
					System.out.print(" ");   //	Prints Space 
				
				for(cols=0;cols<=(n-1)-rows;cols++) {
					System.out.print("* "); // prints the star
				}
				System.out.println();//prints a new line
			}
		}
		// MAIN METHOD
		public static void main(String[] args) {
//			Program to Print Reversed Pyramid
			// Sample Pattern
/*
	 * * * * * 
	  * * * * 
	   * * * 
	    * * 
	     *
 */
			int hght;
			System.out.print(" How many lines (*) should be printed in pyramid :");
			Scanner sc = new Scanner(System.in);
			
//			Get the height of pyramid from user
			hght = sc.nextInt(); // Stores the user input
			sc.close();
			System.out.println("\t <=====   =====   =====>\t");
			printStars(hght);		//calls the Static Method for further Operations
		}
}
