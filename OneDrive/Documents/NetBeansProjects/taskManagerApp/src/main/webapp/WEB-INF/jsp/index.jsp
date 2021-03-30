<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache"> 
    <meta http-equiv="Cache-Control" content="no-cache">
    
    <title>Task Manager | Home</title>

	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<%--    <link href="static/css/bootstrap.min.css" rel="stylesheet">--%>
     <link href="static/css/style.css" rel="stylesheet">
    
    <!--[if lt IE 9]>
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	<![endif]-->
</head>
<body>

<%--	<div role="navigation">--%>
<%--		<div class="navbar navbar-inverse">--%>
<%--			<a href="/" class="navbar-brand">Task Manager</a>--%>
<%--			<div class="navbar-collapse collapse">--%>
<%--				<ul class="nav navbar-nav">--%>
<%--					<li><a href="new-task">New Task</a></li>--%>
<%--					<li><a href="all-tasks">All Tasks</a></li>--%>
<%--				</ul>--%>
<%--			</div>--%>
<%--		</div>--%>
<%--	</div>--%>

<nav class="navbar navbar-expand-md navbar-dark bg-dark">
	<a class="navbar-brand text-success" href="/">
		<span style="font-size: 1em; color:#fff;">
			<i class="fas fa-tasks"></i>
		</span>
		Task Manager App</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse justify-content-md-center" id="navbarCollapse">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active">
				<a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="new-task">New Task</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="all-tasks">All Tasks</a>
			</li>
		</ul>
		<form class="form-inline mt-2 mt-md-0">
			<input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
	</div>
</nav>
	
	<c:choose>
		<c:when test="${mode == 'MODE_HOME'}">
			<div class="container py-5" id="homeDiv">
				<div class="jumbotron">
					<h1 class="display-4">Welcome to Task Manager App</h1>
					<p class="lead">This is a simple app that demostrates CRUD operations.</p>
					<hr class="my-4">
					<p>It uses Spring-boot framework, JSP, JPA, Bootstrap and MySql.</p>
					<img src="static/img/spring.png" height="50px"/>&nbsp;&nbsp;
					<img src="static/img/mysql.png" height="50px"/><br/><br>
					<a class="btn btn-primary btn-lg" href="https://spring.io/projects/spring-boot" role="button">Learn more</a>
					<hr class="my-4">
					<a href="" class="btn btn-outline-success">Log In</a>
					<a href="" class="btn btn-outline-success">Sign Up</a>

				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_TASKS'}">
			<div class="container text-center py-5" id="tasksDiv">
				<h3 class="display-4">My Tasks</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>Id #</th>
								<th>Name</th>
								<th>Description</th>
								<th>Date Created</th>
								<th>Finished</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="task" items="${tasks}">
								<tr>
									<td>${task.id}</td>
									<td>${task.name}</td>
									<td>${task.description}</td>
									<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${task.dateCreated}"/></td>
									<td>${task.finished}</td>
									<td class="text-center"><a href="update-task?id=${task.id}"><i class="fas fa-edit align-items-center"></i></a></td>
									<td class="text-center"><a href="delete-task?id=${task.id}"><i class="fas fa-trash-alt" style="color: red"></i></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container py-5">
				<h3 class="display-4 text-center">Manage Task</h3>
				<hr>
				<form class="" method="POST" action="save-task">
					<input type="hidden" name="id" value="${task.id}"/>
					<div class="form-group row">
						<label class="control-label col-md-2 col-form-label-lg">Name</label>
						<div class="col-md-10">
							<input type="text" class="form-control form-control-lg" placeholder="Enter task title here" name="name" value="${task.name}"/>
						</div>				
					</div>
					<div class="form-group row">
						<label class="control-label col-md-2 col-form-label-lg">Description</label>
						<div class="col-md-10">
							<input type="text" class="form-control form-control-lg" placeholder="Enter task details here" name="description" value="${task.description}"/>
						</div>				
					</div>
					<div class="form-group row">
						<legend class="col-md-2 col-form-label-lg">Finished</legend>
						<div class="col-md-10">
							<div class="form-check">
								<input type="radio" class="form-check-input" name="finished" value="true"/>
								<label class="form-check-label">Yes</label>
							</div>
							<div class="form-check">
								<input type="radio" class="form-check-input" name="finished" value="false" checked/>
								<label class="form-check-label">No</label>
							</div>
						</div>				
					</div>
					<div class="form-group text-center">
						<input type="submit" class="btn btn-lg btn-success" value="Save"/>
					</div>
				</form>
			</div>
		</c:when>		
	</c:choose>

<footer class="footer mt-auto py-3">
	<div class="container">
		<span class="text-muted">&copy; All rights reserved. Created by <a href="www.github.com/thesohelchaikh">Sohel Shaikh</a></span>
	</div>
</footer>

	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>