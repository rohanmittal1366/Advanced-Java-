<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
	  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	  
</head>
<body text-align="center">
	<div class="container">

		<div class="jumbotron" style="background:#004993">
			<h1 align="center" style="color:white">Login - SignUp</h1>
		</div>
		<div class="row">
			
			<div class="col-sm-6"><a href="#" data-toggle="modal" data-target="#exampleModalCenter"><button type = "button" class = "btn btn-primary btn-block"> <span class="glyphicon glyphicon-user"></span><h6> Login </h6> </button></a></div>
			<div class="col-sm-6"><a href="#" data-toggle="modal" data-target="#exampleModalCenter1"><button type = "button" class = "btn btn-primary btn-block"> <span class="glyphicon glyphicon-log-in"></span> <h6> SignUp</h6> </button></a></div>
	
		</div>
		<%
			//application.removeAttribute("Counter");
                	//response.setIntHeader("Refresh", 1);
                    Integer cnt = (Integer)application.getAttribute("Counter");
                    if(cnt ==null || cnt == 0){
                        out.println("First Visit");
                        cnt = 1;
                    }
                    else{
                        out.println("Visit counter : ");
                        cnt += 1;
                    }
                    application.setAttribute("Counter", cnt);
         %>
        <p>You are visitor number: <%= cnt%></p>
		<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		  <div class="modal-dialog modal-dialog-centered" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle" style="font-size:20px">Signup</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <form action="Login" method="post">
		        	<div class="form-group">
				      <label for="email">Email:</label>
				      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
				    </div>
				    <div class="form-group">
				      <label for="pwd">Password:</label>
				      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" required>
				    </div>
				    <div class="modal-footer">
				        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
				        <button type="submit" name = 'submitbuttonlogin' class="btn btn-primary" >Submit</button>
		     		 </div>
				    
		        </form>
		      </div>
		      
		    </div>
		  </div>
		</div>
		
		<div class="modal fade" id="exampleModalCenter1" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		  <div class="modal-dialog modal-dialog-centered" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle" style="font-size:20px">Signup</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <form action="Signup" method="post">
		        	<div class="form-group">
				      <label for="name">Name</label>
				      <input type="text" class="form-control" id="name" placeholder="Enter name" name="name" required>
				    </div>
		        	<div class="form-group">
				      <label for="email">Email:</label>
				      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
				    </div>
				    <div class="form-group">
				      <label for="pwd">Password:</label>
				      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" required>
				    </div>
				    <div class="modal-footer">
				        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
				        <button type="submit" name = 'submitbuttonsignup' class="btn btn-primary" >Submit</button>
		     		 </div>
		        </form>
		      </div>
		      
		    </div>
		  </div>
		</div>
		
	</div>
</body>
</html>