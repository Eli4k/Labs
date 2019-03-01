<!DOCTYPE html>
<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title></title>
</head>
<body>
	<jsp:useBean id="execute" class="test2.Farenheit">
		<jsp:setProperty property="temperature" name="execute"/>
		<h1>You have entered the data Below</h1>
		<jsp:getProperty property="temperature" name="execute"/>
	</jsp:useBean>

<%= "Celsius Equivalent: "+execute.getTemp()-32 * 5.0/9.0; %>

</body>
</html>


