package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Headers1
 */
@WebServlet("/Headers1")
public class Headers1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Headers1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Header
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();

		  out.println(request.getHeader("host"));
		 	
		  out.println("<BODY><TABLE BORDER=3><tr>"
		 		+ "<TH>Header Name<TH>Header Value");
		 //Enumeration is a interface similar to iterator
		 Enumeration headerNames = request.getHeaderNames();
		 while(headerNames.hasMoreElements()) 
		 {
		 String headerName = (String)headerNames.nextElement();
		 out.println("<TR><TD>" + headerName);
		 out.println("    <TD>" + request.
				 getHeader(headerName)); 
		 }//headervalue
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
