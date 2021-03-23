package monPremierProjetJava;

import java.util.Arrays;
import java.util.Collections;

public class TabExo17 {

	public static void ordreDecroissant() {
		Integer[] tableau = { -1, -2, 5, 9, -5, 6, 7, 3, 4, 2 };
		
		Arrays.sort(tableau, Collections.reverseOrder()); 
		System.out.println("Les valeurs du tableau trié par ordre décroissant :");
		for(int i:tableau) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ordreDecroissant();
	}

}
