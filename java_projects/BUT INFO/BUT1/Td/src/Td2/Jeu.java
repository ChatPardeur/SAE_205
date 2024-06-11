package Td2;

import java.util.Scanner;

public class Jeu 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		boolean arreter = false;
		
		Table t = new Table(28);
		t.initTab();
		t.affTable();
		
		String reponse = new String();
		int gauche, droite;		
		while(!arreter)
		{

			System.out.println("entrez un domino à jouer (les 2 valeurs séparées par un espace)");
			gauche = sc.nextInt();
			droite = sc.nextInt();
						
			switch (t.recherche(gauche, droite)) {
			case -1:
				t.poserAgauche(gauche, droite);
				break;
			case 1:
				t.PoserAdroite(gauche, droite);
				break;
			default:
				System.out.println("err");
				break;
			}
			
			t.affTable();
			
			System.out.println("voulez-vous arrêter ?(oui/non)");
			Scanner scan = new Scanner(System.in);

			reponse = scan.nextLine();
			
			if(reponse.compareTo("oui") == 0)
			{
				arreter = true;
				System.out.println("arrêt du jeu");
			}
		}
	}
}
