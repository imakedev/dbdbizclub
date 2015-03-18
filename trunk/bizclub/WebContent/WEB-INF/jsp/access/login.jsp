<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="robots" content="all">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"/>
<link href="<c:url value="/resources/register/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/register/css/bootstrap-responsive.css" />" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/register/css/style.css" />" media="all" />
<link href="<c:url value="/resources/register/material/css/ripples.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/register/material/css/material-wfont.min.css" />" rel="stylesheet">
<script type="text/javascript" src="<c:url value="/resources/register/js/jssor.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/register/js/jssor.slider.js" />"></script>
<title>Bizclub</title>
</head>
<body>
<div id="top_menu">
	<div id="box_top">
		<div class="row">
    	<div class="col-md-2" style="padding:10px 0 0 50px;"><a href="<c:url value="/" />"><img src="<c:url value="/resources/register/images/logo.png" />"></a></div>
	</div>
</div>
</div>
<!-- -------------------------------------------------------------------------------------------------------------------------------- -->
<div style="background:#fff; padding:20px 0 20px 0;">
	<div class="container">
	<div class="blog col-md-5 col-md-offset-3">
		<h3 style="text-align: center; font-weight: bold;">Login</h3>
		<div class="col-md-12">
		 <c:url value="/j_spring_security_check" var="security_check"/>
      		  <form  id="form" class="form-horizontal"  name="form" method="post" action="${security_check}" >
			    <fieldset>
			    	<div class="form-group has-warning">
			        	<label class="col-md-2 control-label" style="color: #fff; margin-top: 10px;">Username: </label>
			            <div class="col-md-10">
			                <input class="form-control text" id="username"  name="j_username"  type="text" value="" placeholder="Username" style="background-color: #fff;">
			            </div>
			        </div>
			        <div class="form-group has-warning">
			        	<label class="col-md-2 control-label" style="color: #fff; margin-top: 10px; ">Password: </label>
			            <div class="col-md-10">
			                <input class="form-control text" id="password" name="j_password" type="password" value="" placeholder="Password" style="background-color: #fff;">
			            </div>
			        </div>
			        <div class="form-group">
			            <div class="col-md-10 col-md-offset-5">
			                <button class="btn btn-material-orange btn_popup" type="submit" style="margin-left: -20px;">login</button>
			            </div>
			        </div>
			        <br>
			        <div class="form-group">
				        <div class="col-md-7">
				        	<a href="#" style="float: left; color: #fff;">forget your password?</a>
				        </div>
				        <div class="col-md-4">
				        <button type="button" onclick="goRegister()" class="btn btn-material-orange btn_popup" 
				        style="float: right; color: #fff; text-align: right; padding: 0px 10px 0px 10px; margin-top: -5px;">Sign Up</button>
				        
				        </div>
				        <div class="col-md-1">
				        	<a href="#" style="text-decoration: none; float: right;"><span class="mdi-action-info-outline" style="color: #fff;"></span></a>
				        </div>
			        </div>
			    </fieldset>
			</form>
		</div>
	</div>
</div>
</div>
<c:url value="/register" var="registerUrl" />"
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
<script>
      $(document).ready(function() {
          $.material.init();
      });
      function goRegister(){
    	  window.location.href="${registerUrl}";
      }
</script>
<style>
body{
	font-family: 'th_k2d_july8regular';
}
</style>
</body>
</html>