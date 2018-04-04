package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Clientes;
import daos.ClientesDAO;
import daosImpl.ClientesDAOImpl;

@WebServlet("/ServletGuardarCambiosCliente")
public class ServletGuardarCambiosCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		String calle = request.getParameter("calle");
		String numero = request.getParameter("numero");
		String codigo_postal = request.getParameter("codigo_postal");
		String poblacion = request.getParameter("poblacion");
		String telefono = request.getParameter("telefono");
		String email = request.getParameter("email");
		String tipoCliente = request.getParameter("tipoCliente");

		Clientes cliente = new Clientes(nombre, calle, numero, codigo_postal,
				poblacion, telefono, email, tipoCliente);

		ClientesDAO clientesDAO = new ClientesDAOImpl();
		clientesDAO.guardarCambiosAnuncio(cliente);

		request.getRequestDispatcher("ServletListadoCliente").forward(
				request, response);
	}
	
}
