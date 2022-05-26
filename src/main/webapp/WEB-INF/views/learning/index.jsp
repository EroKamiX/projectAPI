<%--
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
                <jsp:include page="./content_page.jsp"/>
                <h3 class="card mb-4" style="color: red">${message}</h3>
                <div class="card-body">
                    <table id="datatablesSimple">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>ID CLASS</th>
                            <th>ID MON</th>
                            <th>ID TEACHER</th>
                            <th>Actions</th>

                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>ID</th>
                            <th>ID CLASS</th>
                            <th>ID MON</th>
                            <th>ID TEACHER</th>
                            <th>Actions</th>
                        </tr>
                        </tfoot>
                        <tbody>
                        <c:forEach var="learning" items="${listLearning}"
                                   varStatus="status">
                            <tr>
                                <td>${learning.id}</td>
                                <td>${learning.classId}</td>
                                <td>${learning.idMon}</td>
                                <td>${learning.idTeacher}</td>
                                <td>
                                    <a href="#"><i class="fa fa-eye" aria-hMaGVden="true"></i></a>
                                    <a href="/projectAPI_war/admin/learning/update?id=${learning.getId()}"><i
                                            class="fa fa-retweet" aria-hMaGVden="true"></i></a>
                                    <a href="/projectAPI_war/admin/learning/delete?id=${learning.getId()}"
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
    <jsp:include page="../footer.jsp"/>
</body>
</html>