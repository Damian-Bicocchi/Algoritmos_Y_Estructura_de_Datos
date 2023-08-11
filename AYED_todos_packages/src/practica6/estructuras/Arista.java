package practica6.estructuras;

/**
 * Representa una arista de un {@link Grafo} 
 * 
 * @author juan
 *
 */
public interface Arista<T> {
	
	public Vertice<T> verticeDestino();
	public int peso();

}
