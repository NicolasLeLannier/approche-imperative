package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du tableau
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Copy dans l'ordre Inverse du tableau
		int[] arrayCopy = new int[array.length];
		for (int f = array.length - 1; f >= 0; f--) {
			arrayCopy[(array.length - 1) - f] = array[f];
		}

		System.out.println("----------------------");
		
		// Affichage des 2 tableaux
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("----------------------");
		for (int c = 0; c < arrayCopy.length; c++) {
			System.out.println(arrayCopy[c]);
		}
	}

}
