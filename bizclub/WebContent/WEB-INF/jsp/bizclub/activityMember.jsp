<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<%@ include file="/WEB-INF/jsp/common/search.jsp" %>
<!-- -------------------------------------------------------------------------------------------------------------------------------- -->
<div style="background:#5E3752; padding:50px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin: 0 auto;">
	      <div class="row">
	      	<div class="col-md-3" style="margin-right: 10px;">
	      		<div style="font-size: 22px;">
					<ul class="v_menu col-md-12">
					   <c:if test="${not empty provinceCenters}"> 
        	 				<c:forEach items="${provinceCenters}" var="provinceCenter" varStatus="loop"> 
        	 				<c:if test="${provinceCenter.bcId==bcId}">
        	 					<li class="active"><a href='<c:url value="/product/activity/${provinceCenter.bcId}" />' style="color:#fff;">${provinceCenter.bcProviceName}</a></li>
        	 				</c:if>
        	 				<c:if test="${provinceCenter.bcId!=bcId}">
        	 					<li><a href='<c:url value="/product/activity/${provinceCenter.bcId}" />'>${provinceCenter.bcProviceName}</a></li>
        	 				</c:if>
        	 				</c:forEach>
        	 			</c:if>
					</ul>
				</div>
	      	</div>
	      	<div class="col-md-8">
		      <div class="jumbotron">
		      	<div class="row">
			      	<div class="col-md-4" style="background-color: #fbcb04; box-shadow: 1px 7px 15px #000; ">
						<div style="text-align: left;  color: #fff; font-size: 28px; font-weight: bold;">จำนวนสมาชิก ${bizclubCenter.bcMemberSize} ราย</div>
					</div>
		      		<div class="col-md-12">
		      			<div class="list-group">
		      			<c:if test="${not empty users}"> 
        	 				<c:forEach items="${users}" var="user" varStatus="loop"> 
		      				<div class="row">
			      				<div class="col-md-9" style="margin: 20px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								          <c:if test="${not empty user.logoPath}">
								            <img class="circle"  width="56" height="56" src="<c:url value="/getfile/logo/${user.userId}/xxx" />" alt="icon">
								            </c:if>
								            <c:if test="${ empty user.logoPath}">
								              <img class="circle"  width="56" height="56"  src="<c:url value="/resources/register/images/img_logo.png" />" alt="icon">
								            </c:if>
								        </div>
								        <div class="row-content">
								             <h4 class="list-group-item-heading">${user.corpName}</h4>
								          
<%-- 								            <span><c:out value="${user.services}"/></span>						         --%>
								        </div>
								    </div>
							    </div>
							    <div class="col-md-3" style="margin: 10px 0px 0px 0px;">
							     <c:if test="${isAuthen==true}">
		      					  	   <c:if test="${isStaff || isAdmin}">
		      					  	   		<c:if test="${userObj.bizclubProvince==bcId}">
							    				<button class="btn btn-danger btn-flat" style="padding: 5px 5px 5px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    				<button class="btn btn-success btn-flat" style="padding: 5px 5px 5px 5px; float: right;" data-toggle="modal" data-target="#member-popup"><i class="mdi-image-edit"></i></button>
							    			</c:if>
							    		</c:if>
							    	</c:if>
									<br><br><br>
									<a href="<c:url value="/product/items/${bcId}/${user.userId}" />" style="color: orange; float: right;">รายละเอียด<i class="mdi-av-play-circle-fill"></i></a>
						    	</div>
					    	</div>
						    <div class="list-group-separator"></div>
						   </c:forEach>
						  </c:if>
						  <%--  
						     <div class="row">
			      				<div class="col-md-9" style="margin: 10px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								            <img class="circle" src="<c:url value="/resources/register/images/5.png" />" alt="icon">
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">นาย ธนธัช พัฒนเสรีเสถียร <span style="color: #a8a6a5;">(นิติบุคคล)</span></h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">บจ. แพดโปร แปซิฟิค </p>
								            <span>วัสดุสนับสนุนอุตสาหกรรม (ซองบรรจุอาหาร)</span>						        
								        </div>
								    </div>
							    </div>
							    <div class="col-md-3" style="margin: 10px 0px 0px 0px;">
							    	<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    	<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right; data-toggle="modal" data-target="#item-popup"><i class="mdi-image-edit"></i></button>
									<br><br><br>
									<a href="Activity_item.html" style="color: orange; float: right;"><i class="mdi-action-shopping-cart"></i> สินค้า/บริการ</a>
						    	</div>
					    	</div>
					    	<div class="list-group-separator"></div>
						    <div class="row">
			      				<div class="col-md-9" style="margin: 10px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								            <img class="circle" src="<c:url value="/resources/register/images/femail1.png" />" alt="icon">
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">น.ส. จารุวรรณ ปั้นทอง <span style="color: #a8a6a5;">(นิติบุคคล)</span></h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">หจ. อกาวิกา</p>
								            <span>เครื่องประดับอัญมณีสังเคราะห์</span>						        
								        </div>
								    </div>
							    </div>
							    <div class="col-md-3" style="margin: 10px 0px 0px 0px;">
									<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    	<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right; data-toggle="modal" data-target="#item-popup"><i class="mdi-image-edit"></i></button>
									<br><br><br>
									<a href="Activity_item.html" style="color: orange; float: right;"><i class="mdi-action-shopping-cart"></i> สินค้า/บริการ</a>
						    	</div>
					    	</div>
						    <div class="list-group-separator"></div>
						     --%>
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
		      <!-- ------------------------------------------------------ -->
<div id="member-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-md">
    <div class="modal-content" style="border-top: 5px solid #f0bb18; border-bottom: 5px solid #7e06b4;">
      <div class="modal-body">
      	<div class="row">
   			<div class="col-md-7 col-md-offset-5">
				<img class="img-thumbnail" id="profile" width="120" height="120" src="<c:url value="/resources/register/images/img_logo.png" />" >
   			</div>
   			<div class="col-md-12" style="margin-top: 20px;">
      			<form class="form-horizontal">
				    <fieldset>
				        <div class="form-group">
				        	<label class="col-md-4 control-label">ชื่อ-สกุล: </label>
				            <div class="col-md-7">
				                <input class="form-control textsize" id="fullName_modal" type="text" value="">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-4 control-label">ชื่อนิติบุคคล/ชื่อทางการค้า: </label>
				            <div class="col-md-7">
				                <input class="form-control textsize" id="corpName_modal" type="text" value="">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-4 control-label">สินค้า/บริการ: </label>
				            <div class="col-md-7">
				                <textarea rows="2" cols="" id="services_modal" class="form-control textsize"></textarea>
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-4 control-label">Website: </label>
				            <div class="col-md-7">
				                <input class="form-control textsize" id="website_modal" type="text" value="">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-4 control-label">Email: </label>
				            <div class="col-md-7">
				                <input class="form-control textsize" id="email_modal" type="text" value="">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-4 control-label">เบอร์โทรศัพท์: </label>
				            <div class="col-md-7">
				                <input class="form-control textsize" id="mobilePhone_modal" type="text" value="">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-4 control-label">Line: </label>
				            <div class="col-md-7">
				                <input class="form-control textsize" id="lineId_modal" type="text" value="">
				            </div>
				        </div>
				        <div class="col-md-offset-4">
				        	<button class="btn btn-white btn-lg" type="reset" style="font-weight: bold; font-size: 20px;">ยกเลิก</button>
				        	<button class="btn btn-material-yellow-400" type="submit" style="font-weight: bold; font-size: 20px;">บันทึก</button>
				        </div>
				        <%--
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">ประเภทธุรกิจ: </label>
				            <div class="col-md-5">
				            	<textarea rows="2" cols="" class="form-control textsize" disabled="disabled">ธุรกิจบริการ</textarea>
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">เกี่ยวข้องในธุรกิจ: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="" type="text" value="เจ้าของธุรกิจ ตำแหน่งกรรมการผู้จัดการ" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">ที่อยู่: </label>
				            <div class="col-md-5">
				            	<textarea rows="2" cols="" class="form-control textsize" disabled="disabled">542/36 ซ.สหการประมูล (สถานทูตลาว) ถนนประชาอุทิศ แขวงวังทองหลาง เขตวังทองหลาง</textarea>
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">จังหวัด: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="" type="text" value="กรุงเทพมหานคร" disabled="disabled">
				            </div>
				        </div>
				         --%>
			        </fieldset>
		        </form>
      		</div>
      	</div>
      </div>
  	</div>
 </div>
</div>


<div id="delete-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-sm">
    <div class="modal-content" style="background-color: #d81515;">
      <div class="modal-body">
      	<form:form   id="memberItemForm" name="memberItemForm"   method="GET" action=""
		cssClass="form-horizontal">
		     <input type="hidden" id="item_delete">
	          	<div class="form-group">
		            <label class="col-lg-10 col-md-offset-1 control-label" style="text-align: center; font-size: 28px; color: #ffffff; font-weight: 700;">Are you sure?</label>
	        	</div>
	      </form:form>
      </div>
      <div class="modal-footer">
        <button type="button" onclick="deleteMemberItem()" class="btn btn-material-grey-100 btn-xs" data-dismiss="modal">Yes</button>
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
      });
</script>
<style>
body{
	font-family: 'th_k2d_july8regular';
}
</style>  
</body>
</html>