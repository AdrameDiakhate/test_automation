package monPremierProjetJava;

public class TabExo11 {

	public static void Occurence(int x) {
		int monTableau[] = { 11, 12, 13, 14, 15, 16, 17, 18, 18, 18 };
		int occurence = 0;
		for (int i : monTableau) {
			if (i == x) {
				occurence++;
			}
		}
		System.out.println("Le nombre d'occurence de " + x + " est " + occurence);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Occurence(18);
	}

}
