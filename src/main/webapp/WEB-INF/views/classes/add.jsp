2<%--
  Created by IntelliJ IDEA.
  User: tu901
  Date: 28/11/2021
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../header.jsp"/>
<body class="sb-nav-fixed">
<jsp:include page="../nav_top.jsp"/>
<div id="layoutSidenav">
    <jsp:include page="../nav_sides.jsp"/>
    <div id="layoutSidenav_content">
        <main>
            <div class="container-fluid px-4">
                <h1 class="mt-4">Add Classes</h1>
                <ol class="breadcrumb mb-4">
                    <li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
                    <li class="breadcrumb-item active">Add Classes</li>
                </ol>
                <a href="/projectAPI_war/admin/students/add" class="btn btn-primary">Add Classes</a>
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
                        <i class="fas fa-table me-1"></i> DataTable Classes
                    </div>
                    <div class="card-body">
                        <form action="/projectAPI_war/admin/classes/add_action"
                              method="post">
                            <table>
                                <tr>
                                    <td>ID:</td>
                                    <td><input type="text" name="id" class="form-control"
                                               value="${classesDTO.getId()}"/></td>
                                </tr>
                                <tr>
                                    <td>Name:</td>
                                    <td><input type="text" name="name" class="form-control"
                                               value="${classesDTO.getName()}"/></td>
                                </tr>
                                <tr>
                                <tr>
                                    <td colspan="2"><input type="submit" name="addStudent" class="btn btn-primary"
                                                           value="Add Classes"/><a href="../classes"
                                                                                   class="btn btn-secondary">Cancel</a>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </main>
    </div>
    <jsp:include page="../footer.jsp"/>
</body>
</html>