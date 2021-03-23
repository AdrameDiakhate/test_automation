package monPremierProjetJava;

public class TabExo1 {

	static int monTableau[]=new int[10];

	public static void remplirTableau() {

		for (int i = 0; i <= 9; i++) {
			monTableau[i]=i+1;
		}
	}
	
	public static void afficherTableau() {

		for (int i : monTableau) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		remplirTableau();
		afficherTableau();
	}

}
