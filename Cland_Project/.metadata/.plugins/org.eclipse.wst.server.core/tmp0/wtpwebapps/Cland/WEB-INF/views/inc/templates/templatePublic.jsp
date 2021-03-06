<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>		<!--  chú ý dùng tile khi ghép giao diện -->
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
<title>CLand | VinaEnter Edu</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!--Oswald Font -->
	<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>

		<c:url value="/resources" var="contextPath" scope="application"></c:url>
	
	<link rel="stylesheet" type="text/css" href="${contextPath}/public/css/tooltipster.css" />
		<!-- home slider-->
	<link href="${contextPath}/public/css/pgwslider.css" rel="stylesheet">
		<!-- Font Awesome -->
	<link rel="stylesheet" href="${contextPath}/public/css/font-awesome.min.css">
	<link href="${contextPath}/public/style.css" rel="stylesheet" media="screen">
	<link href="${contextPath}/public/responsive.css" rel="stylesheet" media="screen">
</head>

<body>
	<section id="header_area">
	<div class="wrapper header">
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</div>
	</section>

	<section id="content_area">
	<div class="clearfix wrapper main_content_area">

		<div class="clearfix main_content floatleft">


				<tiles:insertAttribute name="body"></tiles:insertAttribute>


		</div>
		<div class="clearfix sidebar_container floatright">
			<div class="clearfix sidebar">
			
				<tiles:insertAttribute name="sideBar"></tiles:insertAttribute>
				
			</div>
		</div>
	</div>
	</section>
	<section id="footer_bottom_area">
	<div class="clearfix wrapper footer_bottom">
	
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
		
	</div>
	</section>

	<script type="text/javascript"
		src="http://code.jquery.com/jquery-1.7.0.min.js"></script>
	<script type="text/javascript" src="${contextPath}/public/js/jquery.tooltipster.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('.tooltip').tooltipster();
		});
	</script>
	<script type="text/javascript" src="${contextPath}/public/js/selectnav.min.js"></script>
	<script type="text/javascript">
		selectnav('nav', {
			label : '-Navigation-',
			nested : true,
			indent : '-'
		});
	</script>
	<script src="${contextPath}/public/js/pgwslider.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('.pgwSlider').pgwSlider({

				intervalDuration : 5000

			});
		});
	</script>
	<script type="text/javascript" src="${contextPath}/public/js/placeholder_support_IE.js"></script>
</body>
</html>


