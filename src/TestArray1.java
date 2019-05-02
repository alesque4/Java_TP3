
public class TestArray1 {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int i, max, min;
		
		//Affichage
		String affichage = "Array : [ ";
		for(i=0 ; i<array.length; i++) {
			affichage = affichage + array[i] + ", ";
		}
		affichage += ']';
		System.out.println((new StringBuilder(affichage)).deleteCharAt(affichage.length()-3));
		
		//Affichage inverse
		affichage = "Array : [ ";
		for(i=array.length-1 ; i>=0 ; i--) {
			if (i!=array.length-1) {
				affichage = affichage +", ";
			}
			affichage = affichage + array[i];
		}
		affichage += ']';
		System.out.println((new StringBuilder(affichage)).deleteCharAt(affichage.length()-3));
		
		//Affichage des entiers supérieurs à 3
		affichage = "Array : [ ";
		for(i=0 ; i<array.length; i++) {
			if(array[i] >= 3) {
				
				affichage = affichage + array[i] + ", ";
			}
		}
		affichage += ']';
		System.out.println((new StringBuilder(affichage)).deleteCharAt(affichage.length()-3));
		
		//Affichage pairs
		affichage = "Array : [ ";
		for(i=0 ; i<array.length; i++) {
			if(array[i] % 2 == 0) {
				
				affichage = affichage + array[i] + ", ";
			}
		}
		affichage += ']';
		System.out.println((new StringBuilder(affichage)).deleteCharAt(affichage.length()-3));
		
		//Maximum
		affichage = "Array : [ ";
		max = array[0];
		for(i=1 ; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		affichage += ']';
		System.out.println("Maximum : "+max);
		
		//Minimum
		affichage = "Array : [ ";
		min = array[0];
		for(i=1 ; i<array.length; i++) {
			if(array[i] < max) {
				min = array[i];
			}
		}
		affichage += ']';
		System.out.println("Maximum : "+min);
	}
}
