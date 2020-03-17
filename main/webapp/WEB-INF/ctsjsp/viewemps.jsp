<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<h1>Employees List</h1>
<table border="3" width="20%">
<tr><th>Id</th><th>Name</th><th>Salary</th></tr>
<c:forEach var="emp11" items="${emplist}">
<tr>
<td>${emp11.eno}</td>
<td>${emp11.name}</td>
<td>${emp11.salary}</td>
</tr>
</c:forEach>
</table>