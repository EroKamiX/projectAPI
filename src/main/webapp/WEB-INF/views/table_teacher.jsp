<%--
  Created by IntelliJ IDEA.
  User: tu901
  Date: 28/11/2021
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="./header.jsp"/>
<body class="sb-nav-fixed">
<jsp:include page="./nav_top.jsp"/>
<div id="layoutSidenav">
    <jsp:include page="./nav_sides.jsp"/>
    <div id="layoutSidenav_content">
        <main>
            <div class="container-fluid px-4">
                <h1 class="mt-4">Teachers</h1>
                <ol class="breadcrumb mb-4">
                    <li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
                    <li class="breadcrumb-item active">Teachers</li>
                </ol>
                <h3 class="card mb-4" style="color: red">${message}</h3>
                <div class="card mb-4">
                    <div class="card-body">
                        DataTables is a third party plugin that is used to generate the
                        demo table below. For more information about DataTables, please
                        visit the <a target="_blank" href="https://datatables.net/">official
                        DataTables documentation</a> .
                    </div>
                </div>
                <a href="/projectAPI_war/admin/teachers/add" class="btn btn-primary">Add Teacher</a>
                <div class="card mb-4">
                    <div class="card-header">
                        <i class="fas fa-table me-1"></i> DataTable Teachers
                    </div>
                    <div class="card-body">
                        <table id="datatablesSimple">
                            <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Age</th>
                                <th>Address</th>
                                <th>Picture</th>
                                <th>Phone Number</th>
                                <th>Action</th>
                            </tr>
                            </thead>
                            <tfoot>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Age</th>
                                <th>Address</th>
                                <th>Picture</th>
                                <th>Phone Number</th>
                                <th>Action</th>
                            </tr>
                            </tfoot>
                            <tbody>
                            <c:forEach var="teacher" items="${listTeacher}"
                                       varStatus="status">
                                <tr>
                                    <td>${teacher.getId()}</td>
                                    <td>${teacher.getName()}</td>
                                    <td>${teacher.getAge()}</td>
                                    <td>${teacher.getAddress()}</td>
                                    <td>${teacher.getPicture()}</td>
                                    <td>${teacher.getSdt()}</td>
                                    <td>
                                        <a href="#"><i class="fa fa-eye" aria-hMaGVden="true"></i></a>
                                        <a href="/projectAPI_war/admin/teachers/update?id=${teacher.getId()}"><i
                                                class="fa fa-retweet" aria-hMaGVden="true"></i></a>
                                        <a href="/projectAPI_war/admin/teachers/delete?id=${teacher.getId()}"
                                           onclick="return confirm('Are you sure about that ?')"><i class="fa fa-trash"
                                                                                                    aria-hMaGVden="true"></i></a>

                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </main>
        <jsp:include page="./footer.jsp"/>
</body>
</html>