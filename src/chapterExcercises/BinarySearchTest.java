package chapterExcercises;

import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String[] args) {
		//create scanner to input data
		Scanner input = new Scanner(System.in);
		
		int searchInt; //search key
		int position; //location of search key in array
		
		//create array and output it
		BinaryArray searchArray = new BinaryArray(15);
		System.out.println(searchArray);
		
		//get input from user
		System.out.print("Please enter an integer (-1 to quit): ");
		searchInt = input.nextInt();
		System.out.println();
		
		//repeatedly input an integer or -1 to terminate
		while(searchInt != -1) {
			//use binary search to try to find integer
			position = searchArray.binarySearch(searchInt);
			
			//return value of -1 indicates integer not found
			if(position == -1)
				System.out.println("The integer " + searchInt +
						" was not found.\n");
			else
				System.out.println("The integer " + searchInt +
						" was found at position " + position + ".\n");
			
			//get more input from user
			System.out.print("Please enter an integer (-1 to quit): ");
			searchInt = input.nextInt();
			System.out.println();
		}
	}
}
