package practica3.estructuras;


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

	

	public ArbolBinario<T> espejo() {
		ArbolBinario<T> miArbolAux = null;
		if (!this.esVacio()) {
			miArbolAux = new ArbolBinario<T>();
			miArbolAux.setDato(this.getDato());
			if (this.tieneHijoIzquierdo()){
				miArbolAux.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
			}
			if (this.tieneHijoDerecho()){
				miArbolAux.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
			}
		}
		return miArbolAux;
	}

	public void entreNiveles(int n, int m) {
		
		int nivelAct = 0;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		ArbolBinario<T> arbolAux = null;
		if (!this.esVacio()) {
			while (!cola.esVacia() && nivelAct <= m) {
				arbolAux = cola.desencolar();
				if (arbolAux != null) {
					if ((nivelAct >= n) && (nivelAct <= m)) {
						System.out.println(arbolAux.getDato());
					}
					if (arbolAux.tieneHijoIzquierdo()){
						cola.encolar(arbolAux.getHijoIzquierdo());
					}
					if (arbolAux.tieneHijoDerecho()){
						cola.encolar(arbolAux.getHijoDerecho());
					}
					
				}
				else {
					if (!cola.esVacia()) {
						System.out.println("------------------");
						cola.encolar(null);
						nivelAct++;
					}
				}
			}
			
		}
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
	

	
	public int contarHojas () {
		
		if (this != null) {
			if ((!this.tieneHijoDerecho()) && (!this.tieneHijoIzquierdo())) {
				return 1;
			}
			else {
				int cont = 0;
				if (this.tieneHijoIzquierdo()) {
					cont += this.getHijoIzquierdo().contarHojas();
				}
				if (this.tieneHijoDerecho()) {
					cont += this.getHijoDerecho().contarHojas();
				}
				
				return cont;
			}
		}
		return 0;
	}
	

	
	
	public int altura_arbol () {
		if (this.esHoja())
			return 0;
		else {
			int rec_izq = 0;
			int rec_der = 0;
			if (this.tieneHijoIzquierdo())
				rec_izq = 1 + this.getHijoIzquierdo().altura_arbol();
			
			if (this.tieneHijoDerecho())
				rec_der = 1 + this.getHijoDerecho().altura_arbol();
			
			return Math.max(rec_izq, rec_der);
		}
	}
}



