package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation des tableaux
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		
		int nombreElementCommun = 0;
		
		// Double boucle for pour comparer les 2 tableaux
		for (int i = 0; i < array1.length; i++) {
			for (int f = 0; f < array2.length; f++) {
				if(array1[i] == array2[f]) {
					nombreElementCommun ++;
				}
			}
		}
		
		System.out.println("Nombre éléments en communs : " + nombreElementCommun);
	}

}
