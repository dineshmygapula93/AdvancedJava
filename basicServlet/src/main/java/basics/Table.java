package basics;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Table
 */
@WebServlet("/table")
public class Table extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Table() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=green>");
		for(int i=1 ;i<=100 ;i++) {
		pw.println("<table border=2><tr><td>5</td>");
		pw.println("<td>*</td>");
		pw.println("<td>"+i+"</td>");
		pw.println("<td>=</td>");
		pw.println("<td>"+i*5+"</td>");
		}
		pw.println("</tr></body></html>");


	}

}
