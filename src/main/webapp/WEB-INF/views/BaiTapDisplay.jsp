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
                <a href="/projectAPI/${urlToClasse}/baiTap?id=${id}" style="width: 235px; margin-top: 15px; text-align: center; padding: 0px; height: 50px" class="btn btn-sm btn-white">
                                            <span style="
    margin-top: 5px;
    font-size: 20px;
    color: black;">Chi tiết bài tập</span>
                </a>
                <c:if test="${urlToClasse.equals('Teacher')}">

                    <a href="/projectAPI/${urlToClasse}/chamDiem?id=${id}&loptinchi=${loptinchi}" style="width: 235px; margin-top: 15px; text-align: center; padding: 0px; height: 50px" class="btn btn-sm btn-white">
                        <span style="
    margin-top: 5px;
    font-size: 20px;
    color: black;">Chấm điểm sinh viên</span>
                    </a>
                </c:if>
                <a href="/projectAPI/${urlToClasse}/diem?id=${id}&loptinchi=${loptinchi}" style="width: 235px; margin-top: 15px; text-align: center; padding: 0px; height: 50px" class="btn btn-sm btn-white">
                        <span style="
                        margin-top: 5px;
                        font-size: 20px;
                        color: black;">Điểm sinh viên</span>
                </a>
            </div>
        <div class="row" style="margin-top: 30px">
            <div class="col-8">
                <div class="row">
                    <div class="col">
                        <h2>${tenBaiTap}</h2>
                        <span style="float: right">
                                Đến hạn: ${denHan}
                            </span>
                        <br>
                        <hr>
                    </div>
                </div>
                ${noiDungBaiTap}
                <c:forEach var="file" items="${myFile}">
                    <a href="<c:url value="/upload/${loptinchi}/BaiTap/${file.filename}"></c:url>" download>
                        <span style="color: blue">${file.filename}</span>
                    </a><br/>
                </c:forEach>
            </div>
            <div class="col-4">
                <c:choose>
                    <c:when test="${role.equals('STUDENT')}">
                        <c:choose>
                            <c:when test="${hethan != true}">
                                <c:choose>
                                    <c:when test="${filesdto != null}">
                                        <form action="/projectAPI/Student/huyNopBaiTap?id=${id}" id="formHuy" method="post">
                                            <div class="row">
                                                <div class="col">
                                                <span id="nopFile">
<%--                                    <input type="text" name="username" value="${username}">--%>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                         class="bi bi-paperclip" viewBox="0 0 16 16">
                                        <path d="M4.5 3a2.5 2.5 0 0 1 5 0v9a1.5 1.5 0 0 1-3 0V5a.5.5 0 0 1 1 0v7a.5.5 0 0 0 1 0V3a1.5 1.5 0 1 0-3 0v9a2.5 2.5 0 0 0 5 0V5a.5.5 0 0 1 1 0v7a3.5 3.5 0 1 1-7 0V3z"/>
                                    </svg>
                                    Nộp file <br>
                                    <c:forEach var="file" items="${filesdto}">
                                        <a href="<c:url value="/upload/${loptinchi}/hocsinh/${file.filename}"></c:url>" download>
                                            <span style="color: blue">${file.filename}</span>
                                        </a><br/>
                                    </c:forEach>
                                </span>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col">
                                                    <div style="cursor: pointer; width: 278px; margin-top: 15px; text-align: center; height: 35px; vertical-align: middle"
                                                         class="btn btn-sm btn-white" onclick="submitForm()">
                                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                                             class="bi bi-plus-circle" viewBox="0 0 16 16">
                                                            <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                                                            <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
                                                        </svg>
                                                        <span>Hủy nộp<span>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </c:when>
                                    <c:otherwise>
                                        <form action="/projectAPI/Student/nopBaiTap?id=${id}" id="formNop" method="post"
                                              enctype="multipart/form-data">
                                            <div class="row">
                                                <div class="col">
                                <span id="nopFile">
<%--                                    <input type="text" name="username" value="${username}">--%>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                         class="bi bi-paperclip" viewBox="0 0 16 16">
                                        <path d="M4.5 3a2.5 2.5 0 0 1 5 0v9a1.5 1.5 0 0 1-3 0V5a.5.5 0 0 1 1 0v7a.5.5 0 0 0 1 0V3a1.5 1.5 0 1 0-3 0v9a2.5 2.5 0 0 0 5 0V5a.5.5 0 0 1 1 0v7a3.5 3.5 0 1 1-7 0V3z"/>
                                    </svg>
                                    Nộp file
                                    <br>
                                    <input id="fileNop" type="file" name="files" class="btn btn-sm btn-white">
                                    <div id="container">

                                    </div>
                                    <input id="btnNop" type="button"
                                           style="width: 278px; margin-top: 15px; text-align: center; padding: 0px; height: 35px"
                                           value="Thêm hoặc tạo +" class="btn btn-sm btn-white">
                                </span>
                                                    <span id="lienKet" style="display: none">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                         class="bi bi-link" viewBox="0 0 16 16">
                                        <path d="M6.354 5.5H4a3 3 0 0 0 0 6h3a3 3 0 0 0 2.83-4H9c-.086 0-.17.01-.25.031A2 2 0 0 1 7 10.5H4a2 2 0 1 1 0-4h1.535c.218-.376.495-.714.82-1z"/>
                                        <path d="M9 5.5a3 3 0 0 0-2.83 4h1.098A2 2 0 0 1 9 6.5h3a2 2 0 1 1 0 4h-1.535a4.02 4.02 0 0 1-.82 1H12a3 3 0 1 0 0-6H9z"/>
                                    </svg>
                                    Liên kết
                                    <input class="form-control" name="link" type="text"/>
                                </span>
                                                    <br>
                                                    <span id="lienKetSpan" style="cursor: pointer;" onclick="lienket()">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                         class="bi bi-link" viewBox="0 0 16 16">
                                        <path d="M6.354 5.5H4a3 3 0 0 0 0 6h3a3 3 0 0 0 2.83-4H9c-.086 0-.17.01-.25.031A2 2 0 0 1 7 10.5H4a2 2 0 1 1 0-4h1.535c.218-.376.495-.714.82-1z"/>
                                        <path d="M9 5.5a3 3 0 0 0-2.83 4h1.098A2 2 0 0 1 9 6.5h3a2 2 0 1 1 0 4h-1.535a4.02 4.02 0 0 1-.82 1H12a3 3 0 1 0 0-6H9z"/>
                                    </svg>
                                    Liên kết
                                </span>
                                                    <span id="inputSpand" style="cursor: pointer; display: none;" onclick="inputSpan()">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                         class="bi bi-paperclip" viewBox="0 0 16 16">
                                        <path d="M4.5 3a2.5 2.5 0 0 1 5 0v9a1.5 1.5 0 0 1-3 0V5a.5.5 0 0 1 1 0v7a.5.5 0 0 0 1 0V3a1.5 1.5 0 1 0-3 0v9a2.5 2.5 0 0 0 5 0V5a.5.5 0 0 1 1 0v7a3.5 3.5 0 1 1-7 0V3z"/>
                                    </svg>
                                    Nộp file
                                </span>
                                                </div>
                                            </div>
                                            <br>
                                            <div class="row">
                                                <div class="col">
                                                    <div style="cursor: pointer; width: 278px; margin-top: 15px; text-align: center; height: 35px; vertical-align: middle"
                                                         class="btn btn-sm btn-white" onclick="submitForm()">
                                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                                             class="bi bi-plus-circle" viewBox="0 0 16 16">
                                                            <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                                                            <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
                                                        </svg>
                                                        <span>nộp bài tập<span>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </c:otherwise>
                                </c:choose>
                            </c:when>
                            <c:otherwise>
                                <h4 class="h4" style="color: red">Đã hết hạn.</h4>
                            </c:otherwise>
                        </c:choose>

                    </c:when>
                    <c:otherwise>
                        <a href="/projectAPI/Teacher/suaBaiTap?id=${id}" style="text-decoration: none">
                            <div style="cursor: pointer; width: 278px; margin-top: 15px; text-align: center; height: 35px; vertical-align: middle"
                                 class="btn btn-sm btn-white">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                     class="bi bi-plus-circle" viewBox="0 0 16 16">
                                    <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                                    <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
                                </svg>
                                <span>sửa bài tập<span>
                            </div>
                        </a>
                        <a href="/projectAPI/Teacher/xoaBaiTap?id=${id}" style="text-decoration: none">
                            <div style="cursor: pointer; width: 278px; margin-top: 15px; text-align: center; height: 35px; vertical-align: middle"
                                 class="btn btn-sm btn-white">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                     class="bi bi-plus-circle" viewBox="0 0 16 16">
                                    <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                                    <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
                                </svg>
                                <span>Xóa bài tập<span>
                            </div>
                        </a>
                    </c:otherwise>
                </c:choose>

            </div>
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
<script>
    var nopfile = document.getElementById("nopFile");
    var lienketInptut = document.getElementById("lienKet");
    var lienketSpan = document.getElementById("lienKetSpan");
    var inputSpand = document.getElementById("inputSpand");
    var formNop = document.getElementById("formNop");
    var container = document.getElementById("container");
    var formHuy = document.getElementById("formHuy")

    $(document).ready(function () {
        var x = 1;
        var max_fields = 10;
        $('#btnNop').click(function (e) {
            var input = document.createElement("input");
            e.preventDefault();
            if (x < max_fields) {
                x++;
                input.type = "file";
                input.name = "files";
                input.className = "btn btn-sm btn-white";
                container.append(input);
            }
        });

        // $('#fileNop').change(function () {
        //     input.type = "button";
        //     input.value = "Thêm hoặc tạo +";
        //     input.id = "btnNop";
        //     input.style = "width: 278px; margin-top: 15px; text-align: center; padding: 0px; height: 35px";
        //     input.className = "btn btn-sm btn-white";
        //     container.appendChild(input);
        // });
    });


    function lienket() {
        nopfile.style.display = "none";
        lienketSpan.style.display = "none";
        lienketInptut.style.display = "block";
        inputSpand.style.display = "block";
    }

    function inputSpan() {
        nopfile.style.display = "block";
        lienketSpan.style.display = "block";
        lienketInptut.style.display = "none";
        inputSpand.style.display = "none";
    }

    function submitForm() {
        formNop.submit();
    }

    function submitHuyForm() {
        formHuy.submit();
    }
</script>
</body>
</html>
