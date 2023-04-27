package practica4.ejercicio3Pr4;
import practica2.estructuras.*;
import practica4.estructuras.*;
public class RecorridosAG {
	
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n) { // private
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>(); // lista de impares mayores que n a retornar
		priNumerosImparesPreOrden(a, n, l);
		return l;
	}

	private void priNumerosImparesPreOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
		ListaGenerica<ArbolGeneral<Integer>> hijosAux = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> datoAux = null;
		if (a != null) {
			if ((a.getDato() % 2 != 0) && (a.getDato() > n))
				l.agregarFinal(a.getDato()); 
			if (a.tieneHijos()) {
				hijosAux = a.getHijos();
				hijosAux.comenzar();
				while (!hijosAux.fin()) {
					datoAux = hijosAux.proximo();
					priNumerosImparesPreOrden(datoAux, n, l);
				}
			}
		}
	}
	
	
	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> a, Integer n) { // private
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>(); // lista de impares mayores que n a retornar
		priNumerosImparesInOrden(a, n, l);
		return l;
	}
	
	private void priNumerosImparesInOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
		if (!a.esHoja()) {
			ListaEnlazadaGenerica<ArbolGeneral<Integer>> listaHijos = (ListaEnlazadaGenerica<ArbolGeneral<Integer>>) a.getHijos();
			listaHijos.comenzar();
			priNumerosImparesInOrden(listaHijos.proximo(),n,l); 
			if (a.getDato() % 2 != 0 && a.getDato() > n) { 
				l.agregarFinal(a.getDato()); 
			}
			while (!listaHijos.fin())
				;
			priNumerosImparesInOrden(listaHijos.proximo(),n,l);
		} else {
			if (a.getDato() % 2 != 0 && a.getDato() > n)
				l.agregarFinal(a.getDato()); // proceso la raiz
		}

	}
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>(); // lista de impares mayores que n a retornar
		priNumerosImparesPostOrden(a, n, l);
		return l;
	}
	
	private void priNumerosImparesPostOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
		if (!a.esHoja()) {
			ListaEnlazadaGenerica<ArbolGeneral<Integer>> listaHijos = (ListaEnlazadaGenerica<ArbolGeneral<Integer>>) a.getHijos();
			listaHijos.comenzar(); 
			while (!listaHijos.fin()) {
				priNumerosImparesPostOrden(listaHijos.proximo(),n,l);
			}
		}
		if (a.getDato() % 2 != 0 && a.getDato() > n)
			l.agregarFinal(a.getDato()); // proceso la raiz
	}
	
	
    public ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n) {
        ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
        priNumerosImparesPN(a, n, l);
        
        return l;
    }
    
    private void priNumerosImparesPN(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
        ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
        ArbolGeneral<Integer> arbol_aux;
        cola.encolar(a);
        while (!cola.esVacia()) {
            arbol_aux = cola.desencolar();
            if (arbol_aux.getDato() % 2 == 0 && arbol_aux.getDato() > n) {
                l.agregarFinal(arbol_aux.getDato());
            }
            if (arbol_aux.tieneHijos()) {
                ListaGenerica<ArbolGeneral<Integer>> hijos = arbol_aux.getHijos();
                hijos.comenzar();
                while (!hijos.fin()) {
                    cola.encolar(hijos.proximo());
                }
            }
        }
    }
}


