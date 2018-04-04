package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.AdministradorDAO;
import daosImpl.AdministradorDAOImpl;

/**
 * Servlet implementation class ServletIdenAdmin
 */
@WebServlet("/ServletIdenAdmin")
public class ServletIdenAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("se ejecuta el servlet de identificacion de admin");
		String admin = request.getParameter("campoLogin");
		String pass = request.getParameter("campoPass");
		AdministradorDAO adminDAO = new AdministradorDAOImpl();
		if (adminDAO.identificarAdmin(admin, pass)) {
			request.getSession().setAttribute("admin", "ok");
			request.getRequestDispatcher("index.jsp")
					.forward(request, response);
		} else {
			// falta indicar mensaje de email o pass incorrectos
			request.getRequestDispatcher("login.jsp")
					.forward(request, response);
		}
	}

}
