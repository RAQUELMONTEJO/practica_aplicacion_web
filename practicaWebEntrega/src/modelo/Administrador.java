package modelo;

public class Administrador {

	private String nombre;
	private String pass;

	public Administrador() {}

	public Administrador(String nombre, String pass) {
		super();
		this.nombre = nombre;
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Administrador [nombre=" + nombre + ", pass=" + pass + "]";
	}

	
	
}
