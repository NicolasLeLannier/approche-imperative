package fr.algorithmie;

import java.util.*;

public class Interactif21Batons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Jeu des 21 Bâtons !");
		System.out.println("Règles : Retirer entre 1 et 3 bâtons de façon à ne pas prendre le dernier bâton.");

		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		int nbBaton = 21;

		do {
			System.out.print("Prenez entre 1 et 3 bâtons : ");
			nb = scanner.nextInt();

			if (nb <= 3 && nb >= 1)
				nbBaton = EnleverBaton(nbBaton, nb);
			Afficher(nbBaton);

			if (nbBaton > 1) {
				System.out.println("\n--------------------- Tour de l'ordinateur ---------------------");

				nbBaton = Ordinateur(nbBaton);
				Afficher(nbBaton);
			} else {
				System.out.println("Bravo vous avez gagné !");
			}

		} while (nbBaton > 1);

		System.out.println("\nLa partie est fini. Merci d'avoir joué !");
	}

//	public static String Afficher(int nbBaton) {
//		String resu = "";
//		resu =+ "\n---------------------------------------------\n";
//		for(int i = 0; i < 21; i++) {
//			if(i < nbBaton)
//				resu =+ " I ";
//			else 
//				resu =+ " O ";
//		}
//		resu =+ "\n---------------------------------------------\n";
//		return resu;
//	}

	public static void Afficher(int nbBaton) {
		System.out.println("Nombre de batons restants : " + nbBaton + "\n");
	}

	public static int EnleverBaton(int nbBaton, int nb) {
		return nbBaton -= nb;
	}

	public static int Ordinateur(int nbBaton) {
		int nbBatonAvant = nbBaton;
		if (nbBaton < 5) {
			nbBaton = EnleverBaton(nbBaton, nbBaton - 1);
		} else {
			int nbAleatoire = (int) (Math.random() * 3) + 1;
			nbBaton = EnleverBaton(nbBaton, nbAleatoire);
		}
		
		System.out.println("L'ordinateur a pris " + (nbBatonAvant - nbBaton) + " bâtons");
		
		return nbBaton;
	}

}
