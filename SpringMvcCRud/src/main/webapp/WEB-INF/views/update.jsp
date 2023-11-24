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
	<h3 class="text-center mb-3" >Update Details</h3>
	<form action="${pageContext.request.contextPath }/update-details" method="post">
		 
		  <div class="form-group">
		    <label for="name">Student id</label>
		    <input type="text" class="form-control"  value="${student.id }"
		     name="id">
		  </div>
		  
		  <div class="form-group">
		    <label for="name">Student name</label>
		    <input type="text" class="form-control" value="${student.name }"
		     name="name">
		  </div>
		  
		  <div class="form-group">
		    <label for="name">Student Age</label>
		    <input type="text" class="form-control"  value="${student.age }"
		     name="age">
		  </div>
		  
		  <div class="form-group">
		    <label for="description">city</label>
		    <input type="text" class="form-control"  value="${student.city }"
		     name="city">
		  </div>
		    <div class="form-group">
		    <label for="description">email</label>
		    <input type="email" class="form-control"  value="${student.email}"
		     name="email">
		  </div>
		  
		  <div class="text-center" >
		  <a href="${pageContext.request.contextPath }/" class="btn btn-primary">Back</a>
		  <button type="submit" class="btn btn-primary">update</button></div>
</form></div></div></div>
</body>
</html>