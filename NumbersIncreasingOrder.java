package specialPatterns;
import java.util.*;
/*
 * @author Anish
 *
 */

public class NumbersIncreasingOrder {
// 	This program prints the numbers in Right Triangle Increasing Order
	public static void printNumbers(int n) {		// Static Method
		int row;
//		<--			Driver Code		-->
		for(row=0;row<=n;row++) {
			int t =row;	// t is a temporary variable
			
			for(;;) {	// infinite loop
				System.out.print(" " + t);		// Prints the Number
				if(t==n)	// if t equals num then breaks the infinite loop	
					break;
				t++;
			}
			System.out.println(); 	// Prints New Line
		}
	}
	// MAIN METHOD
	public static void main(String[] args) {
// 		Program to print halfPyramid of Number from 0 to num
		// Sample Pattern
/* 		
 		0 1 2 3 4 5
 		1 2 3 4 5
 		2 3 4 5
 		3 4 5
 		4 5
 		5		
 */
		int num;
		System.out.print(" Enter Base Point Number : ");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();    //		get the Point number
		sc.close();
		System.out.println("\t <=====   =====   =====>\t");
		printNumbers(num);		//calls the Static Method for further Operations
	}
}
