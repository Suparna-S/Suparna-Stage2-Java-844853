<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="s" value="${param.username}" />
We welcome<br>
<c:out value="${s}"/>