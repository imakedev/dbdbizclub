<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<%@ include file="/WEB-INF/jsp/common/banner.jsp" %>
<%@ include file="/WEB-INF/jsp/common/search.jsp" %>
<!-- -------------------------------------------------------------------------------------------------------------------------------- -->

<div style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin: 0 auto;">
	
	
	<a href="<c:url value="/news/activity" />" style="float: right; font-size: 22px; font-weight: bold;">ตารางกิจกรรม</a>
	<%-- <a href="<c:url value="/news/activity" />" style="float: right; font-size: 22px; font-weight: bold;" data-toggle="modal" data-target="#calendar">ตารางกิจกรรม</a> --%>
      <div class="row">
	      <div class="col-md-10 col-md-offset-2">
	      	<div class="col-md-3 jumbotron" style="height: 250px; margin: 10px 15px 10px 15px; padding: 0px;">
	      		<div class="col-md-12">
      				<p class="newsText">ข่าวภาคเหนือ
      				<a href='<c:url value="/news/newsActivity/1" />' class="newsMore">ดูทั้งหมด</a></p>
	      		</div>
	      		<div class="col-md-12 newsTitlebox">
	      			<div class="col-md-4"><img src="<c:url value="/resources/register/images/pix_6.png" />" height="40px" width="50px"></div>
	      			<div class="col-md-8 newsBody">หัวข้อ............................................................</div>
	      		</div>
	      	</div>
	      	<div class="col-md-3 jumbotron" style="height: 250px; margin: 10px 15px 10px 15px; padding: 0px;">
	      		<div class="col-md-12">
      				<p class="newsText">ข่าวภาคกลาง
      				<a href='<c:url value="/news/newsActivity/1" />' class="newsMore">ดูทั้งหมด</a></p>
	      		</div>
	      		<div class="col-md-12 newsTitlebox">
	      			<div class="col-md-4"><img src="<c:url value="/resources/register/images/pix_5.png" />" height="40px" width="50px"></div>
	      			<div class="col-md-8 newsBody">การสัมมนา“การเชื่อมโยงเครือข่ายธุรกิจ Biz Club Thailand”</div>
	      		</div>
	      		<div class="col-md-12" style="word-wrap:break-word; text-indent: 1.5em; height: 130px; padding-top: 5px;">ผลต่อเนื่องจากการจัดงานสัมมนาเชื่อมโยงเครือข่ายธุรกิจ Biz Club รองรับ AEC ระหว่างวันที่   1-3 สิงหาคม 2557 ผู้ประกอบธุรกิจที่เป็นสมาชิก Biz Club ทั้งส่วนกลาง . . .
	      		</div>
	      		<div style="float: right; padding-right: 10px;"><a href="#">อ่านเพิ่มเติม </a></div>
	      	</div>
	      	<div class="col-md-3 jumbotron" style="height: 250px; margin: 10px 15px 10px 15px; padding: 0px;">
	      		<div class="col-md-12">
      				<p class="newsText">ข่าวภาคอีสาน
      				<a href='<c:url value="/news/newsActivity/1" />' class="newsMore">ดูทั้งหมด</a></p>
	      		</div>
	      		<div class="col-md-12 newsTitlebox">
	      			<div class="col-md-4"><img src="<c:url value="/resources/register/images/pix_1.png" />" height="40px" width="50px"></div>
	      			<div class="col-md-8 newsBody">หัวข้อ............................................................</div>
	      		</div>
	      	</div>
	      	<div class="col-md-3 jumbotron" style="height: 250px; margin: 10px 15px 10px 15px; padding: 0px;">
	      		<div class="col-md-12">
      				<p class="newsText">ข่าวภาคใต้
      				<a href='<c:url value="/news/newsActivity/1" />' class="newsMore">ดูทั้งหมด</a></p>
	      		</div>
	      		<div class="col-md-12 newsTitlebox">
	      			<div class="col-md-4"><img src="<c:url value="/resources/register/images/pix_2.png" />" height="40px" width="50px"></div>
	      			<div class="col-md-8 newsBody">หัวข้อ............................................................</div>
	      		</div>
	      	</div>
	      	<div class="col-md-3 jumbotron" style="height: 250px; margin: 10px 15px 10px 15px; padding: 0px;">
	      		<div class="col-md-12">
      				<p class="newsText">ข่าวภาคตะวันออก
      				<a href='<c:url value="/news/newsActivity/1" />' class="newsMore">ดูทั้งหมด</a></p>
	      		</div>
	      		<div class="col-md-12 newsTitlebox">
	      			<div class="col-md-4"><img src="<c:url value="/resources/register/images/pix_3.png" />" height="40px" width="50px"></div>
	      			<div class="col-md-8 newsBody">หัวข้อ............................................................</div>
	      		</div>
	      	</div>
	      	<div class="col-md-3 jumbotron" style="height: 250px; margin: 10px 15px 10px 15px; padding: 0px;">
	      		<div class="col-md-12">
      				<p class="newsText">ข่าวภาคตะวันตก
      				<a href='<c:url value="/news/newsActivity/1" />' class="newsMore">ดูทั้งหมด</a></p>
	      		</div>
	      		<div class="col-md-12 newsTitlebox">
	      			<div class="col-md-4"><img src="<c:url value="/resources/register/images/pix_4.png" />" height="40px" width="50px"></div>
	      			<div class="col-md-8 newsBody">หัวข้อ............................................................</div>
	      		</div>
	      	</div>
      	</div>
   	</div>
   	
   	<a href='<c:url value="/register/1" />' class="col-md-12 jumbotron" style="background-color: #ffb400; height: 80px; text-align: center; color:#000; text-decoration: none;">
   		<h2>ร่วมสมัครสมาชิก Biz Club</h2>
   	</a>
   	<div class="col-md-10 col-md-offset-1">
   		<div class="tabs">
	       <div class="tab">
	           <input type="radio" id="tab-1" name="tab-group-1" checked>
	           <label for="tab-1">โปรโมทสินค้า</label>
	           <div class="content">
	               <table class="table table-hover">
		               <thead>
			               	<tr style="font-weight: bold; font-size: 22px; background-color: #ffb400;">
								<th class="col-md-2" style="text-align: center;">วันที่</th>
								<th class="col-md-10" style="text-align: center;">หัวข้อ</th>
							</tr>
						</thead>
						<tbody style="font-size: 20px; font-weight: 500;">
							<tr height="30px">
								<td style="text-align: center;">09-03-2558</td>
								<td><a href="#">โรงเรียนกวดวิชา</a> (จากการ promotion สินค้า หน้าระบบสินค้า > สินค้าและบริการ > My product)</td>
							</tr>
							<tr height="30px">
								<td style="text-align: center;">28-02-2558</td>
								<td><a href="#">เสื้อนอนเด็ก</a></td>
							</tr>
							<tr height="30px">
								<td style="text-align: center;">07-02-2558</td>
								<td><a href="#">พระเครื่อง</a></td>
							</tr>
							<tr height="30px">
								<td style="text-align: center;"></td>
								<td><a href="#"></a></td>
							</tr>
							<tr height="30px">
								<td style="text-align: center;"></td>
								<td><a href="#"></a></td>
							</tr>
						</tbody>
					</table>
	           </div>
	       </div>
	       <div class="tab">
	           <input type="radio" id="tab-2" name="tab-group-1">
	           <label for="tab-2">ความต้องการสินค้า</label>
	           <div class="content">
	               <table class="table table-hover">
		               <thead>
			               	<tr style="font-weight: bold; font-size: 22px; background-color: #58047d; color:#fff;">
								<th class="col-md-2" style="text-align: center;">วันที่</th>
								<th class="col-md-10" style="text-align: center;">หัวข้อ</th>
							</tr>
						</thead>
						<tbody style="font-size: 20px; font-weight: 500;">
							<tr height="30px">
								<td style="text-align: center;">01-04-2558</td>
								<td><a href="#">ลำไยสด พันธุ์จัมโบ้</a> {จากการ เพิ่มความต้องการสินค้า ในหน้าต่อยอดธุรกิจ}</td>
							</tr>
							<tr height="30px">
								<td style="text-align: center;">05-04-2558</td>
								<td><a href="#">อุปกรณ์เล่นสงกรานต์ (ปืนฉีดน้ำ, ขันน้ำ, แว่นตา, แป้ง ฯลฯ)</a></td>
							</tr>
							<tr height="30px">
								<td style="text-align: center;"></td>
								<td><a href="#"></a></td>
							</tr>
							<tr height="30px">
								<td style="text-align: center;"></td>
								<td><a href="#"></a></td>
							</tr>
							<tr height="30px">
								<td style="text-align: center;"></td>
								<td><a href="#"></a></td>
							</tr>
						</tbody>
					</table>
	           </div>
	       </div>
	    </div>
   	</div>
   	<a href='<c:url value="/register/1" />' class="col-md-12 jumbotron" style="background-color: #58047d; color:#fff; height: 80px; text-align: center; color: #fff; text-decoration: none;"><h2>สมัครเป็นสมาชิก Biz Club</h2></a>
   	<div class="col-md-12" style="font-size: 22px; font-weight: bold;">รายการศูนย์ประสานงานภาคต่างๆ</div>
   	<div class="row">
   		<div class="col-md-3 col-md-offset-2" style="background-color: #fff2b2;">
   			<span style="font-size: 20px; font-weight: bold; height: 250px;">ภาคกลาง</span>
   			<ul>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	        </ul>
   		</div>
   		<div class="col-md-3" style="background-color: #fff;">
   			<span style="font-size: 20px; font-weight: bold; height: 250px;">ภาคเหนือ</span>
   			<ul>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	        </ul>
   		</div>
   		<div class="col-md-3" style="background-color: #fff2b2;">
   			<span style="font-size: 20px; font-weight: bold; height: 250px;">ภาคอีสาน</span>
   			<ul>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	        </ul>
   		</div>
   		<div class="col-md-3 col-md-offset-2" style="background-color: #fff;">
   			<span style="font-size: 20px; font-weight: bold; height: 250px;">ภาคตะวันตก</span>
   			<ul>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	        </ul>
   		</div>
   		<div class="col-md-3" style="background-color: #fff2b2;">
   			<span style="font-size: 20px; font-weight: bold; height: 250px;">ภาคตะวันออก</span>
   			<ul>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	        </ul>
   		</div>
   		<div class="col-md-3" style="background-color: #fff;">
   			<span style="font-size: 20px; font-weight: bold; height: 250px;">ภาคใต้</span>
   			<ul>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	          <li>•</li>
	        </ul>
   		</div>
   	</div>
   	</div>
</div>
   	
<div id="calendar" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-md">
    <div class="modal-content">
      <div class="modal-body">
      	<div class="col-md-12">
           	<img src="<c:url value="/resources/register/images/calendar.jpg" />" width="530px" height="730px" >
         </div>
      </div>
      <div class="modal-footer">
      </div>
    </div>
  </div>
</div>
<!-- ----------------------------------------------------------------------------------------------------------- -->
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
<script>
      $(document).ready(function() {
          $.material.init();
      });
      function goToPage(page){
    	
    	  if(page.length>0){
    	  window.open(
    			  page,
    			  '_blank' // <- This is what makes it open in a new window.
    			);
    	  }
      }
</script>
<script>
function URLact(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#activity')
                .attr('src', e.target.result)
                .width(190)
                .height(130);
        };

        reader.readAsDataURL(input.files[0]);
    }
}
</script>
<script>
	function gotoPage(id){
		alert(id);
	}
</script>
<style>
body{
	font-family: 'th_k2d_july8regular';
}
</style>  
</body>
</html>