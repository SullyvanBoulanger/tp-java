package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {8, -7, 12, 1, -2, 14, 17, 9};
		
		System.out.println(array[0]);
		System.out.println(array.length);
		System.out.println(array[array.length-1]);
		
		// Ne fonctionne pas car il essaye d'accéder à la valeur du 10ème élément alors qu'on a que 8 éléments
		System.out.println(array[9]);
	}

}
