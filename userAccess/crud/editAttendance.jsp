<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<%@page import="finalLab.viewData.ListDao"%>
	<jsp:useBean id="me" class="finalLab.viewData.ListBean">
		<jsp:setProperty property="*" name="me"/>
	</jsp:useBean>
	<%
		int i=ListDao.update(me);	
		response.sendRedirect("viewForm.jsp");
	%>
</body>
</html>