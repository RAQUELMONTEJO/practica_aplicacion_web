package daos;

public class ConstantesSQL {

	public static final String IDENTIFICACION_ADMIN = "select id from tabla_administradores where login = ? and pass = ?";

	public static final String INSERCION_PRENDA = "insert into tabla_ropa(tipo, color, precio, talla, sexo, referencia, descripcion) "
			+ "values(?,?,?,?,?,?,?)";

	public static final String INSERCION_CLIENTE = "insert into tabla_clientes(nombre, calle, numero, codigo_postal, poblacion, telefono, email, tipo) "
			+ "values(?,?,?,?,?,?,?,?)";

	public static final String SELECCION_PRENDAS = "select * from tabla_ropa";

	public static final String SELECCION_CLIENTES = "select * from tabla_clientes";

	public static final String OBTENER_PRENDA_POR_ID = "select * from tabla_ropa where id = ? ";

	public static final String OBTENER_CLIENTE_POR_ID = "select * from tabla_clientes where id = ? ";

	public static final String GUARDAR_CAMBIOS_PRENDA = "update tabla_ropa set tipo = ?, color = ?, precio = ?, talla = ?, sexo = ?, refencia = ?, descripcion = ? where id=?";

	public static final String GUARDAR_CAMBIOS_CLIENTE = "update tabla_clientes set nombre = ?, calle = ?, numero = ?, codigo_postal = ?, poblacion = ?, telefono = ?, email = ?, cliente/empresa = ? where id=?";

	public static final String BORRAR_PRENDA_POR_ID = "delete from tabla_ropa where id = ? ";

	public static final String BORRAR_CLIENTE_POR_ID = "delete from tabla_clientes where id = ? ";
}
