<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<form action="/dashboard" method="post">
			<button type="submit" class="btn btn-primary mb-2">Back</button>
		</form>
		
		<table class="table table-success table-striped" style="font-family:serif">
			<thead style="background-color: #04AA6D;  color: black;  padding: 15px;text-align: left;">
				<tr>
					<th scope="col">StudentName</th>
					<th scope="col">Bangla</th>
					<th scope="col">Math</th>
					<th scope="col">English</th>
					<th scope="col">General Science</th>
					<th scope="col">Result & GPA</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="s" items="${studentSubject}">
					<tr>
						<th scope="row">${s.studentName}</th>
						<td>${s.bangla}</td>
						<td>${s.math}</td>
						<td>${s.english}</td>
						<td>${s.generalScience}</td>
						<td>${s.result}& ${s.gpa}</td>








					</tr>
				</c:forEach>


			</tbody>
		</table>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>

</html>