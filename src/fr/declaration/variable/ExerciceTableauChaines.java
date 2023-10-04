package fr.declaration.variable;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] tableauVilles = {"Tours", "Angers", "Toulouse", "Poitiers", "Orléans"};
		
		/*
		for(int i = 0; i < tableauVilles.length ; i++) {
			System.out.println(tableauVilles[i]);
		}
		*/
		System.out.println(tableauVilles[0]);
		System.out.println(tableauVilles[1]);
		System.out.println(tableauVilles[2]);
		System.out.println(tableauVilles[3]);
		System.out.println(tableauVilles[4]);
		
		System.out.println(tableauVilles.length);
		
		tableauVilles[3] = "Reims";
		for(int i = 0; i < tableauVilles.length ; i++) {
			System.out.println(tableauVilles[i]);
		}
	}

}
