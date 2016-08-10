package chapterExcercises;

import java.util.Arrays;
import java.util.Random;

public class BinaryArray {

	private int[] data;
	private static final Random generator = new Random();
	
	//create array of given size and fill with random integers
	public BinaryArray(int size) {
		data = new int[size];
		
		for(int i = 0; i < size; i++) {
			data[i] = 10 + generator.nextInt(90);
		}
		
		Arrays.sort(data);
	}
	
	//perform binary search on data
	public int binarySearch(int searchElement) {
		int low = 0; //low end of search area
		int high = data.length - 1; //high end of search area
		int middle = (low + high + 1) / 2; //middle element
		int location = -1; //return falue; -1 if not found
		
		do { //search loop for element 
			//print elements in array
			System.out.print(remainingElements(low, high));
			
			//output spaces for alignment
			for(int i = 0; i < middle; i++)
				System.out.print("  ");
			System.out.println(" * "); //indicate current middle
			
			//if the element is found in the middle
			if(searchElement == data[middle])
				location = middle;
			
			//if element is too high
			else if(searchElement < data[middle])
				high = middle - 1; //create new high
			else //middle element is too low
				low = middle + 1; //create new low
			
			middle = (low + high + 1) / 2; //create new middle
		} while((low <= high) && (location == -1));
		
		return location; //return location of search key
	}
	
	//method to output certain values in array
	public String remainingElements(int low, int high) {
		StringBuilder temp = new StringBuilder();
		
		//output spaces for alignment
		for(int i = 0; i < low; i++)
			temp.append(" ");
		
		//output elements left in array
		for(int i = low; i <= high; i++)
			temp.append(data[i] + " ");
		
		temp.append("\n");
		return temp.toString();
	}
	
	//method to output values in array
	public String toString() {
		return remainingElements(0, data.length - 1);
	}
}
