package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Suite de Fibonacci !");
		
		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in);

		System.out.print("Choisir un rang : ");
		int nb = scanner.nextInt();
		
		for(int i = 1; i <= nb; i++) {
			System.out.println("Rang " + i + " => " + TestFibonacci(i));
		}
	}

	public static int TestFibonacci(int rang) {
		if(rang <= 1) 
			return rang;
		else 
			return TestFibonacci(rang-1) + TestFibonacci(rang-2);
	}
}
