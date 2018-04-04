package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Clientes;
import daos.ClientesDAO;
import daos.ConstantesSQL;
import daos.GenericDAO;

public class ClientesDAOImpl extends GenericDAO implements ClientesDAO {

	@Override
	public void registrarCliente(Clientes cliente) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.INSERCION_CLIENTE);
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getCalle());
			ps.setString(3, cliente.getNumero());
			ps.setString(4, cliente.getCodigo_postal());
			ps.setString(5, cliente.getPoblacion());
			ps.setString(6, cliente.getTelefono());
			ps.setString(7, cliente.getEmail());
			ps.setString(8, cliente.getTipoCliente());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("sql esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();
	}

	@Override
	public List<Clientes> obtenerClientes() {
		conectar();
		List<Clientes> clientes = new ArrayList<Clientes>();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.SELECCION_CLIENTES);
			ResultSet resultado = ps.executeQuery();
			while (resultado.next()) {
				Clientes cliente = new Clientes();
				cliente.setNombre(resultado.getString("nombre"));
				cliente.setCalle(resultado.getString("calle"));
				cliente.setNumero(resultado.getString("numero"));
				cliente.setCodigo_postal(resultado.getString("codigo_postal"));
				cliente.setPoblacion(resultado.getString("poblacion"));
				cliente.setTelefono(resultado.getString("telefono"));
				cliente.setEmail(resultado.getString("email"));
				cliente.setTipoCliente(resultado.getString("tipo"));
				clientes.add(cliente);
			}// end while
		} catch (SQLException e) {
			System.out.println("sql select clientes esta mal");
			System.out.println(e.getMessage());
		}// end catch
		desconectar();
		return clientes;
	}

	@Override
	public Clientes obtenerClientesPorId(int id) {
		conectar();
		Clientes cliente = new Clientes();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.OBTENER_CLIENTE_POR_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cliente.setNombre(rs.getString("nombre"));
				cliente.setCalle(rs.getString("calle"));
				cliente.setNumero(rs.getString("numero"));
				cliente.setCodigo_postal(rs.getString("codigo_postal"));
				cliente.setPoblacion(rs.getString("poblacion"));
				cliente.setTelefono(rs.getString("telefono"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTipoCliente(rs.getString("tipo"));
				cliente.setId(id);
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println("seguramente la sql este mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		return cliente;
	}

	@Override
	public void guardarCambiosAnuncio(Clientes cliente) {
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.GUARDAR_CAMBIOS_CLIENTE);
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getCalle());
			ps.setString(3, cliente.getNumero());
			ps.setString(4, cliente.getCodigo_postal());
			ps.setString(5, cliente.getPoblacion());
			ps.setString(6, cliente.getTelefono());
			ps.setString(7, cliente.getEmail());
			ps.setString(8, cliente.getTipoCliente());
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
	public Clientes borrarClientesPorId(int id) {
		conectar();
		Clientes cliente = new Clientes();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.BORRAR_CLIENTE_POR_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cliente.setNombre(rs.getString("nombre"));
				cliente.setCalle(rs.getString("calle"));
				cliente.setNumero(rs.getString("numero"));
				cliente.setCodigo_postal(rs.getString("codigo_postal"));
				cliente.setPoblacion(rs.getString("poblacion"));
				cliente.setTelefono(rs.getString("telefono"));
				cliente.setEmail(rs.getString("email"));
				cliente.setTipoCliente(rs.getString("tipo"));
				cliente.setId(id);
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
