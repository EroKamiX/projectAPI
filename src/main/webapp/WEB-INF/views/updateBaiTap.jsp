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
<script src="<c:url value="/resource/js/demo.js"></c:url>"></script>

<!-- END ONLY DEV -->

<!-- ========== MAIN CONTENT ========== -->
<!-- Navbar Vertical -->


<!-- End Navbar Vertical -->

<!-- Main mới -->
<form action="/projectAPI/Teacher/uploadBaiTap" method="post" enctype="multipart/form-data">
    <main class="container">
        <c:if test="${success != null}">
            <h3 style="color: blue">Sửa bài tập thành công</h3>
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
                        <button type="submit" class="btn btn-success border-right">Sửa bài</button>
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
                                       aria-describedby="titleHid" placeholder="" value="${baiTap.tenBaiTap}">
                            </div>

                            <div class="form-group">
                                <label for="tutorial">Nội dung bài tập</label>
                                <textarea id="mytextarea" name="noiDungBaiTap">${baiTap.noiDungBaiTap}</textarea>
                            </div>
                        </div>
                        <div class="card-footer text-muted p-0 border-0 bg-transparent">
                            <div id="containerFile">
                                <% int i = 1; %>
                                <c:forEach var="file" items="${files}">
                                    <% i += 1; %>
                                    <label for="file-upload<%= i %>" class="custom-file-upload text-success border rounded" id="labelupload<%= i %>" style="padding-left: 15px;">${file.filename}</label>
                                    <input type="text" name="files" id="file-upload<%= i %>" value="${file.filename}">
                                </c:forEach>
                            </div>
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
                                        <c:choose>
                                            <c:when test="${baiTap.loptinchi == classDT.id}">
                                                <option value="${classDT.id}" selected>${classDT.tenLopTC}</option>
                                            </c:when>
                                            <c:otherwise>
                                                <option value="${classDT.id}">${classDT.tenLopTC}</option>
                                            </c:otherwise>
                                        </c:choose>

                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="">Thang điểm</label>
                            <select name="thangDiem" class="form-control col-md-6" id="">
                                <option value="10">10</option>
                                <option value="20">20</option>
                                <option value="30">30</option>
                                <option value="40">40</option>
                                <option value="50">50</option>
                                <option value="60">60</option>
                                <option value="70">70</option>
                                <option value="80">80</option>
                                <option value="90">90</option>
                                <option value="100">100</option>
                                <option value="200">200</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label for="">Đến hạn</label>
                            <input type="date" class="form-control" id="hanNop" name="deadline"/>
                        </div>
                    </div>
                    <div class="card-footer text-muted p-0 border-0 bg-transparent">
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