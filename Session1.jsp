<%@ page session="true" %>
<% 
out.println("Session Object: "+session);
String Username=request.getParameter("n1");
String password=request.getParameter("n2");
session.setAttribute("SessionUser", Username);
session.setAttribute("SessionPassword", password);

out.println("<h1>Welcome "+Username+"!");
out.println("<a href=Session2.jsp>NextPage</a>");
%> 
