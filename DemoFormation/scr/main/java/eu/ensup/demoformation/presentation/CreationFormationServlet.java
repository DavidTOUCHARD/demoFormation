package eu.ensup.demoformation.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.demoformation.domaine.Formation;
import eu.ensup.demoformation.service.FormationService;
import eu.ensup.demoformation.service.IFormationService;

/**
 * Servlet implementation class CreationFormationServlet
 */
public class CreationFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	IFormationService formationserv = new FormationService();

	public CreationFormationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("button1") != null) {
			String theme = request.getParameter("theme");
			String adresse = request.getParameter("adresse");
			System.out.println("formation : " + theme + " " + adresse);
			Formation formation = new Formation(theme, adresse);
			formationserv.ajouterFormation(formation);

			RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
			rs.forward(request, response);
		}
		doGet(request, response);
	}

}
