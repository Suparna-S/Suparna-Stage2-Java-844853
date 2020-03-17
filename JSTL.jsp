<%@taglib
uri="http://java.sun.com/jsp/jstl/core"
prefix="cts"%>
<cts:out value="Have Hopes!!"/>
<cts:set var="a" value="chennai"/>
<cts:out value="${a}"/>

<cts:forEach var="n" begin="3" end="8" step="2">
</cts:forEach>
<cts:out value="${n}"/><br>
<cts:if test="${a=='chennai'}" var="b">
<p>My location is
<cts:out value="${a}"/>
<p>Result: <cts:out value="${b}"/></p>
</cts:if>
