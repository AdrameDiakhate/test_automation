package monPremierProjetJava;

import java.util.Scanner;

public class TabExo21 {

	public static void insererNombre() {
		int monTableau[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		//int first = monTableau[0];
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la valeur du nombre à insérer");
		x = sc.nextInt();
		sc.close();
		for(int i=0;i<monTableau.length;i++) {
			if(monTableau[i]>x) {
				//monTableau[i]=x;
			}
		}
		for(int i:monTableau) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insererNombre();
	}

}
