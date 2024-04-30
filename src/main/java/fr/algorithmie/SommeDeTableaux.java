package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {
	
	private static int returnTotalFromArray(int[] array) {
		int total = 0;
		
		for(int number : array) {
			total += number;
		}
		
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] intArray2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		
		int[] totals = {returnTotalFromArray(intArray1), returnTotalFromArray(intArray2)};
		
		System.out.println(Arrays.toString(totals));
	}

}
