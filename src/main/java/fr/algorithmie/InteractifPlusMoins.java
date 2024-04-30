package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		long random = Math.round(Math.random()*100) + 1;
		
		System.out.println("Un nombre aléatoire a été généré entre 1 et 1OO (inclus), essayez de le trouver !");
		
		int choice = -1;
		do {
			System.out.println("Quel numéro tentez-vous ?");
			choice = scanner.nextInt();
			
			if(random < choice) {
				System.out.println("C'est moins.");
			} else if (random > choice) {
				System.out.println("C'est plus.");
			}
		}while(choice != random);
		
		scanner.close();
		
		System.out.println("Bien joué ! Le numéro caché était " + random);
	}

}
