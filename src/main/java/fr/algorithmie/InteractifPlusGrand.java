package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
	
	private static int findMax(int[] array) {
		int max = array[0];
		
		for(int number : array) {
			if(number > max)
				max = number;
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Veuillez saisir un nombre : ");
			array[i]= scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println("Max : " + findMax(array));
	}

}
