package specialPatterns;
import java.util.*;

public class NumbersDecreasingOrder {
// 	This program prints the numbers in Right Triangle Decreasing Order
	
	public static void printNumbers(int n) {		//Static Method
		int row;
//		<--			Driver Code		-->
		for(row=n;row>=0;row--) {
			int t =row;	// t is a temporary variable
			
			for(;;) {	// infinite loop
				System.out.print(" " + t);  // Prints the Number
				if(t==0) 	//if t equals 0 then breaks the infinite loop
					break;
				t--;
			}
			System.out.println();   // Prints the New Line
		}
	}
	// MAIN METHOD
	public static void main(String[] args) {
// 		Program to print Right Triangle UPside Down of Number from num to 0
		// Sample Pattern
/*
 		5 4 3 2 1 0
 		4 3 2 1 0
 		3 2 1 0
 		2 1 0
 		1 0
 		0
*/
		int num;
		System.out.print(" Enter Base Point Number : ");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();    //		get the starting number
		sc.close();
		System.out.println("\t <=====   =====   =====>\t");
		printNumbers(num);		//calls the Static Method for further Operations

	}
}
