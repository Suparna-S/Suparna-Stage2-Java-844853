<!-- EL having different IMPLICIT OBJECT 
not as same as JSP IMPLICIT OBJECT -->

<h1>
${ 12+12 }
${6.0 ge 13 }
${5<7}
${5 lt 7 }
${header["host1"] }
${"I am EL" }
<%
session.setAttribute("Name", "Suparna");
%>
<h1> Session Value: ${sessionScope.Name}
</h1>