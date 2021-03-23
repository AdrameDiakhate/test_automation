package monPremierProjetJava;

public class TabExo5 {
	
	/*
	 faites un programme JAVA qui Augmente de 1 tous les éléments d’un
tableau, le nouveau tableau sera affiché à l’écran. Utiliser une méthode pour gérer
l’augmentation de 1 sur les éléments de tableau et une autre méthode pour
l’affichage de tableau.
	 */

	static int monTableau[]= {1,2,3,4,5};
	
	public static void Incrementer() {

		for (int i=0;i<5;i++) {
			monTableau[i]++;
		}
	}
	public static void Affichage() {

		//int monTableau[] = new int[n];
		for (int i:monTableau) {
			System.out.println(i);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Incrementer();
		Affichage();
	}

}
