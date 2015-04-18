<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<%@ include file="/WEB-INF/jsp/common/search.jsp" %>
<!-- -------------------------------------------------------------------------------------------------------------------------------- -->
<div style="background:#5E3752; padding:10px 0 20px 0;">
	<div class="container" style="background:#fff; margin-top: 40px; margin-bottom: 40px;">
	      <div class="row">
	      	<div class="col-md-3" style="margin-right: 10px;">
	      		<div style="font-size: 22px;">
					<ul class="v_menu col-md-12">
					   <c:if test="${not empty provinceCenters}"> 
        	 				<c:forEach items="${provinceCenters}" var="provinceCenter" varStatus="loop"> 
        	 				<c:if test="${provinceCenter.bcId==bcId}">
        	 					<li class="active"><a href='<c:url value="/news/publicize/${provinceCenter.bcId}/${bcZone}" />' style="color:#fff;">${provinceCenter.bcProviceName}</a></li>
        	 				</c:if>
        	 				<c:if test="${provinceCenter.bcId!=bcId}">
        	 					<li><a href='<c:url value="/news/publicize/${provinceCenter.bcId}/${bcZone}" />'>${provinceCenter.bcProviceName}</a></li>
        	 				</c:if>
        	 				</c:forEach>
        	 			</c:if>
					</ul>
				</div>
	      	</div>
	      	<div class="col-md-8">
		      <div class="jumbotron">
		      	<div class="row">
			      	<div class="col-md-9">
			      		<button onclick="goToPage('${bizclubCenter.bcFacebook}')"  class="btn btn-material-amber" type="button" style="padding: 10px 150px 10px 150px; float: right;"><img  src="<c:url value="/resources/register/images/fb.gif" />">facebook</button>
					</div>
		      		<div class="col-md-12">
		      			<form class="form-inline">
						  <div class="form-group">
						  <h2 style="margin-left: 20px;">กิจกรรม</h2>
						  </div>
						  <a href="<c:url value="/product/member/${bcId}" />" style="float: right; margin-top:30px; color: purple;">ข้อมูลสมาชิก ${bizclubCenter.bcMemberSize} ราย</a>
						</form>
						<div class="row">
                             <div class="col-md-12" align="center">
                                 <button type="button" class="btn btn-default" id="newActivity" onclick="javascript:addNews(${bcId},${bcZone});">Add</button>
                             </div>
                         </div>
						<div class="list-group">
		      			<div class="list-group-separator"></div>
		      			</div>
		      			<div class="list-group">
		      			<c:forEach  items="${newsActList}" var="newsActList" varStatus="loop">
			      			<div class="row">
		      					<div class="col-md-12" style="margin: -20px 0px -50px 0px;">
		      					  <c:if test="${isAuthen==true}">
		      					  	   <c:if test="${isStaff || isAdmin}">
		      					  	   			<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup" onclick="javascript:delNews(${bcId},${bcZone},${newsActList.activityId });"><i class="mdi-action-delete"></i></button>
							    				<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#activity-popup" onclick="javascript:editNews(${bcId},${bcZone},${newsActList.activityId });"><i class="mdi-image-edit"></i></button>
									 </c:if>
		      					  </c:if>
						    	</div>
			      				<div class="col-md-12" style="margin: 20px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="col-md-3">
									        <c:if test="${not empty newsActList.imgPath}">
									        	<img src="<c:url value="/getfile/News/${newsActList.imgPath }" />" alt="<c:url value="${newsActList.imgName }" />" class="img-thumbnail" data-src="holder.js/200x200">
									        </c:if>
								        </div>
								        <div class="col-md-9">
								            <h4 class="list-group-item-heading">${newsActList.title}</h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;"> &nbsp;&nbsp;${newsActList.detail}</p>	
								            <a href="#" style="color: orange; float: right;" data-toggle="modal" onclick="javascript:moreDetail(${bcId},${bcZone},${newsActList.activityId });">รายละเอียด<i class="mdi-av-play-circle-fill"></i></a>
								            			        
								        </div>
								    </div>
							    </div>
					    	</div>
					    	<div class="list-group-separator"></div>
		      			</c:forEach>
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
        <p id="moreTitle" class="modal-title" style="font-size: 26px; font-weight: bold; padding-bottom: 20px;"></p>
      </div>
      <div class="modal-body">
      	<div class="row">
      		<div class="col-md-12">
      			<div class="col-md-4" style="padding-left: 20px;">
      				<img class="img-thumbnail" id="profile" src="" alt="" data-src="holder.js"/>
      			</div>
      			<div class="col-md-8" style="padding-left: 0px;">
	            	<p id="moreDetail" style="font-size: 20px;"> &nbsp;&nbsp;</p>
	            </div>
            </div>
        </div>
		</div>
      </div>
  	</div>
 </div>
<!-- ----------------------------------------------------------------------------------------------------------- -->
<div id="activity-popup" class="modal fade" tabindex="-1">
<c:url var="post_url"  value="/news/publicize/save" />
<form:form id="publicizeForm" name="publicizeForm" modelAttribute="publicizeForm"    method="post" action="${post_url}" enctype="multipart/form-data">
	<form:hidden path="bpId" class="form-control textsize empty" id="bpId"/>
	<form:hidden path="bcId" class="form-control textsize empty" id="bcId"/>
	<form:hidden path="bcZone" class="form-control textsize empty" id="bcZone"/>
	<form:hidden path="pageMode" class="form-control textsize empty" id="pageMode"/>
  <div class="modal-dialog modal-lg">
    <div class="modal-content" style="border-top: 5px solid #f0bb18; border-bottom: 5px solid #7e06b4;">
      <div class="modal-body">
      	<div class="row">
      		<div class="col-md-12">
      			<div class="col-md-8">
      			<span class="form-horizontal">
				    	<fieldset>
		      				<div class="form-group">
					        	<label class="col-md-2 control-label">หัวข้อ: </label>
					            <div class="col-md-10">
					            	<form:input path="bpTitle" class="form-control textsize empty" id="title"/>
					            </div>
					        </div>
					        <div class="form-group">
					        	<label class="col-md-2 control-label">เนื่อหา: </label>
					            <div class="col-md-10">
					            	<form:textarea path="bpDetail" class="form-control textsize empty" id="detail" cols="5" rows="5"/>
					            </div>
					        </div>
					        <div class="col-md-offset-3">
					        	<div class="col-md-4 radio radio-primary">
								    <label class="radio-inline">
								      <!-- <input name="chk1" value="option1" type="radio"> -->
								     <form:radiobutton path="isFixed" id="isFixed" name="isFixed" value="fix" /> 
								      <span style="margin-top: -5px; margin-left: 20px; width: 250px;">โพสปักหมุด</span>
								    </label>
								</div>
								<div class="col-md-3 radio radio-primary">
								    <label class="radio-inline">
								      <!-- <input name="chk1" value="option1" type="radio"> -->
								     <form:radiobutton path="isFixed" id="isFixed" name="isFixed" value="null" /> 
								      <span style="margin-top: -5px; margin-left: 20px; width: 250px;">โพสธรรมดา</span>
								    </label>
							    </div>
					        </div>
			        	</fieldset>
			        </span>
      			</div>
      			<div class="col-md-4">
	            	<img class="img-thumbnail" id="activity" src='<c:url value="/resources/register/images/defult.png" />' alt='<c:url value="/resources/register/images/defult.png" />' data-src="holder.js"/>
	            	 <input type='file' id="activity_upload" name="activity_upload" onchange="URLact(this);" style="font-size: 10px; "/>
      			</div>
      		</div>
      		<div class="col-md-offset-4">
		        <button class="btn btn-default btn-flat" data-dismiss="modal" style="font-weight: bold; font-size: 20px;">ยกเลิก</button>
		        <button type="submit" id="commit" class="btn btn-material-purple-800 btn-xs" data-dismiss="modal" style="font-weight: bold; font-size: 20px;">โพส</button>
	      	</div>
      	</div>
      </div>
  	</div>
 </div>
 </form:form>
</div>


<div id="delete-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-sm">
    <div class="modal-content" style="background-color: #d81515;">
      <div class="modal-body">
          	<div class="form-group">
	            <label class="col-lg-10 col-md-offset-1 control-label" style="text-align: center; font-size: 28px; color: #ffffff; font-weight: 700;">Are you sure?</label>
        	</div>
      </div>
      <div class="modal-footer">
        <button type="button" onclick="confirmDelete()" class="btn btn-material-grey-100 btn-xs" data-dismiss="modal">Yes</button>
        <button class="btn btn-black btn-xs" data-dismiss="modal">No</button>
      </div>
    </div>
  </div>
</div>
<!-- ----------------------------------------------------------------------------------------------------------- -->
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
<script>
      $(document).ready(function() {
          $.material.init();
          $('#commit').click(function(){
        	  document.getElementById('publicizeForm').submit();
        	 // $('#publicizeForm').submit;	
			});
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
function moreDetail(bcId,bcZone,bpId){
	 $.ajax({
		  type: "GET",
		  contentType : 'application/json; charset=utf-8',
		  url: "/bizclub/news/publicize/moreDetail/"+bcId+"/"+bcZone+"/"+bpId,
		  dataType : 'json'
		})
		  .done(function( msg ) {
			  $("#more-popup").modal('show');
			  $("#moreTitle").text(msg.bpTitle);
			  $("#moreDetail").text(msg.bpDetail);
			  if(msg.bpPicturePath!=null){
				  var scr1 = "/getfile/News/"+msg.bpPicturePath;
				  $("#profile").attr("src", scr1);
				  $("#profile").attr("alt", msg.bpPictureName);
			  }
		  });
}
function addNews(bcId,bcZone){
	 $.ajax({
		  type: "GET",
		  contentType : 'application/json; charset=utf-8',
		  url: "/bizclub/news/publicize/add/"+bcId+"/"+bcZone,
		  dataType : 'json'
		})
		  .done(function( msg ) {
			  $("#activity-popup").modal('show');
			  $("#bcId").val(msg.bcId);
			  $("#bcZone").val(msg.bcZone);
			  $("#pageMode").val(msg.pageMode);
		  });
}
function editNews(bcId,bcZone,bpId){
	 $.ajax({
		  type: "GET",
		  contentType : 'application/json; charset=utf-8',
		  url: "/bizclub/news/publicize/edit/"+bcId+"/"+bcZone+"/"+bpId,
		  dataType : 'json'
		})
		  .done(function( msg ) {
			  $("#activity-popup").modal('show');
			  $("#bpId").val(msg.bpId);
			  $("#bcId").val(msg.bcId);
			  $("#bcZone").val(msg.bcZone);
			  $("#title").val(msg.bpTitle);
			  $("#detail").val(msg.bpDetail);
			  $("#pageMode").val(msg.pageMode);
			  if(msg.isFixed == 'Y'){
				  $("input[name=isFixed][value='fix']").prop('checked', true);
			  }
			  if(msg.isFixed == 'N'){
				  $("input[name=isFixed][value='null']").prop('checked', true);
			  }
			  if(msg.bpPicturePath!=null){
				  var scr1 = "/getfile/News/"+msg.bpPicturePath;
				  $("#activity").attr("src", scr1);
				  $("#activity").attr("alt", msg.bpPictureName);
			  }
		  });
}
function delNews(bcId,bcZone,bpId){
	 $.ajax({
		  type: "GET",
		  contentType : 'application/json; charset=utf-8',
		  url: "/bizclub/news/publicize/delete/"+bcId+"/"+bcZone+"/"+bpId,
		  dataType : 'json'
		})
		  .done(function( msg ) {
			  $("#delete-popup").modal('show');
			  $("#bpId").val(msg.bpId);
			  $("#bcId").val(msg.bcId);
			  $("#bcZone").val(msg.bcZone);
			  $("#title").val(msg.bpTitle);
			  $("#detail").val(msg.bpDetail);
			  $("#pageMode").val(msg.pageMode);
		  });
} 
function confirmDelete(){
	document.getElementById('publicizeForm').submit();
}
</script>
<style>
body{
	font-family: 'th_k2d_july8regular';
}
</style>  
</body>
</html>