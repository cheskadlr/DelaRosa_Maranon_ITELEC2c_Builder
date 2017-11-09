<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="java.sql.*"%>
    
<jsp:useBean id="dbRecord" type="java.sql.ResultSet" 
	scope="request"/>   
	 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" href="assets/img/logo.png" type="image/x-icon" />
<title>Project BurYo</title>

<link rel="stylesheet" href="assets/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/dist/custom.css">
<link rel="stylesheet" href="assets/dist/font-awesome/css/font-awesome.min.css">
</head>
<body  class="text-white">

	<nav class="navbar sticky-top navbar-toggleable-md navbar-inverse bg-inverse">
		<a class="navbar-brand mx-auto d-block brand" href="#">
			<img src="assets/img/logo.png" width="130px">
		</a>
	</nav>

	<div class="jumbotron jumbotron-fluid text-light bg-primary">
		<div class="container">
			<h1 class="display-3">Project Buryo</h1>
			<p class="lead text-white">All orders </p>
		</div>
	</div>
	<div class="container-fluid mx-5">
	
		<table class="table table-bordered table-striped table-sm">
			<tr>
				<th>Transaction #</th>
				<th>Burger</th>
				<th>Burger Size</th>
				<th>Froyo</th>
				<th>Froyo Size</th>
			</tr>
			<% while (dbRecord.next()) { %>
				<tr align="center">
					<td><%=dbRecord.getString("id") %></td>
					<td><%=dbRecord.getString("burger") %></td>
					<td><%=dbRecord.getString("bsize") %></td>
					<td><%=dbRecord.getString("froyo") %></td>
					<td><%=dbRecord.getString("fsize") %></td>
				</tr>
			<% } %>
		</table>
		<hr/>
		<form action='index.jsp'>
			<button type="submit" class="btn btn-success mb-3"><< TAKE ORDER >></button>
		</form>	
	</div>
</body>
</html>