<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
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

	<nav class
	="navbar sticky-top navbar-toggleable-md navbar-inverse bg-inverse">
		<a class="navbar-brand brand" href="#">
			<img src="assets/img/logo.png" width="130px">
		</a>
		
		<ul class="navbar-nav mr-auto mt-2 mt-md-0">
	      <li class="nav-item active">
	        <a class="nav-link" href="index.jsp">Home</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="BuildItems.jsp">Build your Order</a>
	      </li>
	    </ul>
		
	</nav>

	<div class="jumbotron jumbotron-fluid text-light bg-primary">
		<div class="container">
			<h1 class="display-3">Project Buryo</h1>
			<p class="lead text-white">Welcome! Burger + Froyo</p>
		</div>
	</div>
	<div class="container-fluid mx-5">
	
	<fieldset>
		<h1>BURGERS</h1>
		<form action="processorder.html" method="POST">
			<p>Select your preferred burger</p>
			
			<div class="card-deck">
				<div class="card mb-3 card-outline-primary">
					<h4 class="card-header">
						<label class="form-check-label">
							<input type="radio" class="form-check-input" name="burgertype" value="Ultra" checked> Ultra Burger
						</label>
					</h4>
					
					<img src="assets/img/burger1.png" class="w-75 mx-auto d-block burger my-4">
				</div> 
				
				<div class="card mb-3 card-outline-primary">
					<h4 class="card-header">
						<label class="form-check-label">
							<input type="radio" class="form-check-input" name="burgertype" value="Ultra Mega"> Ultra Mega Burger
						</label>
					</h4>
					
					<img src="assets/img/burger2.png" class="w-50 mx-auto d-block burger my-4">
				</div> 
			</div>	
			
			
			
			<!-- <div class="form-check form-check-inline">
				<div class="card mb-3 card-outline-primary">
					<h4 class="card-header">
						<label class="form-check-label">
							<input type="radio" class="form-check-input" name="burgertype" value="Ultra" checked> Ultra Burger
						</label>
					</h4>
					
					<img src="assets/img/burger1.png" class="w-75 mx-auto d-block burger">
				</div> 
			</div>
			
			<div class="form-check form-check-inline">
				<div class="card mb-3 card-outline-primary">
					<h4 class="card-header"><label class="form-check-label">
							<input type="radio" class="form-check-input" name="burgertype" value="Ultra Mega"> Ultra Mega Burger
						</label></h4>
					<img src="assets/img/burger2.png" class="w-75 mx-auto d-block burger">
				</div>
			</div>-->
			
			<label class="form-check form-check-inline">Select your preferred patty size:</label>
			<div class="form-check form-check-inline">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="burgersize" value="One-Eighth" checked>
					1/8
				</label>
			</div>
			
			<div class="form-check form-check-inline">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="burgersize" value="One-Fourth">
					1/4
				</label>
			</div>

			<div class="form-check form-check-inline">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="burgersize" value="One-Half">
					1/2
				</label>
			</div>
			
		<br><br><br>
			
		<h1>FROYO</h1>
			<div class="card-deck">
				<div class="card mb-3 card-outline-primary">
					<h4 class="card-header">
						<label class="form-check-label">
							<input type="radio" class="form-check-input" name="froyotype" value="Strawberry" checked> Strawberry
						</label>
					</h4>
					
					<img src="assets/img/str.jpg" class="w-75 mx-auto d-block burger my-4">
				</div> 
				
				<div class="card mb-3 card-outline-primary">
					<h4 class="card-header">
						<label class="form-check-label">
							<input type="radio" class="form-check-input" name="froyotype" value="Vanilla"> Vanilla
						</label>
					</h4>
					
					<img src="assets/img/vanilla.jpeg" class="w-75 mx-auto d-block burger my-4">
				</div> 
				
				<div class="card mb-3 card-outline-primary">
					<h4 class="card-header">
						<label class="form-check-label">
							<input type="radio" class="form-check-input" name="froyotype" value="Chocolate"> Chocolate
						</label>
					</h4>
					
					<img src="assets/img/choco.JPG" class="w-75 mx-auto d-block burger my-4">
				</div> 
			</div>	
			<!--<p>Select your preferred Froyo flavor</p>
			<div class="form-check form-check-inline">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="froyotype" value="Strawberry" checked>
					Strawberry
				</label>
			</div>
			
			<div class="form-check form-check-inline">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="froyotype" value="Vanilla">
					Vanilla
				</label>
			</div>

			<div class="form-check form-check-inline">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="froyotype" value="Chocolate">
					Chocolate
				</label>
			</div>-->
			
			<label class="form-check form-check-inline">Select your preferred froyo size:</label>
			<div class="form-check form-check-inline">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="froyosize" value="Small" checked>
					Small
				</label>
			</div>
			
			<div class="form-check form-check-inline">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="froyosize" value="Medium">
					Medium
				</label>
			</div>

			<div class="form-check form-check-inline">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="froyosize" value="Large">
					Large
				</label>
			</div>		
	
				
			
			<p class="my-5">
				<button type="submit" value="Show Burger Yummy Info" class="btn btn-success">
					<i class="fa fa-cart-plus pr-2" aria-hidden="true"></i>Add order
				</button>
				<button type="reset" class="btn btn-warning">
					<i class="fa fa-undo pr-2" aria-hidden="true"></i>Reset
				</button>
			</p>
		</form>
			<form action="listorders.action" method="post">
				<button type="submit" value="Show Burger Yummy Info" class="btn btn-success">
					<i class="fa fa-bars pr-2" aria-hidden="true"></i>Show all orders
				</button>
			</form>
			
	</fieldset>
	</div>
	<script src="assets/dist/js/tether.min.js"></script>
	<script src="assets/dist/js/jquery-3.2.1.min.js"></script>
	<script src="assets/dist/js/bootstrap.min.js"></script>
</body>
</html>