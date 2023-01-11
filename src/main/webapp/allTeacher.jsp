<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<div class="row">
			<div class="col-md-5">
				<form action="/addTeacher" method="post" style=" padding: 50px;">
				<h4>Teacher Form</h4>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Name</label> <input
							type="text" class="form-control" name="name">
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Email Address</label> <input
							type="text" class="form-control" name="email">
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Date of Birth</label> <input
							type="text" class="form-control" name="dateofbirth">
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Designation</label> <input
							type="text" class="form-control" name="designation">
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Gender</label> <select class="form-select form-select-lg mb-3"
							aria-label=".form-select-lg example" name="gender">
							<option>Male</option>
							<option>Female</option>
						</select>
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Religion</label> <input
							type="text" class="form-control" name="religion">
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Address</label> <input
							type="text" class="form-control" name="address">
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Joining Date</label> <input
							type="text" class="form-control" name="jdate">
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Phone Number</label> <input
							type="text" class="form-control" name="phone">
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
					
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