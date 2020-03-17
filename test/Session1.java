package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session1
 */
@WebServlet("/Session1")
public class Session1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	    HttpSession session = 
	    		request.getSession(false);
	    out.println("Session Value: " +session);

		out.print("<BODY bgcolor=yellow><h1>Online Shopping</h1>");
	    out.print("<FORM METHOD=post ACTION=Session2>");
	    out.print("<INPUT TYPE=SUBMIT NAME=foo VALUE=PEPSI>");
	    out.print("<INPUT TYPE=SUBMIT NAME=bar VALUE=\"Put a MIRINDA into the shopping cart\">");
	    out.print("<INPUT TYPE=SUBMIT NAME=see VALUE=\"View the shopping cart\">");
	    out.print("<INPUT TYPE=SUBMIT NAME=buy VALUE=\"Buy the shopping cart\">");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
