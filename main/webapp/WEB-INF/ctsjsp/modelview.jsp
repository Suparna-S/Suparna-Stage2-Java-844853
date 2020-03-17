<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>

<c:forEach var="listValue" items="${lists}">
<li>${listValue}</li>
</c:forEach>

</h1>