package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int choice = -1;
		do {
			System.out.println("Veuillez saisir un nombre entre 1 et 10 : ");
			choice = scanner.nextInt();
		}while(choice <= 1 || choice >= 10);
		
		System.out.println("Vous avez choisi " + choice);
		scanner.close();
	}

}
