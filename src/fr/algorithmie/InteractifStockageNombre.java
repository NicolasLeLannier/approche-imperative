package fr.algorithmie;

import java.util.*;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in);
		int nb1 = 0;
		int nb2 = 0;
		int[] array = new int[0];

		// Tant que le nombre n'est pas entre 1 et 10 on repose la question
		do {
			System.out.println("\n1. Ajouter un nombre \n2. Afficher les nombres existants \n3. Fermer le programme");
			System.out.print("Entrez un nombre : ");
			nb1 = scanner.nextInt();

			switch (nb1) {
			case 1:
//				ajout();

				System.out.print("\nEntrez un nombre à ajouter : ");
				nb2 = scanner.nextInt();

				// Copie le tableau pour le recréer avec une taille en plus
				array = Arrays.copyOf(array, array.length + 1);
				array[array.length - 1] = nb2;

				break;
			case 2:
//				afficher();

				if (array.length == 0) {
					System.out.println(
							"Vous n'avez pas encore de données dans votre tableau. Vous pouvez en ajouter en appuyant sur 1.");
				} else {
					// Affiche un tableau avec une bonne présentation visuelle
					System.out.println("\n----------- Voici votre tableau -------------");
					for (int affichage : array) {
						System.out.print(affichage + " ");
					}
					System.out.println("\n---------------------------------------------");
				}

				break;
			default:
				System.out.println("Au revoir !");
			}

		} while (nb1 != 3);

	}

//	public static void ajout() {
//		Scanner scanner = new Scanner(System.in);
//		int nb2 = 0;
//		int[] array = {};
//
//		System.out.print("\nEntrez un nombre à ajouter : ");
//		nb2 = scanner.nextInt();
//		array[array.length - 1] = nb2;
//	}
//
//	public static void afficher() {
//		int[] array = { 1, 34, 23 };
//
//		if (array.length == 0) {
//			System.out.println("Vous n'avez pas encore de données dans votre tableau.");
//		} else {
//			for (int affichage : array) {
//				System.out.print(affichage + " ");
//			}
//		}
//	}
}
