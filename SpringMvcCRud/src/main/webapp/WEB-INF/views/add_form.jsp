<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-3">
<div class="row" >
<div class="col-md-4 offset-md-4">

<h3 class="text-center mb-3" >Fill the Details</h3>
<form action="add-student" method="post">	 
		  <div class="form-group">
		    <label for="name">Student name</label>
		    <input type="text" class="form-control" id="name"
		     placeholder="Enter name"
		     name="name">
		  <%--   // <h6 class="text-danger">${msg}</h6> --%>
		  </div>
		   
		  <div class="form-group">
		    <label for="name">Student Age</label>
		    <input type="text" class="form-control"
		      placeholder="Enter Age"
		     name="age">
		  </div>
		  
		  <div class="form-group">
		    <label for="description">city</label>
		    <input type="text" class="form-control" id="city"
		      placeholder="Enter city"
		     name="city">
		  </div>
		  <div class="form-group">
		    <label for="description">email</label>
		    <input type="email" class="form-control" id="email"
		      placeholder="Enter email"
		     name="email">
		     <h6 class="text-danger">${msg}</h6>
		  </div>
		  
		  <div class="text-center" >
		  <a href="${pageContext.request.contextPath }/" class="btn btn-primary">Back</a>
		  <button type="submit" class="btn btn-primary">Add</button></div>
</form></div></div></div>
</body>
</html>