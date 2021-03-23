package monPremierProjetJava;

public class TabExo12 {

	public static void Maximum() {
		int monTableau[] = { 11, 12, 13, 14, 15, 16, 17, 18, 18, 18 };
		int max = monTableau[0];
		int position = 0;

		for (int i = 0; i < monTableau.length; i++) {
			if (monTableau[i] > max) {
				max = monTableau[i];
				position = i;
			}
		}
		System.out.println("Le maximum est " + max + " ,sa position est " + position);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum();
	}

}
