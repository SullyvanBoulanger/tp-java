package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int choice = -1;
		do {
			System.out.println("Veuillez saisir un nombre entre 1 et 10 : ");
			choice = scanner.nextInt();
		}while(choice <= 1 || choice >= 10);
		
		scanner.close();
		
		System.out.println("Vous avez choisi " + choice);
		
		for(int i = 1;i<11;i++) {
			System.out.println(choice + " * " + i + " = " + choice*i);
		}
	}

}
