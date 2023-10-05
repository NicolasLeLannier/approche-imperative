package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du tableau
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };

		int[] array3 = new int[array1.length + array2.length];
		int longueur = array1.length + array2.length;

		for (int i = 0; i < longueur; i++) {
			if (i >= array1.length) {
				array3[i] = array2[i - array1.length];
			} else {
				array3[i] = array1[i];
			}
		}

		for (int affichage : array3)
			System.out.print(affichage + " ");
	}

}
