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
			<div class="col" style="margin-top: 2%">
			<a href="/addTeacherForm" >Add Teacher</a>
				<table class="table table-success table-striped" style="font-family:serif">
					<thead style="background-color: #04AA6D;  color: white;  padding: 15px;text-align: left;">
						<tr>
						   
							<th scope="col">Teacher's name</th>
							<th scope="col">Email</th>
							<th scope="col">Phone</th>
							<th scope="col">Action</th>
							<th></th>
						</tr>
					</thead>
				
					<tbody>
					<c:forEach var="t" items="${st }">
						<tr>
							<td>${t.name }</td>
							<td>${t.email }</td>
							<td>${t.phone }</td>
							<td><form action="/updateTeacherf/${t.getId()}">
							<input type="submit" class="btn btn-info" value="Update" />
						</form></td>
						<td><form action="/deleteteacher/${t.getId()}">
							<input type="submit" class="btn btn-danger" value="Delete" />
						</form></td>
							
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>