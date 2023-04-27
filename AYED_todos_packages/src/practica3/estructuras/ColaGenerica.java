package estructuras;


public class ColaGenerica<T> {
	  private ListaEnlazadaGenerica<T> cola;
	  
	  public ColaGenerica() {
		    cola = new ListaEnlazadaGenerica<T>();
	  }
	  
	  public void encolar(T elemento){
	    this.cola.agregarFinal(elemento);
	  }
	  
	  public boolean esVacia(){
	    return this.cola.esVacia();
	  }
	  
	  
	  public T desencolar(){
	    T elementoPrincipio = null;
	    this.cola.comenzar();
	    if (!this.cola.esVacia()) {
	        elementoPrincipio = this.cola.proximo();
	        this.cola.eliminar(elementoPrincipio);
	    }
	    return elementoPrincipio;
	    
	  }
	  public T tope() {
	    return this.cola.elemento(1);
	  }
	  
	  
	  
	  
}

