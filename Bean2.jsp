<body bgcolor="pink" text="blue">
<h1>Java Bean Details:</h1>
<jsp:useBean id="b1" class="com.test.Product" scope="session"/>
<jsp:setProperty property="no" name="b1" param="a1"/>
<jsp:setProperty property="name" name="b1" param="b1"/> 
<h1> 
PNO:
<jsp:getProperty name="b1" property="no"b></jsp:getProperty></h1>
<h1> PNAME:<jsp.getProperty name="b1" property="name"/> 
</h1>
<jsp:getProperty property="NAME" name="b1"/></h1>
<a href="Bean3.jsp">NEXT PAGE</a>
</body>