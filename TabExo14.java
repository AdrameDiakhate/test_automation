package monPremierProjetJava;

public class TabExo14 {

	static int[] tableau1 = { -1, -2, -3, -4, -5, 1, 2, 3, 4, 5 };
	static int[] tableau2 = new int[10];
	static int[] tableau3 = new int[10];

	public static void absolueCarre() {
		for (int i = 0; i < tableau1.length; i++) {
			tableau2[i] = tableau1[i];
			tableau3[i] = tableau1[i];
			if (tableau1[i] < 0) {
				tableau2[i] = Math.abs(tableau1[i]);
			}
			if (tableau1[i] > 0) {
				tableau3[i] = (int) Math.pow(tableau1[i], 2);
			}
		}
		System.out.println("Le tableau avec les valeurs absolues des nombres négatifs");
		for (int i = 0; i < tableau1.length; i++) {
			System.out.println(tableau2[i]);
		}
		System.out.println("Le tableau avec les carrés des nombres positifs");
		for (int i = 0; i < tableau1.length; i++) {
			System.out.println(tableau3[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		absolueCarre();
	}

}
