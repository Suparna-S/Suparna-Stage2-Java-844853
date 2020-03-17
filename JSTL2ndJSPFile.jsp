<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource
var="snapshot"
driver="com.mysql.jdbc.Driver" 
url="jdbc:mysql://localhost/myself"
user="root" password="suparnasql"/>

<sql:query dataSource="${snapshot}"
var="res">
select * from employee where salary>50000;
</sql:query>  
<table border="1">
<tr>
<th>id</th>
<th>name</th> 
<th>salary</th>
</tr>
<c:forEach var="row1" items="${res.rows}">
<tr>
<td><c:out value="${row1.id}"/></td>
<td><c:out value="${row1.name}"/></td>
<td><c:out value="${row1.salary}"/></td>
</tr>
</c:forEach>
</table>