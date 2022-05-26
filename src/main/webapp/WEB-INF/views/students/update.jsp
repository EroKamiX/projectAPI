<%--
  Created by IntelliJ IDEA.
  User: tu901
  Date: 28/11/2021
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<jsp:include page="../header.jsp" />
<body class="sb-nav-fixed">
<jsp:include page="../nav_top.jsp" />
	<div id="layoutSidenav">
<jsp:include page="../nav_sides.jsp" />		
		<div id="layoutSidenav_content">
		<main>
			<div class="container-fluid px-4">
				<h1 class="mt-4">Update Student</h1>
				<ol class="breadcrumb mb-4">
					<li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
					<li class="breadcrumb-item active">Update Student</li>
				</ol>
				<a href="/projectAPI_war/admin/students/add" class="btn btn-primary">Update Student</a>
				<div class="card mb-4">
					<div class="card-body">
						DataTables is a third party plugin that is used to generate the
						demo table below. For more information about DataTables, please
						visit the <a target="_blank" href="https://datatables.net/">official
							DataTables documentation</a> .
					</div>
				</div>
				<div class="card mb-4">
					<div class="card-header">
						<i class="fas fa-table me-1"></i> DataTable Student
					</div>
					<div class="card-body">
						<form:form modelAttribute="updateStudents"
						action="/projectAPI_war/admin/students/update_action/${idStudent}"
							method="post">
							<table>
								<tr>
									<td>ID:</td>
									<td>${idStudent}</td>
								</tr>
								<tr>
									<td>Name:</td>
									<td><form:input  type="text" path="name" class="form-control" /></td>
								</tr>
								<tr>
									<td>Age:</td>
									<td><form:input  type="text" path="age" class="form-control" /></td>
								</tr>
								<tr>
									<td>Address:</td>
									<td><form:input  type="text" path="address" class="form-control"  /></td>
								</tr>
								<tr>
									<td>class ID:</td>
									<td>
										<select name='classId' class="form-select"
												aria-label="selectStudent">
											<option selected value="">Select Class</option>
											<c:forEach var="classes" items="${listClasses}"
													   varStatus="status">
												<option value="${classes.getId()}">${classes.getName()}</option>

											</c:forEach>

										</select>
									</td>
								</tr>
								<tr>
									<td>Avatar:</td>
									<td><form:input  type="text" path="picture" class="form-control"  /></td>
								</tr>
								<tr>
									<td>Phone Number:</td>
									<td><form:input  type="text" path="sdt" class="form-control" /></td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit" class="btn btn-primary" /><a href="../students" class="btn btn-secondary">Cancel</a>
									</td>
								</tr>
							</table>
						</form:form>
					</div>
				</div>
			</div>
		</main>
		</div>
<jsp:include page="../footer.jsp" />
</body>
</html>