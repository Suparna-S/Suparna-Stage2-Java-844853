<%
if((request.getParameter("a1")).equals("Ashish"))
{
	%>
	<jsp:forward page="For1.jsp">
	<jsp:param name="user" value="**Welcome user*"></jsp:param>
		</jsp:forward>
	<%
}
else
{
	%>
	<jsp:forward page="For2.jsp">
	<jsp:param value="Invalid user" name="user1"></jsp:param>
	</jsp:forward>
	<%
}
%>