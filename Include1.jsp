<body bgcolor="violet" text="cornflowerblue">
<%@ include file="Hidden1.html" %>
<h1>Next.......</h1>
<jsp:include page="Inc1.jsp" />

<jsp:include page="Inc1.jsp" >
<jsp:param value="CTS" name="Company"/>
<jsp:param value="9.00am-6.00pm" name="Time"/>
</jsp:include>
</body>