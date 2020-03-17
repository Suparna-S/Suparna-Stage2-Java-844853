<body bgcolor="yellow" text="blue">
<h1> JAVA BEAN DETAILS:</h1>
<jsp:useBean id="b1" 
class="com.test.Product" scope="session"/>
<jsp:setProperty name="b1" property="*"/>
<h1>
<jsp:getProperty name="b1" property="productno" />
<jsp:getProperty name="b1" property="productname" />
</h1>
PNO: <%=b1.getProductno() %>
PNAME: <%=b1.getProductname() %>


</body>