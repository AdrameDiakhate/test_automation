package monPremierProjetJava;

/*
 Créer un programme JAVA qui Permet de vérifier que deux tableaux de
même longueur sont identiques (les éléments des deux tableaux seront remplis par
une fonction).

 */

public class TabExo6 {
	
	static int [] premier=new int[10];
	static int [] deuxieme=new int[10];
	
	public static void remplirTableau() {
		for(int i=0; i<10;i++) {
			premier[i]=i+1;
			deuxieme[i]=i+2;
		}
		
	}
	public static void compareTableau() {
		boolean identique=true;
		for(int i:premier) {
			for(int j:deuxieme) {
			if(i!=j) {
			identique=false;
			}
		}
	}
		if(identique==true) {
			System.out.println("Les deux tableaux sont identiques");
		}
		else
		{
			System.out.println("Les deux tableaux sont différents");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remplirTableau();
		compareTableau();

	}

}
