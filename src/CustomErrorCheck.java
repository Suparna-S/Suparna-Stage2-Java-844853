

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CustomErrorCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CustomErrorCheck() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mail=request.getParameter("mail");
    	if (mail.equals("unknown")) 
    	{
	//response.sendError(404,"Website Not Available");
//response.sendError(response.SC_NOT_FOUND,	"Pls My Website Not Available");
  		response.sendError(404,"CustomErrorPage.html");
   	
    	}
    	else
    	{
    	response.sendRedirect(mail);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
