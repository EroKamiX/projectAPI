<%--
  Created by IntelliJ IDEA.
  User: tu901
  Date: 28/11/2021
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<jsp:include page="../header.jsp" />
<body class="sb-nav-fixed">
	<jsp:include page="../nav_top.jsp" />
	<div id="layoutSidenav">
		<jsp:include page="../nav_sides.jsp" />
		<div id="layoutSidenav_content">
			<main>
			<div class="container-fluid px-4">
				<h1 class="mt-4">Lớp Quản Lý</h1>
				<ol class="breadcrumb mb-4">
					<li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
					<li class="breadcrumb-item active">Lớp Quản Lý</li>
				</ol>
				<h3 class="card mb-4" style="color: red">${message}</h3>
				<a href="/projectAPI_war/admin/classes/add" class="btn btn-primary">Thêm
					Lớp Quản Lý</a>
				<div class="card mb-4">
					<div class="card-header">
						<i class="fas fa-table me-1"></i> Lớp Quản Lý
					</div>
					<div class="card-body">
						<table id="datatablesSimple">
							<thead>
								<tr>
									<th>Mã Lớp</th>
									<th>Tên Lớp</th>
									<th>Mã Khoa</th>
									<th>Khóa</th>
									<th>Cố Vấn Học Tập</th>
									<th>Số lượng</th>
									<th>Trạng Thái</th>
									<th>Action</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th>Mã Lớp</th>
									<th>Tên Lớp</th>
									<th>Mã Khoa</th>
									<th>Khóa</th>
									<th>Cố Vấn Học Tập</th>
									<th>Số lượng</th>
									<th>Trạng Thái</th>
									<th>Action</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="lopQl" items="${listLopQL}" varStatus="status">
									<tr>
										<td>${lopQl.getId()}</td>
										<td>${lopQl.getTenLop()}</td>
										<td>${lopQl.getKhoaHoc()}</td>
										<td>${lopQl.getKhoa()}</td>
										<td>${lopQl.getTenGV()}</td>
										<td>${lopQl.getSoluong()}</td>
										<td><c:choose>
												<c:when test="${lopQl.getStatus() == 1}">
                                				Đang hoạt động
                                				</c:when>
												<c:otherwise>
                                				Ngưng hoạt động
   						 						</c:otherwise>
											</c:choose>
										</td>
										<td><a href="#"><i class="fa fa-eye"
												aria-hMaGVden="true"></i></a> <a
											href="/projectAPI_war/admin/classes/update?id=${classes.getId()}"><i
												class="fa fa-retweet" aria-hMaGVden="true"></i></a> <a
											href="/projectAPI_war/admin/classes/delete?id=${classes.getId()}"
											onclick="return confirm('Are you sure about that ?')"><i
												class="fa fa-trash" aria-hMaGVden="true"></i></a></td>
									</tr>

								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			</main>
			<jsp:include page="../footer.jsp" />
</body>
</html>