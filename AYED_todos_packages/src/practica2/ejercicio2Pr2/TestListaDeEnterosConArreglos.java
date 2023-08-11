package practica2.ejercicio2Pr2;
import practica1.estructuras.*;

public class TestListaDeEnterosConArreglos {
	public static void main(String [] args) {
		ListaDeEnterosConArreglos miListaArreglo = new ListaDeEnterosConArreglos();
		for (String arg: args) {
			miListaArreglo.agregarInicio(Integer.parseInt(arg));
		}
		
		miListaArreglo.comenzar();
		while (!miListaArreglo.fin()) {
			System.out.println(miListaArreglo.proximo());
		}

		System.out.println("------------------------------------------");
		miListaArreglo.comenzar();
		//miListaArreglo.imprimirReves(miListaArreglo);
		
	}
}
