package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ecrire un nombre : ");
		int nb = scanner.nextInt();
		
		for(int i = nb + 1; i < (nb + 11) ; i++) {
			System.out.println(i);
		}
	}

}
