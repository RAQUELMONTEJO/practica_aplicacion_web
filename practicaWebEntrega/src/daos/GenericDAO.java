package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class GenericDAO {

	protected Connection miConexion = null;

	// Carga del driver de conexión jdbc:
	static {
		// Bloque especial que se ejecuta una unica vez a lo largo de la
		// aplicacion la primera vez que esta clase es usada
		// Preparo driver y conexion
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			System.out.println("No encuentro el driver-libreria de mysql.");
		}
	}

	protected void conectar() {
		String url = "jdbc:mysql://localhost:3306/portal_web";
		try {
			miConexion = DriverManager.getConnection(url, "root", "jeveris");
		} catch (SQLException e) {
			System.out.println("Error de conexion o la sql esta mal.");
			e.printStackTrace();
		}
	}

	protected void desconectar() {
		try {
			miConexion.close();
		} catch (SQLException e) {
			System.out.println("No pude realizar la desconexión");
			e.printStackTrace();
		}
	}

}
