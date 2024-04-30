package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("Valeurs supérieurs à 3");
		
		for(int number : array) {
			if(number > 3) {
				System.out.println(number);
			}
		}
		
		System.out.println("Valeurs paires");
		
		for(int number : array) {
			if(number%2 == 0) {
				System.out.println(number);
			}
		}
		
		System.out.println("Valeurs à l'index pair");
		
		for(int i=0;i<array.length;i++) {
			if(i%2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("Valeurs impaires");
		
		for(int number : array) {
			if(number%2 == 1) {
				System.out.println(number);
			}
		}
	}

}
