package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Clientes;
import modelo.Ropa;
import daos.ClientesDAO;
import daos.RopaDAO;
import daosImpl.ClientesDAOImpl;
import daosImpl.RopaDAOImpl;

@WebServlet("/ServletBorrarPrenda")
public class ServletBorrarPrenda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		RopaDAO prendasDAO = new RopaDAOImpl();
		Ropa prendaAeditar = prendasDAO.borrarPrendaPorId(id);
		request.setAttribute("prendaAeditar", prendaAeditar);
		request.getRequestDispatcher("borrarPrendaOK.jsp").forward(request,
				response);
		System.out.println("borrar prenda de id: " + id);
	}
}
