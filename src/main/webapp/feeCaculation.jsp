<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fee calculation</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
            <div class="col-md-6">
                <button class="btn btn-primary">Due Student</button>                
                <br>
                <hr>
                <form action="/fee/calculate" method="post">
                    <label for="">Student ID</label>
                    <input type="text" placeholder="SID" name="sid">
                    <button class="btn btn-primary" type="submit">Calculate</button>
                </form>
                
                <table class="table table-bordered table-hover">
                    <thead>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Monthly Fee</th>
                        <th>Charge</th>
                        <th>Paid</th>
                        <th>due</th>
                        <th>Total</th>                        
                    </thead>
                    <tbody>
                        <c:forEach var="s" items="${st}">
                            <td>${s.sid}</td>
                            <td>${s.name}</td>
                            <td>${s.fee}</td>
                            <td>${s.charge}</td>
                            <td>${s.paid}</td>
                            <td>${s.dui}</td>
                            <td>${s.total}</td>
                        </c:forEach>                    
                    </tbody>

                </table>
                <form action="/fee/collectFee" method="post">
                	<label>Inter Fee Amount:</label><br>
                	<input placeholder="Fee" name="fee"><br>
                	<label>Charge:</label><br>
                	<input placeholder="Charge" name="charge"><br>
                	<hr>
                	<button type="submit" class="btn btn-primary">Pay</button>
                	<a href="/dashboard">back</a>
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