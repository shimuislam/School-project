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
    <div class="col-md-6 mt-5" style="padding: 20px; font-family:serif">
      <form action="/update" method="put">
		<div class="mb-3">
		<h2>Update Student</h2>
			<label for="exampleInputEmail1" class="form-label">Name</label> <input
				class="form-control" name="name" value=${s.getName()}>

		</div>
		<div class="mb-3">
			<label class="form-label">Email</label> 
			<input class="form-control" name="email" value=${s.getEmail()}>
			</div>	
			<div class="mb-3">
			<label class="form-label">Address</label> 
			<input class="form-control" name="address" value=${s.getAddress()}>
			</div>
			<div class="mb-3">
			<label class="form-label">Phone Number</label> 
			<input class="form-control" name="phone" value=${s.getPhone()}>
			</div>
		

		<button type="submit" class="btn btn-primary">Update</button>
		
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