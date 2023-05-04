package ejerciciosParcial1;

import practica3.estructuras.*;

public class Parcial {
	
	
	public ListaGenerica<Integer> resolver(ArbolBinario<Integer> ab, int min) {
		Boolean sePudo = false;
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		if ((ab != null) && (!ab.esVacio())) {
			sePudo = resolverPriv(ab, min, lista);
		}
		if (sePudo) {
			return lista;
		}
		return null;
	}

	private Boolean resolverPriv(ArbolBinario<Integer> ab, int min, ListaGenerica<Integer> l) {
		Boolean ok = false;
		l.agregarFinal(ab.getDato());
		if (ab.getDato() % 2 == 0) {
			min--;
		}
		if (!ab.esHoja()) {
			if (ab.tieneHijoIzquierdo()) {
				
				ok = resolverPriv(ab.getHijoIzquierdo(), min, l);
				if (!ok) {
					l.eliminarEn(l.tamanio());
				} else {
					return true;
				}
			}
			if (ab.tieneHijoDerecho()) {
				ok = resolverPriv(ab.getHijoDerecho(), min, l);
				if (!ok) {
					return false;
				}
				else {
					return true;
				}
			}
		} else {
			
			return (min <= 0);
			
		}
		
		return false;
	}
	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>();
		ArbolBinario<Integer> b = new ArbolBinario<Integer>();
		ArbolBinario<Integer> c = new ArbolBinario<Integer>();
		ArbolBinario<Integer> d = new ArbolBinario<Integer>();
		ArbolBinario<Integer> e = new ArbolBinario<Integer>();
		ArbolBinario<Integer> f = new ArbolBinario<Integer>();
		ArbolBinario<Integer> g = new ArbolBinario<Integer>();
		ArbolBinario<Integer> h = new ArbolBinario<Integer>();
		ArbolBinario<Integer> i = new ArbolBinario<Integer>();
		ArbolBinario<Integer> j = new ArbolBinario<Integer>();
		ArbolBinario<Integer> k = new ArbolBinario<Integer>();
		
		a.setDato(7);
		b.setDato(56);
		c.setDato(25);
		d.setDato(38);
		e.setDato(31);
		f.setDato(5);
		g.setDato(6);
		h.setDato(87);
		i.setDato(77);
		j.setDato(94);
		k.setDato(2);
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);
		c.agregarHijoIzquierdo(f);
		c.agregarHijoDerecho(g);
		d.agregarHijoIzquierdo(i);
		d.agregarHijoDerecho(j);
		e.agregarHijoDerecho(k);
		
		Parcial p = new Parcial();
		ListaEnlazadaGenerica<Integer> lista = (ListaEnlazadaGenerica<Integer>) p.resolver(a, 3);
		lista.comenzar();
		while (!lista.fin()) {
			System.out.println(lista.proximo());
		}
		
	}
}