package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
	
	private static long aiTurn() {
		long removedSticks = Math.round(Math.random()*2) + 1;
		
		System.out.println("L'IA a retiré " + removedSticks + ".");
		return removedSticks;
	}
	
	private static long playerTurn(int remainingSticks, Scanner scanner) {
		
		System.out.println("C'est votre tour, il reste " + remainingSticks);
		System.out.println("Vous retirez combien de batons ?");
		
		
		int choice = scanner.nextInt();
		while(choice < 1 || choice > 3) {
			System.out.println("Invalide");
			System.out.println("Vous retirez combien de batons ?");
			choice = scanner.nextInt();
		}
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Jeu des 21 Batons");
		System.out.println("Chaque tour, vous pouvez retirez 1, 2 ou 3 batons.");
		System.out.println("Le joueur qui retire le dernier baton perd.");
		System.out.println("Vous allez jouer contre l'IA");
		
		long random = Math.round(Math.random()*100) + 1;
		
		boolean isAIBegins = random < 50;
		
		if(isAIBegins) {
			System.out.println("L'IA commence.");
		} else {
			System.out.println("Vous commencez.");
		}
		
		int sticks = 21;
		
		if(isAIBegins)
			sticks -= aiTurn();
		
		Scanner scanner = new Scanner(System.in);
		boolean isPlayerWin = false;
		do {
			sticks -= playerTurn(sticks, scanner);
			if(sticks <= 0)
				isPlayerWin = true;
			
			sticks -= aiTurn();
			if(sticks <= 0)
				isPlayerWin = true;
		}while(sticks > 0);
		scanner.close();
		System.out.println("Le vainqueur est " + (isPlayerWin ? "vous !" : "l'IA !"));
	}

}
