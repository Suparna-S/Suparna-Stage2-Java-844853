

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class JDBC2
 */
public class JDBC2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDBC2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
        Connection con;
        try
        {
        String e1 = request.getParameter("e1");
        int eno1=Integer.parseInt(e1);
        String n1 = request.getParameter("n1");
        String s1 = request.getParameter("s1");
        int sal=Integer.parseInt(s1);        
        pw.println("<body bgcolor=pink><h1>Value "
    + "passed to emp table: " +e1 + " "+n1 + " "+s1);
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection
   ("jdbc:mysql://localhost:3306/myself","root","suparnasql");
  PreparedStatement pst =  con.prepareStatement
("insert into employee4(eno1,name,salary) values(?,?,?)");
        pst.setInt(1,eno1);
        pst.setString(2,n1);
        pst.setInt(3,sal);        
        int i = pst.executeUpdate();
        if(i!=0)
        {
         pw.println("<br><h1>Record has been "
         		+ "inserted");
        }
        else
        {
         pw.println("Failed to insert the data");
        }
        //display
        pw.println("<table border=6 bgcolor=pink "
       + "align=center bordercolor=red><tr><th>Eno</th>"
       + "<th>EmpName</th><th>Salary</th></tr>");
       ResultSet rs=pst.executeQuery("select * from emp1");
       while(rs.next())
        {
        pw.println("<tr>");
        pw.println("<td>"+rs.getString(1));
        pw.println("<td>"+rs.getString(2));
        pw.println("<td>"+rs.getString(3)); 	   
        pw.println("</tr>");
        }          
        }
        catch(Exception e)
        {
            pw.println(e);
        }
	}

}
