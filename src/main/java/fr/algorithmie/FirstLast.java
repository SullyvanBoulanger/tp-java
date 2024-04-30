package fr.algorithmie;

public class FirstLast {

	private static boolean isFirstOrLastElementSame(int[] array) {
		if(array.length <= 0) 
			return false;
		return array[0] == array[array.length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {6, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		System.out.println(isFirstOrLastElementSame(array1));
		System.out.println(isFirstOrLastElementSame(array2));
	}

}
