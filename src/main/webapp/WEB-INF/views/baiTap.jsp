<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: phatn
  Date: 1/15/2022
  Time: 12:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Required Meta Tags Always Come First -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Title -->
    <title>Dashboard | Front - Admin &amp; Dashboard Template</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="<c:url value="/resource/img/favicon.ico"></c:url>">

    <!-- Font -->
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&display=swap" rel="stylesheet">

    <!-- CSS Implementing Plugins -->
    <link rel="stylesheet" href="<c:url value="/resource/css/vendor.min.css"></c:url>">
    <link rel="stylesheet" href="<c:url value="/resource/css/style.css"></c:url>">
    <link rel="stylesheet" href="<c:url value="/resource/css/myStyle.css"></c:url>">
    <link rel="stylesheet" href="<c:url value="/resource/css/phong.css"></c:url>">
    <!-- CSS Front Template -->
    <link rel="stylesheet" href="<c:url value="/resource/css/theme.min.css?v=1.0"></c:url>">
</head>
<body class="   footer-offset">
<jsp:include page="headerFrontend.jsp"></jsp:include>
<script src="<c:url value="/resource/js/hs-navbar-vertical-aside-mini-cache.js"></c:url>"></script>

<script src=" <c:url value="/resource/js/demo.js"></c:url>"></script>

<!-- END ONLY DEV -->

<!-- ========== MAIN CONTENT ========== -->
<!-- Navbar Vertical -->


<!-- End Navbar Vertical -->

<main id="content" role="main" class="main pointer-event">
    <div class="content container-fluid">

        <div class="page-header">
            <div class="row align-items-center">
                <div class="col-sm mb-2 mb-sm-0">
                    <a style="width: 235px; margin-top: 15px; text-align: center; padding: 0px; height: 50px" href="/projectAPI/${urlToClasse}/Class?loptinchi=${classId}&monhoc=${monhoc}" class="btn btn-sm btn-white">
                                            <span style="
    margin-top: 5px;
    font-size: 20px;
    color: black;">Bài tập</span>
                    </a>
                    <a href="/projectAPI/${urlToClasse}/hienThiSinhVien?loptinchi=${classId}&monhoc=${monhoc}" style="width: 235px; margin-top: 15px; text-align: center; padding: 0px; height: 50px" class="btn btn-sm btn-white">
                        <span style="
    margin-top: 5px;
    font-size: 20px;
    color: black;">Danh sách sinh viên</span>
                    </a>
                </div>
            </div>
        </div>

        <div class="row d-flex">
            <h3>Danh sách bài tập</h3>
            <c:choose>
                <c:when test="${urlToClasse == 'Student'}">
                    <c:forEach var="baiTapList" items="${baiTapLists}">
                        <a style="width: 100%; margin-top: 15px; padding: 0px; height: 100px" class="btn btn-sm btn-white" href="/projectAPI/${urlToClasse}/baiTap?id=${baiTapList.id}&loptinchi=${baiTapList.loptinchi}">
                            <div>
                                <svg xmlns="http://www.w3.org/2000/svg" height="40px" viewBox="0 0 24 24" width="50px" fill="#FFFFFF"><path d="M0 0h24v24H0z" fill="none"/><path d="M19 3h-4.18C14.4 1.84 13.3 1 12 1c-1.3 0-2.4.84-2.82 2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-7 0c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zm2 14H7v-2h7v2zm3-4H7v-2h10v2zm0-4H7V7h10v2z"/></svg>
                                <span style="    float: left;
    margin-left: 25px;
    margin-top: 32px;
    font-size: 25px;
    color: black;">${baiTapList.tenBaiTap}</span>
                                <jsp:useBean id="now" class="java.util.Date" />
                                <fmt:setLocale value="en_US" />
                                <fmt:parseDate value="${baiTapList.deadline}" var="parsedExpDate" pattern="yyyy-MM-dd" />
                                <c:choose>
                                    <c:when test="${now.time lt parsedExpDate.time}">
                                        <span style="float: right; margin-top: 62px; font-size: 15px; margin-right: 10px;">Đến hạn, ${baiTapList.deadline}</span>
                                    </c:when>
                                    <c:otherwise>
                                        <span style="float: right; margin-top: 62px; font-size: 15px; margin-right: 10px;">Đã hết hạn</span>
                                    </c:otherwise>
                                </c:choose>
                            </div>
                        </a>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <c:forEach var="baiTapList" items="${baiTapLists}">
                        <a style="width: 100%; margin-top: 15px; padding: 0px; height: 100px" class="btn btn-sm btn-white" href="/projectAPI/${urlToClasse}/chamDiem?id=${baiTapList.id}&loptinchi=${baiTapList.loptinchi}">
                            <div>
                                <svg xmlns="http://www.w3.org/2000/svg" height="40px" viewBox="0 0 24 24" width="50px" fill="#FFFFFF"><path d="M0 0h24v24H0z" fill="none"/><path d="M19 3h-4.18C14.4 1.84 13.3 1 12 1c-1.3 0-2.4.84-2.82 2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-7 0c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zm2 14H7v-2h7v2zm3-4H7v-2h10v2zm0-4H7V7h10v2z"/></svg>
                                <span style="    float: left;
    margin-left: 25px;
    margin-top: 32px;
    font-size: 25px;
    color: black;">${baiTapList.tenBaiTap}</span>
                                <span style="    float: right;
    margin-top: 62px;ạn
    font-size: 15px;
    margin-right: 10px;">Đến hạn, ${baiTapList.deadline}</span>
                            </div>
                        </a>
                    </c:forEach>
                </c:otherwise>
            </c:choose>

        </div>
    </div>

    <!-- Footer -->

    <jsp:include page="footer.jsp"></jsp:include>

    <!-- End Footer -->
</main>

<!-- JS Implementing Plugins -->
<script src=" <c:url value="/resource/js/vendor.min.js"></c:url>"></script>
<script src=" <c:url value="/resource/js/theme.min.js"></c:url>"></script>
<script src="<c:url value="/resource/js/index.js"></c:url>"></script>

</body>
</html>
