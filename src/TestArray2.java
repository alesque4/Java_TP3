public class TestArray2{
	
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int i;
		
		//Moyenne
		int somme=0;
		float moyenne=0;
		for(i=0; i<array.length; i++) {
			somme += array[i];
		}
		moyenne = (float)somme / (float)array.length;
		System.out.println("Moyenne : "+moyenne);
		
		//Nombre de doublons
		int j, nombreDoublons=0;
		for(i=0; i<array.length; i++) {
			for(j=i+1; j<array.length; j++) {
				if(array[j] == array[i]) {
					nombreDoublons++;
				}
			}
		}
		System.out.println("Nombre de doublons : "+nombreDoublons);
		
		//Index de l'entier 15
		for(i=0 ; i<array.length; i++) {
			if(array[i] == 15) {
				System.out.println("Index de 15 : "+i);
				break;
			}
		}
		
	}

}
