<body bgcolor=purple>
<%!
int a1=10;
int add(int n, int m)
{
	return n+m;
}
%>
<%!
int subtract(int n, int m)
{
	return n-m;
}
%>
<%
int a2=100;
out.println("<h1>Welcome to JSP!");
out.println(a1+" "+a2);
out.println("Inside scriplets add: "+add(20,40));
%>
<%
out.println("Sub: "+subtract(40,20));
%>
<h1>Expression Tag</h1>
Add:<%= 12+12 %>
<%="<h1>GoodDay</h1>" %>
<%= a1 %>
Add Method:<%=add(10,50) %>
Subtract Method:<%=subtract(8,4) %>
</body>


