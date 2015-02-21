<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<html>
<head>
<title>BizClub</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="robots" content="all">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"/>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/register/css/style.css" />" media="all" />
<link href="<c:url value="/resources/register/material/css/ripples.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/register/material/css/material-wfont.min.css" />" rel="stylesheet">

<!-- Le styles -->
<link href="<c:url value="/resources/register/css/bootstrap.css" />" rel="stylesheet">
<link href="<c:url value="/resources/register/css/bootstrap-responsive.css" />" rel="stylesheet">
<!--<script src="js/jquery.min.js"></script>-->
<script type="text/javascript" src="<c:url value="/resources/register/js/jquery.min.js" />"></script>
<!-- <script type="text/javascript" src="js/jssor.js"></script> -->
<!-- <script type="text/javascript" src="js/jssor.slider.js"></script> -->
<script src="<c:url value="/resources/register/material/js/ripples.min.js" />"></script>
<script src="<c:url value="/resources/register/material/js/material.min.js" />"></script>

<!--//-->
<!-- <link rel="stylesheet" href="css/responsivemobilemenu.css" type="text/css"/> -->
<!-- <script type="text/javascript" src="js/responsivemobilemenu.js"></script> -->

</head>
<body >
<div id="top_menu">
	<div id="box_top" class="container">
    	<div class="span4" style="padding:10px 0 0 20px;"><img src="<c:url value="/resources/register/images/logo.png" />"></div>
        <div class="span7">                
        	<nav id="nav" role="navigation">
                <a href="#nav" title="Show navigation">Show navigation</a>
                <a href="#" title="Hide navigation">Hide navigation</a>
                <ul >
                    <li><a href="<c:url value="/" />">หน้าแรก</a></li>
                    <li>
                        <a href="#" aria-haspopup="true"><span>ข้อมูลทางการค้า</span></a>
                        <ul>
                            <li><a href="#">ผลิตภัณฑ์</a></li>
                            <li><a href="#">บริการ</a></li>
                        </ul>
                    </li>
                    <li><a href="#" >ข่าวประชาสัมพันธ์</a></li>
                    <li><a href="#">ระบบรายงาน</a></li>
                    <li><a href="<c:url value="/page/searchmember" />">ระบบสมาชิก</a></li>
                    <li><a href="#">ติดต่อเรา</a></li>
                </ul>
            </nav>
        </div>
    </div>    
</div>
<div style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin: 0 auto;">
          <form class="form-inline" role="form">
		    <fieldset>
		    	<legend>Register <i class="mdi-image-navigate-next"></i>Profile</legend>
		        <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;">First Name: <span style="color: red;">*</span></label>
		            <div class="span3" style="padding-bottom: 10px;">
		                <input class="form-control" id="fname" placeholder="First Name" type="text">
		            </div>
		            <label class="span2 control-label" style="padding-bottom: 10px;">Last Name: <span style="color: red;">*</span></label>
		            <div class="span3" style="padding-bottom: 10px;">
		                <input class="form-control" id="lname" placeholder="Last Name" type="text">
		            </div>
		        </div>
		        <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;">Birthday: <span style="color: red;">*</span></label>
		            <div class="span3" style="padding-bottom: 10px;">
		                <input class="form-control" id="bd" placeholder="Birthday" type="date">
		            </div>
		        </div>
    		    <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;">image file: <span style="color: red;">*</span></label>
		            <div class="span3" style="padding-bottom: 10px;">
		                <input readonly="" class="form-control floating-label" placeholder="Browse..." type="text">
                		<input id="inputFile" multiple="" type="file">
		            </div>
		        </div>
		        <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;">Address: <span style="color: red;">*</span></label>
		            <div class="span3" style="padding-bottom: 10px;">
		                <textarea class="form-control" id="Address" placeholder="Address"></textarea>
		            </div>
		        </div>
		        <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;">Gender:<span style="color: red;">*</span></label>
		            <div class="span3" style="padding-bottom: 10px;">
		                <div class="radio radio-primary">
		                    <label>
		                        <input name="optionsRadios" id="optionsRadios1" value="option1" checked="" type="radio">
		                        Male
		                    </label>
		                </div>
		                <div class="radio radio-primary">
		                    <label>
		                        <input name="optionsRadios" id="optionsRadios2" value="option2" type="radio">
		                        Female
		                    </label>
		                </div>
		            </div>
		        </div>
		        <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;"></label>
		            <div class="span3" style="padding-bottom: 10px;">
		                <p></p>
		            </div>
		        </div>
		        <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;">E-mail: <span style="color: red;">*</span></label>
		            <div class="span3" style="padding-bottom: 10px;">
		                <input class="form-control" id="email" placeholder="E-mail" type="email">
		                <span style="font-size:10px; color: red;">(@gmail only)</span>
		            </div>
		        </div>
		        <div class="form-group">
		            <label class="span11 control-label" style="padding-bottom: 10px;"></label>
		        </div>
		        <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;">Phone Number: <span style="color: red;">*</span></label>
		            <div class="span3" style="padding-bottom: 100px;">
		                <input class="form-control" id="phone" placeholder="Phone Number" type="text">
		            </div>
		        </div>
		        
		        <legend>Register <i class="mdi-image-navigate-next"></i>Career</legend>
		        <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;">Company Name: <span style="color: red;">*</span></label>
		            <div class="span9" style="padding-bottom: 10px;">
		                <input class="form-control" id="cname" placeholder="Company Name" type="text">
		            </div>
		        </div>
                <div class="form-group">
		            <label for="select" class="span2 control-label" style="padding-bottom: 10px;">Business Type: <span style="color: red;">*</span></label>
		            <div class="span9" style="padding-bottom: 10px;">
		                <select class="" id="">
		                    <option>1</option>
		                    <option>2</option>
		                    <option>3</option>
		                    <option>4</option>
		                    <option>5</option>
		                </select>
		            </div>
		        </div>
		         <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;">Nature of Business:</label>
		            <div class="span9" style="padding-bottom: 10px;">
		                <textarea class="form-control" id="business" placeholder="Nature of Business"></textarea>
		            </div>
		        </div>
		        <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;">Address: <span style="color: red;">*</span></label>
		            <div class="span9" style="padding-bottom: 10px;">
		                <textarea class="form-control" id="Address1" placeholder="Address"></textarea>
		            </div>
		        </div>
		        <div class="form-group">
		            <label class="span2 control-label" style="padding-bottom: 10px;">Certificate: <span style="color: red;">*</span></label>
		            <div class="span9" style="padding-bottom: 10px;">
		                <textarea class="form-control" id="certificate" placeholder="Certificate"></textarea>
		            </div>
		        </div>
		        <div class="form-group">
		            <div class="span9 offset2">
		                <button class="btn btn-default">Cancel</button>
		                <a href="Approve.html" type="button" class="btn btn-primary" data-toggle="modal" data-target="#approve-popup">Register</a>
		            </div>
		        </div>
       		</fieldset>
		</form>
     </div>
   </div>
<!-- ----------------------------------approve-popup------------------------------------------------------------- -->
<div id="approve-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
      <div class="modal-body">
      	<form class="form-horizontal">
			<fieldset>
	          	<div class="form-group">
		            <label class="span10 offset1 control-label" style="text-align: center; font-size: 18px;">กรุณารอการอนุมัติผ่านทางemail</label>
	        	</div>
	      	</fieldset>
	      </form>
      </div>
      <div class="modal-footer">
        <button class="btn btn-material-blue-700 btn-xs" data-dismiss="modal">ok</button>
      </div>
    </div>
  </div>
</div>
<!-- --------------------------------------------------------------------------- -->

<div id="footer">
	<div class="container">
	<div id="footer_body" class="clear">
        <div  class="box_contact">
            <div  class="topic_contact">สำนักพัฒนาผู้ประกอบธุรกิจ กรมพัฒนาธุรกิจการค้า กระทรวงพาณิชย์</div>
            <div>เลขที่ 44/100 ถนน นนทบุรี 1 ต.บางกระสอ อ.เมือง จ.นททบุรี 11000</div>
            <div>โทรศัพท์: 02-547-5962</div>
            <div>โทรสาร: 02-547-5963-64</div>
            <div>email: training@dbd.go.th</div>
        </div>
        <div style="float:right;width:300px;" >
        	<div  style="text-align:right;">
            	<a href="#"><img src="<c:url value="/resources/register/images/btn_f.png" />"></a>&nbsp;<a href="#"><img src="<c:url value="/resources/register/images/btn_t.png" />"></a>
            </div>
        </div>
    </div>
    </div>
</div>
</body>
</html>

<script>
     $(document).ready(function() {
         $.material.init();
     });
</script>