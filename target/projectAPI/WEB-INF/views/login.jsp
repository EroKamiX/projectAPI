<%--
  Created by IntelliJ IDEA.
  User: phatn
  Date: 10/18/2021
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<body onload='document.loginForm.username.focus();'>
<h1>Spring Security 5 - Login Form</h1>

<c:if test="${not empty errorMessge}">
    <div style="color:red; font-weight: bold; margin: 30px 0px;">${errorMessge}</div>
</c:if>

<c:url value="/login" var="loginUrl"/>
<form action="${loginUrl}" method="post">
    <table>
        <tr>
            <td>UserName:</td>
            <td>${name}</td>
        </tr>
        <tr>
            <td>Password:</td>
            <td>${address}</td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="submit"/></td>
        </tr>
    </table>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>
<div class="open_grepper_editor" title="Edit & Save To Grepper"></div>
