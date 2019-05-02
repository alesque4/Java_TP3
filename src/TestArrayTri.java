import java.util.Arrays;

public class TestArrayTri {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int i;
		
		Arrays.sort(array);
		//Affichage
		String affichage = "Array : [ ";
		for(i=0 ; i<array.length; i++) {
			affichage = affichage + array[i] + ", ";
		}
		affichage += ']';
		System.out.println((new StringBuilder(affichage)).deleteCharAt(affichage.length()-3));
	}
}
