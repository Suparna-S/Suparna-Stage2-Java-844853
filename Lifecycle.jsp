<!-- 
1.Lifecycle init and dsetroy only declared in Declaration Tag
2.Init and destroy called only once
3.We can override jspInit(), jspDestroy() but we cant override jspService() method.
 -->

<%!
int counter=10;
public void jspInit()
{
	System.out.println("Init Method");
}
%>
<% 
System.out.println("Service Method...");
counter++;
%>
<h2>JSP Lifecycle: Request Counter</h2>
<p>This page has been called <%=counter %> times </p>
<%!
public void jspDestroy() 
{
System.out.println("Destroy method...");
}
%>