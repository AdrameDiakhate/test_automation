package monPremierProjetJava;

public class TabExo13 {

	
	public static void Minimum() {
		int monTableau[] = { 11, 12, 13, 14, 15, 16, 17, 18, 18, 18 };
		int min = monTableau[0];
		int position = 0;

		for (int i = 0; i < monTableau.length; i++) {
			if (monTableau[i] < min) {
				min = monTableau[i];
				position = i;
			}
		}
		System.out.println("Le minimum est " + min + " ,sa position est " + position);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Minimum();
	}

}
