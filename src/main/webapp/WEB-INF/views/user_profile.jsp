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
<script src="<c:url value="/resource/js/hs-navbar-vertical-aside-mini-cache.js"></c:url>"></script>
<header id="header" class="navbar navbar-expand-lg navbar-bordered flex-lg-column px-0">
    <div class="navbar-dark w-100">
        <div class="container">
            <div class="navbar-nav-wrap">
                <div class="navbar-brand-wrapper">
                    <!-- Logo -->
                    <a class="navbar-brand" href="./index.html" aria-label="Front">
                        <img class="navbar-brand-logo" src="<c:url value="/resource/img/logo-white.svg"></c:url>"
                             alt="Logo">
                    </a>
                    <!-- End Logo -->
                </div>

                <div class="navbar-nav-wrap-content-left">
                    <!-- Search Form -->
                    <div class="d-none d-lg-block">
                        <form class="position-relative">
                            <!-- Input Group -->
                            <div class="input-group input-group-merge input-group-borderless input-group-hover-light navbar-input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="tio-search"></i>
                                    </div>
                                </div>
                                <input type="search" class="js-form-search form-control" placeholder="Search in front"
                                       aria-label="Search in front" data-hs-form-search-options="{
                         &quot;clearIcon&quot;: &quot;#clearSearchResultsIcon&quot;,
                         &quot;dropMenuElement&quot;: &quot;#searchDropdownMenu&quot;,
                         &quot;dropMenuOffset&quot;: 20,
                         &quot;toggleIconOnFocus&quot;: true,
                         &quot;activeClass&quot;: &quot;focus&quot;
                       }">
                                <a class="input-group-append" href="javascript:;">
                                        <span class="input-group-text">
                    <i id="clearSearchResultsIcon" class="tio-clear" style="display: none;"></i>
                  </span>
                                </a>
                            </div>
                            <!-- End Input Group -->

                            <!-- Card Search Content -->
                            <div id="searchDropdownMenu"
                                 class="hs-form-search-menu-content card dropdown-menu dropdown-card overflow-hidden animated hs-form-search-menu-hidden hs-form-search-menu-initialized">
                                <!-- Body -->
                                <div class="card-body-height py-3">

                                    <div class="dropdown-divider my-3"></div>

                                    <small class="dropdown-header mb-n2">Tutorials</small>

                                    <a class="dropdown-item my-2" href="./index.html">
                                        <div class="media align-items-center">
                                                <span class="icon icon-xs icon-soft-dark icon-circle mr-2">
                        <i class="tio-tune"></i>
                      </span>

                                            <div class="media-body text-truncate">
                                                <span>How to set up Gulp?</span>
                                            </div>
                                        </div>
                                    </a>

                                    <a class="dropdown-item my-2" href="./index.html">
                                        <div class="media align-items-center">
                                                <span class="icon icon-xs icon-soft-dark icon-circle mr-2">
                        <i class="tio-paint-bucket"></i>
                      </span>

                                            <div class="media-body text-truncate">
                                                <span>How to change theme color?</span>
                                            </div>
                                        </div>
                                    </a>
                                </div>
                                <!-- End Body -->

                                <!-- Footer -->
                                <a class="card-footer text-center" href="./index.html">
                                    See all results
                                    <i class="tio-chevron-right"></i>
                                </a>
                                <!-- End Footer -->
                            </div>
                            <!-- End Card Search Content -->
                        </form>
                    </div>
                    <!-- End Search Form -->
                </div>

                <!-- Secondary Content -->
                <div class="navbar-nav-wrap-content-right">
                    <!-- Navbar -->
                    <ul class="navbar-nav align-items-center flex-row">
                        <li class="nav-item d-lg-none">
                            <!-- Search Trigger -->
                            <div class="hs-unfold">
                                <a class="js-hs-unfold-invoker btn btn-icon btn-ghost-light rounded-circle"
                                   href="javascript:;" data-hs-unfold-options="{
                     &quot;target&quot;: &quot;#searchDropdown&quot;,
                     &quot;type&quot;: &quot;css-animation&quot;,
                     &quot;animationIn&quot;: &quot;fadeIn&quot;,
                     &quot;hasOverlay&quot;: &quot;rgba(46, 52, 81, 0.1)&quot;,
                     &quot;closeBreakpoint&quot;: &quot;md&quot;
                   }" data-hs-unfold-target="#searchDropdown" data-hs-unfold-invoker="">
                                    <i class="tio-search"></i>
                                </a>
                            </div>
                            <!-- End Search Trigger -->
                        </li>

                        <li class="nav-item d-none d-sm-inline-block">
                            <!-- Notification -->
                            <div class="hs-unfold">
                                <a class="js-hs-unfold-invoker btn btn-icon btn-ghost-light rounded-circle"
                                   href="javascript:;" data-hs-unfold-options="{
                     &quot;target&quot;: &quot;#notificationNavbarDropdown&quot;,
                     &quot;type&quot;: &quot;css-animation&quot;
                   }" data-hs-unfold-target="#notificationNavbarDropdown" data-hs-unfold-invoker="">
                                    <i class="tio-notifications-on-outlined"></i>
                                    <span class="btn-status btn-sm-status btn-status-danger"></span>
                                </a>

                                <div id="notificationNavbarDropdown"
                                     class="hs-unfold-content dropdown-unfold dropdown-menu dropdown-menu-right navbar-dropdown-menu hs-unfold-hidden hs-unfold-content-initialized hs-unfold-css-animation animated"
                                     style="width: 25rem; animation-duration: 300ms;"
                                     data-hs-target-height="0" data-hs-unfold-content=""
                                     data-hs-unfold-content-animation-in="slideInUp"
                                     data-hs-unfold-content-animation-out="fadeOut">
                                    <!-- Header -->
                                    <div class="card-header">
                                        <span class="card-title h4">Notifications</span>
                                    </div>
                                    <!-- End Header -->
                                    <!-- Body -->
                                    <div class="card-body-height">
                                        <!-- Tab Content -->
                                        <div class="tab-content" id="notificationTabContent">
                                            <div class="tab-pane fade show active" id="notificationNavOne"
                                                 role="tabpanel" aria-labelledby="notificationNavOne-tab">
                                                <ul class="list-group list-group-flush navbar-card-list-group">
                                                    <!-- Item -->
                                                    <li class="list-group-item custom-checkbox-list-wrapper">
                                                        <div class="row">
                                                            <div class="col-auto position-static">
                                                                <div class="d-flex align-items-center">
                                                                    <div class="custom-control custom-checkbox custom-checkbox-list">
                                                                        <input type="checkbox"
                                                                               class="custom-control-input"
                                                                               id="notificationCheck1" checked="">
                                                                        <label class="custom-control-label"
                                                                               for="notificationCheck1"></label>
                                                                        <span class="custom-checkbox-list-stretched-bg"></span>
                                                                    </div>
                                                                    <div class="avatar avatar-sm avatar-circle">
                                                                        <img class="avatar-img"
                                                                             src="<c:url value="/resource/img/img3.jpg"></c:url>"
                                                                             alt="Image Description">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col ml-n3">
                                                                <span class="card-title h5">Brian Warner</span>
                                                                <p class="card-text font-size-sm">changed an issue from
                                                                    "In Progress" to <span class="badge badge-success">Review</span>
                                                                </p>
                                                            </div>
                                                            <small class="col-auto text-muted text-cap">2hr</small>
                                                        </div>
                                                        <a class="stretched-link" href="#"></a>
                                                    </li>
                                                    <!-- End Item -->

                                                    <!-- Item -->
                                                    <li class="list-group-item custom-checkbox-list-wrapper">
                                                        <div class="row">
                                                            <div class="col-auto position-static">
                                                                <div class="d-flex align-items-center">
                                                                    <div class="custom-control custom-checkbox custom-checkbox-list">
                                                                        <input type="checkbox"
                                                                               class="custom-control-input"
                                                                               id="notificationCheck2" checked="">
                                                                        <label class="custom-control-label"
                                                                               for="notificationCheck2"></label>
                                                                        <span class="custom-checkbox-list-stretched-bg"></span>
                                                                    </div>
                                                                    <div class="avatar avatar-sm avatar-soft-dark avatar-circle">
                                                                        <span class="avatar-initials">K</span>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col ml-n3">
                                                                <span class="card-title h5">Klara Hampton</span>
                                                                <p class="card-text font-size-sm">mentioned you in a
                                                                    comment</p>
                                                                <blockquote class="blockquote blockquote-sm">
                                                                    Nice work, love! You really nailed it. Keep it up!
                                                                </blockquote>
                                                            </div>
                                                            <small class="col-auto text-muted text-cap">10hr</small>
                                                        </div>
                                                        <a class="stretched-link" href="#"></a>
                                                    </li>
                                                    <!-- End Item -->

                                                    <!-- Item -->
                                                    <li class="list-group-item custom-checkbox-list-wrapper">
                                                        <div class="row">
                                                            <div class="col-auto position-static">
                                                                <div class="d-flex align-items-center">
                                                                    <div class="custom-control custom-checkbox custom-checkbox-list">
                                                                        <input type="checkbox"
                                                                               class="custom-control-input"
                                                                               id="notificationCheck4" checked="">
                                                                        <label class="custom-control-label"
                                                                               for="notificationCheck4"></label>
                                                                        <span class="custom-checkbox-list-stretched-bg"></span>
                                                                    </div>
                                                                    <div class="avatar avatar-sm avatar-circle">
                                                                        <img class="avatar-img"
                                                                             src="<c:url value="/resource/img/img10.jpg"></c:url>"
                                                                             alt="Image Description">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col ml-n3">
                                                                <span class="card-title h5">Ruby Walter</span>
                                                                <p class="card-text font-size-sm">joined the Slack group
                                                                    HS Team</p>
                                                            </div>
                                                            <small class="col-auto text-muted text-cap">3dy</small>
                                                        </div>
                                                        <a class="stretched-link" href="#"></a>
                                                    </li>
                                                    <!-- End Item -->

                                                    <!-- Item -->
                                                    <li class="list-group-item custom-checkbox-list-wrapper">
                                                        <div class="row">
                                                            <div class="col-auto position-static">
                                                                <div class="d-flex align-items-center">
                                                                    <div class="custom-control custom-checkbox custom-checkbox-list">
                                                                        <input type="checkbox"
                                                                               class="custom-control-input"
                                                                               id="notificationCheck3">
                                                                        <label class="custom-control-label"
                                                                               for="notificationCheck3"></label>
                                                                        <span class="custom-checkbox-list-stretched-bg"></span>
                                                                    </div>
                                                                    <div class="avatar avatar-sm avatar-circle">
                                                                        <img class="avatar-img"
                                                                             src="<c:url value="/resource/img/google.svg"></c:url>"
                                                                             alt="Image Description">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col ml-n3">
                                                                <span class="card-title h5">from Google</span>
                                                                <p class="card-text font-size-sm">Start using forms to
                                                                    capture the information of prospects visiting your
                                                                    Google website</p>
                                                            </div>
                                                            <small class="col-auto text-muted text-cap">17dy</small>
                                                        </div>
                                                        <a class="stretched-link" href="#"></a>
                                                    </li>
                                                    <!-- End Item -->

                                                    <!-- Item -->
                                                    <li class="list-group-item custom-checkbox-list-wrapper">
                                                        <div class="row">
                                                            <div class="col-auto position-static">
                                                                <div class="d-flex align-items-center">
                                                                    <div class="custom-control custom-checkbox custom-checkbox-list">
                                                                        <input type="checkbox"
                                                                               class="custom-control-input"
                                                                               id="notificationCheck5">
                                                                        <label class="custom-control-label"
                                                                               for="notificationCheck5"></label>
                                                                        <span class="custom-checkbox-list-stretched-bg"></span>
                                                                    </div>
                                                                    <div class="avatar avatar-sm avatar-circle">
                                                                        <img class="avatar-img"
                                                                             src="<c:url value="/resource/img/img7.jpg"></c:url>"
                                                                             alt="Image Description">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col ml-n3">
                                                                <span class="card-title h5">Sara Villar</span>
                                                                <p class="card-text font-size-sm">completed <i
                                                                        class="tio-folder-bookmarked text-primary"></i>
                                                                    FD-7 task</p>
                                                            </div>
                                                            <small class="col-auto text-muted text-cap">2mn</small>
                                                        </div>
                                                        <a class="stretched-link" href="#"></a>
                                                    </li>
                                                    <!-- End Item -->
                                                </ul>
                                            </div>

                                            <div class="tab-pane fade" id="notificationNavTwo" role="tabpanel"
                                                 aria-labelledby="notificationNavTwo-tab">
                                                <ul class="list-group list-group-flush navbar-card-list-group">
                                                    <!-- Item -->
                                                    <li class="list-group-item custom-checkbox-list-wrapper">
                                                        <div class="row">
                                                            <div class="col-auto position-static">
                                                                <div class="d-flex align-items-center">
                                                                    <div class="custom-control custom-checkbox custom-checkbox-list">
                                                                        <input type="checkbox"
                                                                               class="custom-control-input"
                                                                               id="notificationCheck7">
                                                                        <label class="custom-control-label"
                                                                               for="notificationCheck7"></label>
                                                                        <span class="custom-checkbox-list-stretched-bg"></span>
                                                                    </div>
                                                                    <div class="avatar avatar-sm avatar-soft-dark avatar-circle">
                                                                        <span class="avatar-initials">A</span>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col ml-n3">
                                                                <span class="card-title h5">Anne Richard</span>
                                                                <p class="card-text font-size-sm">accepted your
                                                                    invitation to join Notion</p>
                                                            </div>
                                                            <small class="col-auto text-muted text-cap">1dy</small>
                                                        </div>
                                                        <a class="stretched-link" href="#"></a>
                                                    </li>
                                                    <!-- End Item -->

                                                    <!-- Item -->
                                                    <li class="list-group-item custom-checkbox-list-wrapper">
                                                        <div class="row">
                                                            <div class="col-auto position-static">
                                                                <div class="d-flex align-items-center">
                                                                    <div class="custom-control custom-checkbox custom-checkbox-list">
                                                                        <input type="checkbox"
                                                                               class="custom-control-input"
                                                                               id="notificationCheck6">
                                                                        <label class="custom-control-label"
                                                                               for="notificationCheck6"></label>
                                                                        <span class="custom-checkbox-list-stretched-bg"></span>
                                                                    </div>
                                                                    <div class="avatar avatar-sm avatar-circle">
                                                                        <img class="avatar-img"
                                                                             src="<c:url value="/resource/img/img5.jpg"></c:url>"
                                                                             alt="Image Description">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col ml-n3">
                                                                <span class="card-title h5">Finch Hoot</span>
                                                                <p class="card-text font-size-sm">left Slack group HS
                                                                    projects</p>
                                                            </div>
                                                            <small class="col-auto text-muted text-cap">3dy</small>
                                                        </div>
                                                        <a class="stretched-link" href="#"></a>
                                                    </li>
                                                    <!-- End Item -->

                                                    <!-- Item -->
                                                    <li class="list-group-item custom-checkbox-list-wrapper">
                                                        <div class="row">
                                                            <div class="col-auto position-static">
                                                                <div class="d-flex align-items-center">
                                                                    <div class="custom-control custom-checkbox custom-checkbox-list">
                                                                        <input type="checkbox"
                                                                               class="custom-control-input"
                                                                               id="notificationCheck8">
                                                                        <label class="custom-control-label"
                                                                               for="notificationCheck8"></label>
                                                                        <span class="custom-checkbox-list-stretched-bg"></span>
                                                                    </div>
                                                                    <div class="avatar avatar-sm avatar-dark avatar-circle">
                                                                        <span class="avatar-initials">HS</span>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col ml-n3">
                                                                <span class="card-title h5">Htmlstream</span>
                                                                <p class="card-text font-size-sm">you earned a "Top
                                                                    endorsed" <i class="tio-verified text-primary"></i>
                                                                    badge</p>
                                                            </div>
                                                            <small class="col-auto text-muted text-cap">6dy</small>
                                                        </div>
                                                        <a class="stretched-link" href="#"></a>
                                                    </li>
                                                    <!-- End Item -->

                                                    <!-- Item -->
                                                    <li class="list-group-item custom-checkbox-list-wrapper">
                                                        <div class="row">
                                                            <div class="col-auto position-static">
                                                                <div class="d-flex align-items-center">
                                                                    <div class="custom-control custom-checkbox custom-checkbox-list">
                                                                        <input type="checkbox"
                                                                               class="custom-control-input"
                                                                               id="notificationCheck9">
                                                                        <label class="custom-control-label"
                                                                               for="notificationCheck9"></label>
                                                                        <span class="custom-checkbox-list-stretched-bg"></span>
                                                                    </div>
                                                                    <div class="avatar avatar-sm avatar-circle">
                                                                        <img class="avatar-img"
                                                                             src="<c:url value="/resource/img/img8.jpg"></c:url>"
                                                                             alt="Image Description">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col ml-n3">
                                                                <span class="card-title h5">Linda Bates</span>
                                                                <p class="card-text font-size-sm">Accepted your
                                                                    connection</p>
                                                            </div>
                                                            <small class="col-auto text-muted text-cap">17dy</small>
                                                        </div>
                                                        <a class="stretched-link" href="#"></a>
                                                    </li>
                                                    <!-- End Item -->

                                                    <!-- Item -->
                                                    <li class="list-group-item custom-checkbox-list-wrapper">
                                                        <div class="row">
                                                            <div class="col-auto position-static">
                                                                <div class="d-flex align-items-center">
                                                                    <div class="custom-control custom-checkbox custom-checkbox-list">
                                                                        <input type="checkbox"
                                                                               class="custom-control-input"
                                                                               id="notificationCheck10">
                                                                        <label class="custom-control-label"
                                                                               for="notificationCheck10"></label>
                                                                        <span class="custom-checkbox-list-stretched-bg"></span>
                                                                    </div>
                                                                    <div class="avatar avatar-sm avatar-soft-dark avatar-circle">
                                                                        <span class="avatar-initials">L</span>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col ml-n3">
                                                                <span class="card-title h5">Lewis Clarke</span>
                                                                <p class="card-text font-size-sm">completed <i
                                                                        class="tio-folder-bookmarked text-primary"></i>
                                                                    FD-134 task</p>
                                                            </div>
                                                            <small class="col-auto text-muted text-cap">2mn</small>
                                                        </div>
                                                        <a class="stretched-link" href="#"></a>
                                                    </li>
                                                    <!-- End Item -->
                                                </ul>
                                            </div>
                                        </div>
                                        <!-- End Tab Content -->
                                    </div>
                                    <!-- End Body -->

                                    <!-- Card Footer -->
                                    <a class="card-footer text-center" href="#">
                                        View all notifications
                                        <i class="tio-chevron-right"></i>
                                    </a>
                                    <!-- End Card Footer -->
                                </div>
                            </div>
                            <!-- End Notification -->
                        </li>

                        <li class="nav-item">
                            <!-- Account -->
                            <div class="hs-unfold">
                                <a class="js-hs-unfold-invoker navbar-dropdown-account-wrapper" href="javascript:;"
                                   data-hs-unfold-options="{
                     &quot;target&quot;: &quot;#accountNavbarDropdown&quot;,
                     &quot;type&quot;: &quot;css-animation&quot;
                   }" data-hs-unfold-target="#accountNavbarDropdown" data-hs-unfold-invoker="">
                                    <div class="avatar avatar-sm avatar-circle">
                                        <img class="avatar-img" src="<c:url value="/resource/img/img6.jpg"></c:url>"
                                             alt="Image Description">
                                        <span class="avatar-status avatar-sm-status avatar-status-success"></span>
                                    </div>
                                </a>

                                <div id="accountNavbarDropdown"
                                     class="hs-unfold-content dropdown-unfold dropdown-menu dropdown-menu-right navbar-dropdown-menu navbar-dropdown-account hs-unfold-hidden hs-unfold-content-initialized hs-unfold-css-animation animated"
                                     style="width: 16rem; animation-duration: 300ms;"
                                     data-hs-target-height="0" data-hs-unfold-content=""
                                     data-hs-unfold-content-animation-in="slideInUp"
                                     data-hs-unfold-content-animation-out="fadeOut">
                                    <div class="dropdown-item">
                                        <div class="media align-items-center">
                                            <div class="avatar avatar-sm avatar-circle mr-2">
                                                <img class="avatar-img"
                                                     src="<c:url value="/resource/img/img6.jpg"></c:url>"
                                                     alt="Image Description">
                                            </div>
                                            <div class="media-body">
                                                <span class="card-title h5">${name}</span>
                                                <span class="card-text">${username}</span>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="dropdown-divider"></div>

                                    <a class="dropdown-item" href="<c:url value="/Teacher/Profile"></c:url>">
                                        <span class="text-truncate pr-2" title="Settings">Profile</span>
                                    </a>
                                    <a class="dropdown-item" href="<c:url value="/logout"></c:url>">
                                        <span class="text-truncate pr-2" title="Sign out">Sign out</span>
                                    </a>
                                </div>
                            </div>
                            <!-- End Account -->
                        </li>

                        <li class="nav-item">
                            <!-- Toggle -->
                            <button type="button" class="navbar-toggler btn btn-ghost-light rounded-circle"
                                    aria-label="Toggle navigation" aria-expanded="false" aria-controls="navbarNavMenu"
                                    data-toggle="collapse" data-target="#navbarNavMenu">
                                <i class="tio-menu-hamburger"></i>
                            </button>
                            <!-- End Toggle -->
                        </li>
                    </ul>
                    <!-- End Navbar -->
                </div>
                <!-- End Secondary Content -->
            </div>
        </div>
    </div>

    <div id="searchDropdown"
         class="hs-unfold-content dropdown-unfold search-fullwidth d-md-none hs-unfold-content-initialized hs-unfold-css-animation animated fadeIn"
         data-hs-target-height="0" data-hs-unfold-content="" data-hs-unfold-content-animation-in="fadeIn"
         data-hs-unfold-content-animation-out="fadeOut" style="animation-duration: 300ms;">
        <form class="input-group input-group-merge input-group-borderless">
            <div class="input-group-prepend">
                <div class="input-group-text">
                    <i class="tio-search"></i>
                </div>
            </div>

            <input class="form-control rounded-0" type="search" placeholder="Search in front"
                   aria-label="Search in front">

            <div class="input-group-append">
                <div class="input-group-text">
                    <div class="hs-unfold">
                        <a class="js-hs-unfold-invoker" href="javascript:;" data-hs-unfold-options="{
                   &quot;target&quot;: &quot;#searchDropdown&quot;,
                   &quot;type&quot;: &quot;css-animation&quot;,
                   &quot;animationIn&quot;: &quot;fadeIn&quot;,
                   &quot;hasOverlay&quot;: &quot;rgba(46, 52, 81, 0.1)&quot;,
                   &quot;closeBreakpoint&quot;: &quot;md&quot;
                 }" data-hs-unfold-target="#searchDropdown" data-hs-unfold-invoker="">
                            <i class="tio-clear tio-lg"></i>
                        </a>
                    </div>
                </div>
            </div>
        </form>
    </div>

    <div class="container">
        <nav class="js-mega-menu flex-grow-1 hs-menu-initialized hs-menu-horizontal">
            <!-- Navbar -->
            <div class="navbar-nav-wrap-navbar collapse navbar-collapse col-12" id="navbarNavMenu">
                <div class="navbar-body col-lg-12">
                    <ul class="navbar-nav flex-grow-1 col-lg-12">

                        <li class="hs-has-sub-menu navbar-nav-item col-lg-2">
                            <a id="dashboardsDropdown"
                               class="hs-mega-menu-invoker navbar-nav-link nav-link nav-link-toggle" href="javascript:;"
                               aria-haspopup="true" aria-expanded="false" aria-labelledby="navLinkDashboardsDropdown">
                                <i class="tio-earth-east nav-icon"></i> Ngoại ngữ
                            </a>

                            <!-- Dropdown -->
                            <ul id="navLinkDashboardsDropdown"
                                class="hs-sub-menu dropdown-menu dropdown-menu-lg hs-sub-menu-desktop-lg animated"
                                aria-labelledby="dashboardsDropdown"
                                style="min-width: 16rem; animation-duration: 300ms;">
                                <li>
                                    <a class="dropdown-item" href="./index.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tất cả
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng anh
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng Nhật
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng trung
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng Hàn
                                    </a>
                                </li>
                            </ul>
                            <!-- End Dropdown -->
                        </li>

                        <li class="hs-has-sub-menu navbar-nav-item col-lg-2">
                            <a id="dashboardsDropdown"
                               class="hs-mega-menu-invoker navbar-nav-link nav-link nav-link-toggle" href="javascript:;"
                               aria-haspopup="true" aria-expanded="false" aria-labelledby="navLinkDashboardsDropdown">
                                <i class="tio-earth-east nav-icon"></i> Ngoại ngữ
                            </a>

                            <!-- Dropdown -->
                            <ul id="navLinkDashboardsDropdown"
                                class="hs-sub-menu dropdown-menu dropdown-menu-lg hs-sub-menu-desktop-lg animated"
                                aria-labelledby="dashboardsDropdown"
                                style="min-width: 16rem; animation-duration: 300ms;">
                                <li>
                                    <a class="dropdown-item" href="./index.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tất cả
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng anh
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng Nhật
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng trung
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng Hàn
                                    </a>
                                </li>
                            </ul>
                            <!-- End Dropdown -->
                        </li>

                        <li class="hs-has-sub-menu navbar-nav-item col-lg-2">
                            <a id="dashboardsDropdown"
                               class="hs-mega-menu-invoker navbar-nav-link nav-link nav-link-toggle" href="javascript:;"
                               aria-haspopup="true" aria-expanded="false" aria-labelledby="navLinkDashboardsDropdown">
                                <i class="tio-earth-east nav-icon"></i> Ngoại ngữ
                            </a>

                            <!-- Dropdown -->
                            <ul id="navLinkDashboardsDropdown"
                                class="hs-sub-menu dropdown-menu dropdown-menu-lg hs-sub-menu-desktop-lg animated"
                                aria-labelledby="dashboardsDropdown"
                                style="min-width: 16rem; animation-duration: 300ms;">
                                <li>
                                    <a class="dropdown-item" href="./index.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tất cả
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng anh
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng Nhật
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng trung
                                    </a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="./dashboard-alternative.html">
                                        <span class="tio-circle nav-indicator-icon"></span> Tiếng Hàn
                                    </a>
                                </li>
                            </ul>
                            <!-- End Dropdown -->
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
        <div class="row justify-content-lg-center">
            <div class="col-lg-10">
                <!-- Profile Cover -->
                <div class="profile-cover">
                    <div class="profile-cover-img-wrapper">
                        <img id="profileCoverImg" class="profile-cover-img"
                             src="<c:url value="/resource/img/img2.jpg"></c:url>" alt="Image Description">

                        <!-- Custom File Cover -->
                        <%--                            <div class="pro file-cover-content profile-cover-btn">--%>
                        <%--                                <div class="custom-file-btn">--%>
                        <%--                                    <input type="file" class="js-file-attach custom-file-btn-input" id="profileCoverUplaoder" data-hs-file-attach-options="{--%>
                        <%--                                    &quot;textTarget&quot;: &quot;#profileCoverImg&quot;,--%>
                        <%--                                    &quot;mode&quot;: &quot;image&quot;,--%>
                        <%--                                    &quot;targetAttr&quot;: &quot;src&quot;--%>
                        <%--                                 }">--%>
                        <%--                                    <label class="custom-file-btn-label btn btn-sm btn-white" for="profileCoverUplaoder">--%>
                        <%--                            <i class="tio-add-photo"></i>--%>
                        <%--                            <span class="d-none d-sm-inline-block ml-1">Update your header</span>--%>
                        </label>
                    </div>
                </div>
                <!-- End Custom File Cover -->
            </div>
        </div>
        <!-- End Profile Cover -->

        <!-- Profile Header -->
        <div class="text-center mb-5">
            <!-- Avatar -->
            <label class="avatar avatar-xxl avatar-circle avatar-border-lg avatar-uploader profile-cover-avatar"
                   for="avatarUploader">
                <img id="avatarImg" class="avatar-img" src="<c:url value="/resource/img/img6.jpg"></c:url>"
                     alt="Image Description">

                <input type="file" class="js-file-attach avatar-uploader-input" id="avatarUploader"
                       data-hs-file-attach-options="{
                                &quot;textTarget&quot;: &quot;#avatarImg&quot;,
                                &quot;mode&quot;: &quot;image&quot;,
                                &quot;targetAttr&quot;: &quot;src&quot;
                             }">

                <span class="avatar-uploader-trigger">
                        <i class="tio-edit avatar-uploader-icon shadow-soft"></i>
                      </span>
            </label>
            <!-- End Avatar -->

            <h1 class="page-title">${name} <i class="tio-verified tio-lg text-primary" data-toggle="tooltip"
                                              data-placement="top" title="" data-original-title="Top endorsed"></i></h1>

            <!-- List -->
            <ul class="list-inline list-inline-m-1">
                <li class="list-inline-item">
                    <%--                                <i class="tio-city mr-1"></i>--%>
                    <%--                                <span>Pixeel Ltd.</span>--%>
                </li>
                <c:forEach items="${lsDTO}" var="lsDTO">
                    <li class="list-inline-item">
                        <i class="tio-poi-outlined mr-1"></i>
                        <a href="#">${lsDTO.address}</a>
                    </li>
                </c:forEach>


                <li class="list-inline-item">
                    <%--                                <i class="tio-date-range mr-1"></i>--%>
                    <%--                                <span>Joined March 2013</span>--%>
                </li>
            </ul>
            <!-- End List -->
        </div>
        <!-- End Profile Header -->

        <!-- Nav -->
        <div class="js-nav-scroller hs-nav-scroller-horizontal mb-5" data-hs-nav-scroller-options="{
                         &quot;type&quot;: &quot;horizontal&quot;,
                         &quot;delay&quot;: 20
                       }">

                        <span class="hs-nav-scroller-arrow-backward" style="display: none;">
                      <a class="hs-nav-scroller-arrow-link" href="javascript:;">
                        <i class="tio-chevron-left"></i>
                      </a>
                    </span>

            <span class="hs-nav-scroller-arrow-forward" style="display: none;">
                      <a class="hs-nav-scroller-arrow-link" href="javascript:;">
                        <i class="tio-chevron-right"></i>
                      </a>
                    </span>

            <ul class="nav nav-tabs align-items-center">
                <li class="nav-item">
                    <a class="nav-link active disabled" href="#">Profile</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Lớp</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Bài tập</a>
                </li>
                <form action="Update" method="post">
                    <li class="nav-item ml-auto">
                        <a class="btn btn-sm btn-white mr-2" id="editBtn" onclick="changeProfileHtml()">
                            <i class="tio-edit mr-1" id="editProfileIcon"></i> <span
                                id="editProfile">Edit profile</span>
                        </a>
                        <button class="btn btn-sm btn-white mr-2" id="updateBtn" type="submit" style="display: none">
                            Save change
                        </button>
                        <a class="btn btn-icon btn-sm btn-white mr-2" href="#">
                            <i class="tio-format-points mr-1"></i>
                        </a>

                        <!-- Unfold -->
                        <div class="hs-unfold hs-nav-scroller-unfold">
                            <a class="js-hs-unfold-invoker btn btn-icon btn-sm btn-white" href="javascript:;"
                               data-hs-unfold-options="{
                               &quot;target&quot;: &quot;#profileDropdown&quot;,
                               &quot;type&quot;: &quot;css-animation&quot;
                             }" data-hs-unfold-target="#profileDropdown" data-hs-unfold-invoker="">
                                <i class="tio-more-vertical"></i>
                            </a>

                            <div id="profileDropdown"
                                 class="hs-unfold-content dropdown-unfold dropdown-menu dropdown-menu-right mt-1 hs-unfold-hidden hs-unfold-content-initialized hs-unfold-css-animation animated hs-unfold-reverse-y"
                                 data-hs-target-height="243" data-hs-unfold-content=""
                                 data-hs-unfold-content-animation-in="slideInUp"
                                 data-hs-unfold-content-animation-out="fadeOut" style="animation-duration: 300ms;">
                                <span class="dropdown-header">Settings</span>

                                <a class="dropdown-item" href="#">
                                    <i class="tio-share dropdown-item-icon"></i> Share profile
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="tio-blocked dropdown-item-icon"></i> Block page and profile
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="tio-info-outined dropdown-item-icon"></i> Suggest edits
                                </a>

                                <div class="dropdown-divider"></div>

                                <span class="dropdown-header">Feedback</span>

                                <a class="dropdown-item" href="#">
                                    <i class="tio-report-outlined dropdown-item-icon"></i> Report
                                </a>
                            </div>
                        </div>
                        <!-- End Unfold -->
                    </li>
            </ul>
        </div>
        <!-- End Nav -->

        <div class="row">
            <%--                        <div class="col-lg-4">--%>
            <%--                            <!-- Card -->--%>
            <%--                            <div class="card card-body mb-3 mb-lg-5">--%>
            <%--                                <h5>Complete your profile</h5>--%>

            <%--                                <!-- Progress -->--%>
            <%--                                <div class="d-flex justify-content-between align-items-center">--%>
            <%--                                    <div class="progress flex-grow-1">--%>
            <%--                                        <div class="progress-bar bg-primary" role="progressbar" style="width: 15%" aria-valuenow="15" aria-valuemin="0" aria-valuemax="100"></div>--%>
            <%--                                    </div>--%>
            <%--                                    <span class="ml-4">15%</span>--%>
            <%--                                </div>--%>
            <%--                                <!-- End Progress -->--%>
            <%--                            </div>--%>
            <%--                            <!-- End Card -->--%>

            <%--                            <!-- Card -->--%>
            <%--                            <div class="card mb-3 mb-lg-5">--%>
            <%--                                <!-- Header -->--%>
            <%--                                <div class="card-header">--%>
            <%--                                    <h2 class="card-header-title h5">Profile</h2>--%>

            <%--                                    <a class="btn btn-sm btn-white" href="account-settings.html">Edit</a>--%>
            <%--                                </div>--%>
            <%--                                <!-- End Header -->--%>

            <%--                                <!-- Body -->--%>
            <%--                                <div class="card-body">--%>
            <%--                                    <ul class="list-unstyled list-unstyled-py-3 text-dark mb-3">--%>
            <%--                                        <li class="py-0">--%>
            <%--                                            <small class="card-subtitle">About</small>--%>
            <%--                                        </li>--%>

            <%--                                        <li>--%>
            <%--                                            <i class="tio-user-outlined nav-icon"></i> Mark Williams--%>
            <%--                                        </li>--%>
            <%--                                        <li>--%>
            <%--                                            <i class="tio-briefcase-outlined nav-icon"></i> No department title--%>
            <%--                                        </li>--%>
            <%--                                        <li>--%>
            <%--                                            <i class="tio-city nav-icon"></i> Pixeel Ltd.--%>
            <%--                                        </li>--%>

            <%--                                        <li class="pt-2 pb-0">--%>
            <%--                                            <small class="card-subtitle">Contacts</small>--%>
            <%--                                        </li>--%>

            <%--                                        <li>--%>
            <%--                                            <i class="tio-online nav-icon"></i> mark@example.com--%>
            <%--                                        </li>--%>
            <%--                                        <li>--%>
            <%--                                            <i class="tio-android-phone-vs nav-icon"></i> +1 (555) 752-01-10--%>
            <%--                                        </li>--%>

            <%--                                        <li class="pt-2 pb-0">--%>
            <%--                                            <small class="card-subtitle">Teams</small>--%>
            <%--                                        </li>--%>

            <%--                                        <li class="font-size-sm text-body">--%>
            <%--                                            <i class="tio-group-equal nav-icon"></i> You are not a member of any teams--%>
            <%--                                        </li>--%>
            <%--                                        <li class="font-size-sm text-body">--%>
            <%--                                            <i class="tio-briefcase-outlined nav-icon"></i> You are not working on any projects--%>
            <%--                                        </li>--%>
            <%--                                    </ul>--%>
            <%--                                </div>--%>
            <%--                                <!-- End Body -->--%>
            <%--                            </div>--%>
            <%--                            <!-- End Card -->--%>

            <%--                            <!-- Card -->--%>
            <%--                            <div class="card card-lg mb-3 mb-lg-5">--%>
            <%--                                <!-- Body -->--%>
            <%--                                <div class="card-body text-center">--%>
            <%--                                    <div class="w-50 mx-auto mb-4">--%>
            <%--                                        <img class="img-fluid" src="<c:url value="/resource/img/unlock.svg"></c:url>" alt="Image Description">--%>
            <%--                                    </div>--%>

            <%--                                    <div class="mb-3">--%>
            <%--                                        <h3>2-step verification</h3>--%>
            <%--                                        <p>Protect your account now and enable 2-step verification in the settings.</p>--%>
            <%--                                    </div>--%>

            <%--                                    <a class="btn btn-primary" href="account-settings.html#twoStepVerificationSection">Enable Now</a>--%>
            <%--                                </div>--%>
            <%--                                <!-- End Body -->--%>
            <%--                            </div>--%>
            <%--                            <!-- End Card -->--%>
            <%--                        </div>--%>

            <div class="col-lg-8">
                <!-- Card -->
                <c:forEach items="${lsDTO}" var="lsDTO">
                    <%--                            <div class="card-body">--%>
                    <div class="row">
                        <div class="col-sm-3">
                            <h6 class="mb-0">Full Name</h6>
                        </div>
                        <div class="col-sm-9 text-secondary">
                            <span style="display: block;" id="name">${lsDTO.name}</span>
                            <input type="text" value="${lsDTO.name}" name="name" id="nameInput" style="display: none;"
                                   class="form-control"/>
                        </div>
                    </div>
                    <br/>
                    <div class="row">
                        <div class="col-sm-3">
                            <h6>Age</h6>
                        </div>
                        <div class="col-sm-9 text-secondary">
                            <span style="display: block;" id="age">${lsDTO.age}</span>
                            <input type="number" value="${lsDTO.age}" name="age" id="ageInput" style="display: none;"
                                   class="form-control"/>
                        </div>
                    </div>
                    <br/>
                    <div class="row" id="username">
                        <div class="col-sm-3">
                            <h6>Email</h6>
                        </div>
                        <div class="col-sm-9 text-secondary">
                            <span style="display: block;">${username}</span>
                        </div>
                    </div>
                    <br/>
                    <div class="row">
                        <div class="col-sm-3">
                            <h6>Phone</h6>
                        </div>
                        <div class="col-sm-9 text-secondary">
                            <span style="display: block;" id="phone">${lsDTO.sdt}</span>
                            <input type="text" value="${lsDTO.sdt}" name="phone" id="phoneInput" style="display: none;"
                                   class="form-control"/>
                        </div>
                    </div>
                    <br/>
                    <div class="row">
                        <div class="col-sm-3">
                            <h6 class="mb-0">Address</h6>
                        </div>
                        <div class="col-sm-9 text-secondary">
                            <span style="display: block" id="address">${lsDTO.address}</span>
                            <input type="text" value="${lsDTO.address}" name="address" id="addressInput"
                                   style="display: none;" class="form-control"/>
                        </div>
                    </div>
                </c:forEach>
                </form>
                <%--                     End Card --%>
                <%--                        </div>--%>
            </div>
        </div>
    </div>
    </div>

    <!-- Footer -->

    <div class="footer">
        <div class="row justify-content-between align-items-center">
            <div class="col">
                <p class="font-size-sm mb-0">&copy; Front. <span
                        class="d-none d-sm-inline-block">2020 Htmlstream.</span></p>
            </div>
            <div class="col-auto">
                <div class="d-flex justify-content-end">
                    <!-- List Dot -->
                    <ul class="list-inline list-separator">
                        <li class="list-inline-item">
                            <a class="list-separator-link" href="#">FAQ</a>
                        </li>

                        <li class="list-inline-item">
                            <a class="list-separator-link" href="#">License</a>
                        </li>

                        <li class="list-inline-item">
                            <!-- Keyboard Shortcuts Toggle -->
                            <div class="hs-unfold">
                                <a class="js-hs-unfold-invoker btn btn-icon btn-ghost-secondary rounded-circle"
                                   href="javascript:;" data-hs-unfold-options='{
                              "target": "#keyboardShortcutsSidebar",
                              "type": "css-animation",
                              "animationIn": "fadeInRight",
                              "animationOut": "fadeOutRight",
                              "hasOverlay": true,
                              "smartPositionOff": true
                             }'>
                                    <i class="tio-command-key"></i>
                                </a>
                            </div>
                            <!-- End Keyboard Shortcuts Toggle -->
                        </li>
                    </ul>
                    <!-- End List Dot -->
                </div>
            </div>
        </div>
    </div>

    <!-- End Footer -->
</main>

<!-- JS Implementing Plugins -->
<script src="<c:url value="/resource/js/vendor.min.js"></c:url>"></script>
<script src="<c:url value="/resource/js/theme.min.js"></c:url>"></script>
<script src="<c:url value="/resource/js/index.js"></c:url>"></script>

<%--    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>--%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.3.0/jquery.form.min.js"
        integrity="sha384-qlmct0AOBiA2VPZkMY3+2WqkHtIQ9lSdAsAn5RUJD/3vA5MKDgSGcdmIv4ycVxyn"
        crossorigin="anonymous"></script>
<script>
    function changeProfileHtml() {
        var nameInput = document.getElementById("nameInput");
        var name = document.getElementById("name");
        var ageInput = document.getElementById("ageInput");
        var age = document.getElementById("age");
        var username = document.getElementById("username");
        var sdtInput = document.getElementById("phoneInput");
        var sdt = document.getElementById("phone");
        var addressInput = document.getElementById("addressInput");
        var address = document.getElementById("address");
        var editProfileIcon = document.getElementById("editProfileIcon");
        var editProfile = document.getElementById("editProfile");
        var updateBtn = document.getElementById("updateBtn");

        editProfileIcon.style.display = "none";
        editProfile.innerHTML = 'Save Change';
        name.style.display = "none";
        username.style.display = "none";
        nameInput.style.display = "block";
        age.style.display = "none";
        ageInput.style.display = "block";
        sdt.style.display = "none";
        sdtInput.style.display = "block";
        addressInput.style.display = "block";
        address.style.display = "none";
        updateBtn.style.display = "";
        document.getElementById("editBtn").style.display = "none";
    }
</script>

</body>

</html>