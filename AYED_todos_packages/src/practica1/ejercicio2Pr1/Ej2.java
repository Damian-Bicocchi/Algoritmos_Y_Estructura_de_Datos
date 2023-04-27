package practica1.ejercicio2Pr1;
import java.util.Scanner;
public class Ej2 {
	
	public static int[] multiplosN(int n) {
		int[] vector = new int[n];
		for (int i = 0; i < n; i++) {
			vector[i] = n * (i + 1);
		}
		return vector;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n");
		
		int [] miArray = Ej2.multiplosN(s.nextInt());
		for (int i = 0; i < miArray.length;i++) {
			System.out.println(miArray[i]);
		}
		s.close();

	}

}
