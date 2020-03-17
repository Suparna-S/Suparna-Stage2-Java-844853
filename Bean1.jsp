<body bgcolor="yellow" text="blue">
<h1>Java bean details:</h1>
<jsp:useBean id="s1" class="com.test.Product"  scope="request"/>
<jsp:setProperty property="no" name="s1" value="1001"/>
<jsp:setProperty property="name" name="s1" value="Dell Laptop"/>
<h1>
PNO:
<jsp:getProperty property="no" name="s1"/>
PNAME:
<jsp:getProperty property="name" name="s1"/>
</h1>