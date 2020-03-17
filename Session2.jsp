<%
String Username=(String)session.getAttribute("SessionUser");
String password=(String)session.getAttribute("SessionPassword");
out.println("<h1>Welcome "+Username);
out.println("<h1>Your Password "+password);
session.invalidate();
out.println("<a href=HTMLforJSP.html>Back</a>");
%>

