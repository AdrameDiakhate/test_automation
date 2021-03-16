/**
 * 
 */
package monPremierProjetJava;

/**
 * @author DESKLAP PRO
 *
 */
public class MonPremierProjetJava {

	/**
	 * @param args
	 */

	public static void MaxDeuxNombres(int n1, int n2) {

		if (n1 > n2) {
			System.out.println(n1 + " est le maximum");
		} else if (n1 < n2) {
			System.out.println(n2 + " est le maximum");
		} else {
			System.out.println("Les deux nombres sont égaux");
		}
	}

	public static void MaxTroisNombres(int n1, int n2, int n3) {

		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println(n1 + " est le maximum");
			} else if (n1 < n3) {
				System.out.println(n3 + " est le maximum");
			} else {
				System.out.println(n1 + " est le maximum");
			}
		} else if (n1 < n2)

		{
			if (n2 > n3) {
				System.out.println(n2 + " est le maximum");
			} else if (n2 < n3) {
				System.out.println(n3 + " est le maximum");
			} else {
				System.out.println(n1 + " est le maximum");
			}
		} else {
			if (n1 > n3) {
				System.out.println(n1 + " est le maximum");
			} else if (n1 < n3) {
				System.out.println(n3 + " est le maximum");
			} else {
				System.out.println("Les trois nombres sont égaux");
			}
		}
	}

	public static void PairImpair(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " est pair");
		} else {
			System.out.println(a + " est impair");
		}
	}

	public static void SigneDunNombre(int n) {
		if (n > 0) {
			System.out.println(n + " est positif");
		} else if (n < 0) {
			System.out.println(n + " est négatif");
		} else {
			System.out.println(n + " est nul");
		}
	}

	public static void Bissextile(int annee) {

		// Une année est bissextile si elle est divisible par 4 et non divisble par 100

		if (annee % 4 == 0 & annee % 100 != 0) {
			System.out.println(annee + " est une année bissextile");
		} else {
			System.out.println(annee + " n'est pas une année bissextile");
		}
	}

	public static void DivisibleParCinqEtOnze(int x) {
		if (x % 5 == 0 && x % 11 == 0) {
			System.out.println(x + " est divisible par 5 et 11");
		} else {
			System.out.println(x + " n'est pas divisble par 5 et 11");
		}
	}

	public static void AlphabetOuNon(char alpha) {
		if ((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z')) {
			System.out.println(alpha + " est un alphabet");
		} else {
			System.out.println(alpha + " n'est pas un alphabet");
		}

	}

	public static void VoyelleOuConsonne(char alpha) {
		if ((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z')) {
			if (alpha == 'a' || alpha == 'A' || alpha == 'o' || alpha == 'O' || alpha == 'u' || alpha == 'U'
					|| alpha == 'i' || alpha == 'I' || alpha == 'e' || alpha == 'E' || alpha == 'y' || alpha == 'Y') {
				System.out.println(alpha + " est une voyelle");
			} else {
				System.out.println(alpha + " est une consonne");
			}
		} else {
			System.out.println(alpha + " n'est pas un alphabet");
		}
	}

	public static void TypeDeCaractere(char caractere) {
		if ((caractere >= 'a' && caractere <= 'z') || (caractere >= 'A' && caractere <= 'Z')) {
			System.out.println(caractere + " est pas un alphabet");
		} else if (caractere >= '0' && caractere <= '9') {
			System.out.println(caractere + " est un chiffre");
		} else {
			System.out.println(caractere + " est un caractère spéciale");
		}
	}

	public static void MajusculeMinuscule(char alpha) {

		if (alpha >= 'a' && alpha <= 'z') {
			System.out.println(alpha + " est pas un alphabet en minuscule");

		} else if (alpha >= 'A' && alpha <= 'Z') {
			System.out.println(alpha + " est pas un alphabet en majuscule");
		}
	}

	public static void TriangleValide(float angle1, float angle2, float angle3) {
		if (angle1 + angle2 + angle3 == 180) {
			System.out.println("Le triangle est valide");
		} else {
			System.out.println("Le triangle n'est pas valide");
		}
	}

	public static void TriangleValideCotes(float cote1, float cote2, float cote3) {
		if ((cote1 + cote2 > cote3) && (cote1 + cote3 > cote2) && (cote2 + cote3 > cote1)) {
			System.out.println("Le triangle est valide");
		} else {
			System.out.println("Le triangle n'est pas valide");
		}
	}

	public static void NatureTriangle(float cote1, float cote2, float cote3) {
		if ((cote1 == cote2 && cote1 == cote3 && cote2 == cote3)) {
			System.out.println("Le triangle est équilatéral");
		} else if ((cote1 == cote2) || (cote1 == cote3) || (cote1 == cote3)) {
			System.out.println("Le triangle est isocéle");
		} else {
			System.out.println("Le triangle est scalène");
		}
	}

	public static void BeneficeOuPerte(double achat, double vente) {

		if (vente > achat) {
			System.out.println("Le bénéfice est de: " + (vente - achat));
		} else if (vente < achat) {
			System.out.println("La perte est de: " + (achat - vente));
		}
	}

	public static void SecondDegres(double a, double b, double c) {
		double delta;
		double x1;
		double x2;
		double x0;
		if (a != 0) {
			delta = b * b - 4 * a * c;
			if (delta > 0) {
				x1 = (-b - Math.sqrt(delta)) / 2 * a;
				x2 = (-b + Math.sqrt(delta)) / 2 * a;
				System.out.println("L'équation admet deux solutions :" + x1 + " et " + x2);
			} else if (delta == 0) {
				x0 = (-b / 2 * a);
				System.out.println("L'équation admet une seule solution :" + x0);
			} else {
				System.out.println("L'équation n'admet aucune solution");
			}
		} else {
			if (b != 0) {
				System.out.println("L'équation est du premier degré et sa solution est: " + (-c / b));
			}
		}

	}

	public static void Achat(double benefice, double perte, double vente) {

		double achat;
		if (benefice != 0 && perte == 0) {
			if (vente > benefice) {
				achat = vente - benefice;
				System.out.println("Le prix d'achat est de: " + achat);
			} else {
				System.out.println(
						"Vous avez réalisé une bénéfice, donc le prix de vente doit être supérieur au bénéfice. Veuillez revoir vos chiffres svp!");
			}
		} else if (perte != 0 && benefice == 0) {
			if (perte < vente) {
				achat = vente + perte;
				System.out.println("Le prix d'achat est de: " + achat);
			} else {
				System.out.println(
						"Vous avez réalisé une perte, donc celle ci doit être inférieure au prix de vente. Veuillez revoir vos chiffres svp!");
			}
		} else {
			System.out.println("Impossible de faire un bénéfice et une perte pour une même vente");
		}
	}

	public static void NombresNaturelles(int n) {
		System.out.println("Voici les tous les nombres naturels de 1 à " + n + ":\n");
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}
	}

	public static void InverseNombresNaturelles(long n) {
		System.out.println("Voici les tous les nombres naturels de " + n + " à 1 " + ":\n");
		for (long i = n; i >= 1; i--) {
			System.out.println(i);
		}
	}

	public static void TousLesAlphabets() {
		for (char alpha = 'a'; alpha <= 'z'; alpha++) {
			System.out.println(alpha);
		}
	}

	public static void NombresPairsEntre1Et100() {
		System.out.println("Voici tous les nombres pairs entre 1 et 100");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void NombresImpairsEntre1Et100() {
		System.out.println("Voici tous les nombres impairs entre 1 et 100");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void SommeDesNombres(int n) {
		int somme = 0;
		for (int i = 1; i <= n; i++) {
			somme += i;
		}
		System.out.println("La somme des nombres de " + 1 + " à " + n + " est de : " + somme);
	}

	public static void SommeNombresImpairs() {
		int somme = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				somme += i;
			}
		}
		System.out.println("La somme des nombres impairs de 1 à 100 est de : " + somme);
	}

	public static void TableDeMultiplication(int n) {
		System.out.println("Table de " + n);
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " =" + " " + (i * n));
		}
	}

	public static void FacteursDunNombre(int n) {

		System.out.println("Les facteurs de " + n + " sont:");
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void NombrePremier(int n) {
		int facteurs = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				facteurs++;
			}
		}
		if (facteurs == 2) {
			System.out.println(n + " est un nombre premier");
		} else {
			System.out.println(n + " n'est pas un nombre premier");
		}
	}

	public static void TousLesNombrePremiers(int n) {

		System.out.println("Les nombres premiers entre 1 et " + n + " sont:");
		for (int i = 0; i <= n; i++) {
			int facteurs = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					facteurs++;
				}
			}
			if (facteurs == 2) {
				System.out.println(i);
			}
		}
	}
	
	public static void FacteursPremiers(int n) {

		System.out.println("Les facteurs premiers de "+ n + " sont:");
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				for(int j=1; j<= i; j++) {
					if(i % j ==0) {
					System.out.println(i);
					}
				}
			}
		}
	}
	
	public static void NomDuMois(int num) {
			switch (num) {
			case 1: System.out.println("Janvier");
			break;
			case 2: System.out.println("Février");
			break;
			case 3: System.out.println("Mars");
			break;
			case 4: System.out.println("Avril");
			break;
			case 5: System.out.println("Mai");
			break;
			case 6: System.out.println("Juin");
			break;
			case 7: System.out.println("Juillet");
			break;
			case 8: System.out.println("Août");
			break;
			case 9: System.out.println("Septembre");
			break;
			case 10: System.out.println("Octobre");
			break;
			case 11: System.out.println("Novembre");
			break;
			case 12: System.out.println("Décembre");
			break;
			default: System.out.println("Entrer un nombre compris entre 1 et 12");
			}
	}

	public static void main(String[] args) {

		MaxDeuxNombres(5, 12);
		MaxDeuxNombres(0, 1);
		MaxDeuxNombres(17, 10);
		MaxDeuxNombres(-0, 0);
		MaxDeuxNombres(19, 19);

		MaxTroisNombres(0, 0, 5);
		MaxTroisNombres(7, 3, 5);
		MaxTroisNombres(100, 100, 100);
		MaxTroisNombres(0, 0, 0);
		MaxTroisNombres(16, 7, 18);

		PairImpair(3);
		PairImpair(7);
		PairImpair(14);
		PairImpair(21);
		PairImpair(24);

		SigneDunNombre(1);
		SigneDunNombre(0);
		SigneDunNombre(-5);
		SigneDunNombre(4);
		SigneDunNombre(-150);

		Bissextile(1900);
		Bissextile(2000);
		Bissextile(2008);
		Bissextile(2012);
		Bissextile(2021);

		DivisibleParCinqEtOnze(55);
		DivisibleParCinqEtOnze(5);
		DivisibleParCinqEtOnze(11);
		DivisibleParCinqEtOnze(11);
		DivisibleParCinqEtOnze(110);

		AlphabetOuNon('a');
		AlphabetOuNon('z');
		AlphabetOuNon('9');
		AlphabetOuNon(';');
		AlphabetOuNon('E');

		VoyelleOuConsonne('a');
		VoyelleOuConsonne('Y');
		VoyelleOuConsonne('z');
		VoyelleOuConsonne('D');
		VoyelleOuConsonne('A');
		VoyelleOuConsonne('E');

		TypeDeCaractere(')');
		TypeDeCaractere('a');
		TypeDeCaractere('Z');
		TypeDeCaractere('0');
		TypeDeCaractere('7');
		TypeDeCaractere(';');

		MajusculeMinuscule('a');
		MajusculeMinuscule('A');
		MajusculeMinuscule('E');
		MajusculeMinuscule('e');
		MajusculeMinuscule('D');

		TriangleValide(10, 50, 100);
		TriangleValide(60, 60, 60);
		TriangleValide(70, 10, 100);
		TriangleValide(10, 10, 100);
		TriangleValide(110, 20, 50);

		TriangleValideCotes(5, 5, 5);
		TriangleValideCotes(5, 6, 7);
		TriangleValideCotes(8, 7, 6);
		TriangleValideCotes(1, 2, 5);
		TriangleValideCotes(10, 2, 3);

		NatureTriangle(5, 5, 5);
		NatureTriangle(5, 5, 7);
		NatureTriangle(8, 7, 6);
		NatureTriangle(10, 10, 10);
		NatureTriangle(21, 22, 23);

		BeneficeOuPerte(15000, 12000);
		BeneficeOuPerte(1000, 2500);
		BeneficeOuPerte(10000, 15000);
		BeneficeOuPerte(14000, 13500);
		BeneficeOuPerte(1000, 875);

		SecondDegres(1, 1, 0);
		SecondDegres(1, 5, 4);
		SecondDegres(4, 5, 3);
		SecondDegres(2, 4, 1);
		SecondDegres(0, 2, 5);

		Achat(5000, 0, 15000);
		Achat(0, 15000, 25000);
		Achat(1000, 0, 1500);
		Achat(450000, 0, 100000);
		Achat(0, 100, 250);

		NombresNaturelles(5);
		NombresNaturelles(7);
		NombresNaturelles(10);
		NombresNaturelles(9);
		NombresNaturelles(3);

		InverseNombresNaturelles(5);
		InverseNombresNaturelles(7);
		InverseNombresNaturelles(10);
		InverseNombresNaturelles(9);
		InverseNombresNaturelles(3);

		TousLesAlphabets();

		NombresPairsEntre1Et100();

		NombresImpairsEntre1Et100();

		SommeDesNombres(3);
		SommeDesNombres(4);
		SommeDesNombres(5);
		SommeDesNombres(6);
		SommeDesNombres(7);

		SommeNombresImpairs();

		TableDeMultiplication(1);
		TableDeMultiplication(2);
		TableDeMultiplication(3);
		TableDeMultiplication(4);
		TableDeMultiplication(5);

		FacteursDunNombre(4);
		FacteursDunNombre(6);
		FacteursDunNombre(9);
		FacteursDunNombre(10);
		FacteursDunNombre(12);

		NombrePremier(5);
		NombrePremier(10);
		NombrePremier(7);
		NombrePremier(17);
		NombrePremier(25);

		TousLesNombrePremiers(10);
		TousLesNombrePremiers(9);
		TousLesNombrePremiers(12);
		TousLesNombrePremiers(18);
		TousLesNombrePremiers(25);
		
		NomDuMois(1);
		NomDuMois(2);
		NomDuMois(3);
		NomDuMois(10);
		NomDuMois(12);
	
	}

}