package practica3.estructuras;

public class PilaGenerica<T> {
	private ListaEnlazadaGenerica<T> pila;

	public void apilar(T elemento) {
		this.pila.agregarInicio(elemento);
	}

	public T desapilar() {
        T elem = this.pila.elemento(1);
        this.pila.eliminarEn(1);
        return elem;
    }
	
	public boolean esVacia() {
		return this.pila.tamanio() == 0;
	}

	public T tope(){
	    return this.pila.elemento(this.pila.tamanio());
	}

	public PilaGenerica() {
		
		pila = new ListaEnlazadaGenerica<T>();
		
	}

}
