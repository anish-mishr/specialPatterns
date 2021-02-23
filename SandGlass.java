package specialPatterns;

import java.util.Scanner;

public class SandGlass {
// This program prints SandGlass of Stars
	// SandGlass is a combination of reversed Pyramid and Pyramid
	public static void printStars(int n) {	//Static Method
		int rows, cols, space;
//		<--			Driver Code		-->
			// Reversed Pyramid
		for(rows=0;rows<n;rows++) {
			
			for(space=0;space<=rows;space++) // Space Printing Logic
				System.out.print(" ");   //	Prints Space 
			
			for(cols=0;cols<=(n-1)-rows;cols++) {
				System.out.print("* "); // prints the star
			}
			System.out.println();//prints a new line
		}
			// Pyramid
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
//Program to Print SandGlass
	// Sample Pattern
/*
		* * * * * 
		 * * * * 
		  * * * 
		   * * 
		    * 
		    * 
		   * * 
		  * * * 
		 * * * * 
		* * * * *
*/
		int hght;
		System.out.print(" How many lines (*) should be printed in pyramid :");
		Scanner sc = new Scanner(System.in);
		
//		Get the height of SandGlass from center from user
		hght = sc.nextInt(); // Stores the user input
		sc.close();
		System.out.println("\t <=====   =====   =====>\t");
		printStars(hght);		//calls the Static Method for further Operations
	}
}
