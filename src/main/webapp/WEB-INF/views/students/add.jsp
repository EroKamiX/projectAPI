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
				<h1 class="mt-4">Thêm Sinh Viên</h1>
				<ol class="breadcrumb mb-4">
					<li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
					<li class="breadcrumb-item active">Thêm Sinh Viên</li>
				</ol>
				<a href="/projectAPI_war/admin/students/add" class="btn btn-primary">Thêm Sinh Viên</a>
				
				<div class="card mb-4">
					<div class="card-header">
						<i class="fas fa-table me-1"></i> DataTable Student
					</div>
					<div class="card-body">
						<form:form modelAttribute="sinhvienDTO"
							action="/projectAPI/admin/students/add_action" method="post">
							<table>
								<tr>
									<td>Tên Sinh Viên:</td>
									<td><form:input type="text" path="tenSV"
											class="form-control" /></td>
								</tr>
								<tr>
									<td>Khóa:</td>
									<td><form:input type="number" path="khoaHoc"
											class="form-control" value="22"/></td>
								</tr>
								<tr>
									<td>Khoa:</td>
									<td>
                                <select name='khoa' class="form-select"
                                        aria-label="selectTeacher">
                                    <option selected value="">Chọn Khoa</option>
                                    <c:forEach var="khoa" items="${khoaDTO}"
                                               varStatus="status">
                                        <option value="${khoa.id}">${khoa.tenKhoa}</option>

                                    </c:forEach>

                                </select>
                            </td>
								</tr>
								
								<tr>
									<td>Quê Quán:</td>
									<td><form:input type="text"  path="quequan"
											class="form-control" /></td>
								</tr>
								<tr>
									<td>Ngày Sinh:</td>
									<td><form:input type="date"  path="birthday"
											class="form-control" /></td>
								</tr>
								<tr>
									<td>Avatar:</td>
									<td><form:input  class="form-control" path="avatar"/></td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit"
										class="btn btn-primary" value="Add Student" /><a
										href="../teachers" class="btn btn-secondary">Cancel</a></td>
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