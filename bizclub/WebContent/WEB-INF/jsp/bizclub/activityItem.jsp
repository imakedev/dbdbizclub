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
						<c:if test="${not empty provinceCenters}"> 
        	 				<c:forEach items="${provinceCenters}" var="provinceCenter" varStatus="loop"> 
        	 				<c:if test="${provinceCenter.bcId==bcId}">
        	 					<li class="active"><a href='<c:url value="/product/activity/${provinceCenter.bcId}" />'>${provinceCenter.bcProviceName}</a></li>
        	 				</c:if>
        	 				<c:if test="${provinceCenter.bcId!=bcId}">
        	 					<li><a href='<c:url value="/product/activity/${provinceCenter.bcId}" />'>${provinceCenter.bcProviceName}</a></li>
        	 				</c:if>
        	 				</c:forEach>
        	 			</c:if>
        	 			<%--
					   <li class="active"><a href='#'>กรุงเทพมหานคร</a></li>
					   <li><a href='#'>นนทบุรี</a></li>
					   <li><a href='#'>ปทุมธานี</a></li>
					   <li><a href='#'>เชียงใหม่</a></li>
					   <li><a href='#'>เชียงราย</a></li>
					   <li><a href='#'>ขอนแก่น</a></li>
					   <li><a href='#'>นครศรีธรรมราช</a></li>
					   <li><a href='#'>พิษณุโลก</a></li>
					   <li><a href='#'>ภูเก็ต</a></li>
					    --%>
					</ul>
				</div>
	      	</div>
	      	<!-- ===================== สินค้า ============================= -->
	      	<div class="col-md-8">
		      <div class="jumbotron">
		      	<div class="row">
		      		<div class="col-md-11" style="background-color: #fbcb04; box-shadow: 1px 7px 15px #000; margin-bottom: 30px;">
						<div style="text-align: left;  color: #000; font-size: 28px; font-weight: 500;"><i class="mdi-action-shopping-cart"></i> ข้อมูลสินค้า
						<c:if test="${bizclubOwner.corpType=='1'}">
							${bizclubOwner.corpName}
						</c:if>
						<c:if test="${bizclubOwner.corpType=='2'}">
							${bizclubOwner.taxesCorpName}
						</c:if>
						<c:if test="${bizclubOwner.corpType=='3'}">
							${bizclubOwner.personCorpName}
						</c:if>
						<c:if test="${bizclubOwner.corpType=='4'}">
							
						</c:if>
						</div>
					</div>
		      		<div class="col-md-12">
		      			<div class="list-group">
		      			<c:if test="${not empty bizclubAssets}"> 
        	 			 <c:forEach items="${bizclubAssets}" var="bizclubAsset" varStatus="loop"> 
		      				<div class="row">
			      				<div class="col-md-10" style="margin: 0px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								         <c:if test="${not empty bizclubAsset.baPictureName}">
												<img class="square"   width="100" height="100" src="<c:url value="/getfile/product/${bizclubAsset.baId}/xx" />">
										</c:if>
										<c:if test="${ empty bizclubAsset.baPictureName}">
												 <img class="square"   width="100" height="100"  src="" alt="icon">
										</c:if>
								           
								        </div>
								        <div class="row-content">
								        <%-- 
								        <h4 class="list-group-item-heading">VERY OLD LADIES 9CT GOLD WATCH - CLORIS - 20 GRAMS</h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">บจ. ดรีมจ๊อคกี้</p>
								            <span>รับผลิตสื่อวิดีทัศน์, สื่อประชาสัมพันธ์-โฆษณาครบวงจร</span>
								             --%>
								         <h4 class="list-group-item-heading">${bizclubAsset.baTitle}</h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">${bizclubAsset.baDetail}</p>
								            
								            
								        </div>
								    </div>
							    </div>
							    <div class="col-md-2">
							      <c:if test="${isAuthen==true}">
		      					  	   <c:if test="${isStaff || isAdmin}">
		      					  	   		<c:if test="${userObj.bizclubProvince==bcId}">
							    				<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    				<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#detail-popup"><i class="mdi-image-edit"></i></button>
							    	   		</c:if>
							    	   </c:if>
							    	</c:if>
							    	<br><br><br><br>
							    	<div>
							    	<a href="#" onclick="showMemeber('${bizclubAsset.user.userId}')" style="font-size: 20px;">สนใจติดต่อ..</a>	
							    	<%--
						            	<a href="#" data-toggle="modal" data-target="#detail-popup" style="font-size: 20px; float: right; color: orange;">รายละเอียด<i class="mdi-av-play-circle-fill"></i></a>
						            	 --%>						        
						        	</div>
							    </div>
					    	</div>
						    <div class="list-group-separator"></div>
						  </c:forEach>
						 </c:if>
						 <%-- 
						   <div class="row">
			      				<div class="col-md-10" style="margin: 10px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								            <img class="square" src="" alt="icon">
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">ANTIQUE SOLID SILVER ART DECO WATCH set STONES & ENAMEL</h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">บจ. เอาท์ดอร์อินโนเวชั่น</p>
								            <span>อุปกรณ์แค้มปิ้ง ,กระเป๋ากันน้ำ,อุปกรณ์ยังชีพ</span>					        
								        </div>
								    </div>
							    </div>
							    <div class="col-md-2">
							    	<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    	<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right; data-toggle="modal" data-target="#item-popup"><i class="mdi-image-edit"></i></button>
							    	<br><br><br><br>
							    	<div>
						            	<a href="#" data-toggle="modal" data-target="#detail-popup" style="font-size: 20px; float: right; color: orange;">รายละเอียด<i class="mdi-av-play-circle-fill"></i></a>						        
						        	</div>
							    </div>
					    	</div>
					    	<div class="list-group-separator"></div>
						    <div class="row">
			      				<div class="col-md-10" style="margin: 10px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								            <img class="square" src="" alt="icon">
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">VERY OLD SILVER & ENAMEL WATCH - VERY PRETTY DESIGN - RARE - L@@K</h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">หจ. แม็กซิม่าครีเอชั่น</p>
								            <span>เครื่องประดับอัญมณีสังเคราะห์</span>					        
								        </div>
								    </div>
							    </div>
							    <div class="col-md-2">
							    	<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    	<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right; data-toggle="modal" data-target="#item-popup"><i class="mdi-image-edit"></i></button>
							    	<br><br><br><br>
							    	<div>
						            	<a href="#" data-toggle="modal" data-target="#detail-popup" style="font-size: 20px; float: right; color: orange;">รายละเอียด<i class="mdi-av-play-circle-fill"></i></a>						        
						        	</div>
							    </div>
					    	</div>
						    <div class="list-group-separator"></div>
						     --%>
						</div>
				      	<ul class="pager">
						    <li class="previous disabled"><a href="javascript:void(0)">← Older</a></li>
						    <li class="next"><a href="javascript:void(0)">Newer →</a></li>
						</ul>
		      		</div>
<!-- =============================== ข้อมูลสมาชิก =============================================== -->
					<div class="col-md-11" style="background-color: #7105a2; box-shadow: 1px 7px 15px #000; margin-top: 20px; margin-bottom: 30px;">
						<div style="text-align: left;  color: #fff; font-size: 28px; font-weight: 500;"><i class="mdi-social-person"></i> ข้อมูลผู้ประกอบการ
						<c:if test="${bizclubOwner.corpType=='1'}">
							${bizclubOwner.corpName}
						</c:if>
						<c:if test="${bizclubOwner.corpType=='2'}">
							${bizclubOwner.taxesCorpName}
						</c:if>
						<c:if test="${bizclubOwner.corpType=='3'}">
							${bizclubOwner.personCorpName}
						</c:if>
						<c:if test="${bizclubOwner.corpType=='4'}">
							
						</c:if>
						</div>
					</div>
		      		<div class="col-md-12">
		      			<div class="col-md-3 col-md-offset-1">
		      			 <c:if test="${not empty bizclubOwner.logoPath}">
								            <img  class="img-thumbnail"  width="259" height="259" src="<c:url value="/getfile/logo/${bizclubOwner.userId}/xxx" />" alt="icon">
								            </c:if>
								            <c:if test="${ empty bizclubOwner.logoPath}">
								              <img  class="img-thumbnail"  width="259" height="259" s src="<c:url value="/resources/register/images/img_logo.png" />" alt="icon">
								            </c:if>
					<%--
							<img class="img-thumbnail" id="profile" width="259" height="259"  src="<c:url value="/resources/register/images/5.png" />" >
							 --%>
						</div>
						
						<div class="col-md-8">
						<span class="form-horizontal">
						    <fieldset>
					            <div class="form-group">
						            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ชื่อ-สกุล: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
						              <input class="form-control textsize" id="" value="${bizclubOwner.firstName} ${bizclubOwner.lastName}" type="text" disabled="disabled">
						          
									   </div>
					            </div>
					            <%-- 
					            <div class="form-group">
						            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ชื่อธุรกิจ: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
						             	<input class="form-control textsize" id="" value="" type="text" disabled="disabled">
						            </div>
					            </div>
					            --%>
					            <div class="form-group">
						            <label class="col-md-3 control-label" style="padding-bottom: 10px;">สินค้า/บริการ: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
						             	<input class="form-control textsize" id="" value="${bizclubOwner.services}" type="text" disabled="disabled">
						            </div>
					            </div>
					            <div class="form-group">
						            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ประเภทธุรกิจ: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
						             	<input class="form-control textsize" id="" value="${bizclubOwner.corpGroupIdShow}" type="text" disabled="disabled">
						            </div>
					            </div>
					            <div class="form-group">
						            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Facebook: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
						             	<input class="form-control textsize" id="" value="${bizclubOwner.facebook}" type="text" disabled="disabled">
						            </div>
					            </div>
					            <div class="form-group">
						            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Website: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
						             	<input class="form-control textsize" id="" value="${bizclubOwner.website}" type="text" disabled="disabled">
						            </div>
					            </div>
					            <div class="form-group">
						            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ที่อยู่: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
						               <textarea rows="3" cols="2" style="width:100%" disabled="disabled">${bizclubOwner.addressNo} ${bizclubOwner.addressName} ${bizclubOwner.addressSubDistrictShow} ${bizclubOwner.addressDistrictShow} ${bizclubOwner.addressProvinceShow} ${bizclubOwner.addressPostCodeShow}
						               </textarea>
						               <%--
						             	<input class="form-control textsize" id="" value=""  type="text" disabled="disabled">
						             	 --%>
						            </div>
					            </div>
					            
					            <div class="form-group">
						            <label class="col-md-3 control-label" style="padding-bottom: 10px;">จังหวัด: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
						             	<input class="form-control textsize" id="" value="${bizclubOwner.bizclubProvinceShow}" type="text" disabled="disabled">
						            </div>
					            </div>
					            <div class="form-group">
						            <label class="col-md-3 control-label" style="padding-bottom: 10px;">เบอร์โทรศัพท์: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
						            	<input class="form-control textsize" id="" value="${bizclubOwner.mobilePhone}" type="text" disabled="disabled">
						            </div>
					            </div>
					            <div class="form-group">
						            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Email: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
						                <input class="form-control textsize" id="" value="${bizclubOwner.email}" type="text" disabled="disabled">
						            </div>
					            </div>
					            <div class="form-group">
						            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Line ID: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
						                <input class="form-control textsize" id="" value="${bizclubOwner.lineId}" type="text" disabled="disabled">
						            </div>
					            </div>
				            </fieldset>
						</span>
					</div>
		      		</div>
		      	</div>
		      </div>
	      	</div>
				<button onclick="goBackToMemeber('${bcId}')" class="btn btn-fab btn-fab btn-raised btn-material-lightyellow" style="float: right;"><i class="mdi-content-reply"></i></button>      		
	      </div>
  		</div>
	</div>
	      <!-- ------------------------ detail-popup ------------------------------------- -->
<div id="detail-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-lg">
    <div class="modal-content" style="border-top: 5px solid #f0bb18; border-bottom: 5px solid #7e06b4;">
      <div class="modal-header" style="background-color: #fbb819">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
      </div>
      <div class="modal-body">
      	<div class="row">
      		<div class="col-md-12">
      			<div class="col-md-3">
	            	<img class="img-thumbnail" id="item" src="WebContent/resources/register/images/defult.png" alt="WebContent/resources/register/images/defult.png" data-src="holder.js"/>
	            	 <input type='file' id="profile_upload" name="profile_upload" onchange="URLitem(this);" style="font-size: 10px; "/>
      			</div>
      			<div class="col-md-9" style="padding-left: 0px;">
	            	<span class="form-horizontal">
				    	<fieldset>
		      				<div class="form-group">
					        	<label class="col-md-2 control-label">ชื่อสินค้า: </label>
					            <div class="col-md-9">
					                <input class="form-control textsize" id="" type="text" value="">
					            </div>
					        </div>
					        <div class="form-group">
					        	<label class="col-md-2 control-label">รายละเอียด: </label>
					            <div class="col-md-9">
					                <textarea class="form-control textsize" id="" cols="7" rows="5"></textarea>
					            </div>
					        </div>
			        	</fieldset>
			        </span>
	            </div>
      		</div>
      		<div class="col-md-offset-4">
		        <button class="btn btn-default btn-flat" data-dismiss="modal" style="font-weight: bold; font-size: 20px;">ยกเลิก</button>
		        <button type="button" onclick="deleteMemberItem()" class="btn btn-material-purple-800 btn-xs" data-dismiss="modal" style="font-weight: bold; font-size: 20px;">บันทึก</button>
	      	</div>
            </div>
        </div>
		</div>
      </div>
  	</div>
 </div>
 <!-- ------------------------------------------------------------------------------------------- -->
 <div id="member-popup2" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-lg">
    <div class="modal-content" style="border: 3px solid #fbb819;">
    <div class="modal-header" style="background-color: #fbb819">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <p class="modal-title" style="font-size: 28px; font-weight: bold; padding-bottom: 10px;">สนใจติดต่อ</p>
      </div>
      <div class="modal-body">
      	<div class="row">
		<div class="col-md-3 col-md-offset-1">
			<img class="img-thumbnail" id="mprofile" width="259" height="259"  src="<c:url value="/resources/register/images/img_logo.png" />" >
		</div>
		
		<div class="col-md-8">
		<span class="form-horizontal">
		    <fieldset>
		     <div id="store_element" class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ชื่อร้าน: </label>
		            <div class="col-md-6" style="padding-bottom: 10px;">
		              <input class="form-control textsize" id="mcorpName" value="" type="text" disabled="disabled">
		          
					   </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ชื่อ-สกุล: </label>
		            <div class="col-md-6" style="padding-bottom: 10px;">
		              <input class="form-control textsize" id="mfirstName" value="" type="text" disabled="disabled">
		          
					   </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Website: </label>
		            <div class="col-md-6" style="padding-bottom: 10px;">
		             <input class="form-control textsize" id="mwebsite" value="" type="text" disabled="disabled">
		           
		            </div>
	            </div>
	             <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Facebook: </label>
		            <div class="col-md-6" style="padding-bottom: 10px;">
		                  <input class="form-control textsize" id="mfacebook" value="" type="text" disabled="disabled">
		            </div>
	            </div>
	             
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ID Line: </label>
		            <div class="col-md-6" style="padding-bottom: 10px;">
		              <input class="form-control textsize" id="mlineID" value="" type="text" disabled="disabled">
		          
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">เบอร์โทรศัพท์: </label>
		            <div class="col-md-6" style="padding-bottom: 10px;">
		            <input class="form-control textsize" id="mmobile" value="" type="text" disabled="disabled">
		          
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Email: </label>
		            <div class="col-md-6" style="padding-bottom: 10px;">
		                <input class="form-control textsize" id="memail" value="" type="text" disabled="disabled">
		            </div>
	            </div>
<!-- ----------------------------------EDIT MODE---------------------------------------------- -->	            
<!-- 	            <div class="form-group"> -->
<!-- 		            <div class="col-lg-10"> -->
<!-- 		                <button class="btn btn-default" style="font-weight: bold; font-size: 24px;">ยกเลิก</button> -->
<!-- 		                <button type="submit" class="btn btn-material-green" style="font-weight: bold; font-size: 22px;">บันทึก</button> -->
<!-- 		            </div> -->
<!-- 		        </div> -->
<!-- ----------------------------------------------------------------------------------------- -->
		</fieldset>
	</span>
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
function URLitem(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#item')
                .attr('src', e.target.result)
                .width(200)
                .height(250);
        };

        reader.readAsDataURL(input.files[0]);
    }
}
</script>
<script>
      $(document).ready(function() {
          $.material.init();
      });
      function showMemeber(uid){
    	  $.ajax({
    		  type: "GET",
    		  contentType : 'application/json; charset=utf-8',
    		  url: "/bizclub/bizmem/item/"+uid,
    		  dataType : 'json'
    		})
    		  .done(function( msg ) {
    		   // alert( "Data Saved: " + msg.addressDistrict );
    		    // $("#id_member").val(msg.userId);
    		     if( msg.corpType ) {
    		    //	 alert(msg.corpType)
    		    var corpname="";
    		        if(msg.corpType=='1')
    		        	corpname=msg.corpName;
    		        else  if(msg.corpType=='2')
    		        	corpname=msg.taxesCorpName;
    		        else  if(msg.corpType=='3')
    		        	corpname=msg.personCorpName;
    		        else  if(msg.corpType=='3')
    		        	  $("#store_element").hide();
    		    	
    	    	     $("#mcorpName").val(msg.corpName); 
    		    }else{
    		    	  $("#store_element").hide();
    		    }
    		  
    		    $("#mfacebook").val(msg.facebook);
    		    $("#mfirstName").val(msg.firstName +" "+msg.lastName);
    		   // $("#mlastName").val(msg.lastName);
    		  //  $("#mnickName").val(msg.nickName);
    		  //  $("#corpId_modal").val(msg.corpId);
    		//    $("#corpName_modal").val(msg.corpName);
    		  //  $("#services_modal").val(msg.services);
    		    $("#mwebsite").val(msg.website);
    		    $("#memail").val(msg.email);
    		    $("#mmobile").val(msg.mobilePhone);
    		    $("#mlineID").val(msg.lineId);
    		    //$("#mlineName").val(msg.lineName);
    		          
    		    if(msg.logoFileName!=null && msg.logoFileName.length>0){
   		    		 $("#mprofile").attr("src","/bizclub/getfile/logo/"+msg.userId+"/xxx");
   		    		 
   		    	 }else{
   		    		 $("#mprofile").attr("src",'<c:url value="/resources/register/images/img_logo.png" />');
   		    	 }
   		    
    		   //  $("#brId").val(brId);
    		    //$("#cardId_modal").val(msg.cardId);
    		  
    		             $("#member-popup2").modal('show')
    		           
    		  });
    	//  data-toggle="modal" data-target="#member-popup"
      }
      function goBackToMemeber(userID){
    
    	  window.location.href="<c:url value='/product/member/"+userID+"'/>";
      }
</script>
<style>
body{
	font-family: 'th_k2d_july8regular';
}
</style>
</body>
</html>