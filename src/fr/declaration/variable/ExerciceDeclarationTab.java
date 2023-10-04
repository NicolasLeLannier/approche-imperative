package fr.declaration.variable;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tabTP = {8, -7, 12, 1, -2, 14, 17, 9};
		System.out.println(tabTP[0]);
		System.out.println(tabTP.length);
		System.out.println(tabTP[tabTP.length - 1]);
		System.out.println(tabTP[10]);	// Fonctionne pas car il n'y a pas 11 éléments
	}

}
