package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du tableau
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6 };
		
		boolean controleTableau = false;
		
		// Check des conditions (s'il n'est pas vide, ou si 1er ou dernier nombre soit 6)
		if(array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6)) {
			controleTableau = true;
		}
		
		System.out.println(controleTableau);
	}

}
