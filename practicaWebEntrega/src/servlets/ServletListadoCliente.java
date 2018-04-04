package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ClientesDAO;
import daosImpl.ClientesDAOImpl;

@WebServlet("/ServletListadoCliente")
public class ServletListadoCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ClientesDAO daoClientes = new ClientesDAOImpl();

		// asi continuo en listadoAnuncios.jsp al cual le tengo que dar
		// los anuncios que me de el dao
		request.setAttribute("clientes", daoClientes.obtenerClientes());
		request.getRequestDispatcher("listadoClientes.jsp").forward(request,
				response);
	}

}
