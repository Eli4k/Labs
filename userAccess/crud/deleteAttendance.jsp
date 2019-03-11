<%@page import="finalLab.viewData.ListDao"%>
<jsp:useBean id="me" class="finlLab.viewData.ListBean">
	<jsp:setProperty property="*" name="me"/>
</jsp:useBean>
<%
	ListDao.delete(me);
	reponse.sendRedirect("viewForm.jsp");
%>