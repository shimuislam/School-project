<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Students</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<form action="/saveAdmission" method="POST"
					style=" padding: 50px; font-family:serif;">
					<h3>Student Admission Form</h3>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Student
							Name</label> <input type="text" class="form-control" name="name" />
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Date of
							Birth </label> <input type="text" class="form-control" name="date" />
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Select Class
							 </label> <select class="form-select form-select-lg mb-3"
							aria-label=".form-select-lg example" name="classes">
							<option>5</option>
							<option>6</option>
							<option>7</option>
							<option>8</option>
							<option>9</option>
							<option>10</option>

						</select>
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Gender
						</label> <select class="form-select form-select-lg mb-3"
							aria-label=".form-select-lg example" name="gender">
							<option>Male</option>
							<option>Female</option>
						</select>
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Blood
							Group </label> <select class="form-select form-select-lg mb-3"
							aria-label=".form-select-lg example" name="bloodgroup">
							<option>A+</option>
							<option>A-</option>
							<option>B+</option>
							<option>B-</option>
							<option>O+</option>
							<option>O-</option>

						</select>
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Religion
						</label> <input type="text" class="form-control" name="religeon" />
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Phone
							Number</label> <input type="text" class="form-control" name="phone" />
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Address
						</label> <input type="text" class="form-control" name="address" />
					</div>
					<button type="submit" class="btn btn-primary">Save</button>	
					<a href="/dashboard" role="button">Back</a>									
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