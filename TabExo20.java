package monPremierProjetJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TabExo20 {
	
	public static void rangerValeurEntreeDecroissant(int n) {
		Integer untab[] = new Integer[n];
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
		
		Arrays.sort(untab,Collections.reverseOrder());
		
		System.out.println("Les valeurs entrées triées par ordre décroissant");
		for(int i:untab) {
			System.out.println(i);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rangerValeurEntreeDecroissant(5);

	}
}
