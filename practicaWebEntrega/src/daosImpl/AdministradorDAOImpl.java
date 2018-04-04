package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import daos.AdministradorDAO;
import daos.ConstantesSQL;
import daos.GenericDAO;

public class AdministradorDAOImpl extends GenericDAO implements
		AdministradorDAO {

	@Override
	public boolean identificarAdmin(String nombre, String pass) {
		boolean identificado = false;
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.IDENTIFICACION_ADMIN);
			ps.setString(1, nombre);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				// si este if se cumple, eso es que he obtenido un resultado
				// de base de datos
				identificado = true;
			}
		} catch (SQLException e) {
			System.out.println("Problemas al registrar el administrador");
			System.out.println(e.getMessage());
		}
		desconectar();
		return identificado;
	}

}
