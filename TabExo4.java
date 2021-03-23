package monPremierProjetJava;

public class TabExo4 {
	
	/*
	 Créer un programme JAVA qui a une méthode sommeTableau.
sommeTableau permet de calculer et d’afficher ensuite la somme des éléments d’un
tableau de n éléments. Tester sommeTableau avec un tableau de réels et avec un
tableau d’entier.
	 */
	
	public static void sommeTableauEntier(int n) {
		int monTableau[]=new int[n];
		int somme=0;
		for(int i=0;i<n;i++) {
			monTableau[i]=i+1;
		}
		for(int i:monTableau) {
			somme+=i;
		}
		System.out.println("La somme des entiers du tableau est : "+somme);
	}
	
	public static void sommeTableauReel(int n) {
		float monTableau[]=new float[n];
		float somme=0;
		
		for(int i=0;i<n;i++) {
			monTableau[i]=i+1;
		}
		for(float i:monTableau) {
			somme+=i;
		}
		System.out.println("La somme des réels du tableau est : "+somme);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sommeTableauEntier(4);
		sommeTableauReel(5);
	}

}
