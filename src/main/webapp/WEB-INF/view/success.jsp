<%@page import="com.cjc.crud.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>Register Info</title>
<script>
  function deleteData()
  {
	  alert("You are going to delete data");
	  document.myform.action="delete";
	  document.myform.submit();
  }
  function updateData()
  {
	  alert("You are going to update records...")
	  document.myform.action="update";
	  document.myform.submit();
  }
</script>
</head>
<body>
	<h2>Welcome to CJC!</h2>
	<%--
<% Student st=(Student)request.getAttribute("data"); %>
<%=st.getUname() %>
<%=st.getFname() %>
<%=st.getPwd() %>
<%=st.getPhno() %>
<%=st.getEmail() %>   --%>
	<%--For Large data --%>
	<%--
<% List<Student> st=(List<Student>)request.getAttribute("data"); %>
<% for(Student s:st){%>
   <h1><%= s.getFname() %></h1>
   <h1><%= s.getUname() %></h1>
   <h1><%= s.getPwd() %></h1>
   <h1><%= s.getPhno()%></h1>
   <h1><%= s.getEmail() %></h1>
   


<% } %>
 --%>

	<%--For displaying in tabular format --%>
	<%
		List<Student> st = (List<Student>) request.getAttribute("data");
	
	
	%>
	<form name="myform">
	  <table border="2">
		<thead>
			<tr>
				<th>select</th>
				<th>Roll no</th>
				<th>user name</th>
				<th>password</th>
				<th>name</th>
				<th>mob no</th>
				<th>EmailId</th>
			</tr>
		</thead>
		<tbody>


			<%
				for (Student s : st) {
			%>
			<tr>
			    <td><input type="radio" name="rollno" value="<%=s.getRollno()%>"></td>
				<td><%=s.getRollno()%></td>
				<td><%=s.getUname()%></td>
				<td><%=s.getPass() %></td>
				<td><%=s.getName()%></td>
				<td><%=s.getMobileno() %></td>
				<td><%=s.getEmailid() %></td>
				
			</tr>


			<%
				}
			%>


		</tbody>
		<button onclick="deleteData()">Delete</button>
		<button onclick="updateData()">Update</button>
	</table>
	</form>
</body>
</html>