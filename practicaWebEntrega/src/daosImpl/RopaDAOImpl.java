package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Ropa;
import daos.ConstantesSQL;
import daos.GenericDAO;
import daos.RopaDAO;

public class RopaDAOImpl extends GenericDAO implements RopaDAO {

	@Override
	public void registrarPrenda(Ropa ropa) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.INSERCION_PRENDA);
			ps.setString(1, ropa.getTipo());
			ps.setString(2, ropa.getColor());
			ps.setString(3, ropa.getPrecio());
			ps.setString(4, ropa.getTalla());
			ps.setString(5, ropa.getSexo());
			ps.setString(6, ropa.getReferencia());
			ps.setString(7, ropa.getDescripcion());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("sql esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();
	}

	@Override
	public List<Ropa> obtenerPrenda() {
		conectar();
		List<Ropa> prendas = new ArrayList<Ropa>();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.SELECCION_PRENDAS);
			ResultSet resultado = ps.executeQuery();
			while (resultado.next()) {
				Ropa prenda = new Ropa();
				prenda.setTipo(resultado.getString("tipo"));
				prenda.setColor(resultado.getString("color"));
				prenda.setPrecio(resultado.getString("precio"));
				prenda.setTalla(resultado.getString("talla"));
				prenda.setSexo(resultado.getString("sexo"));
				prenda.setReferencia(resultado.getString("referencia"));
				prenda.setDescripcion(resultado.getString("descripcion"));
				prendas.add(prenda);
			}// end while
		} catch (SQLException e) {
			System.out.println("sql select ropa esta mal");
		}// end catch
		desconectar();
		return prendas;
	}

	@Override
	public Ropa obtenerPrendaPorId(int id) {
		conectar();
		Ropa prenda = new Ropa();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.OBTENER_PRENDA_POR_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				prenda.setTipo(rs.getString("tipo"));
				prenda.setColor(rs.getString("color"));
				prenda.setPrecio(rs.getString("precio"));
				prenda.setTalla(rs.getString("talla"));
				prenda.setSexo(rs.getString("sexo"));
				prenda.setReferencia(rs.getString("referencia"));
				prenda.setDescripcion(rs.getString("descripcion"));
				prenda.setId(id);
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println("seguramente la sql este mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		return null;
	}

	@Override
	public void guardarCambiosPrenda(Ropa ropa) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.GUARDAR_CAMBIOS_PRENDA);
			ps.setString(1, ropa.getTipo());
			ps.setString(2, ropa.getColor());
			ps.setString(3, ropa.getPrecio());
			ps.setString(4, ropa.getTalla());
			ps.setString(5, ropa.getSexo());
			ps.setString(6, ropa.getReferencia());
			ps.setString(7, ropa.getDescripcion());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out
					.println("posiblemente la sql de guardar cambios este mal");
			System.out.println(e.getMessage());
		}
		desconectar();
	}

	@Override
	public Ropa borrarPrendaPorId(int id) {
		conectar();
		Ropa prenda = new Ropa();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.BORRAR_PRENDA_POR_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				prenda.setTipo(rs.getString("tipo"));
				prenda.setColor(rs.getString("color"));
				prenda.setPrecio(rs.getString("precio"));
				prenda.setTalla(rs.getString("talla"));
				prenda.setSexo(rs.getString("sexo"));
				prenda.setReferencia(rs.getString("referencia"));
				prenda.setDescripcion(rs.getString("descripcion"));
				prenda.setId(id);
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println("seguramente la sql este mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		return null;
	}
}
