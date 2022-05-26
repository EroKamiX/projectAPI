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
                            <th>USERNAME</th>
                            <th>FULLNAME</th>
                            <th>AUTHORITY</th>
                            <th>STATUS</th>
                            <th>Actions</th>

                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>USERNAME</th>
                            <th>FULLNAME</th>
                            <th>AUTHORITY</th>
                            <th>STATUS</th>
                            <th>Actions</th>
                        </tr>
                        </tfoot>
                        <tbody>
                        <c:forEach var="user" items="${listUser}"
                                   varStatus="status">
                            <tr>
                                <td>${user.getUsername()}</td>
                                <td>${user.getFulName()}</td>
                                <td>${user.getAuthority()}</td>
                                <!-- <td>${user.isEnabled()}</td> -->
                                <td>
                                <c:choose>
                                	<c:when test="${user.isEnabled() == true}">
                                	Đang hoạt động
                                	</c:when>
                                	<c:otherwise>
                                	Ngưng hoạt động
   						 			</c:otherwise>
                                </c:choose>
                                </td>
                                <td>
                                    <a href="#"><i class="fa fa-eye" aria-hMaGVden="true"></i></a>
                                    <a href="/projectAPI/admin/user/update?id=${learning.getId()}"><i
                                            class="fa fa-retweet" aria-hMaGVden="true"></i></a>
                                    <a href="/projectAPI/admin/user/delete?id=${learning.getId()}"
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