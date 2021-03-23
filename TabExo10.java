package monPremierProjetJava;

/*
  Faites un programme JAVA qui affiche dans un premier temps les
éléments d’un tableau puis il compte et affiche le nombre de nombre pair et le
nombre de nombre impair d’un tableau d’entier tabInt. Remplacer ensuite tous les
pairs par la valeur 10 et tous les nombres impairs par la valeur 3 dans le tableau
tabInt afin d’afficher les éléments du nouveau tableau résultant.
 */
public class TabExo10 {

	public static void pairImpair() {
		int monTableau[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int pair = 0;
		int impair = 0;
		System.out.println("Les valeurs avant modification du tableau");
		for (int i : monTableau) {
			System.out.println(+i);
			if (i % 2 == 0) {
				pair++;
			} else {
				impair++;
			}
		}
		
		System.out.println("Le nombre de nombre pair est de: " + pair);
		
		System.out.println("Le nombre de nombre impair est de: " + impair);
		
		System.out.println("Les valeurs après modification du tableau");
		for (int i : monTableau) {
			if (i % 2 == 0) {
				i = 10;
			} else {
				i=3;
			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pairImpair();
	}

}
