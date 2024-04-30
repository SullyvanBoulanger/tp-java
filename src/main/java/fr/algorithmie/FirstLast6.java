package fr.algorithmie;

public class FirstLast6 {
	
	private static boolean isFirstOrLastElement6(int[] array) {
		if(array.length <= 0) 
			return false;
		return array[0] == 6 || array[array.length-1] == 6;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {6, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		System.out.println(isFirstOrLastElement6(array1));
		System.out.println(isFirstOrLastElement6(array2));
	}

}
