package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Vous devez ecrire 10 nombres.");
		
		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		int maxVal = 0;
		int array[] = new int[10];
		
		for(int i = 0; i < 10 ; i++) {
			System.out.print("Ecrire un nombre : ");
			nb = scanner.nextInt();
			array[i] = nb;
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxVal)
				maxVal = array[i];
		}
		
		System.out.println("Votre plus grand nombre est : " + maxVal);
	}

}
