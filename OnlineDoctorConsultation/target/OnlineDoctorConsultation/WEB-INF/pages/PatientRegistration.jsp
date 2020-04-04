<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Patient Registration</title>
</head>

<body>
 <img height = 200 width=200 src="<c:url value="/resources/images/reg.jpg"></c:url>"/>	
	<form:form id="form1" name="form1" modelAttribute="patient" method="post" action="PatientRegistration">
		<table width="200" border="0" align="center">
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><fieldset>
						<legend>Patient Registration</legend>
						<table width="609" border="0" align="center">
							<tr>
								<td width="69">&nbsp;</td>
								<td colspan="2">ID</td>
								<td colspan="3"><label> <form:input type="text" name="P_id" id="P_id" path="P_id" />
								</label></td>
								<td width="56">&nbsp;</td>
							</tr>
							<tr>
								<td width="69">&nbsp;</td>
								<td colspan="2">Name</td>
								<td colspan="3"><label> <form:input type="text" name="P_name" id="P_name" path="P_name" />
								</label></td>
								<td width="56">&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Password</td>
								<td colspan="3"><form:input type="password" name="P_pwd" id="P_pwd" path="P_pwd" /></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Mobile</td>
								<td colspan="3"><form:input type="text" name="P_mobile"	id="P_mobile" path="P_mobile" /></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Age</td>
								<td colspan="3"><form:input type="text" name="P_age" id="P_age" path="P_age" /></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">City</td>
								<td colspan="3"><form:input type="text" name="P_city" id="P_city" path="P_city" /></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">State</td>
								<td colspan="3"><form:input type="text" name="P_state" id="P_state" path="P_state" /></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Diagnosed</td>
								<td colspan="3"><form:input type="text" name="P_diagnosed" id="P_diagnosed" path="P_diagnosed" /></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td width="60">&nbsp;</td>
								<td width="68"><input type="submit" name="btn_submit"
									id="btn_submit" value="Submit" /></td>
								<td>&nbsp;</td>
							</tr>
						</table>
					</fieldset></td>
			</tr>
		</table>
	</form:form>
</body>
</html>