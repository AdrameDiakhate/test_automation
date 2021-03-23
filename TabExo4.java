package monPremierProjetJava;

public class TabExo4 {
	
	/*
	 Cr�er un programme JAVA qui a une m�thode sommeTableau.
sommeTableau permet de calculer et d�afficher ensuite la somme des �l�ments d�un
tableau de n �l�ments. Tester sommeTableau avec un tableau de r�els et avec un
tableau d�entier.
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
		System.out.println("La somme des r�els du tableau est : "+somme);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sommeTableauEntier(4);
		sommeTableauReel(5);
	}

}
