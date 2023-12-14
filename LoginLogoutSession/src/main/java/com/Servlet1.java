package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				PrintWriter out=response.getWriter();
        out.println("<html><body>");
	//String name=(String)session.setAttribute("name", name);
        HttpSession session =request.getSession(false);

		String name=null;
		
		if(session.getAttribute("name")!=null) {
			 name = (String) session.getAttribute("name");
		
		
		//out.print("the user name is"+name);
		if(name==null)
		{
			out.println("no user name found");
		}
		else
		{
			out.println("the user name is  "+name);
			
			out.println("<a href='Logout'>logoutSession</a>");
		}
		
		out.println("</body></html>");
		
	}
}
}