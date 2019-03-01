<!DOCTYPE html>
<html>
<head>
	   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title></title>
</head>
<body>

	<%
	//Check if the value of the method is "Post" irrespective of it being upper case on lower case
    if("POST".equalsIgnoreCase(request.getMethod()))
    {
      
        float farenheit, celsius; 
        
        //casting data in form to float
        farenheit = Float.parseFloat(request.getParameter("data"));
        celsius = (farenheit - 32) * 5/9;
        out.print("Celsius Equivalent: "+celsius);
    }
%>
</body>
</html>