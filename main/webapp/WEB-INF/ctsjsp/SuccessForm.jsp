<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>

Name:${result12.name}
<br>
Hobbies:
<ul>
<c:forEach var="hoblist" items="${result12.f_hobbies}">
<li>${hoblist }</li>
</c:forEach>
</ul>
<br>
Gender:${result12.gender}<br>
Country:${result12.country}

