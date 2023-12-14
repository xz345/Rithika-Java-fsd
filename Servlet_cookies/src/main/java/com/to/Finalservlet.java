package com.to;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Finalservlet
 */
public class Finalservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Finalservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int k=0;
		Cookie[] cookie=request.getCookies();
		{
			for(Cookie c:cookie)
			{
				if(c.getName().equals("k"))
				{
					k=Integer.parseInt(c.getValue());
				}
			}
		}
	int val=k*k;
	PrintWriter out=response.getWriter();
	out.print("result is "+val);
		
	}

}
