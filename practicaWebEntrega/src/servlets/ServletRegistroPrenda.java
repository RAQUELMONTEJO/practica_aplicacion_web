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

@WebServlet("/ServletRegistroPrenda")
public class ServletRegistroPrenda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("tipo");
		String color = request.getParameter("color");
		String precio = request.getParameter("precio");
		String talla = request.getParameter("talla");
		String sexo = request.getParameter("sexo");
		String referencia = request.getParameter("referencia");
		String descripcion = request.getParameter("descripcion");

		Ropa nuevo = new Ropa(tipo, color, precio, talla, sexo, referencia, descripcion);
		RopaDAO ropaDAO = new RopaDAOImpl();
		ropaDAO.registrarPrenda(nuevo);
		request.getRequestDispatcher("registroPrendaOK.jsp").forward(request,
				response);
	}

}
