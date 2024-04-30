package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quel rang N de la suite de Fibonacci voulez-vous connaître ?");
		int askedRank = scanner.nextInt();
		scanner.close();
		
		int nMinus1 = 1;
		int nMinus2 = 0;
		
		for(int i = 0;i<askedRank;i++) {
			int temp = nMinus1;
			
			nMinus1 = nMinus1 + nMinus2;
			
			nMinus2 = temp;
		}
		
		System.out.println(nMinus1);
	}

}
