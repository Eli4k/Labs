<%@ page import="finalLab.login.loginDao"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>

	<jsp:useBean id="execute" class="finalLab.login.loginBean"/>
		<jsp:setProperty property="*" name="execute"/>
		

				<% 

					 boolean status=loginDao.validate(execute);
					 if(status){
					 	session.setAttribute("session", "TRUE");
					 	response.sendRedirect("../crud/addForm.html");
					}
					else
						{
							out.print("Email or Password does not match!");
						}
				%>

	

</body>
</html>