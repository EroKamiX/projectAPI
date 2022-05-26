<%--
  Created by IntelliJ IDEA.
  User: tu901
  Date: 28/11/2021
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="./header.jsp"/>
<body class="sb-nav-fixed">
<jsp:include page="./nav_top.jsp"/>
<div id="layoutSidenav">
    <jsp:include page="./nav_sides.jsp"/>
    <div id="layoutSidenav_content">
        <main>
            <div class="container-fluid px-4">
                <h1 class="mt-4">Add Teachers</h1>
                <ol class="breadcrumb mb-4">
                    <li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
                    <li class="breadcrumb-item active">Add Teachers</li>
                </ol>
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
                        <form action="/projectAPI_war/admin/teachers/add_action"
                              method="post">
                            <table>
                                <tr>
                                    <td>Class ID:</td>
                                    <td><input type="text" name="id" class="form-control"
                                               value="${teacherDTO.getId()}"/></td>
                                </tr>
                                <tr>
                                    <td>Class Name:</td>
                                    <td><input type="text" name="name" class="form-control"
                                               value="${teacherDTO.getName()}"/></td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <input type="submit" name="addClasses" class="btn btn-primary"
                                               value="Add Classes"/><a href="../classes" class="btn btn-secondary">Cancel</a>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </main>
        <jsp:include page="./footer.jsp"/>
</body>
</html>