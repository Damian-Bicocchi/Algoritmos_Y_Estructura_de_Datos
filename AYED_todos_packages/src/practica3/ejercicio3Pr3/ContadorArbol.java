package practica3.ejercicio3Pr3;

import practica3.estructuras.*;


public class ContadorArbol {
	ArbolBinario<Integer> miArbol;
	
	public ContadorArbol(ArbolBinario<Integer> miArbol) {
		this.miArbol = miArbol;
	}
	
	public void setMiArbol(ArbolBinario<Integer> miArbol) {
		this.miArbol = miArbol;
	}

	public ListaEnlazadaGenerica<Integer> numerosParesInOrden(){
		ListaEnlazadaGenerica<Integer> listaAux = null;
		if (!this.miArbol.esVacio()) {
			listaAux = new ListaEnlazadaGenerica<Integer>();
			numParesRecursivoInOrden(this.miArbol, listaAux);	
		}
		return listaAux;
	}
	
	public ListaEnlazadaGenerica<Integer> numerosParesPostOrden(){
		ListaEnlazadaGenerica<Integer> listaAux = null;
		if (!this.miArbol.esVacio()) {
			listaAux = new ListaEnlazadaGenerica<Integer>();
			numParesRecursivoPostOrden(this.miArbol, listaAux);	
		}
		return listaAux;
	}
	
	private void numParesRecursivoInOrden(ArbolBinario<Integer> arbol, ListaEnlazadaGenerica<Integer> lista) {
		if (arbol != null) {
			if (arbol.tieneHijoIzquierdo()){
				numParesRecursivoInOrden(arbol.getHijoIzquierdo(),lista);
			}
			if (arbol.getDato() % 2 == 0) {
				lista.agregarInicio(arbol.getDato());	
			}
			if (arbol.tieneHijoDerecho()) {
				numParesRecursivoInOrden(arbol.getHijoDerecho(),lista);
			}
		}
	}

	private void numParesRecursivoPostOrden(ArbolBinario<Integer> arbol, ListaEnlazadaGenerica<Integer> lista) {
		if (arbol != null) {
			if (arbol.tieneHijoIzquierdo()){
				numParesRecursivoPostOrden(arbol.getHijoIzquierdo(),lista);
			}
			if (arbol.tieneHijoDerecho()) {
				numParesRecursivoPostOrden(arbol.getHijoDerecho(),lista);
			}
			if (arbol.getDato() % 2 == 0) {
				lista.agregarInicio(arbol.getDato());	
			}
			
			
		}
	}

	public static void main(String[] args) {
		ArbolBinario<Integer> a= new ArbolBinario<Integer>();
		ArbolBinario<Integer> b= new ArbolBinario<Integer>();
		ArbolBinario<Integer> c= new ArbolBinario<Integer>();
		ArbolBinario<Integer> d= new ArbolBinario<Integer>();
		ArbolBinario<Integer> e= new ArbolBinario<Integer>();
		ArbolBinario<Integer> f= new ArbolBinario<Integer>();
		a.setDato(8);
		b.setDato(2);
		c.setDato(6);
		d.setDato(7);
		e.setDato(9);
		f.setDato(10);
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);
		d.agregarHijoDerecho(f);
		
		ContadorArbol k = new ContadorArbol(a);
		
		ListaEnlazadaGenerica<Integer> listaInOrden = k.numerosParesInOrden();
		ListaEnlazadaGenerica<Integer> listaPostOrden = k.numerosParesPostOrden();
		listaInOrden.comenzar();
		listaPostOrden.comenzar();
		while (!listaInOrden.fin()) {
			System.out.println( listaInOrden.proximo());
		}
		System.out.println("......................................................");
		while (!listaPostOrden.fin()) {
			System.out.println(listaPostOrden.proximo());
		}
	}
}
