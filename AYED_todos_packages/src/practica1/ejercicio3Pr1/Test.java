package practica1.ejercicio3Pr1;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		Estudiante[] vEst = new Estudiante[2];
		
		Profesor[] vProf = new Profesor[3];
				
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < vEst.length; i++) {
			vEst[i] = new Estudiante();
			vEst[i].setApellido(s.next());
			vEst[i].setNombre(s.next());
			vEst[i].setDireccion(s.next());
			vEst[i].setEmail(s.next());
			vEst[i].setComision(s.next());
			System.out.println("........");
		}
		
		System.out.print("Terminamos estudiantes");
		
		for (int i = 0; i < vProf.length; i++) {
			vProf[i].setApellido(s.next());
			vProf[i].setNombre(s.next());
			vProf[i].setCatedra(s.next());
			vProf[i].setEmail(s.next());
			vProf[i].setFacultad(s.next());;
			System.out.println("******");
		}
		
		for (int i = 0; i < vEst.length; i++) {
			System.out.println(vEst[i].tusDatos());
		}
		for (int i = 0; i < vProf.length; i++) {
			System.out.println(vProf[i].tusDatos());
		}
		s.close();
	}

}
