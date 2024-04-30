package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
	
	private static void printAllNumbersFromIntArray(int[] array) {
		for(int number : array) {
			System.out.println(number);
		}
	}
	
	private static void printInInverseOrderAllNumbersFromIntArray(int[] array) {
		for(int i = array.length -1;i>=0;i--) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		printAllNumbersFromIntArray(array);
		printInInverseOrderAllNumbersFromIntArray(array);
		
		int[] arrayCopy = Arrays.copyOf(array, array.length);
	}

}
