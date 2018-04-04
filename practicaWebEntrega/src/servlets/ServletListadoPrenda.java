package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.RopaDAO;
import daosImpl.RopaDAOImpl;

@WebServlet("/ServletListadoPrenda")
public class ServletListadoPrenda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RopaDAO daoRopa = new RopaDAOImpl();

		// asi continuo en listadoAnuncios.jsp al cual le tengo que dar
		// los anuncios que me de el dao
		request.setAttribute("prendas", daoRopa.obtenerPrenda());
		request.getRequestDispatcher("listadoPrenda.jsp").forward(request,
				response);
	}

}
