package practica3.ejercicio4Pr3;

import practica3.estructuras.*;

public class RedBinariaLlena {
	/*
	 * Se necesitaria usar un recorrido en profundidad. Vamos sacando el maximo de la suma de cada subarbol
	 * del arbol, asi devolvemos el mayor retardo. Por lo tanto, tenemos que ir hasta el fondo del arbol
	 * e ir volviendo
	 */
	
	private ArbolBinario<Integer> laRed;

	public void setLaRed(ArbolBinario<Integer> laRed) {
		this.laRed = new ArbolBinario<Integer>();
	}
	
	public int retardoReenvio() {
		if (!this.laRed.esVacio()) {
			return enProfundidadRet(this.laRed);
		}
		else {
			return 0;
		}
	}
	
	private int enProfundidadRet(ArbolBinario<Integer> a) {
		if (!a.esVacio()) {
			if (!a.esHoja()) {
				return (a.getDato() + Math.max(enProfundidadRet(a.getHijoIzquierdo()), enProfundidadRet(a.getHijoDerecho())));
			}
			else {
				return a.getDato();
			}
		}
		return 0;
	}
	
}
