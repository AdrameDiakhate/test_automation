package monPremierProjetJava;
/*
Créer un programme JAVA qui Permet de faire la somme des éléments
de deux tableaux de même longueur préalablement saisis:
1/ La somme sera effectuée dans l’un des deux tableaux (case par case).
2/ La somme sera effectuée dans un 3ème tableau (case par case).
*/

public class TabExo7 {

	public static void sommeTableauVersion1() {
		int tableau1[]= {1,2,3,4,5};
		int tableau2[]= {6,7,8,9,10};
		
		for(int i=0;i<5;i++) {
				tableau1[i]=tableau1[i]+tableau2[i];
		}
		for(int i:tableau1) {
			System.out.println("Première version "+i);
		}
	}
	
	public static void sommeTableauVersion2() {
		int tableau1[]= {1,2,3,4,5};
		int tableau2[]= {6,7,8,9,10};
		int tableau3[]=new int[5];
		
		for(int i=0;i<5;i++) {			
				tableau3[i]=tableau1[i]+tableau2[i];
		}
		for(int i:tableau3) {
			System.out.println("Deuxième versison "+i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sommeTableauVersion1();
		sommeTableauVersion2();

	}

}
