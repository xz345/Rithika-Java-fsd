package filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;



/**
 * Servlet Filter implementation class Validation
 */
public class Validation implements Filter {

    /**
     * Default constructor. 
     */
    public Validation() {
        // TODO Auto-generated constructor sub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		String pan=request.getParameter("pan");
		if(pan==null || !pan.matches("[A-Z]{4}[0-9]{3}")) {
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("index.html").include(request, response);
		out.print("<SPAN Style='colour:red'> invalid no </SPAN>");
		}
		else {
			request.setAttribute("pan", pan);
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
