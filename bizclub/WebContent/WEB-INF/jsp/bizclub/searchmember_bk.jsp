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
<script type="text/javascript" src="<c:url value="/resources/register/js/jssor.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/register/js/jssor.slider.js" />"></script>
<script src="<c:url value="/resources/register/material/js/ripples.min.js" />"></script>
<script src="<c:url value="/resources/register/material/js/material.min.js" />"></script>

<!--//-->
<link rel="stylesheet" href="<c:url value="/resources/register/css/responsivemobilemenu.css" />" type="text/css"/>
<script type="text/javascript" src="<c:url value="/resources/register/js/responsivemobilemenu.js" />"></script>

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
		    	<div class="form-group">
		            <label for="select" class="control-label" style="float: left;">Business Type:</label>
		            <div class="span3" style="padding-bottom: 10px;">
		                <select class="" id="">
		                    <option>--All--</option>
		                    <option>type A</option>
		                    <option>type B</option>
		                    <option>type C</option>
		                    <option>type D</option>
		                </select>
		            </div>
		        </div>
		        <div class="form-group">
		            <label for="select" class="span1 control-label">Search By:</label>
		            <div class="span3" style="padding-bottom: 10px;">
		                <select class="" id="">
		                    <option>--All--</option>
		                    <option>ID Number</option>
		                    <option>ID Member</option>
		                    <option>Name</option>
		                    <option>Company Name</option>
		                
		                </select>
		            </div>
		        </div>
		        <div class="form-group">
		            <div class="span3">
		                <input class="input-large search-query" id="search" placeholder="search" type="text" style="">
		                <a href="#" style="text-decoration : none;"><i class="mdi-action-search"></i></a> 
		            </div>
		        </div>
	        </fieldset>
	      </form>
	      <div class="row">
	      	<div class="span8 offset2">
		      <div class="jumbotron">
		      	<div class="row">
		      		<div class="span2"><img src="<c:url value="/resources/register/images/5.png" />" class="img-thumbnail" data-src="<c:url value="/resources/register/holder.js/200x150" />"></div>
		      		<div class="span5">
		      			<form class="form-inline" role="form">
						    <fieldset>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">เลขที่สมาชิก: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="member" type="text" value="000001" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">ชื่อ-สกุล: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="name" type="text" value="นพทัต บุณยเกียรติ" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">ลักษณะธุรกิจ: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="type" type="text" value="นิติบุคคล" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">เลขทะเบียนนิติบุคคล: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="idperson" type="text" value="0105553116201" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">ชื่อนิติบุคคล/ชื่อทางการค้า: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="bcName" type="text" value="บจ.ดรีมจ๊อคกี้" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">สินค้า/บริการ: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="item" type="text" value="รับผลิตสื่อวิดีทัศน์, สื่อประชาสัมพันธ์-โฆษณาครบวงจร" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">Website: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="Website" type="text" value="http://www.dreamjockey.co.th" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">Email: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="Email" type="text" value="filmbug@hotmail.com" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">เบอร์โทรศัพท์: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="phone" type="text" value="081 567 5403" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">Line: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="line" type="text" value="Tode Dream Jockey" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">ประเภทธุรกิจ: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						            	<textarea rows="2" cols="" class="form-control" disabled="disabled"> ธุรกิจบริการ</textarea>
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">เกี่ยวข้องในธุรกิจ: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="" type="text" value="เจ้าของธุรกิจ ตำแหน่งกรรมการผู้จัดการ" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">ที่อยู่: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						            	<textarea rows="3" cols="" class="form-control" disabled="disabled"> 542/36 ซ.สหการประมูล (สถานทูตลาว) ถนนประชาอุทิศ แขวงวังทองหลาง เขตวังทองหลาง </textarea>
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">จังหวัด: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="" type="text" value="กรุงเทพมหานคร" disabled="disabled">
						            </div>
						        </div>
					        </fieldset>
				        </form>
		      		</div>
		      	</div>
		      </div>
	      	</div>
	      </div>
	      <!-- ------------------------------------------------------ -->
	      <div class="row">
	      	<div class="span8 offset2">
		      <div class="jumbotron">
		      	<div class="row">
		      		<div class="span2"><img src="<c:url value="/resources/register/images/female1.png" />" class="img-thumbnail" data-src="<c:url value="/resources/register/holder.js/200x150" />"></div>
		      		<div class="span5">
		      			<form class="form-inline" role="form">
						    <fieldset>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">เลขที่สมาชิก: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="member" type="text" value="000002" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">ชื่อ-สกุล: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="name" type="text" value="สกนธ์ทิพย์ นามสง่า" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">ลักษณะธุรกิจ: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="type" type="text" value="นิติบุคคล" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">เลขทะเบียนนิติบุคคล: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="idperson" type="text" value="0105530008509" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">ชื่อนิติบุคคล/ชื่อทางการค้า: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="bcName" type="text" value="บจ.เอาท์ดอร์อินโนเวชั่น" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">สินค้า/บริการ: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="item" type="text" value="อุปกรณ์แค้มปิ้ง ,กระเป๋ากันน้ำ,อุปกรณ์ยังชีพ" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">Website: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="Website" type="text" value="" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">Email: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="Email" type="text" value="sakonthip@outdoor.co.th" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">เบอร์โทรศัพท์: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="phone" type="text" value="083 815 0087" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">Line: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="line" type="text" value="sakonthip ป้อม" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">ประเภทธุรกิจ: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						            	<textarea rows="2" cols="" class="form-control" disabled="disabled"> ผู้ผลิต, ค้าส่ง, ค้าปลีก, นำเข้า, ส่งออก, อื่นๆ </textarea>
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">เกี่ยวข้องในธุรกิจ: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="" type="text" value="หุ้นส่วน ตำแหน่งผู้จัดการทั่วไป" disabled="disabled">
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">ที่อยู่: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						            	<textarea rows="3" cols="" class="form-control" disabled="disabled"> 80/1 หมู่ 1 ถ.เทพารักษ์ ต.บางปลา อ.บางพลี </textarea>
						            </div>
						        </div>
						        <div class="form-group">
						        	<label class="span2 control-label" style="font-weight:bold; color:purple; padding-bottom: 10px;">จังหวัด: </label>
						            <div class="span2" style="padding-bottom: 10px;">
						                <input class="form-control" id="" type="text" value="สมุทรปราการ" disabled="disabled">
						            </div>
						        </div>
					        </fieldset>
				        </form>
		      		</div>
		      	</div>
		      </div>
	      	</div>
	      </div>
	      
	      <a href="<c:url value="/page/register" />" style="color: orange; float: right;">more<i class="mdi-av-play-circle-fill"></i></a>
	      
     </div>
   </div>
  
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
<script src="<c:url value="/resources/register/js/doubletaptogo.js" />"></script>
<script>
	$( function()
	{
		$( '#nav li:has(ul)' ).doubleTapToGo();
	});
</script>
<script>
     $(document).ready(function() {
         $.material.init();
     });
</script>