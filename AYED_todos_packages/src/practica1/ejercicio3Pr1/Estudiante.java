package practica1.ejercicio3Pr1;

public class Estudiante {
	private String nombre,apellido,comision,email,direccion;

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

	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String tusDatos() {
		String aux;
		aux = "Apellido: " + this.getApellido() + "\n";
		aux += "Nombre: " + this.getNombre() +"\n";
		aux += "E-Mail: " + this.getEmail() + "\n";
		aux += "Direccion: " + this.getDireccion() + "\n";
		aux += "Comision: " + this.getComision();

		return aux;
	}
}
