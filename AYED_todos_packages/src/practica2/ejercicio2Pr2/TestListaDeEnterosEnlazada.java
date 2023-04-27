package practica2.ejercicio2Pr2;
import tp02.ejercicio1.*;
public class TestListaDeEnterosEnlazada {
	
	public static void main(String[] args) {
		ListaDeEnterosEnlazada miListaEnlazada = new ListaDeEnterosEnlazada();
		for (String num:args) {
			miListaEnlazada.agregarInicio(Integer.parseInt(num));
		}	
		
		miListaEnlazada.comenzar();
		while(!miListaEnlazada.fin()) {
			System.out.println(miListaEnlazada.proximo());
		}
		System.out.println("________________________________");
		miListaEnlazada.comenzar();
		miListaEnlazada.imprimirReves(miListaEnlazada);
		
	}
}