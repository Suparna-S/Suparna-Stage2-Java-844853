package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextParam1
 */
@WebServlet("/ContextParam1")
public class ContextParam1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextParam1() {
        super();
        // TODO Auto-generated constructor stub
    }
    String c1,t1;
	public void init() throws ServletException 
	{
	t1=getServletContext().getInitParameter("Tip1");
	c1=getServletContext().getInitParameter("Tip2");
		}
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletContext obj=getServletContext();
		out.println("<h1>Hint1: "
		+obj.getInitParameter("Tip1"));

		out.println("<h1>Hint2: "
		+obj.getInitParameter("Tip2"));
		out.println("<h1>Context Init: "+t1+ " "+c1);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
