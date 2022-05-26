<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1 class="mt-4">User</h1>
<ol class="breadcrumb mb-4">
    <li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
    <li class="breadcrumb-item active">Add Learning</li>
</ol>
<a href="/projectAPI_war/admin/users/add" class="btn btn-primary">Add User</a>
<div class="card mb-4">
    <div class="card-body">
        DataTables is a third party plugin that is used to generate the
        demo table below. For more information about DataTables, please
        visit the <a target="_blank" href="https://datatables.net/">official
        DataTables documentation</a> .
    </div>
</div>
<div class="card mb-4">
    <div class="card-header">
        <i class="fas fa-table me-1"></i> DataTable User
    </div>