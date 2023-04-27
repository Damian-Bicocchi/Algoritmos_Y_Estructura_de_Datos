package practica2.ejercicio2Pr2;
import tp02.ejercicio1.*;

public class Ejercicio1_6 {
	private ListaDeEnterosEnlazada lista;
	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		if ((n == 0) || (n == 1)) {
			this.lista.agregarFinal(n);
		}
		else {
			this.lista.agregarFinal(n);
			if (n % 2 == 0) {
				this.calcularSucesion(n/2);
			}
			else {
				this.calcularSucesion(3*n + 1);
			}
		}
		return this.lista;
	}
		
	public static void main (String[] args) {
		 Ejercicio1_6 f = new Ejercicio1_6();
		 ListaDeEnterosEnlazada l = f.calcularSucesion(4);
		 //código que recorre e imprime los valores de l
		 while (!l.fin()) {
			 System.out.println(l.proximo());
		 }
	}
}
