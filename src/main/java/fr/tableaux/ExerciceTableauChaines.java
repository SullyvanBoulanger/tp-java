package fr.tableaux;

public class ExerciceTableauChaines {
	
	private static void printElementsFromArray(String[] array) {
		for(String element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = {"Lille", "Paris", "Lyon", "Bourg-en-bresse", "Berck/Mer"};
		
		printElementsFromArray(cities);
		
		System.out.println(cities.length);
		
		cities[3] = "Reims";
		
		printElementsFromArray(cities);
	}

}
