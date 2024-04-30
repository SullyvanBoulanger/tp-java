package fr.algorithmie;

public class AffichageSuite {
	
	
	private static void printForLoop1To10() {
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	private static void printForLoopEvenNumbersFrom1To10() {
		for(int i = 1;i<=10;i++) {
			if(i%2==0)
				System.out.println(i);
		}
	}
	
	private static void printForLoopOddNumbersFrom0To9() {
		for(int i = 0;i<10;i++) {
			if(i%2==1)
				System.out.println(i);
		}
	}
	
	private static void printWhileLoop1To10() {
		int i = 1;
		
		while(i<=10) {
			System.out.println(i);	
			i++;
		}
	}
	
	private static void printWhileLoopEvenNumbersFrom1To10() {
		int i = 1;
		
		while(i<=10) {
			if(i%2==0)
				System.out.println(i);	
			i++;
		}
	}
	
	private static void printWhileLoopOddNumbersFrom0To9() {
		int i = 0;
		
		while(i<10) {
			if(i%2==1)
				System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printForLoop1To10();
		printForLoopEvenNumbersFrom1To10();
		printForLoopOddNumbersFrom0To9();
		
		
		
	}

}
