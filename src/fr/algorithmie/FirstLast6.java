package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation du tableau
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6 };
		
		boolean controleTableau = false;
		
		if(array1.length > 0 && (array1[0] == 6 || array1[array1.length - 1] == 6)) {
			controleTableau = true;
		}
		
		System.out.println(controleTableau);
	}

}
