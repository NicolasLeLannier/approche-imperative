package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		
		do {
			System.out.print("Ecrire un nombre : ");
			
			nb = scanner.nextInt();
			System.out.println(nb);
		} while(nb > 10 || nb < 1);
		
	}

}
