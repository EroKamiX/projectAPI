<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phatn
  Date: 11/16/2021
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>

    <!-- CSS Front Template -->
    <link rel="stylesheet" href="<c:url value="/resource/css/theme.min.css?v=1.0"></c:url>">

    <script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
    <style>
        .btnFileNop {
            border: black solid 1px;
            background: white;
            color: blue;
        }
    </style>
</head>
<body class="footer-offset">
<script src="<c:url value="/resource/js/hs-navbar-vertical-aside-mini-cache.js"></c:url>"></script>
<jsp:include page="headerFrontend.jsp"></jsp:include>
<div class="container">
    <nav class="js-mega-menu flex-grow-1 hs-menu-initialized hs-menu-horizontal">
        <!-- Navbar -->
        <div class="navbar-nav-wrap-navbar collapse navbar-collapse col-12" id="navbarNavMenu">
            <div class="navbar-body col-lg-12">
                <ul class="navbar-nav flex-grow-1 col-lg-12">

                    <li class="nav-item">
                        <a class="nav-link active" href="#">Lớp</a>
                    </li>

                </ul>
            </div>
        </div>
        <!-- End Navbar -->
    </nav>
</div>
</header>
<script src="<c:url value="/resource/js/demo.js"></c:url>"></script>

<!-- END ONLY DEV -->

<!-- ========== MAIN CONTENT ========== -->
<!-- Navbar Vertical -->


<!-- End Navbar Vertical -->


<main id="content" role="main" class="main pointer-event">
        <div class="content container-fluid">
            <div class="row">
                <div class="col-9">
                    <a href="/projectAPI/${urlToClasse}/baiTap?id=${baiTapid}" style="width: 235px; margin-top: 15px; text-align: center; padding: 0px; height: 50px" class="btn btn-sm btn-white">
                                            <span style="
    margin-top: 5px;
    font-size: 20px;
    color: black;">Chi tiết bài tập</span>
                    </a>
                    <a href="/projectAPI/${urlToClasse}/chamDiem?id=${baiTapid}&loptinchi=${loptinchi}" style="width: 235px; margin-top: 15px; text-align: center; padding: 0px; height: 50px" class="btn btn-sm btn-white">
                        <span style="
    margin-top: 5px;
    font-size: 20px;
    color: black;">Chấm điểm sinh viên</span>
                    </a>
                    <a href="/projectAPI/${urlToClasse}/diem?id=${baiTapid}" style="width: 235px; margin-top: 15px; text-align: center; padding: 0px; height: 50px" class="btn btn-sm btn-white">
                        <span style="
    margin-top: 5px;
    font-size: 20px;
    color: black;">Điểm sinh viên</span>
                    </a>
                </div>
                <div class="row" style="margin-top: 15px">
                    <h3>Điểm của các học viên</h3>
                </div>
                    <div class="row" style="margin-top: 15px">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>Mã sinh viên</th>
                            <th>Tên sinh viên</th>
                            <th>Khoa học</th>
                            <th>Địa chỉ</th>
                            <th>Ngày sinh</th>
                            <th>Điểm</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="student" items="${studentdtos}">
                            <tr>
                                <td>${student.masv}</td>
                                <td>${student.tenSV}</td>
                                <td>${student.khoa}</td>
                                <td>${student.quequan}</td>
                                <td>${student.birthday}</td>
                                <td>
                                    <span style="color: blue;">
                                        <c:forEach var="diemt" items="${diems}">
                                            <c:if test="${diemt.studentId.equals(student.masv)}">
                                                ${diemt.diem}/${diemt.thangDiem}
                                            </c:if>
                                        </c:forEach>
                                    </span>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    <!-- Footer -->

    <jsp:include page="footer.jsp"></jsp:include>

    <!-- End Footer -->
</main>

<!-- JS Implementing Plugins -->
<script src="<c:url value="/resource/js/vendor.min.js"></c:url>"></script>
<script src="<c:url value="/resource/js/theme.min.js"></c:url>"></script>
<script src="<c:url value="/resource/js/index.js"></c:url>"></script>
</body>
</html>
