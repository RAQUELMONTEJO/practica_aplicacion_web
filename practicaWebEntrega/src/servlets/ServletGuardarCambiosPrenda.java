package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Ropa;
import daos.RopaDAO;
import daosImpl.RopaDAOImpl;

@WebServlet("/ServletGuardarCambiosPrenda")
public class ServletGuardarCambiosPrenda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String tipo = request.getParameter("tipo");
		String color = request.getParameter("color");
		String precio = request.getParameter("precio");
		String talla = request.getParameter("talla");
		String sexo = request.getParameter("sexo");
		String referencia = request.getParameter("referencia");
		String descripcion = request.getParameter("descripcion");

		Ropa prenda = new Ropa(tipo, color, precio, talla, sexo, referencia,
				descripcion);

		RopaDAO ropaDAO = new RopaDAOImpl();
		ropaDAO.guardarCambiosPrenda(prenda);

		request.getRequestDispatcher("ServletListadoPrenda").forward(
				request, response);
	}

}
