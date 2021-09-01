<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />

<!-- *) For additional spaces between rows : -->
<style>
.row {
	padding-bottom: 10px;
}
</style>
</head>

<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white text-center">
				<h3>STUDENT REGISTRATION FORM</h3>
			</div>
			<!-- printing message from controller -->
			<h1 class="text-success text-center">${msg}</h1>
			<!-- card header end -->
			<div class="card-body">
				<form:form action="registerStudent" method="POST"
					modelAttribute="student">
					<!-- row#1 -->
					<div class="row">
						<div class="col-2">
							<label for="studentName">STUDENT NAME</label>
							<!-- for attribute is used to link form input focus -->
						</div>
						<div class="col-5">
							<form:input path="studentName" type="text" name="studentName"
								id="studentName" class="form-control" />
						</div>
						<div class="col-5">
							<!-- This is to show error section -->
							<form:errors path="studentName" class="error" />
						</div>
					</div>

					<!-- row#2 -->
					<div class="row">
						<div class="col-2">
							<label for="studentEmail">STUDENT EMAIL</label>
						</div>
						<div class="col-5">
							<form:input path="studentEmail" type="email" name="studentEmail"
								id="studentEmail" class="form-control" />
						</div>
						<div class="col-5">
							<form:errors path="studentEmail" class="error" />
						</div>
					</div>

					<!-- row#3 -->
					<div class="row">
						<div class="col-2">
							<label for="studentContact">STUDENT CONTACT</label>
						</div>
						<div class="col-5">
							<form:input path="studentContact" type="number"
								name="studentContact" id="studentContact" class="form-control" />
						</div>
						<div class="col-5">
							<span id="studentContactError" class="text-danger">*Please
								Enter Your Contact Number</span>
						</div>
					</div>

					<!-- row#4 -->
					<div class="row">
						<div class="col-2">
							<label for="studentCourse">COURSE</label>
						</div>
						<div class="col-5">
							<form:select path="studentCourse" name="studentCourse"
								id="studentCourse" class="form-control">

								<form:options items="${courses}"></form:options>

							</form:select>
						</div>
						<div class="col-5">
							<span id="studentDeptError" class="text-danger">*Please
								choose Your Course</span>
						</div>
					</div>

					<!-- row#5 -->
					<div class="row">
						<div class="col-2">
							<label>STUDENT GENDER</label>
						</div>
						<div class="col-5">
							<form:radiobutton path="studentGender" name="studentGender"
								id="Male" value="Male" />
							Male
							<form:radiobutton path="studentGender" name="studentGender"
								id="Female" value="Female" />
							Female
						</div>
						<div class="col-5">
							<span id="studentGenderError" class="text-danger">*Please
								choose Gender</span>
						</div>
					</div>

					<!-- 	row#6 -->
<!-- 					<div class="row"> -->
<!-- 						<div class="col-2"> -->
<!-- 							<label>COURSE TIMINGS</label> -->
<!-- 						</div> -->
<!-- 						<div class="col-5"> -->
<%-- 							<form:checkboxes items="${timings}" path="courseTimings" /> --%>
<!-- 						</div> -->
<!-- 						<div class="col-5"> -->
<!-- 							<span id="studentAddrError" class="text-danger">*Please -->
<!-- 								Select Course Timings</span> -->
<!-- 						</div> -->
<!-- 					</div> -->

					<div class="text-center">
						<button type="submit" class="btn btn-success">Register</button>
						<button type="reset" class="btn btn-danger">Clear</button>
					</div>
				</form:form>
			</div>
			<!-- card body end -->
			<div class="card-footer bg-info text-white">
				<span><strong>Employee '101' created </strong></span>
			</div>
			<!-- footer end -->
		</div>
		<!-- card end -->
	</div>
	<!-- container end -->
</body>

</html>

