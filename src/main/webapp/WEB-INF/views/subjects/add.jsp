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
                <form:form modelAttribute="subjects" action="/projectAPI_war/admin/subjects/add_action" method="post">
                    <table>
                        <tr>
                            <td>Subject ID:</td>
                            <td><form:input type="text" path="id" class="form-control"
                            /></td>
                        </tr>
                        <tr>
                            <td>Subject Name:</td>
                            <td><form:input type="text" path="name" class="form-control"
                            /></td>
                        </tr>

<%--                        <tr>--%>
<%--                            <td>Classes ID:</td>--%>


<%--                            <td>--%>

<%--                                <select name='classId' class="form-select" aria-label="selectClasses">--%>
<%--                                    <option selected value="">Select Classes</option>--%>
<%--                                    <c:forEach var="classes" items="${listClasses}"--%>
<%--                                               varStatus="status">--%>
<%--                                        <option value="${classes.getId()}">${classes.getName()}</option>--%>

<%--                                    </c:forEach>--%>

<%--                                </select>--%>

<%--                        </tr>--%>

                        <tr>
                            <td colspan="2"><input type="submit" name="addSubject"
                                                   class="btn btn-primary" value="Add Subject"/><a
                                    href="../subjects" class="btn btn-secondary">Cancel</a></td>
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