package monPremierProjetJava;

import java.util.Arrays;

public class TabExo16 {


	public static void OrdreCroissant() {
		int[] tableau = { -1, -2, 5, 9, -5, 6, 7, 3, 4, 2 };
		
		Arrays.sort(tableau); 
		System.out.println("Les valeurs du tableau trié par ordre croissant :");
		for(int i:tableau) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdreCroissant();
	}

}
