package monPremierProjetJava;

public class TabExo18 {

	public static void NombresPositifs() {
		int[] tableau = { -1, -2, 5, 9, -5, 6, 7, 3, 4, 2 };
		System.out.println("Les nombres positifs du tableau sont: ");
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] > 0) {
				System.out.println(tableau[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NombresPositifs();
	}

}
