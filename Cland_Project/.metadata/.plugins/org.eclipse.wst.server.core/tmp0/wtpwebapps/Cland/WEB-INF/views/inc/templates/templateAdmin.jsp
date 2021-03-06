<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!--  chú ý dùng tile khi ghép giao diện -->
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<!-- header -->
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Admin Theme v3</title>

<c:url value="/resources" var="contextPath" scope="application"></c:url>

<link rel="shortcut icon" type="image/ico"
	href="${contextPath}/admin/images/icon-180x180.png" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="${contextPath}/admin/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- styles -->
<link href="https://fonts.googleapis.com/css?family=Lobster"
	rel="stylesheet">
<link href="${contextPath}/admin/css/style1.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div class="header">
		<div class="container">
			<div class="row">

				<tiles:insertAttribute name="header"></tiles:insertAttribute>


			</div>
		</div>
	</div>
	<!-- /.header -->
	<div class="page-content">
		<div class="row">
			<div class="col-md-2">
				<div class="sidebar content-box" style="display: block;">
					<!-- Nav-bar -->


					<tiles:insertAttribute name="sideBar"></tiles:insertAttribute>


					<!-- /.nav-bar -->
				</div>
			</div>
			<div class="col-md-10">

				<tiles:insertAttribute name="body"></tiles:insertAttribute>

			</div>
			<!-- /.col-md-10 -->
		</div>
		<!-- /.row -->
	</div>
	<!-- /.page-content -->

	<!-- Footer -->
	<footer>
		<div class="container">

			<tiles:insertAttribute name="footer"></tiles:insertAttribute>

		</div>
	</footer>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://code.jquery.com/jquery.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="${contextPath}/admin/bootstrap/js/bootstrap.min.js"></script>
	<script src="${contextPath}/admin/js/custom.js"></script>
</body>
</html>
<!-- /.footer -->