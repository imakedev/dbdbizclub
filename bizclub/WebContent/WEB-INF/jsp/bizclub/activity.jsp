<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>

<!-- -------------------------------------------------------------------------------------------------------------------------------- -->
<div style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin: 0 auto;">
	      <div class="row">
	      	<div class="col-md-3" style="margin-right: 10px;">
	      		<div style="font-size: 22px;">
					<ul class="v_menu">
					   <li class="active"><a href='#'>กรุงเทพมหานคร</a></li>
					   <li><a href='#'>นนทบุรี</a></li>
					   <li><a href='#'>ปทุมธานี</a></li>
					   <li><a href='#'>เชียงใหม่</a></li>
					   <li><a href='#'>เชียงราย</a></li>
					   <li><a href='#'>ขอนแก่น</a></li>
					   <li><a href='#'>นครศรีธรรมราช</a></li>
					   <li><a href='#'>พิษณุโลก</a></li>
					   <li><a href='#'>ภูเก็ต</a></li>
					</ul>
				</div>
	      	</div>
	      	<div class="col-md-8">
		      <div class="jumbotron">
		      	<div class="row">
			      	<div class="col-md-9">
			      		<button class="btn btn-material-amber" type="button" style="padding: 10px 150px 10px 150px; float: right;"><img src="<c:url value="/resources/register/images/fb.gif" />">acebook</button>
					</div>
		      		<div class="col-md-12">
		      			<form class="form-inline">
						  <div class="form-group">
						  <h2 style="margin-left: 20px;">กิจกรรม</h2>
						  </div>
						  <a href="Activity_Member.html" style="float: right; margin-top:30px; color: purple;">สมาชิก 45 ราย</a>
						</form>
						<div class="list-group">
		      			<div class="list-group-separator"></div>
		      			</div>
		      			<div class="list-group">
		      				<div class="row">
		      					<div class="col-md-12" style="margin: -20px 0px -50px 0px;">
									<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    	<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right; data-toggle="modal" data-target="#item-popup"><i class="mdi-image-edit"></i></button>
						    	</div>
			      				<div class="col-md-12" style="margin: 20px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="col-md-3">
								            <img src="<c:url value="/resources/register/images/n1.jpg" />" class="img-thumbnail" data-src="holder.js/200x200">
								        </div>
								        <div class="col-md-9">
								            <h4 class="list-group-item-heading">ร่วมเป็นคณะกรรมการตัดสินการประกวดของดีเมืองกรุง</h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">รายละเอียด...</p>	
								            <a href="#" style="color: orange; float: right;" data-toggle="modal" data-target="#more-popup">รายละเอียด<i class="mdi-av-play-circle-fill"></i></a>
								            			        
								        </div>
								    </div>
							    </div>
					    	</div>
						    <div class="list-group-separator"></div>
						     <div class="row">
						     	<div class="col-md-12" style="margin: -20px 0px -50px 0px;">
									<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    	<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right; data-toggle="modal" data-target="#item-popup"><i class="mdi-image-edit"></i></button>
						    	</div>
			      				<div class="col-md-12" style="margin: 20px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="col-md-3">
								            <img src="<c:url value="/resources/register/images/n1.jpg" />" class="img-thumbnail" data-src="holder.js/200x200">
								        </div>
								        <div class="col-md-9">
								            <h4 class="list-group-item-heading">ร่วมเป็นคณะกรรมการตัดสินการประกวดของดีเมืองกรุง</h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">รายละเอียด...</p>	
								            <a href="#" style="color: orange; float: right;" data-toggle="modal" data-target="#more-popup">รายละเอียด<i class="mdi-av-play-circle-fill"></i></a>
								            			        
								        </div>
								    </div>
							    </div>
					    	</div>
					    	<div class="list-group-separator"></div>
						    <div class="row">
						    	<div class="col-md-12" style="margin: -20px 0px -50px 0px;">
									<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    	<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right; data-toggle="modal" data-target="#item-popup"><i class="mdi-image-edit"></i></button>
						    	</div>
			      				<div class="col-md-12" style="margin: 20px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="col-md-3">
								            <img src="<c:url value="/resources/register/images/n1.jpg" />" class="img-thumbnail" data-src="holder.js/200x200">
								        </div>
								        <div class="col-md-9">
								            <h4 class="list-group-item-heading">ร่วมเป็นคณะกรรมการตัดสินการประกวดของดีเมืองกรุง</h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">รายละเอียด...</p>	
								            <a href="#" style="color: orange; float: right;" data-toggle="modal" data-target="#more-popup">รายละเอียด<i class="mdi-av-play-circle-fill"></i></a>
								            			        
								        </div>
								    </div>
							    </div>
					    	</div>
						    <div class="list-group-separator"></div>
						</div>
		      		</div>
		      	</div>
		      	<ul class="pager">
				    <li class="previous disabled"><a href="javascript:void(0)">← Older</a></li>
				    <li class="next"><a href="javascript:void(0)">Newer →</a></li>
				</ul>
		      </div>
	      	</div>
	      </div>
  		</div>
	</div>
	      <!-- ------------------------ more-popup ------------------------------------- -->
<div id="more-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-lg">
    <div class="modal-content" style="border: 5px solid #fbb819;">
      <div class="modal-header" style="background-color: #fbb819">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <p class="modal-title" style="font-size: 26px; font-weight: bold; padding-bottom: 20px;">ชื่อกิจกรรม</p>
      </div>
      <div class="modal-body">
      	<div class="row">
      		<div class="col-md-12">
      			<div class="col-md-4" style="padding-left: 20px;">
      				<img class="img-thumbnail" id="profile" src="<c:url value="/resources/register/images/n1.jpg" />" alt="" data-src="holder.js"/>
      			</div>
      			<div class="col-md-8" style="padding-left: 0px;">
	            	<p>รายละเอียด ...</p>
	            </div>
            </div>
        </div>
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
</script>
<style>
body{
	font-family: 'th_k2d_july8regular';
}
</style>  
</body>
</html>