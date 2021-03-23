package monPremierProjetJava;

public class TabExo2 {

	public static void remplirTableau() {
		char tab[];
		for (int i = 0; i <= 0; i++) {
			tab= new char[10];
			for (int j = 65; j <= 74; j++) {
				tab[i] = (char) (j - i);
				System.out.println(tab[i]);
			}
		}
	}

	/*public static void afficherTableau() {
		char tonTableau[] = new char[10];
		tonTableau = remplirTableau();
		for (char i : tonTableau) {
			System.out.println(i);
		}
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remplirTableau();
		//afficherTableau();

	}

}