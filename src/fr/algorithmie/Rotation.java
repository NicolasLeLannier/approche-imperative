package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du tableau
		int[] array = { 6, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6 };
		
		// Affichage avant la rotation
		for (int affichage : array)
			System.out.print(affichage + " ");

		// Parcour du tableau à l'envers pour mettre le dernier en premier d'abord pour pas la supprimer
		for (int i = array.length - 1; i > 0; i--)
			array[i] = array[i - 1];
		
		System.out.println("\n");
		
		// Affichage après la rotation
		for (int affichage : array)
			System.out.print(affichage + " ");
	}

}
