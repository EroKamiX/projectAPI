<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="layoutSidenav_nav">
    <nav class="sb-sidenav accordion sb-sidenav-dark"
         id="sidenavAccordion">
        <div class="sb-sidenav-menu">
            <div class="nav">
                <div class="sb-sidenav-menu-heading">Core</div>
                <a class="nav-link" href="/projectAPI_war/admin/index">
                    <div class="sb-nav-link-icon">
                        <i class="fas fa-tachometer-alt"></i>
                    </div>
                    Dashboard
                </a>
            </div>
            <div class="nav">
                <div class="sb-sidenav-menu-heading">Table</div>
                <a class="nav-link" href="/projectAPI_war/admin/teachers">
                    <div class="sb-nav-link-icon">
                        <i class="fas fa-table"></i>
                    </div>
                    Teacher
                </a>
                <a class="nav-link" href="/projectAPI_war/admin/students">
                    <div class="sb-nav-link-icon">
                        <i class="fas fa-table"></i>
                    </div>
                    Students
                </a>
                <a class="nav-link" href="/projectAPI_war/admin/classes">
                    <div class="sb-nav-link-icon">
                        <i class="fas fa-table"></i>
                    </div>
                    Classes
                </a>
                <a class="nav-link" href="/projectAPI_war/admin/subjects">
                    <div class="sb-nav-link-icon">
                        <i class="fas fa-table"></i>
                    </div>
                    Subjects
                </a>
                <a class="nav-link" href="/projectAPI_war/admin/learning">
                    <div class="sb-nav-link-icon">
                        <i class="fas fa-table"></i>
                    </div>
                    Learning
                </a>
                <a class="nav-link" href="/projectAPI_war/admin/users">
                    <div class="sb-nav-link-icon">
                        <i class="fas fa-table"></i>
                    </div>
                    Users
                </a>
            </div>
        </div>
        <div class="sb-sidenav-footer">
            <div class="small">Logged in as:</div>
            Start Bootstrap
        </div>
    </nav>
</div>