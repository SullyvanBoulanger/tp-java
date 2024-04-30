package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[0];
		
		do {
			System.out.println("1. Ajouter un nombre\n2. Afficher les nombres existants");
			int choice = scanner.nextInt();
			if(choice == 1) {
				array = Arrays.copyOf(array, array.length + 1);
				System.out.println("Quel nombre voulez-vous ajouter ?");
				array[array.length - 1] = scanner.nextInt();
			} else if(choice == 2) {
				System.out.println(Arrays.toString(array));
			} else {
				System.out.println("Invalide");
			}
		}while(true);
	}

}
