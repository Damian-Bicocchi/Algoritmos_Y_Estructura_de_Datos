package practica1.ejercicio3Pr1;

public class Profesor {
	private String nombre,apellido,email,catedra,facultad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCatedra() {
		return catedra;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String tusDatos() {
		String aux;
		aux = "Apellido: " + this.getApellido() + "\n";
		aux += "Nombre: " + this.getNombre() +"\n";
		aux += "E-Mail: " + this.getEmail() + "\n";
		aux += "Catedra: " + this.getCatedra() + "\n";
		aux += "Facultad: " + this.getFacultad();
		
		return aux;
	}
}
