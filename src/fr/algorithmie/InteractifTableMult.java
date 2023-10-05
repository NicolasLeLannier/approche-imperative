package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		boolean verification = false;

		// Tant que le nombre n'est pas entre 1 et 10 on repose la question
		do {
			System.out.print("Ecrire un nombre entre 1 et 10 : ");
			nb = scanner.nextInt();

			// Verification pour être sûr que le nombre soit bien compris entre 1 et 10 avant d'afficher la table
			verification = true;
		} while (nb > 10 || nb < 1);

		// Affichage de la table de multiplication
		if (verification == true) {
			System.out.println("Table de " + nb);

			for (int i = 1; i <= 10; i++) {
				System.out.println(nb + " * " + i + " = " + nb * i);
			}
		}
	}

}
