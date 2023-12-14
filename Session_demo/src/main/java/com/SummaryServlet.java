package com;

import java.io.IOException;
import java.io.PrintWriter;

import dto.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



/**
 * Servlet implementation class SummaryServlet
 */
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SummaryServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession(false);
		if(session!=null) {
			User u=((User)session.getAttribute("User"));
			
		u.setContact(Long.parseLong(request.getParameter("contact")));
		u.setState(request.getParameter("state"));
		PrintWriter out=response.getWriter();
		out.print("<h2> email"+u.getEmail()+"</h2>");
		
		out.println("<h3> details"+u+"</h3>");
		out.println("<h3> sessionid"+session.getId()+"</h3>");
		out.println("<h1> Session time"+session.getCreationTime()
+"</h1>");			
		session.invalidate();
	}

}
}