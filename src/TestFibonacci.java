import java.util.Scanner;

public class TestFibonacci {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner questionUser = new Scanner(System.in);
		boolean inputOk = false;
		
		int nUtilisateur=0;
		
		//Entree utilisateur
		System.out.print("Entrez un rang N : ");
		inputOk = false;
		while(!inputOk){
			if(questionUser.hasNextInt()) {
				nUtilisateur = questionUser.nextInt();
				if(nUtilisateur >= 0) {
					inputOk = true;
				}else {
					System.out.println("Entrez un nombre positif");
				}
			}else {
				System.out.println("Entrez un nombre entier positif.");
				questionUser.next();
			}
		}
		
		//Affichage du resultat
		System.out.println("Fibonacci("+nUtilisateur+") = "+fibo(nUtilisateur));
	}
	
	//calcule fibonacci(n)
	public static int fibo(int n) {
		int n1=0, n2=1, n3=1;
		
		if(n == 0) {
			return 0;
		}else if(n == 1 || n == 2) {
			return 1;
		}else {
			n -= 2;
			while(n>0) {
				n1=n2;
				n2=n3;
				n3=n1+n2;
				n--;
			}
			return n3;
		}
	}

}
