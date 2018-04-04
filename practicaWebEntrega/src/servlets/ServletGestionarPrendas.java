package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.RopaDAO;
import daosImpl.RopaDAOImpl;

@WebServlet("/ServletGestionarPrendas")
public class ServletGestionarPrendas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("obteniendo prendas para gestionarlos");
		RopaDAO prendasDAO = new RopaDAOImpl();
		request.setAttribute("prendas", prendasDAO.obtenerPrenda());
		request.getRequestDispatcher("gestionPrenda.jsp").forward(request,
				response);
	}
}
