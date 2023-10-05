package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialisation du tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Affichage tableau
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("----------------------");
		
		// Affichage Tableau Inverse
		for(int f = array.length - 1; f >= 0; f--) {
			System.out.println(array[f]);
		}
		
		// Copy du tableau
		int[] arrayCopy = array;
	}

}
