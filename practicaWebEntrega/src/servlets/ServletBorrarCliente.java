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

@WebServlet("/ServletBorrarCliente")
public class ServletBorrarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		ClientesDAO clientesDAO = new ClientesDAOImpl();
		Clientes clienteAeditar = clientesDAO.borrarClientesPorId(id);
		request.setAttribute("clienteAeditar", clienteAeditar);
		request.getRequestDispatcher("borrarClienteOK.jsp").forward(request,
				response);
		System.out.println("borrar cliente de id: " + id);
	}
}
