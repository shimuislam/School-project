<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>LogIn</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-md-4" style=" ">
      <form action="/" style="border:2px solid lightgray; border-radius:5px; padding: 50px; margin-top:10%; box-shadow: box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;">
      <h2>Login</h2>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">User ID</label>
    <input type="text" class="form-control" name="id"/>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" name="password"/><br>
    <button type="submit" class="btn btn-primary">LogIn</button>
    <a href="/dashboard.jsp">Back</a>
  </div>
</form>
    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>