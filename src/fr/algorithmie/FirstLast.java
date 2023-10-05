package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du tableau
		int[] array = { 6, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6 };
		
		boolean controleTableau = false;
		
		// Check des conditions (s'il n'est pas vide, ou si 1er et dernier sont égaux)
		if(array.length > 0 && array[0] == array[array.length - 1]) {
			controleTableau = true;
		}
		
		System.out.println(controleTableau);
	}

}
