package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
	
	private static int[] rotate(int[] array) {
		int[] newArray = new int[array.length];
		int last = array[array.length-1];
		
		newArray[0] = last;
		for(int i=0;i<array.length-1;i++) {
			newArray[i+1] = array[i];
		}
		
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,2,3};		
		
		System.out.println(Arrays.toString(rotate(array)));
	}

}
