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

                <form:form modelAttribute="learning"
                           action="/projectAPI_war/admin/learning/add_action" method="post">
                    <table>
                        <tr>
                            <td>ID CLASS:</td>
                            <td>
                                <select name='classId' class="form-select"
                                        aria-label="selectStudent">
                                    <option selected value="">Select class</option>
                                    <c:forEach var="student" items="${listClasses}"
                                               varStatus="status">
                                        <option value="${student.id}">${student.name}</option>

                                    </c:forEach>

                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Subject ID:</td>
                            <td>
                                <select name='idMon' class="form-select"
                                        aria-label="selectClasses">
                                    <option selected value="">Select Subject</option>
                                    <c:forEach var="subject" items="${listSubject}"
                                               varStatus="status">
                                        <option value="${subject.id}">${subject.name}</option>

                                    </c:forEach>

                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>ID TEACHER:</td>
                            <td>
                                <select name='idTeacher' class="form-select"
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