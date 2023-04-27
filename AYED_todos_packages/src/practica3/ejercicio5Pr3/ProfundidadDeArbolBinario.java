package practica3.ejercicio5Pr3;


import practica3.estructuras.*;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> a;

	public ProfundidadDeArbolBinario(ArbolBinario<Integer> a) {
		super();
		this.a = a;
	}
	
	public int sumaElementosProfundidad(int p) {
		int suma = 0;
		int profAct = 0;
		ArbolBinario<Integer> aux = null; 
		if (!this.a.esVacio()) {
			ColaGenerica<ArbolBinario<Integer>>cola = new ColaGenerica<ArbolBinario<Integer>>();
			cola.encolar(this.a);
			cola.encolar(null);
			while (!cola.esVacia() && profAct <= p) {
				aux = cola.desencolar();
				if (aux != null) {
					if (profAct == p) {
						suma += aux.getDato();
					}
					else {
						if (aux.tieneHijoIzquierdo()) {
							cola.encolar(aux.getHijoIzquierdo());
						}
						if (aux.tieneHijoDerecho()) {
							cola.encolar(aux.getHijoDerecho());
						}
					}
				}
				else {
					profAct++;
					cola.encolar(null);
				}
			}
		}
		return suma;
	}
	
}
