<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="yummy1" type="demo.model.BType.BurgerType" scope="request"/>
    <jsp:useBean id="yummy2" type="demo.model.FType.FroyoType" scope="request"/>
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
			<p class="lead text-white">This is what you ordered: </p>
		</div>
	</div>
	<div class="container-fluid mx-5">
	
		<div class="alert alert-success" role="alert">
			
			<% if (yummy1.displayBurger() == "Ultra Burger!!!"){ %>
			<strong>Total Price</strong> Total Price is P250.00.
			<%} else {  %> <strong>Total Price</strong> Total Price is P300.00.<% } %>
			
		</div>
		<div class="card-deck">
		<div class="card mb-3 card-outline-primary">
			<h4 class="card-header">
				<%=yummy1.displayBurger() %>
			</h4>
			
			<div class="card-block">
				<p class="card-text">
				</p>
				<p class="card-text">
					<label>Burger size:</label> <%=yummy1.getSize().displayBurgerSize() %>
				</p>
			</div>
		</div> 
		
		<div class="card mb-3 card-outline-primary">
			<h4 class="card-header">
				<%=yummy2.displayFroyo() %>
			</h4>
			
			<div class="card-block">
				<p class="card-text">
					<%=yummy2.descriptionFroyo() %>
				</p>
				<p class="card-text">
					<label>Froyo size:</label> <%=yummy2.getSize().displayFroyoSize() %>
				</p>
			</div>
		</div> 
		</div>
		
		<p class="mt-2 mb-3">
			<a class="btn btn-success" href="index.jsp" role="button">
				<i class="fa fa-undo pr-2" aria-hidden="true"></i>Order Again
			</a>
			<a class="btn btn-primary" href="listorders.action" role="button">
				<i class="fa fa-bars pr-2" aria-hidden="true"></i>Show all orders
			</a>
		</p>
		
		
		
		<!-- <p><%=yummy1.displayBurger() %></p>
		<p><%=yummy1.getSize().displayBurgerSize() %></p>
		<p><%=yummy2.displayFroyo() %></p>
		<p><%=yummy2.descriptionFroyo() %></p>
		<p><%=yummy2.getSize().displayFroyoSize() %></p>
		
		<div class="mt-3" style="background-color:;">
			<div class="row justify-content-center">
				<div class="col-md-9">
					
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Burger</th>
								<th>Burger Size</th>
								<th>Froyo</th>
								<th>Froyo Size</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>-->
	</div>
</body>
</html>