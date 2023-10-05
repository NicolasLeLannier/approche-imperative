package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxVal = Integer.MAX_VALUE;
		int minVal = Integer.MIN_VALUE;

		// Initialisation du tableau
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		for (int nombre : array)
			System.out.print(nombre + " ");

		for (int i = 0; i < array.length; i++) {
			if (array[i] < maxVal)
				maxVal = array[i];
			if (array[i] > minVal)
				minVal = array[i];
		}

		System.out.println("\nValeur minimale = " + maxVal);
		System.out.println("Valeur maximale = " + minVal);

	}

}
