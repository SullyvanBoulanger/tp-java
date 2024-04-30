package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		
		int occurences = 0;
		for(int number1: array1) {
			for(int number2: array2) {
				if(number1 == number2)
					occurences++;
			}
		}
		
		System.out.println(occurences);
	}

}
