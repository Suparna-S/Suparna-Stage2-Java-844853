<!-- EL IMPLICIT OBJECT::pageContext.request.contextPath
(http://localhost:8080/SpringHibIntegra)-->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<body>
	<form:form id="form1" name="form1" modelAttribute="patient" method="post" action="AdminPage">
		<table width="526" border="0" align="center">
			<tr>
				<td width="520">&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><fieldset>
						<legend>Admin Login</legend>
						<table width="499" border="0" align="center">
							<tr>
								<td colspan="5">&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							<td colspan="3" style="color: red"><c:if
									test="${not empty result}">${result}</c:if></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td width="50">&nbsp;</td>
								<td width="114">Enter Name</td>
								<td colspan="2"><label> 
<form:input type="text"	name="P_name" id="P_name" style=" width : 159px;" path="P_name" />
								</label></td>
								<td width="131">&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>Enter Password</td>
								<td colspan="2"><label> 
<form:input type="password" name="P_pwd" id="P_pwd" style=" width : 160px;" path="P_pwd" />
								</label></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td width="109"><label></label></td>
								<td width="73"><label> 
<input type="submit" name="btn_login" id="btn_login" value="Login" />
								</label></td>
								<td><a href="${pageContext.request.contextPath}/callproj">Register Here >>></a>
								 </td>
							</tr>
						</table>
					</fieldset>
					</td>
			</tr>
		</table>
	</form:form>
</body>
</html>