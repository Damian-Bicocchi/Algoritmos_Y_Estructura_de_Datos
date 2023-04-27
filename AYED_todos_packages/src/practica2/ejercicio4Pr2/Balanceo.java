package practica2.ejercicio4Pr2;
import practica2.estructuras.*;
public class Balanceo {
	public static boolean esBalanceado(String s){
		PilaGenerica<Character> miPila = new PilaGenerica<Character>();
		int largo = 0;
		boolean ok = true;
		while ((largo < s.length()) && ok) {
			char aux, c = s.charAt(largo);
			if ((c == '(') || (c == '[') || (c == '{')) {
				miPila.apilar(c);
			}
			else {
				aux = miPila.desapilar();
				switch (c) {
					case ')':
						if (aux != '(') {
							ok = false;
						}
						break;
					case ']':
						if (aux != '[') {
							ok = false;
						}
						break;
					case '}':
						if (aux != '{') {
							ok = false;
						}
						break;	
				}
			}
			largo++;
		}
		return ok;
	}
	
	//private Scanner input = new Scanner(System.in);
	public static void main(String [] args) {
		//Scanner input = new Scanner(System.in);
		//System.out.println("Ingrese la cadena de string: ");
		String cad = "[()]";
		
		if (esBalanceado(cad)){
			System.out.println("Escribiste biennnnnn");
		}
		else {
			System.out.println("Escribiste mal :(");
		}
		System.out.println();
		//input.close();
	}
	
	
}
