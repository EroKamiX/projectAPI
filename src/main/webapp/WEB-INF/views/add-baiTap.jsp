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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.1/css/all.css"
          integrity="sha384-O8whS3fhG2OnA5Kas0Y9l3cfpmYjapjI0E4theH4iuMD+pLhbf6JI0jIMfYcK3yZ" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <style>
        .container {
            max-width: 100%;
        }

        input[type="file"] {
            display: none;
        }

        .custom-file-upload {
            display: inline-block;
            padding: 6px 12px;
            cursor: pointer;
        }
    </style>
    <!-- Bootstrap CSS -->

    <!-- CSS Front Template -->
    <link rel="stylesheet" href="<c:url value="/resource/css/theme.min.css?v=1.0"></c:url>">

    <script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>

    <script>
        tinymce.init({
            selector: '#mytextarea'
        });
    </script>
</head>

<body class="   footer-offset">

<script src="<c:url value="/resource/js/hs-navbar-vertical-aside-mini-cache.js"></c:url>"></script>
<jsp:include page="headerFrontend.jsp"></jsp:include>
<%--<div class="container">--%>
<%--    <nav class="js-mega-menu flex-grow-1 hs-menu-initialized hs-menu-horizontal">--%>
<%--        <!-- Navbar -->--%>
<%--        <div class="navbar-nav-wrap-navbar collapse navbar-collapse col-12" id="navbarNavMenu">--%>
<%--            <div class="navbar-body col-lg-12">--%>
<%--                <ul class="navbar-nav flex-grow-1 col-lg-12">--%>

<%--                    <li class="nav-item">--%>
<%--                        <a class="nav-link active" href="#">Lớp</a>--%>
<%--                    </li>--%>

<%--                </ul>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <!-- End Navbar -->--%>
<%--    </nav>--%>
<%--</div>--%>
<%--</header>--%>
<script src="<c:url value="/resource/js/demo.js"></c:url>"></script>

<!-- END ONLY DEV -->

<!-- ========== MAIN CONTENT ========== -->
<!-- Navbar Vertical -->


<!-- End Navbar Vertical -->


<%--<main id="content" role="main" class="main pointer-event">--%>
<%--    <c:if test="${success != null}">--%>
<%--        <h3 style="color: red">Thêm bài tập thành công</h3>--%>
<%--    </c:if>--%>
<%--    <form action="/projectAPI_war/uploadBaiTap" method="post" enctype="multipart/form-data">--%>
<%--        <div class="content container-fluid">--%>
<%--            <div class="card col-12" style="padding: 20px 15px!important;">--%>
<%--                <div class="row">--%>
<%--                    <div class="col-md-6">--%>
<%--                        &lt;%&ndash;                        <div class="label">&ndash;%&gt;--%>
<%--                        &lt;%&ndash;                            Lớp: ${className}&ndash;%&gt;--%>
<%--                        &lt;%&ndash;                        </div>&ndash;%&gt;--%>
<%--                        &lt;%&ndash;                        <input type="text" value="${class}" name="classId" style="display: none;"/>&ndash;%&gt;--%>
<%--                        &lt;%&ndash;                            <input type="text" value="${username}" name="username" style="display: none;"/>&ndash;%&gt;--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="row">--%>
<%--                    <div class="col-md-6">--%>
<%--                        <div class="label">--%>
<%--                            Lớp:--%>
<%--                        </div>--%>
<%--                        <select name="classID" class="form-select">--%>
<%--                            <c:forEach var="classDT" items="${classesDT}">--%>
<%--                                <option value="${classDT.id}">${classDT.name}</option>--%>
<%--                            </c:forEach>--%>

<%--                        </select>--%>
<%--                    </div>--%>
<%--                    <div class="col-md-6">--%>
<%--                        <div class="label">--%>
<%--                            Tên môn học:--%>
<%--                        </div>--%>
<%--                        <select name="monhocID" class="form-select">--%>
<%--                            <c:forEach var="subjectDT" items="${subjectsDT}">--%>
<%--                                <option value="${subjectDT.id}">${subjectDT.name}</option>--%>
<%--                            </c:forEach>--%>
<%--                        </select>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="row">--%>
<%--                    <div class="col-md-6">--%>
<%--                        <div class="label">--%>
<%--                            Hạn nộp:--%>
<%--                        </div>--%>
<%--                        <input type="date" class="form-select" id="hanNop" name="deadline"/>--%>
<%--                    </div>--%>
<%--                    <div class="col-md-6">--%>
<%--                        <div class="label">--%>
<%--                            File:--%>
<%--                        </div>--%>
<%--                        <input type="file" name="files" class="btn btn-sm btn-white">--%>
<%--                        <div id="container">--%>

<%--                        </div>--%>
<%--                        <input id="btnNop" type="button"--%>
<%--                               style="width: 278px; margin-top: 15px; text-align: center; padding: 0px; height: 35px"--%>
<%--                               value="Thêm hoặc tạo +" class="btn btn-sm btn-white">--%>
<%--                    </div>--%>
<%--                </div>--%>

<%--                <div class="label">--%>
<%--                    Tên bài tập:--%>
<%--                </div>--%>
<%--                <input type="text" name="tenBaiTap" class="form-control">--%>

<%--                <div class="label">--%>
<%--                    Nội dung bài tập:--%>
<%--                </div>--%>
<%--                <textarea id="mytextarea" name="noiDungBaiTap">Hello, World!</textarea>--%>

<%--                <button type="submit" class="btn btn-primary save-btn">Tạo</button>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </form>--%>

<%--    <!-- Footer -->--%>

<%--    <jsp:include page="footer.jsp"></jsp:include>--%>
<%--    <!-- End Footer -->--%>
<%--</main>--%>

<!-- Main mới -->
<form action="/projectAPI/Teacher/uploadBaiTap" method="post" enctype="multipart/form-data">
    <main class="container">
        <c:if test="${success != null}">
            <h3 style="color: blue">Thêm bài tập thành công</h3>
        </c:if>
        <div class="row m-1">
            <div class="col col-1 mt-2 mb-2">
            </div>
            <div class="col col-6 mt-auto mb-auto">
                <div class="row font-weight-bold">
                    Bài tập
                </div>
            </div>
            <div class="col col-5 mt-auto mb-auto">
                <div class="row float-right">
                    <div class="btn-group">
                        <button type="submit" class="btn btn-success border-right">Giao bài</button>
                        <button type="button" class="btn btn-success dropdown-toggle dropdown-toggle-split border-left"
                                id="dropdownMenuReference" data-toggle="dropdown" aria-expanded="false"
                                data-reference="parent">
                            <span class="sr-only">Toggle Dropdown</span>
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuReference">
                            <a class="dropdown-item" href="#">Bài tập</a>
                            <a class="dropdown-item" href="#">Kiểm tra</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row m-1 border-top">
            <div class="col-1 pt-2">
                <div class="row">
                </div>

                <div class="row mt-5">
                </div>
            </div>

            <div class="col-6 border-right pt-2">
                <div class="row mr-1">
                    <div class="card border-0" style="width: 100%;">
                        <div class="card-body p-0">
                            <div class="form-group">
                                <label for="title">Tên bài tập</label>
                                <input type="text" class="form-control" name="tenBaiTap" id="title"
                                       aria-describedby="titleHid" placeholder="">
                            </div>

                            <div class="form-group">
                                <label for="tutorial">Nội dung bài tập</label>
<%--                                <textarea class="form-control" name="tutorial" id="tutorial" rows="5" name=""></textarea>--%>
                                <textarea id="mytextarea" name="noiDungBaiTap">Hello, World!</textarea>
                            </div>
                        </div>
                        <div class="card-footer text-muted p-0 border-0 bg-transparent">
<%--                            <label for="file-upload" class="custom-file-upload text-success border rounded">--%>
<%--                                <i class="fas fa-plus"></i> File hướng dẫn--%>
<%--                            </label>--%>
<%--                            <input id="file-upload" name="files" type="file" />--%>
							<div id="containerFile"></div>
                            <a name="" id="btnNop" class="btn btn-outline-light text-success font-weight-bold ml-3" href="#"
                               role="button" style="margin-bottom: 5px;">
                                <i class="fas fa-plus"></i> Thêm file hướng dẫn
                            </a>
                            <div id="input"></div>
                        </div>

                    </div>
                </div>
            </div>

            <div class="col-5 pt-2">
                <div class="card border-0" style="width: 100%;">
                    <div class="card-body p-0">
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="inputEmail4">Dành cho</label>
                                <select name="loptinchi" class="form-control" id="exampleFormControlSelect1">
                                    <c:forEach var="classDT" items="${classesDT}">
                                        <option value="${classDT.id}">${classDT.tenLopTC}</option>
                                    </c:forEach>
                                </select>
                            </div>
<%--                            <div class="form-controlgroup col-md-6">--%>
<%--                                <label for="inputPassword4">&nbsp;</label>--%>
<%--                                <select class="form-control" id="exampleFormControlSelect1">--%>
<%--                                    <option>1</option>--%>
<%--                                    <option>2</option>--%>
<%--                                    <option>3</option>--%>
<%--                                    <option>4</option>--%>
<%--                                    <option>5</option>--%>
<%--                                </select>--%>
<%--                            </div>--%>
                        </div>

                        <div class="form-group">
                            <label for="">Thang điểm</label>
                            <select name="thangDiem" class="form-control col-md-6" id="">
                                <option>10</option>
                                <option>20</option>
                                <option>30</option>
                                <option>40</option>
                                <option>50</option>
                                <option>60</option>
                                <option>70</option>
                                <option>80</option>
                                <option>90</option>
                                <option>100</option>
                                <option>200</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label for="">Đến hạn</label>
                            <input type="date" class="form-control" id="hanNop" name="deadline"/>
<%--                            <select class="form-control" id="">--%>
<%--                                <option>Không có ngày đến hạn</option>--%>
<%--                                <option>2</option>--%>
<%--                                <option>3</option>--%>
<%--                                <option>4</option>--%>
<%--                                <option>5</option>--%>
<%--                            </select>--%>
                        </div>
                    </div>
                    <div class="card-footer text-muted p-0 border-0 bg-transparent">
<%--                        <label for="file-upload" class="custom-file-upload text-success border rounded">--%>
<%--                            <i class="fas fa-plus"></i> Tiêu chí chấm điểm--%>
<%--                        </label>--%>
<%--                        <input id="file-upload" name="" type="file" />--%>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </main>
</form>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->


<!-- JS Implementing Plugins -->
<script src="<c:url value="/resource/js/vendor.min.js"></c:url>"></script>
<script src="<c:url value="/resource/js/theme.min.js"></c:url>"></script>
<script src="<c:url value="/resource/js/index.js"></c:url>"></script>
<%--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"--%>
<%--        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"--%>
<%--        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"--%>
<%--        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"--%>
<%--        crossorigin="anonymous"></script>--%>
<script>
    $(document).ready(function () {
        var x = 1;
        var max_fields = 10;
        var container = document.getElementById("containerFile");
        $('#btnNop').click(function (e) {
            var label = document.createElement("label");
            var input = document.createElement("input");
            // var input = document.createElement("<label for='file-upload' class='custom-file-upload text-success border rounded'>" + "<i class='fas fa-plus'></i> Tiêu chí chấm điểm</label>" + "<input id='file-upload' name='files' type='file' />");
            // var input = document.getElementById("input");
            // input.innerHTML = "<label for='file-upload' class='custom-file-upload text-success border rounded'>" + "<i class='fas fa-plus'></i> Tiêu chí chấm điểm</label>" + "<input id='file-upload' name='files' type='file' />";
            e.preventDefault();
            if (x < max_fields) {
                x++;
                label.htmlFor = "file-upload";
                label.htmlFor += x;
                label.className = "custom-file-upload text-success border rounded";
                label.style = "padding-left: 15px;"
                label.innerHTML = "<i class='fas fa-plus'></i> File hương dẫn"
                label.id = "labelupload" + x;
                input.type = "file";
                input.name = "files";
                input.id = "file-upload"
                input.id += x;
                input.onchange = function () {changelabelname(x)}
                // input.className = "btn btn-sm btn-white";
                container.append(label);
                container.append(input);
            }
        });
    });

    function changelabelname(id) {
        var input = document.getElementById('file-upload'+id);
        var label = document.getElementById('labelupload'+id);
        label.innerHTML = input.files.item(0).name;
    }
</script>
</body>

</html>