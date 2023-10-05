package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		int compteur = 0;
		// Message d'erreur si je ne cast pas en (int) car Math random renvoie un nombre double, à virgule
		int nbAleatoire = (int) (Math.random() * 100);
		
//        System.out.println(nbAleatoire);  

		// Tant que le nombre n'est pas entre 1 et 10 on repose la question
		do {
			compteur ++;
			
			System.out.print("Trouvez le nombre entre 1 et 100 : ");

			nb = scanner.nextInt();
			System.out.println(nb);
			
			// Vérification si le nombre est plus ou moins ou correct
			if(nb != nbAleatoire) {
				if(nb < nbAleatoire) {
					System.out.println("FAUX. C'est PLUS !");
				} else 
					System.out.println("FAUX. C'est MOINS !");
			} else {
				System.out.println("Bravo, vous avez trouvé en " + compteur + " coups.");
			}
			
		} while (nb != nbAleatoire);
	}

}
