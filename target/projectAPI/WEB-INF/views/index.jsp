<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html lang="en">

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
                    <h1 class="page-header-title">Môn học</h1>
                </div>
            </div>
        </div>

        <div class="row d-flex">
            <!-- Card -->
            <c:choose>
                <c:when test="${urlToClasse.equals('Student')}">
                    <c:forEach var="sList" items="${subjectList}">
                        <a href="/projectAPI_war/${urlToClasse}/Class?id=${classStudent}&monhoc=${sList.id}">
                            <div class="card">
                                <img class="card-img-top" src="<c:url value="/resource/img/demo.jpg"></c:url>" alt="Card image cap">
                                <div class="card-body">
                                    <h3 class="card-title">${sList.name}</h3><br>
                                    <p class="card-text">${sList.id}</p>
                                    <p class="card-text">
                                            <%--                            <small class="text-muted">14/10/2021</small>--%>
                                    </p>
                                </div>
                            </div>
                        </a>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <c:forEach var="sList" items="${subjectList}">
                        <a href="/projectAPI_war/${urlToClasse}/index?monhoc=${sList.id}">
                            <div class="card">
                                <img class="card-img-top" src="<c:url value="/resource/img/demo.jpg"></c:url>" alt="Card image cap">
                                <div class="card-body">
                                    <h3 class="card-title">${sList.name}</h3><br>
                                    <p class="card-text">${sList.id}</p>
                                    <p class="card-text">
                                            <%--                            <small class="text-muted">14/10/2021</small>--%>
                                    </p>
                                </div>
                            </div>
                        </a>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
            <!-- End Card -->
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