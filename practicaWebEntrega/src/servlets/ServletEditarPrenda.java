package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.RopaDAO;
import daosImpl.RopaDAOImpl;
import modelo.Ropa;

@WebServlet("/ServletEditarPrenda")
public class ServletEditarPrenda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		RopaDAO prendasDAO = new RopaDAOImpl();
		Ropa prendaAeditar = prendasDAO.obtenerPrendaPorId(id);
		request.setAttribute("prendaAeditar", prendaAeditar);
		request.getRequestDispatcher("editarPrenda.jsp").forward(request,
				response);
	}
}
