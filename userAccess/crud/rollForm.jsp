<%@page import="finalLab.viewData.ListDao"%>

<jsp:useBean id="me" class="finalLab.viewData.ListBean">	
	<jsp:setProperty property="*" name="me"/> 
</jsp:useBean>
<%  
int i=ListDao.save(me);  
if(i>0){ 
	response.sendRedirect("addAttendance-Success.jsp");  
}else{  
	response.sendRedirect("addAttendance-Error.jsp"); 
}  
%>  

</body>
</html>