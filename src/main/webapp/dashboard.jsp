<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<!-- Bootstrap Font Icon CSS -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">


		<style>
			.ul1 {
				background-color: #c4e4e4;
				padding: 15px;
				height: 600px;
			}

			.ul1 li {
				list-style-type: none;
				background-color: #505050;
				margin: 5px;
				padding: 15px;
				text-align: left;
			}

			.ul1 li:hover {
				background-color: blue;
				color: white;
				font-weight: bold;
			}

			.ul1 li a {
				color: white;
				font-size: 15pt;
				padding: 5px;
				text-decoration: none;
				display: block;
			}

			.bd {
				background-color: #c4e4e4;
				height: 1200px;
			}

			.lm {
				margin-left: 20px;
			}
		</style>
	</head>

	<body>

		<div class="row">
			<div class="col-3">
				<ul class="ul1">

					<li><a href="/allStudentList"><i class="bi bi-people"></i>
							Student</a></li>
					<li><a href="/allTeacherList"><i class="bi bi-bookmark-star-fill"></i> Teacher</a></li>
					<li><a href="/addClassForm"><i class="bi bi-bookmark-star-fill"></i> Class</a></li>
					<li><a href="/addSectionForm"><i class="bi bi-bar-chart-line"></i> Section</a></li>
					<li><a href="/fee/mainPage"><i class="bi bi-bar-chart-line"></i>Add
							Result</a></li>
					<li><a href="/fee/showResult"><i class="bi bi-bar-chart-line"></i>Show
							Result</a></li>
					<li><a href="/fee/feeCalculation"><i class="bi bi-people"></i>
							Student Fee</a></li>
				</ul>
			</div>
			<div class="col-9">
				<img alt="" src="https://thumbs.dreamstime.com/b/back-to-school-background-copy-space-123898116.jpg"
					height="600px" width="100%">
			</div>
		</div>

		<!-- 	<div class="col-md-12" style="margin-left: 11%; position: absolute;"> -->
		<!-- 		<img alt="" -->
		<!-- 			src="https://thumbs.dreamstime.com/b/back-to-school-background-copy-space-123898116.jpg" -->
		<!-- 			height="600px"> -->
		<!-- 	</div> -->
		<!-- 	<div class="col" -->
		<!-- 		style="position: relative; margin-left: 20%; margin-top: 5%; color: white;"> -->
		<!-- 		<h1> -->
		<!-- 			<b>School Managment System</b> -->
		<!-- 		</h1> -->
		<!-- 	</div> -->


		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
			crossorigin="anonymous"></script>
	</body>

	</html>