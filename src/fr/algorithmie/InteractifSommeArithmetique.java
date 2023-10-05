package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ecrire un nombre : ");
		int nb = scanner.nextInt();
		
		int somme = 0;
		
		// On part de 5 et on ajoute son chiffre en dessous jusqu'à 1
		for(int i = nb; i > 0; i --) {
			somme += i;
		}
		
		System.out.println("Résultat = " + somme);
	}

}
