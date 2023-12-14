package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletA
 */
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletA() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
				out.println("<html><body>");
        
        String userId = request.getParameter("userid");
        //creating a new hidden form field
        out.print("welcome");
       out.println("<form action='Servlet' method='post'>");
       out.println("<input type='hidden' name='userid' id='userid' value='"+userId+"'>");
       out.println("<input type='submit' value='submit' >");
       out.println("</form>");
       //out.println("<script>document.forms[0].submit();</script>");

		
				
		}

}
