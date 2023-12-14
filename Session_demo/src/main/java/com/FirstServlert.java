package com;

import java.io.IOException;

import dto.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlert
 */
public class FirstServlert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlert() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User u =new User();
		HttpSession session=request.getSession();
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
	session.setAttribute("User", u);
		response.sendRedirect("two.html");
		
		
	}

}
