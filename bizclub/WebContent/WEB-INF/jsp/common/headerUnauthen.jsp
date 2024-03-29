<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>

<sec:authorize access="hasAnyRole('ROLE_ADMIN')" var="isAdmin"/>
<sec:authorize access="hasAnyRole('ROLE_STAFF')" var="isStaff"/>
<sec:authorize access="hasAnyRole('ROLE_MEMBER')" var="isMember"/>
<sec:authorize access="isAuthenticated()" var="isAuthen"/> 
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
<link href="<c:url value='/resources/fileupload/css/jquery.fileupload.css'/>" type="text/css"  rel="stylesheet" /> 
<title>Bizclub</title>
</head>
<body>
<c:url value="/register" var="registerUrl" />
<script>
  function goRegister(){
    	  window.location.href="${registerUrl}";
      }
  </script>
<div id="top_menu">
	<div id="box_top">
		<div class="row">
	    	<div class="col-md-2" style="padding:5px 0 0 50px;"><a href="<c:url value="/" />"><img src="<c:url value="/resources/register/images/logo.png" />"></a></div>
	        <div class="col-md-10" style="z-index: 9; position: relative;">                
				<div id='cssmenu' style="font-size: 18px;float: right;">
					<ul>
					   <li class='active'><a href='<c:url value="/" />'>หน้าแรก</a></li>
					 <%--  <li><a href='#'>ต่อยอดธุรกิจ</a></li>  --%>
					   <li><a href='<c:url value="/product" />'>ข้อมูลเครือข่าย</a></li>
					   <li><a href='<c:url value="/news" />'>ข่าวประชาสัมพันธ์</a></li>
					   <li><a href='<c:url value="/login" />'>ระบบสมาชิก</a></li>
					   <%--   <li><a href='#'>ระบบรายงาน</a></li> --%>
					   <%--  <li><a href='<c:url value="/approve" />'>อนุมัติผู้ใช้งาน</a></li> --%>
					   <li><a href='#'>ติดต่อเรา</a></li>
					   <%-- <li><a href='#'>ตั้งค่าระบบ</a></li> --%>
					</ul>
				</div>
			</div>
		</div>
		<div class="col-md-6 col-md-offset-3 visible-xs" style="margin-top: -40px; margin-right:80px; z-index: 99; position: relative;">
			<div class="form-group">
			    <div class="input-group">
			        <input class="form-control textsize" id="inputWarning" type="text" placeholder="Search" style="background-color: #fff;">
			        <span class="input-group-btn">
			            <button class="btn btn-material-indigo" type="button" style="padding: 2px 10px 2px 10px; font-weight: bold; font-size: 18px; margin-left: -5px; ">Search</button>
			        </span>
			    </div>
			</div>
		</div>
	    <div class="col-md-6 col-md-offset-3 hidden-xs" style="margin-top: -25px;">
			<div class="form-group">
			    <div class="input-group style-5">
			        <input type="search" placeholder="search">
			        <span class="input-group-btn">
						<button type="submit" class="btn btn-material-indigo" style="font-weight: bold; font-size: 18px; margin-top: -17px;">Search</button>
					</span>
					  <c:if test="${isAuthen!=true}">
					<span class="input-group-btn">
                        <button type="button"  onclick="goRegister()"  class="btn btn-material-amber-A200" style="font-weight: bold; font-size: 20px; margin: -17px 0px 0px 10px; padding: 6px 15px 6px 15px;">Sign up</button>
                    </span>
                    </c:if>
			    </div>
			</div>
		</div>
	</div>
</div>
