<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="org.springframework.security.web.servletapi.*" %>

<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_MISSCONSULT')" var="isManageMC"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_COMPANY')" var="isManageCompany"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_CANDIDATE')" var="isManageCandidate"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_SEARCH_REPORT')" var="isManageSearchReport"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_SERIES')" var="isManageSeries"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_TEST')" var="isManageTest"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_DOWNLOAD')" var="isManageDownload"/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_MANAGE_MISSCONSULT_REPORT_MANAGEMENT')" var="isManageReportManagement"/> 
<sec:authentication var="myUser" property="principal.myUser"/>
<html>
<head>
<meta charset="UTF-8">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="robots" content="all">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"/>
<link href="<c:url value="/resources/register/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/register/css/bootstrap-responsive.css" />" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/register/css/style.css" />" media="all" />
<link href="<c:url value="/resources/register/material/css/ripples.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/register/material/css/material-wfont.min.css" />" rel="stylesheet">

<title>Bizclub</title>
</head>
<body>
<div id="top_menu">
	<div id="box_top">
		<div class="row">
    	<div class="col-md-2" style="padding:10px 0 0 50px;"><img src="<c:url value="/resources/register/images/logo.png" />"></div>
        <div class="col-md-7" style="z-index: 9; position: relative;">                
        	<nav id="nav" role="navigation">
                <a href="#nav" title="Show navigation">Show navigation</a>
                <a href="#" title="Hide navigation">Hide navigation</a>
                <ul >
                    <li><a href="<c:url value="/" />">หน้าแรก</a></li>
                    <li>
                        <a href="#" aria-haspopup="true"><span>ข้อมูลทางการค้า </span></a>
                        <ul>
                            <li><a href="<c:url value="/product/" />">ผลิตภัณฑ์</a></li>
                            <li><a href="<c:url value="/product/" />">บริการ</a></li>
                        </ul>
                    </li>
                    <li><a href="#" >ข่าวประชาสัมพันธ์</a></li>
                    <li><a href="#">ระบบรายงาน</a></li>
                    <li><a href="<c:url value="/member/" />">ระบบสมาชิก</a></li>
                    <c:if test="${myUser.userid==1}">
                     <li><a href="<c:url value="/approve/" />">อนุมัติผู้ใช้งาน</a></li>
                    </c:if>
                    <li><a href="#">ติดต่อเรา</a></li>
                </ul>
            </nav>
        </div>
    </div>
	<div class="col-md-6 col-md-offset-3 visible-xs" style="margin-top: -30px; margin-left: 60px; z-index: 99; position: relative;">
		<div class="form-group">
		    <div class="input-group">
		        <input class="form-control textsize" id="inputWarning" type="text" placeholder="Search" style="background-color: #fff;">
		        <span class="input-group-btn">
		            <button class="btn btn-material-indigo" type="button" style="padding: 2px 10px 2px 10px; font-weight: bold; font-size: 18px; margin-left: -5px; ">Search</button>
		        </span>
		    </div>
		</div>
	</div>
    <div class="col-md-6 col-md-offset-3 hidden-xs">
		<div class="form-group">
		    <div class="input-group style-5">
		        <input type="search" placeholder="search">
		        <span class="input-group-btn">
					<button type="submit" class="btn btn-material-indigo" style="font-weight: bold; font-size: 22px; margin-top: -15px;">Search</button>
				</span>
		    </div>
		</div>
	</div>
</div>
</div>