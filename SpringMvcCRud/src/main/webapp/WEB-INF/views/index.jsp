<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div class="container mt-5">
	<div class="row">
		<div class="col-md-12">
		<h2 class="text-center">Student Deatils</h2>
		<form action="${pageContext.request.contextPath}/search">
		<input type="text" name="name" placeholder="search by name">
		</form>
		<h7>${msg}</h7>
		     	</div>
		     </div> 	
		  </div>
		    <div class="text-center" ></div>
	     	<table class="table table-bordered">
				  <thead>
				    <tr>
				      <th scope="col">S.ID</th>
				      <th scope="col">S.Name</th>
				      <th scope="col">AGE</th>
				      <th scope="col">ADDRESS</th>
				      <th scope="col">Email</th>
				      <th scope="col">Action</th>
				    </tr>
				  </thead>
				  <tbody>
				  <c:forEach items="${students}" var="s">
				    <tr>
				      <th scope="row">${s.id }</th>
				      <td>${s.name }</td>
				      <td>${s.age }</td>
				      <td>${s.city }</td>
				       <td>${s.email }</td>
				      <td><a href="${pageContext.request.contextPath}/delete/${s.id}"><i class="fas fa-trash-alt"></i></a>
				      <a href="${pageContext.request.contextPath}/update/${s.id}">&emsp;<i class="fa-solid fa-pen-to-square"></i></a></td>
				    </tr>
				  </c:forEach>
				  </tbody>
				</table>
				<div class="text-center" ><a  href="${pageContext.request.contextPath}/add"class="btn btn-primary">Add</a></div>
		</div>
	</div>
</div>

</body>
</html>
