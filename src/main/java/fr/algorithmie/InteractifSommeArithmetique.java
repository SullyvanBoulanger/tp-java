package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre : ");
		int choice = scanner.nextInt();
		
		scanner.close();
		
		int total = 0;
		for(int i=1;i<=choice;i++) {
			total += i;
		}
		
		System.out.println(total);
	}

}
