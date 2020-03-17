<body bgcolor="yellow" text="blue">
<h1>Java Bean Details:</h1>
<jsp:useBean id="b1" class="com.test.Product" scope=session />
<h1>
<jsp:setProperty property="no" name="b1" /> 
<jsp:setProperty property="name" name="b1" /> 
</h1>