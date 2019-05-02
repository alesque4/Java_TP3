import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		Scanner questionUser = new Scanner(System.in);
		
		int nUtilisateur=0, resultat=0;
		
		//Entree utilisateur
		System.out.print("Entrez un rang N : ");
		try {
			nUtilisateur = questionUser.nextInt();
			if(nUtilisateur < 0) {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOOOO !");
		}
		
		//calcul
		resultat = fibo(nUtilisateur);
		
		//Affichage
		System.out.println("Fibonacci("+nUtilisateur+") = "+resultat);
	}
	
	//calcule fibonacci(n) récursivement
	public static int fibo(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1 || n == 2) {
			return 1;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
	}

}
