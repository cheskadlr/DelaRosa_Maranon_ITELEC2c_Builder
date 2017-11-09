<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
	      <li class="nav-item">
	        <a class="nav-link" href="index.jsp">Home</a>
	      </li>
	      <li class="nav-item active">
	        <a class="nav-link" href="BuildItems.jsp">Build your Order</a>
	      </li>
	    </ul>
		
	</nav>

	<div class="jumbotron jumbotron-fluid text-light bg-primary">
		<div class="container">
			<h1 class="display-3">Project Buryo</h1>
			<p class="lead text-white">Welcome! Burger + Froyo. Build your order here.</p>
		</div>
	</div>
	<div class="container-fluid mx-5">
		<form action='orderitem.html' method="post">
			<p class="h3">BURGER</p>
			<div class="row">
				<div class="col">
					Type:
					<div class="form-check">
					  <label class="form-check-label">
					    <input class="form-check-input" type="radio" name="pickBurger" value="ultra" checked>
					   	Ultra Burger
					  </label>
					</div>
					
					<div class="form-check">
					  <label class="form-check-label">
					    <input class="form-check-input" type="radio" name="pickBurger" value="ultraMega">
					   	Ultra Mega Burger
					  </label>
					</div>
				</div>
			
				<div class="col">
					Patty Size:
					<div class="form-check">
					  <label class="form-check-label">
					    <input class="form-check-input" type="radio" name="pickBurgerSize" value="half" checked>
					   	1/2
					  </label>
					</div>
					
					<div class="form-check">
					  <label class="form-check-label">
					    <input class="form-check-input" type="radio" name="pickBurgerSize" value="quarter">
					   	1/4
					  </label>
					</div>
					
					<div class="form-check">
					  <label class="form-check-label">
					    <input class="form-check-input" type="radio" name="pickBurgerSize" value="eighth">
					   	1/8
					  </label>
					</div>
				</div>
			</div>
			
			<p class="h3">FROYO</p>
				<div class="row">
					<div class="col">
						Flavor:
						<div class="form-check">
						  <label class="form-check-label">
						    <input class="form-check-input" type="radio" name="pickFroyoFlavor" value="Chocolate" checked>
						   	Chocolate
						  </label>
						</div>
					
						<div class="form-check">
						  <label class="form-check-label">
						    <input class="form-check-input" type="radio" name="pickFroyoFlavor" value="Strawberry">
						   	Strawberry
						  </label>
						</div>	
						
						<div class="form-check">
						  <label class="form-check-label">
						    <input class="form-check-input" type="radio" name="pickFroyoFlavor" value="Vanilla">
						   	Vanilla
						  </label>
						</div>
					</div>
					
					<div class="col">	
						Size:
						<div class="form-check">
						  <label class="form-check-label">
						    <input class="form-check-input" type="radio" name="pickFroyoSize" value="Small" checked>
						   	Small
						  </label>
						</div>
						
						<div class="form-check">
						  <label class="form-check-label">
						    <input class="form-check-input" type="radio" name="pickFroyoSize" value="Medium">
						   	Medium
						  </label>
						</div>
						
						<div class="form-check">
						  <label class="form-check-label">
						    <input class="form-check-input" type="radio" name="pickFroyoSize" value="Larger">
						   	Large
						  </label>
					</div>
				</div>
			</div>
			
			<button type="submit" class="btn btn-success mt-3 mb-3">Submit</button>
			
		</form>
	</div>

</body>
</html>