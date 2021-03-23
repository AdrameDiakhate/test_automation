package monPremierProjetJava;

/*
 Faites un programme JAVA qui permet de rechercher l’existence d’un
nombre donné dans un tableau monTab de N éléments.

 */
public class TabExo8 {

	public static void existenceNombre(int n) {
		int tab[] = { 1, 2, 3, 4, 5 };
		boolean trouve = false;
		for (int i : tab) {
			if (i == n) {
				trouve = true;
			}
		}
		if (trouve == true) {
			System.out.println(n +" se trouve dans le tableau");
		} else {
			System.out.println(n +" n'est pas dans le tableau");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		existenceNombre(7);
	}

}
