<%@page import="com.cjc.crud.model.Student"%>
<html>
<head>
<title>Update Page</title>
</head>
<body>
	<%
		Student st = (Student) request.getAttribute("data");
	%>
	<form action="edit">
		Rollno:<input type="hidden" name="rollno" value="<%=st.getRollno()%>" ><br>
		User Name:<input type="text" name="uname"
			value="<%=st.getUname()%>"><br> Password:<input
			type="password" name="pass" value="<%=st.getPass()%>"><br>
		name:<input type="text" name="name" value="<%=st.getName()%>"><br>
		Mobile no:<input type="number" name="mobileno"
			value="<%=st.getMobileno()%>"><br> Email Id:<input
			type="text" name="emailid" value="<%=st.getEmailid()%>"><br>
		<input type="submit" value="Submit">
	</form>	
</body>

</html>