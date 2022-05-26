<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<header id="header" class="navbar navbar-expand-lg navbar-bordered flex-lg-column px-0">
    <div class="navbar-dark w-100">
        <div class="container">
            <div class="navbar-nav-wrap">
                <div class="navbar-brand-wrapper">
                    <!-- Logo -->
                    <a class="navbar-brand" href="./index.jsp" aria-label="Front">
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

                                    <a class="dropdown-item my-2" href="./index.jsp">
                                        <div class="media align-items-center">
                                                <span class="icon icon-xs icon-soft-dark icon-circle mr-2">
                        <i class="tio-tune"></i>
                      </span>

                                            <div class="media-body text-truncate">
                                                <span>How to set up Gulp?</span>
                                            </div>
                                        </div>
                                    </a>

                                    <a class="dropdown-item my-2" href="./index.jsp">
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
                                <a class="card-footer text-center" href="./index.jsp">
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
                                        <img class="avatar-img" src=" <c:url value="/resource/img/img6.jpg"></c:url>"
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
                                                     src=" <c:url value="/resource/img/img6.jpg"></c:url>"
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
                                <i class="tio-earth-east nav-icon"></i> Menu
                            </a>

                            <!-- Dropdown -->
                            <ul id="navLinkDashboardsDropdown"
                                class="hs-sub-menu dropdown-menu dropdown-menu-lg hs-sub-menu-desktop-lg animated"
                                aria-labelledby="dashboardsDropdown"
                                style="min-width: 16rem; animation-duration: 300ms;">
                                <li>
                                    <a class="dropdown-item" href="/projectAPI_war/index">
                                        <span class="tio-circle nav-indicator-icon"></span> Môn Học
                                    </a>
                                </li>
<%--                                <li>--%>
<%--                                    <a class="dropdown-item" href="/projectAPI_war/${urlToClasse}/index?monhoc=${monhoc}">--%>
<%--                                        <span class="tio-circle nav-indicator-icon"></span> Lớp--%>
<%--                                    </a>--%>
<%--                                </li>--%>
                                <c:if test="${urlToClasse.equals('Teacher')}">
                                    <li>
                                        <a class="dropdown-item" href="/projectAPI_war/${urlToClasse}/addBaiTap">
                                            <span class="tio-circle nav-indicator-icon"></span> Thêm bài tập
                                        </a>
                                    </li>
                                </c:if>
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

