package practica2.estructuras;

public class mainPilaCola {

	public static void main(String[] args) {
		ColaGenerica<Integer> cola  = new ColaGenerica<Integer>();
		
		for (int i = 0; i < 10; i++) {
			cola.encolar(i);
			
		}
		for (int i = 0; i < 8; i++) {
			System.out.println(cola.desencolar());
		}
		
		
		System.out.println("---------------------------");
		System.out.println(cola.tope());
	}

}
