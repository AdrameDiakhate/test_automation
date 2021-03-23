package monPremierProjetJava;

import java.util.Arrays;
import java.util.Scanner;

public class TabExo19 {

	public static void rangerValeurEntreeCroissant(int n) {
		int untab[] = new int[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Entrer la valeur n° " + (i + 1));
			untab[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("Les valeurs entrées avant le tri");
		for(int i:untab) {
			System.out.println(i);
		}
		
		Arrays.sort(untab);
		
		System.out.println("Les valeurs entrées triées par ordre croissant");
		for(int i:untab) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rangerValeurEntreeCroissant(5);
	}

}
