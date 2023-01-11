<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	
</head>
<body>

	<div class="container">
		<div class="row" >
			<div class="col-md-11" >
					<a href="/admission">Student Admission</a>
					<table class="table table-success table-striped table-sm" style="font-family:serif;">
						<thead style="background-color: #04AA6D;  color: black;  padding: 15px;text-align: left;">
							<tr>
							<th scope="col">SID</th>
								<th scope="col">Name</th>
								<th scope="col">Class</th>
								<th scope="col">Address</th>
								<th scope="col">Phone</th>
								<th scope="col">Action</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
						<c:forEach var="s" items="${st}">
							<tr>
								<td>${s.sid}</td>
								<td>${s.name}</td>
								<td>${s.classes }</td>
								<td>${s.address}</td>
								<td>${s.phone }</td>
								
								<td><form action="/updatef/${s.getId()}">
								<input type="submit" class="btn btn-info" value="Update" />
							</form></td>
							<td><form action="/delete/${s.getId()}">
								<input type="submit" class="btn btn-danger" value="Delete" />
							</form></td>
							</tr>
							</c:forEach>
						</tbody>
					</table>
					<form action="/dashboard" method="post">
						<button type="submit" class="btn btn-primary mb-2">Back</button>
					</form>
					
				
				
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>