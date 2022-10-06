<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<style>
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #ff8000;
	color: white;
}
.pp{
	color:black;
	font-style:bold;
}
</style>


<body>
	<h1>List of Users</h1>

	<table id="customers">
		<tr>
			<th>Request Id</th>
			<th>UserId</th>
			<th>User Name</th>

			<th>Pickup Location</th>
			<th>Drop Location</th>
			<th>Action</th>
		</tr>
		<tbody>
			<c:forEach items="${list}" var="r">
				<tr>
					<td>${r.r_Id}</td>
					<td>${r.customer.user_Id}</td>
					<td>${r.customer.user_name}
					<td>${r.pickup_location}</td>
					<td>${r.drop_location}</td>
					<td>
						<button type="button" class="btn btn-success ml-2"
							data-bs-toggle="modal" data-bs-target="#exampleModal">
							Accept</button>
						<div class="modal fade" id="exampleModal" tabindex="-1"
							aria-labelledby="exampleModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">Enter
											price</h5>
										<button type="button" class="btn-close"
											data-bs-dismiss="modal" aria-label="Close"></button>
									</div>

									<form action="/confirmbooking" method=post>
										<div class="modal-body">
											<p >Pickup Point : <b>${r.pickup_location}</b></p>
											<p >Drop Point :   <b>${r.drop_location}</b></p>
											
											<input type="text" name="price" />
											<input type="hidden" name="customer.user_Id" value="${r.customer.user_Id}"/>
											
											<input type="hidden" name="req_id" value="${r.r_Id}"/>
											<input type="hidden" name="pickup_location" value="${r.pickup_location}"/>
											<input type="hidden" name="drop_location" value="${r.drop_location}"/>
											

										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-secondary"
												data-bs-dismiss="modal">Close</button>
											<button type="submit" class="btn btn-success">Save</button>
										</div>
									</form>
								</div>
							</div>
						</div> <a href=""><button class="btn btn-danger ml-2">Reject</button></a>

					</td>


				</tr>

			</c:forEach>
		</tbody>
	</table>


</body>
</html>