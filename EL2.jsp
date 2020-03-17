<jsp:useBean id="b1" class="com.test.Product" scope="request"/>
<jsp:setProperty name="b1" property="productno" value="${param.pno}"/>
<jsp:setProperty name="b1" property="productname" value="${param.pname}"/>

<h1>
<p>PNO(Using EL):${b1.productno }
<p>PNO(Using getter): <%=b1.getProductno() %>
<p>PNO(Using GetProperty) <jsp:getProperty property="productno" name="b1"/>
<p>PNAME: ${b1.productname}  
</h1>