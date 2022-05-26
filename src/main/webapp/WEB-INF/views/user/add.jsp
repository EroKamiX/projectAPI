2
<%--
  Created by IntelliJ IDEA.
  User: tu901
  Date: 28/11/2021
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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

                <form:form modelAttribute="userDTO"
                           action="/projectAPI_war/admin/users/add_action" method="post">
                    <table>
                        <tr>
                            <td>USERNAME:</td>
                            <td>
                                <form:input path="userName" />
                            </td>
                        </tr>
                        <tr>
                            <td>PASSWORD:</td>
                            <td>
                                <form:input path="password" />
                            </td>
                        </tr>
                        <tr>
                            <td>TEACHER ID:</td>
                            <td>
                                <select name='teacherId' class="form-select"
                                        aria-label="selectTeacher">
                                    <option selected value="">Select Teacher</option>
                                    <c:forEach var="teacher" items="${listTeacher}"
                                               varStatus="status">
                                        <option value="${teacher.id}">${teacher.name}</option>

                                    </c:forEach>

                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>STUDENT ID:</td>
                            <td>
                                <select name='studentId' class="form-select"
                                        aria-label="selectStudent">
                                    <option selected value="">Select Student</option>
                                    <c:forEach var="student" items="${listStudent}"
                                               varStatus="status">
                                        <option value="${student.id}">${student.name}</option>

                                    </c:forEach>

                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>ID AUTHORITY:</td>
                            <td>
                                <select name='authority' class="form-select"
                                        aria-label="selectTeacher">
                                    <option selected value="">Select Authority</option>
                                    <c:forEach var="authority" items="${listRoles}"
                                               varStatus="status">
                                        <option value="${authority}">${authority}</option>

                                    </c:forEach>

                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>ACTIVE:</td>
                            <td>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="enabled" id="flexRadioDefault1">
                                    <label class="form-check-label" for="flexRadioDefault1">
                                        Disable
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="enabled" id="flexRadioDefault2" checked>
                                    <label class="form-check-label" for="flexRadioDefault2">
                                        Enabled
                                    </label>
                            </td>
                        </tr>


                        <tr>
                            <td colspan="2"><input type="submit" name="addLearning"
                                                   class="btn btn-primary" value="Add Learning"/><a
                                    href="../learning" class="btn btn-secondary">Cancel</a></td>
                        </tr>
                    </table>
                </form:form>
            </div>
    </div>
</div>
</main>
</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>