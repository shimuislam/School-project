<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="ISO-8859-1">
			<title>Insert title here</title>
			<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
				integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		</head>

		<body>
			<div class="container">
				<div class="row">
				<form action="/dashboard" method="post">
						<button type="submit" class="btn btn-primary mb-2 mt-2">Back</button>
					</form>
					<div class="col-md-5" style="font-family:serif;">
						<form action="/fee/addSubject" method="POST">
							<div class="mb-3">
								<input type="hidden" class="form-control" name="id">
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Class name</label> <input type="text"
									class="form-control" name="classna" value = 5>
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Student Name </label> <select
									class="form-select form-select-lg mb-3" aria-label=".form-select-lg example"
									name="studentName">
									<c:forEach var="s" items="${studentname}">
										<option>${s.name}</option>
									</c:forEach>
								</select>
							</div>

							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Bangla</label> <input type="text"
									class="form-control" name="bangla" value =0>
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">English</label> <input type="text"
									class="form-control" name="english" value =0>
							</div>

							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Math</label> <input type="text"
									class="form-control" name="math" value =0>
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">General Science</label> <input type="text"
									class="form-control" name="generalScience" value =0>
							</div>
							<button type="submit" class="btn btn-primary">Submit</button>
							
						</form>
						

						
					</div>
				</div>
			</div>
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
				integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
				crossorigin="anonymous"></script>
		</body>

		</html>