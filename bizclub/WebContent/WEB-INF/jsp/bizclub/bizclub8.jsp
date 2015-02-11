<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<html>
<head>
<title>BizClub</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="robots" content="all">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no" />
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/bizclub8/css/style.css" />" media="all" />
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/bizclub8/css/slide.css" />" media="all" />
<script src="<c:url value="/resources/bizclub8/js/prefixfree.min.js" />"></script>
</head>
<body >
<div class="top" >
	<div style="width:1200px; margin:0 auto;">
    	<div class="clearfix">
            <div style="width:700px; float:left;">
                <div id="navcontainer">
                <ul class="clearfix">
                    <li><a href="#" class="focus">หน้าแรก</a></li>
                    <li><a href="#">ข้อมูลทางการค้า</a></li>
                    <li><a href="#">ข่าวสารและประชาสัมพันธ์</a></li>
                    <li><a href="#">ระบบรายงาน</a></li>
                    <li><a href="#">ติดต่อเรา</a></li>
                </ul>
                </div>
            </div>
            <div style="width:100px; float:right;margin-top:8px;margin-right:65px;text-align:right;"> 
                <img src="<c:url value="/resources/bizclub8/images/icon_f1.gif" />" onmouseover="this.src='<c:url value="/resources/bizclub8/images/icon_f0.gif" />';"
      onmouseout="this.src='<c:url value="/resources/bizclub8/images/icon_f1.gif" />';">&nbsp;<img src="<c:url value="/resources/bizclub8/images/icon_e1.gif" />" onmouseover="this.src='<c:url value="/resources/bizclub8/images/icon_e0.gif" />';"
      onmouseout="this.src='<c:url value="/resources/bizclub8/images/icon_e1.gif" />';">
            </div>
        </div>
	</div>
</div>
<div  style="background:url(<c:url value="/resources/bizclub8/images/bg_body.png" />) no-repeat left;">
    <div class="b_logo" >
    	<div style="padding-top:15px;">
    	<div style="width:200px;float:left;"><a href="#"><img src="<c:url value="/resources/bizclub8/images/logo.png" />"></a></div>
        <div style="width:550px;float:left;color:#5A3583;font-size:24px;font-weight:bold; padding-top:10px;">สำนักพัฒนาผู้ประกอบธุรกิจ กรมพัฒนาธุรกิจการค้า กระทรวงพาณิชย์</div>
    	</div>
    </div>
    <!--//----------->
    <div id="b_about" style="height:330px;width:1150px; margin:0 auto;" class="clearfix">
    	<div style="padding-top:15px; clear:both;">
            <div style="width:350px;float:left;">
            	<div style="background:#FFF; height:300px; border:3px solid #DD4563">
                	<div style="margin:25px;">
                    <div style="background:#DD4563;width:150px; font-size:22px; color:#FFF;font-weight:bold; text-align:center;">ข้อมูลทางการค้า</div>
                    <div style="font-size:18px; margin-top:10px;">" หากคุณกำลังมองหาธุรกิจ? ทำธุรกิจแล้ว
                    มีปัญหากำลังหาหนทางแก้ไข ? ติดต่อ......
                    ขอคำแนะนำและปรึกษาจากผู้เชี่ยวชาญที่มี
                    ประสบการณ์เฉพาะด้านอาทิ ด้านการ
                    เริ่มต้นธุรกิจการตลาดการเงิน การบริหาร
                    จัดการการตลาด E – Marketing
                    กฎหมายธุรกิจ และธุรกิจแฟรนไชส์ "</div>
                	</div>
                </div>
            </div>
            <div style="width:745px;float:left;margin-left:20px;">
            	<div class="box effect1" align="center">
                <!--<img src="images/new01.jpg" style="width:720px; height:275px; margin-top:15px;">-->
                  <div class="wrapper wrapper--demo">
                        <div class="carousel">
                            <div class="carousel__content">
                                <div class="item">
                            		<img src="<c:url value="/resources/bizclub8/images/new01.jpg" />" style="width:720px; height:275px; margin-top:15px;">
                          		</div>
                                <div class="item">
                            		<img src="<c:url value="/resources/bizclub8/images/new03.jpg" />" style="width:720px; height:275px; margin-top:15px;">
                          		</div>                               
                            </div>                    
                        <div class="carousel__nav">
                          <a href="#" class="nav nav--left">Click</a>
                        </div>                    
                        </div>
                    </div>
                <script src='<c:url value="/resources/bizclub8/js/jquery.js" />'></script>
  				<script src='<c:url value="/resources/bizclub8/js/jquery.transit.min.js" />'></script>
                <script src="<c:url value="/resources/bizclub8/js/index.js" />"></script>
                </div>
            </div>
        </div>
    </div>
    <!--//---------->
    <div >
    	<div class="b_news" style="overflow:auto;width:1150px; margin:0 auto; padding-top:10px;">
        	<div style="float:left;background:url(<c:url value="/resources/bizclub8/images/bg_news.png" />) no-repeat;height:70px; width:393px;">
            	<div style="color:#FFF; font-size:28px; font-weight:bold;margin:20px 0 0 20px;">ข่าวสารและประชาสัมพันธ์</div>
            </div>
            <div style="width:200px;float:right;text-align:right;margin-right:40px;">
            	<div><a href="#"><img src="<c:url value="/resources/bizclub8/images/btn_l.png" />"></a><a href="#"><img src="<c:url value="/resources/bizclub8/images/btn_r.png" />"></a></div>
            </div>
        </div>
    </div>
   <!--//---------->
   <div>
   		<div class="b_news" style="overflow:auto;width:1150px; margin:0 auto; padding-top:10px;">
        	<div style="width:700px;float:left;height:345px;background:#FFF;">
            	<div  class="box_news"  >
                	<div style="float:left; width:305px;">
                    	<div class="box3 effect3" align="center" ><img src="<c:url value="/resources/bizclub8/images/new02.jpg" />" style="padding-top:7px;"></div>
                    </div>
                    <div style="float:left; width:325px; margin-left:15;">
                    	<div style="color:#57358C;font-weight:700; font-size:24px;">KIP Awards 2013</div>
                        <div style="font-size:18px; height:150px;">ร่วมเป็นคณะกรรมการตัดสินการประกวดของดีเมืองโคราช (KIP Awades 2013)  วันที่ 11 ธันวาคม 2556  ณ หอการค้าจังหวัดนครราชสีมา</div>
                        <div id="btn_news"  class="clear">
                        	<div style="float:left; width:15px;"><img src="<c:url value="/resources/bizclub8/images/btn_more.png" />" style="margin-top:3px;"></div>
                        	<div style="float:left; width:80px;padding-left:5px;font-size:18px;margin-top:3px;font-weight:500;" onClick="document.location='BizClub8.html'">อ่านต่อ</div>
                        </div>
                    </div>
                </div>
            </div>
            <div style="width:360px;margin-left:50px;float:left;height:345px;background:#FFF;">
            	<div style="padding-top:25px; width:220px; margin:0 auto;">
                	<div style="color:#e94f3f;font-weight:500; font-size:24px;text-align:center; height:40px;">รายงานการถือหลักทรัพย์</div>
                    <div class="box2 effect2" align="center"><img src="<c:url value="/resources/bizclub8/images/grahp.jpg" />" style="padding-top:7px;"></div>
                </div>
            </div>
        </div>
   </div> 
   <!--//---------->
   <div  class="clearfix">
   		<div class="b_social" style="width:1150px; margin:0 auto; padding-top:10px;">
        	<div style="text-align:right; padding-right:30px;">
            	<a href="#"><img src="<c:url value="/resources/bizclub8/images/btn_f.png" />"></a>&nbsp;<a href="#"><img src="<c:url value="/resources/bizclub8/images/btn_t.png" />"></a>
            </div>
        </div>
   </div>
   <!--//---------->
   <div id="footer" >
   		<div id="footer_body" class="clearfix" >
        	<div style="float:left; width:450px;color:#FFF;">
            	<div style="font-size:20px;font-weight:500;">สำนักพัฒนาผู้ประกอบธุรกิจ กรมพัฒนาธุรกิจการค้า กระทรวงพาณิชย์</div>
                <div>เลขที่ 44/100 ถนน นนทบุรี 1 ต.บางกระสอ อ.เมือง จ.นททบุรี 11000</div>
                <div>โทรศัพท์: 02-547-5962</div>
                <div>โทรสาร: 02-547-5963-64</div>
                <div>email: training@dbd.go.th</div>
            </div>
            <div style="float:right; width:500px;" class="clearfix">
            	<form >
                    <div class="clearfix">
                        <div  style="float:left; width:220px;">
                            <input type="text" class="form-control" placeholder="ชื่อ-นามสกุล">
                        </div>
                        <div style="float:left; margin-left:10px; width:250px;">
                            <input type="text" class="form-control" placeholder="e-mail">
                        </div>
                    </div>
                    <div style="margin-top:5px; width:100%;">
                        <textarea class="form-control2" rows="3" style="height:50px;" placeholder="ข้อความ"></textarea>                
                    </div>
                    <div class="btn_contact" style="margin-top:5px;">ส่งข้อความ</div>
                </form>
            </div>
        </div>
   </div>
</div>
</body>
</html>