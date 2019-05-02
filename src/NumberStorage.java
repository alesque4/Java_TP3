import java.util.Scanner;

public class NumberStorage {
	
	final static int TAB_SIZE = 5;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		float[] tab = new float[TAB_SIZE];
		float[] tab_temp;
		int tab_i=0, i=0;
		String affichage = "";
		boolean entreeUtilisateurOk = false;
		
		Scanner questionUser = new Scanner(System.in);
		int choix=0;
		float nombreEntre=0;
		
		
		while(true) {
			//menu
			System.out.println("1 : Ajouter un nombre");
			System.out.println("2 : Afficher le tableau");
			System.out.print("Choix : ");
			entreeUtilisateurOk=false;
			
			//Récupération du choix de l'utilisateur
			while(!entreeUtilisateurOk) {
				if(questionUser.hasNextInt()) {
					choix = questionUser.nextInt();
					if(choix == 1 || choix == 2) {
						entreeUtilisateurOk = true;
					}else {
						System.out.println("Entrez une valeur valide.");
					}
				}else {
					System.out.println("Entrez une valeur valide.");
					questionUser.next();
				}
			}
			
			switch(choix) {
			//Ajout d'un nombre
			case 1:
				System.out.print("Entrez un nombre : ");
				entreeUtilisateurOk = false;
				
				while(!entreeUtilisateurOk) {
					if(questionUser.hasNextFloat()) {
						nombreEntre = questionUser.nextFloat();
						entreeUtilisateurOk = true;
					}else {
						System.out.println("Entrez un nombre :");
						questionUser.next();
					}
				}
				
				//Si le tableau est plein, on en fait un nouveau
				if(tab_i == tab.length) {
					tab_temp = new float[tab.length+TAB_SIZE];
				
					//Copie dans le nouveau tableau
					for(i=0; i<tab_i; i++) {
						tab_temp[i] = tab[i];
					}
					
					//Changement de tableau
					tab = tab_temp;
				}
				//Ajout du nouveau nombre
				tab[tab_i] = nombreEntre;
				tab_i++;
				break;
				
			//Affichage
			case 2:
				affichage = "[ ";
				for(i=0; i<tab_i; i++) {
					affichage = affichage + tab[i] + ", ";
				}
				affichage = affichage + "]";
				System.out.println("Tableau : "+(new StringBuilder(affichage)).deleteCharAt(affichage.length()-3));
				break;
			}
		}
	}

}
