package daos;

import java.util.List;

import modelo.Ropa;

public interface RopaDAO {
	
	void registrarPrenda(Ropa ropa);
	List<Ropa> obtenerPrenda();
	Ropa obtenerPrendaPorId(int id);
	void guardarCambiosPrenda(Ropa ropa);
	Ropa borrarPrendaPorId(int id);

}
