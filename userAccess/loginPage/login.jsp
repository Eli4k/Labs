<%@include file="index.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style type="text/css">
		input{
			padding: 15px;
			border-radius: 0px;
			border: 1px solid grey;
			width: 40%;	
	}


	</style>
</head>
<body>
	<%
		String profile_msg = (String)request.getAttribute("profile_msg");
		if(profile_msg != null){
		out.print(profile_msg);
	}
		String login_msg= (String)request.getAttribute("login_msg");
		if(login_msg != null){
		out.print(login_msg);
	}
	
	%>
	<br>
	<form action="loginProcesses.jsp" method="post">
		<input type="text" name="email" placeholder="Email..."><br>
		<input type="password" name="pwd" placeholder="Password..."><br>
		<input type="submit" name="login">
	</form>
</body>
</html>