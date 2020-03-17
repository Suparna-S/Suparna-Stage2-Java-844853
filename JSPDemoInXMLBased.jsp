<body bgcolor="violet">
<jsp:declaration>
int add(int x, int y)
{
	return x+y;
}
</jsp:declaration>
<h1>
<jsp:scriptlet>
out.println("Inside Scriptlets Add: "+add(10,20));
</jsp:scriptlet>
<br>
<jsp:expression> 
"Add: "+add(10,22)
</jsp:expression>

</body>

