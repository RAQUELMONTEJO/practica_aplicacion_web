package daos;

import java.util.List;

import modelo.Clientes;

public interface ClientesDAO {

	void registrarCliente(Clientes cliente);
	List<Clientes> obtenerClientes();
	Clientes obtenerClientesPorId(int id);
	void guardarCambiosAnuncio(Clientes cliente);
	Clientes borrarClientesPorId(int id);
	
}
