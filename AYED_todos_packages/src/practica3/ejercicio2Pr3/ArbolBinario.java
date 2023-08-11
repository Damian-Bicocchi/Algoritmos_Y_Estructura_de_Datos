package practica3.ejercicio2Pr3;

import practica3.estructuras.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;
	private ArbolBinario<T> hijoDerecho;
	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * 
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo != null;
	}

	public boolean tieneHijoDerecho() {
		return this.hijoDerecho != null;
	}
	
	public void inOrden() {
		if (!this.esVacio()) {
			if (this.tieneHijoIzquierdo()) {
				this.getHijoIzquierdo().inOrden();
			}
			
			System.out.println(this.getDato());
			
			if (this.tieneHijoDerecho()) {
				this.getHijoDerecho().inOrden();
			}
			
		}
	}
	
	public void preOrden() {
		if (!this.esVacio()) {
			System.out.println(this.getDato());
			
			if (this.tieneHijoIzquierdo()){
				this.getHijoIzquierdo().preOrden();
			}
			if (this.tieneHijoDerecho()){
				this.getHijoDerecho().preOrden();
			}
		}
	}
	
	public void postOrden(){
		if (!this.esVacio()) {
			if (this.tieneHijoIzquierdo()){
				this.getHijoIzquierdo().postOrden();
			}
			if (this.tieneHijoDerecho()){
				this.getHijoDerecho().postOrden();
			}
			System.out.println(this.getDato());
		}
	}

	public int contarHojas() {
		int contHojas = 0;
		if (!this.esVacio()) {
			if (!this.esHoja()) {
				if (this.tieneHijoIzquierdo()) {
					contHojas += this.getHijoIzquierdo().contarHojas();
				}
				if (this.tieneHijoDerecho()) {
					contHojas += this.getHijoDerecho().contarHojas();
				}
				
			}
			else {
				contHojas ++;
			}
		}
		return contHojas;
	}
	
	public ArbolBinario<T> espejo(){
		ArbolBinario<T> arbolAux = null;
		if (!this.esVacio()) {
			arbolAux = new ArbolBinario<T>();
			arbolAux.setDato(this.getDato());
			if (this.tieneHijoIzquierdo()) {
				arbolAux.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
			}
			if (this.tieneHijoDerecho()) {
				arbolAux.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
			}
		}
		return arbolAux;
	}
	
	public void entreNiveles(int n, int m) {
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		ArbolBinario<T> arbolAux = null;
		int nivelAct = 0;
		if (!this.esVacio()) {
			cola.encolar(this);
			cola.encolar(null);
			while (!cola.esVacia() && nivelAct <= m) {
				arbolAux = cola.desencolar();
				if (arbolAux != null) {
					if (nivelAct>= n) {
						System.out.println(arbolAux.getDato());
					}
					if (arbolAux.tieneHijoIzquierdo() && (nivelAct+1 <= m)){
						cola.encolar(arbolAux.getHijoIzquierdo());
					}
					if (arbolAux.tieneHijoDerecho() && (nivelAct+1 <= m)) {
						cola.encolar(arbolAux.getHijoDerecho());
					}
				
				}
				else {
					if (!cola.esVacia()) {
						System.out.println("-------------------------------");
						nivelAct ++;
						cola.encolar(null);
					}
				}
			}
			
		}
	}
	
	
}
