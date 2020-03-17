package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Timeout1
 */
@WebServlet("/Timeout1")
public class Timeout1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Timeout1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<BODY bgcolor = cornflowerblue>"+"<H1>Session Timer</H1>");
		HttpSession session= request.getSession(true);
		out.println("<h1>Session: "+session);
		out.println("<h1>Previous timeout was: "+session.getMaxInactiveInterval());
		out.println("<h1>Time: "+new Date());
		session.setMaxInactiveInterval(20);
		out.println("<h1>The newly assigned"+"timeout is"+session.getMaxInactiveInterval());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
