package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		
		// Tant que le nombre n'est pas entre 1 et 10 on repose la question
		do {
			System.out.print("Ecrire un nombre entre 1 et 10 : ");
			
			nb = scanner.nextInt();
			System.out.println(nb);
		} while(nb > 10 || nb < 1);
		
	}

}
