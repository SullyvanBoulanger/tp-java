package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre : ");
		int choice = scanner.nextInt();
		
		scanner.close();
		
		for(int i=1;i<11;i++) {
			System.out.println(choice+i);
		}
	}

}
