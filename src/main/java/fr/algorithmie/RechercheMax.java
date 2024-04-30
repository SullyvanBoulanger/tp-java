package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int max = array[0];
		
		for(int number : array) {
			if(number > max)
				max = number;
		}
		
		System.out.println(max);
	}

}
