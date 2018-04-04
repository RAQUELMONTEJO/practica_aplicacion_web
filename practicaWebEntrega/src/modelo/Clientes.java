package modelo;

public class Clientes {
	
	private String nombre;
	private String calle;
	private String numero;
	private String codigo_postal;
	private String poblacion;
	private String telefono;
	private String email;
	private String tipoCliente;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Clientes() {}

	public Clientes(String nombre, String calle, String numero,
			String codigo_postal, String poblacion, String telefono,
			String email, String tipoCliente) {
		super();
		this.nombre = nombre;
		this.calle = calle;
		this.numero = numero;
		this.codigo_postal = codigo_postal;
		this.poblacion = poblacion;
		this.telefono = telefono;
		this.email = email;
		this.tipoCliente = tipoCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	@Override
	public String toString() {
		return "Clientes [nombre=" + nombre + ", calle=" + calle + ", numero="
				+ numero + ", codigo_postal=" + codigo_postal + ", poblacion="
				+ poblacion + ", telefono=" + telefono + ", email=" + email
				+ ", tipoCliente=" + tipoCliente + "]";
	}
	
	

}
