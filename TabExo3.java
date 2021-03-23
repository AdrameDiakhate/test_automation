package monPremierProjetJava;

//import java.util.*;

public class TabExo3 {

	/*
	 * Créer un programme JAVA qui a une méthode gererTableau qui prend en entrer un
	 * nombre entier n, puis remplir un tableau de n éléments et de l’afficher.
	 * Tester gererTableau avec un tableau d’entier, avec un tableau de réels et
	 * avec un tableau de caractères.
	 */

	public static void gererTaleauEntier(int n) {

		int monTableau[] = new int[n];
		for (int i = 0; i < n; i++) {
			monTableau[i] = i + 1;
			System.out.println(monTableau[i]);
		}

	}

	public static void gererTaleauReel(int n) {
		float monTableau[] = new float[n];
		for (int i = 0; i < n; i++) {
			monTableau[i] = (float) (i + 1);
			System.out.println(monTableau[i]);
		}
	}

	public static void gererTaleauCaractere(int n) {
		char monTableau[] = new char[n];
		for (char i = 0; i < n; i++) {
			monTableau[i] = (char) (i + 65);
			System.out.println(monTableau[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gererTaleauEntier(10);
		gererTaleauReel(10);
		gererTaleauCaractere(10);
	}

}
