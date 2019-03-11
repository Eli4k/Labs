<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;" charset="utf-8">
	<title>Edit Attendance</title>
</head>
<body>
	<%@page import="finalLab.viewData.ListDao, finalLab.viewData.ListBean"%>
	<%
		String id=request.getParameter("id");
		ListBean me = ListDao.getRecordById(Integer.parseInt(id));
	%>
	<h1>Edit Form</h1>
	<form action="editAttendance.jsp" method="post">
		<table>
			<tr>
				<th>Monday</th>
				<th>Tuesday</th>
				<th>Wednesday</th>
				<th>Thursday</th>
				<th>Friday</th>	
			</tr>

			<tr>
				<td>
					<select name="monday">
						<option></option>
						<option>Absent</option>
						<option>Present</option>
					</select>
				</td>
				
				<td>
					<select name="tuesday">
						<option></option>
						<option>Absent</option>
						<option>Present</option>
					</select>
				</td>
				
				<td>
					<select name="wednesday">
						<option></option>
						<option>Absent</option>
						<option>Present</option>
					</select>	
				</td>
				
				<td>
					<select name="thursday">
						<option></option>
						<option>Absent</option>
						<option>Present</option>
					</select>
				</td>
				<td>
					<select name="friday">
						<option></option>
						<option>Absent</option>
						<option>Present</option>
					</select>
				</td>
				<br>
			</tr>
			<input type="submit" value="Submit">	
		</table>
			
	</form>
</body>
</html>