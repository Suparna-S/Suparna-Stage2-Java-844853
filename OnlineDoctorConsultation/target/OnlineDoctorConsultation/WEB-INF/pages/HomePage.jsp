<%@ page language="java"  charset=ISO-8859-1
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<title>Welcome to Home Page</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
.w3-bar,h1,button {font-family: "Montserrat", sans-serif}
.fa-anchor,.fa-coffee {font-size:200px}
</style>
<body>
<input type="submit" value="AdminLogin.jsp" name="Admin"/>
<input type="submit" value="PatientRegistration.jsp" name="Patient"/>
<!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-red w3-card w3-left-align w3-large">
    <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-red" href="javascript:void(0);" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
    <a href="#" class="w3-bar-item w3-button w3-padding-large w3-white">Home</a>
    <a href="AdminPage.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Admin</a>
 <!-- <a href="DoctorRegistration.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Doctor</a>  -->
    <a href="PatientRegistration.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Patient</a>

  </div>

  <!-- Navbar on small screens -->
  <div id="navDemo" class="w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium w3-large">
    <a href="AdminPage.jsp" class="w3-bar-item w3-button w3-padding-large">Admin</a>
 <!-- <a href="DoctorRegistration.jsp" class="w3-bar-item w3-button w3-padding-large">Doctor</a>  -->
    <a href="PatientRegistration.jsp" class="w3-bar-item w3-button w3-padding-large">Patient</a>

  </div>	
</div>

<!-- Header -->
<header class="w3-container w3-red w3-center" style="padding:128px 16px">
  <h1 class="w3-margin w3-jumbo">Welcome to Doctor Consultation</h1>
  <p class="w3-xlarge">Treatment at your ease!</p>
  
</header>

<!-- First Grid -->
<div class="w3-row-padding w3-padding-64 w3-container">
  <div class="w3-content">
    <div class="w3-twothird">
      <h1>Have any health concerns?</h1>
      <h5 class="w3-padding-32">Designed for your convenience and satisfaction. No more hold, no more wait! Now you can reach out 
to your doctor by their experience, specialty or that perfectly suits your time..!!</h5>

    </div>

    <div class="w3-third w3-center">
      <i class="fa fa-anchor w3-padding-64 w3-text-red"></i>
    </div>
  </div>
</div>

<div class="w3-container w3-black w3-center w3-opacity w3-padding-64">
    <h1 class="w3-margin w3-xlarge">Find a professional doctor and get Prescription!!</h1>
</div>

<!-- Footer -->
<footer class="w3-container w3-padding-64 w3-center w3-opacity">  
  
 <p>Developed by <a href="#" target="_blank">Suparna S</a></p>
</footer>

<script>
// Used to toggle the menu on small screens when clicking on the menu button
function myFunction() {
  var x = document.getElementById("navDemo");
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
  } else { 
    x.className = x.className.replace(" w3-show", "");
  }
}
</script>

</body>
</html>


<!-- %@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/homepage.css" type="text/css">
<title>Welcome JSP</title>
<h1>Welcome to Doctor Consultation!!!</h1>
</head>
<body>
<form>
<h2>Treatment at your ease!</h2>
<h2>Having Health Concerns??</h2>
<h3>Find a professional doctor and get Prescription!!</h3>
<h3>Designed for your convenience and satisfaction. No more hold, no more wait! Now you can reach out 
to your doctor by their experience, specialty or that perfectly suits your time..!!</h3>
<button onclick="document.location = 'Admin.jsp'">Admin</button>
<button onclick="document.location = 'Doctor.jsp'">Doctor</button>
<button onclick="document.location = 'Patient.jsp'">Patient</button>
<!-- <a href="Doctor.jsp">Doctor</a>
<a href="Patient.jsp">Patient</a>
<a href="Admin.jsp">Admin</a>  
</form>
</body>
</html> -->

<!--  
<html>
<body>
<h2>Hello World!</h2>
<% out.print("welcome to jsp"); %> 
</body>
</html>
 -->
 
 <!-- <html>  
<body>  
Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
</body>  
</html>  -->

<!-- <%@page contentType="text/html" import="java.util.*" %> 
<html>
<body>
<p>&nbsp;</p>
<div align="center">
<table border="0" cellpadding="0" cellspacing="0" width="460" bgcolor="#40E0D0">
<tr>
<td width="100%"><font size="6" color="#800000">&nbsp;Welcome to Doctor Consultation!!</font></td>
</tr>
<tr>
<td width="100%"><b>&nbsp;Treatment at your ease!&nbsp; <font size="5" color="#0000ff"> 
<!-- <%= new java.util.Date() %> 
</font></b></td>
</tr>
</table>
</center>
</div>
</body>
</html>  -->