<%@page import="javax.xml.ws.Response"%>
<%@page import="org.omg.CORBA.Request"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
PrintWriter out1 = response.getWriter();
String name = (String)request.getAttribute("name");
String phone = (String)request.getAttribute("phone");
if(phone!=null){
out1.print("Requested Data = "+phone);
}
else if(name!=null || !name.isEmpty()){
	out1.print("Requested Data = "+name);
}
else if(phone==null && (name==null||name.isEmpty())){
	out1.print("Requested Data Not in Records");
	}
%>
</body>
</html>