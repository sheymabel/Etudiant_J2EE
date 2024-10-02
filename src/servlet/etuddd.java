package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class etuddd
 */
@WebServlet("/etuddd")
public class etuddd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<etud> etudinat =new ArrayList<etud>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public etuddd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("etud", etudinat);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/etudi.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        int age = Integer.parseInt(request.getParameter("age"));
        etud newStudent = new etud(id, nom, prenom, age);
        etud.ajouterPersonne(newStudent);
        request.setAttribute(prenom, prenom);

	this.getServletContext().getRequestDispatcher( "/WEB-INF/etudi.jsp" ).forward( request, response );

}
}