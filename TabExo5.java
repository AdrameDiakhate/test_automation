package monPremierProjetJava;

public class TabExo5 {
	
	/*
	 faites un programme JAVA qui Augmente de 1 tous les �l�ments d�un
tableau, le nouveau tableau sera affich� � l��cran. Utiliser une m�thode pour g�rer
l�augmentation de 1 sur les �l�ments de tableau et une autre m�thode pour
l�affichage de tableau.
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
