<!-- By default,
the type of the input tag is text. -->

<%@page isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1>
<form:form action="valid" modelAttribute="result">
Name:<form:input path="name"/>
Hobbies:
Shopping<form:checkbox path="f_hobbies" value="Shopping"/>
Cricket<form:checkbox path="f_hobbies" value="Cricket"/>
SocialMedia<form:checkbox path="f_hobbies" value="Whatsapp,Google"/>
<br><br>
Gender:
Male<form:radiobutton path="gender" value="Male"/>
Female<form:radiobutton path="gender" value="Female"/>
<br><br>
Country:
<form:select path="country" items="${countryopt}" multiple="true"/>
<input type="submit" value="Submit"/>
</form:form>
</h1>