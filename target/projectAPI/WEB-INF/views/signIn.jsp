<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phatn
  Date: 10/16/2021
  Time: 10:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" class="h-100">

<head>
    <!-- Required Meta Tags Always Come First -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Title -->
    <title>Cover Sign In | Front - Admin &amp; Dashboard Template</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="<c:url value="/resource/img/favicon.ico"></c:url>">

    <!-- Font -->
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&display=swap" rel="stylesheet">

    <!-- CSS Implementing Plugins -->
    <link rel="stylesheet" href="<c:url value="/resource/css/vendor.min.css"></c:url>">
    <link rel="stylesheet" href="<c:url value="/resource/css/style.css"></c:url>">
    <!-- CSS Front Template -->
    <link rel="stylesheet" href="<c:url value="/resource/css/theme.min.css?v=1.0"></c:url>">
</head>

<body class="d-flex align-items-center min-h-100">
<!-- ========== HEADER ========== -->
<header class="position-absolute top-0 left-0 right-0 mt-3 mx-3">
    <div class="d-flex d-lg-none justify-content-between">
        <a href="index.jsp">
            <img class="w-100" src="<c:url value="/resource/img/logo.svg"></c:url>" alt="Image Description"
                 style="min-width: 7rem; max-width: 7rem;">
        </a>
    </div>
</header>
<!-- ========== END HEADER ========== -->

<!-- ========== MAIN CONTENT ========== -->
<main id="content" role="main" class="main pt-0">
    <!-- Content -->
    <div class="container-fluid px-3">
        <div class="row">
            <!-- Cover -->
            <div class="col-lg-6 d-none d-lg-flex justify-content-center align-items-center min-vh-lg-100 position-relative bg-light px-0">
                <!-- Logo & Language -->
                <div class="position-absolute top-0 left-0 right-0 mt-3 mx-3">
                    <div class="d-none d-lg-flex justify-content-between">
                        <a href="index.jsp">
                            <img class="w-100" src="<c:url value="/resource/img/logo.svg"></c:url>"
                                 alt="Image Description" style="min-width: 7rem; max-width: 7rem;">
                        </a>
                    </div>
                </div>
                <!-- End Logo & Language -->

                <div style="max-width: 23rem;">
                    <div class="text-center mb-5">
                        <img class="img-fluid" src="<c:url value="/resource/img/chat.svg"></c:url>"
                             alt="Image Description" style="width: 12rem;">
                    </div>

                    <div class="mb-5">
                        <h2 class="display-4">Build digital products with:</h2>
                    </div>

                    <!-- List Checked -->
                    <ul class="list-checked list-checked-lg list-checked-primary list-unstyled-py-4">
                        <li class="list-checked-item">
                            <span class="d-block font-weight-bold mb-1">All-in-one tool</span> Build, run, and scale
                            your apps - end to end
                        </li>

                        <li class="list-checked-item">
                            <span class="d-block font-weight-bold mb-1">Easily add &amp; manage your services</span> It
                            brings together your tasks, projects, timelines, files and more
                        </li>
                    </ul>
                    <!-- End List Checked -->

                    <div class="row justify-content-between mt-5 gx-2">
                        <div class="col">
                            <img class="img-fluid" src="<c:url value="/resource/img/gitlab-gray.svg"></c:url>"
                                 alt="Image Description">
                        </div>
                        <div class="col">
                            <img class="img-fluid" src="<c:url value="/resource/img/fitbit-gray.svg"></c:url>"
                                 alt="Image Description">
                        </div>
                        <div class="col">
                            <img class="img-fluid" src="<c:url value="/resource/img/flow-xo-gray.svg"></c:url>"
                                 alt="Image Description">
                        </div>
                        <div class="col">
                            <img class="img-fluid" src="<c:url value="/resource/img/layar-gray.svg"></c:url>"
                                 alt="Image Description">
                        </div>
                    </div>
                    <!-- End Row -->
                </div>
            </div>
            <!-- End Cover -->

            <div class="col-lg-6 d-flex justify-content-center align-items-center min-vh-lg-100">
                <div class="w-100 pt-10 pt-lg-7 pb-7" style="max-width: 25rem;">
                    <!-- Form -->
                    <c:url value="/login" var="loginUrl"/>
                    <form class="js-validate" action="${loginUrl}" method="post">
                        <div class="text-center mb-5">
                            <h1 class="display-4">Sign in</h1>
                        </div>
                        <h3 style="color: red">${errorMessage}</h3>
                        <!-- Form Group -->
                        <div class="js-form-message form-group">
                            <label class="input-label" for="signupSrEmail">Your email</label>

                            <input type="text" class="form-control form-control-lg" name="username" id="signupSrEmail"
                                   placeholder="Markwilliams@example.com" aria-label="Markwilliams@example.com" required
                                   data-msg="Please enter a valid email address.">
                        </div>
                        <!-- End Form Group -->

                        <!-- Form Group -->
                        <div class="js-form-message form-group">
                            <label class="input-label" for="signupSrPassword" tabindex="0">
                    <span class="d-flex justify-content-between align-items-center">
                      Password
                      <a class="input-label-secondary" href="reset-password.html">Forgot Password?</a>
                    </span>
                            </label>

                            <div class="input-group input-group-merge">
                                <input type="password" class="js-toggle-password form-control form-control-lg"
                                       name="password" id="signupSrPassword" placeholder="8+ characters required"
                                       aria-label="8+ characters required" required
                                       data-msg="Your password is invalid. Please try again."
                                       data-hs-toggle-password-options='{
                             "target": "#changePassTarget",
                             "defaultClass": "tio-hidden-outlined",
                             "showClass": "tio-visible-outlined",
                             "classChangeTarget": "#changePassIcon"
                           }'>
                                <div id="changePassTarget" class="input-group-append">
                                    <a class="input-group-text" href="javascript:;">
                                        <i id="changePassIcon" class="tio-visible-outlined"></i>
                                    </a>
                                </div>
                            </div>
                        </div>
                        <!-- End Form Group -->

                        <!-- Checkbox -->
                        <div class="form-group">
                            <div class="custom-control custom-checkbox">
                                <input type="checkbox" class="custom-control-input" id="termsCheckbox"
                                       name="termsCheckbox">
                                <label class="custom-control-label font-size-sm text-muted" for="termsCheckbox">
                                    Remember me</label>
                            </div>
                        </div>
                        <!-- End Checkbox -->

                        <button type="submit" class="btn btn-lg btn-block btn-primary">Sign in</button>
                    </form>
                    <!-- End Form -->
                </div>
            </div>
        </div>
        <!-- End Row -->
    </div>
    <!-- End Content -->
</main>
<!-- ========== END MAIN CONTENT ========== -->


<!-- JS Implementing Plugins -->
<script src="<c:url value="/resource/js/vendor.min.js"></c:url>"></script>

<!-- JS Front -->
<script src="<c:url value="/resource/js/theme.min.js"></c:url>"></script>

<!-- JS Plugins Init. -->
<script>
    $(document).on('ready', function () {
        // initialization of Show Password
        $('.js-toggle-password').each(function () {
            new HSTogglePassword(this).init()
        });

        // initialization of form validation
        $('.js-validate').each(function () {
            $.HSCore.components.HSValidation.init($(this));
        });

        // initialization of select2
        $('.js-select2-custom').each(function () {
            var select2 = $.HSCore.components.HSSelect2.init($(this));
        });
    });
</script>

<!-- IE Support -->
<script>
    if (/MSIE \d|Trident.*rv:/.test(navigator.userAgent)) document.write('<script src="./js/polyfill.min.js"><\/script>');
</script>
</body>

</html>
