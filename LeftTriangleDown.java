package specialPatterns;
import java.util.*;

public class LeftTriangleDown {
// This program prints Left Triangle DownWards
	public static void printStars(int n) { // Static Method
		int rows, cols, space;
//		<--			Driver Code		-->
		for(rows=n-1;rows>=0;rows--) {
			for(space=2*(n-rows);space!=0;space--) 	// Space Printing Logic
				System.out.print(" "); // Prints space
			
			for(cols=0;cols<=rows;cols++) {
				System.out.print("* "); // prints the star
			}
			System.out.println();//prints a new line
		}
	}
	// MAIN MEHTOD
	public static void main(String[] args) {
//		Program to Print Left Triangle Downwards
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
