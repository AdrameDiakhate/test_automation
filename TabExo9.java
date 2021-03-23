package monPremierProjetJava;

import java.util.Scanner; // Import the Scanner class

/*
 faites un programme JAVA qui permet de lire un tableau de 10 notes
d��l�ves et de d�terminer le nombre de celles qui sont sup�rieures ou �gales � la
moyenne.

 */
public class TabExo9 {

	public static void superieureMoyenne() {
		double somme = 0;
		double notes[] = new double[10];
		int nombre = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < notes.length; i++) {
			System.out.println("Entrer la note n� " + (i + 1));
			notes[i] = sc.nextDouble();
			somme += notes[i];
		}
		sc.close();
		for (double i : notes) {
			if (i >= (somme / notes.length)) {
				nombre++;
			}
		}
		System.out.println("Le nombre de note sup�rieure � la moyenne est : " + nombre);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superieureMoyenne();
	}

}
