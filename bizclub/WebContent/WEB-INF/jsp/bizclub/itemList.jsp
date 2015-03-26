<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<!-- ------------------------------------------- END MENU/ BEGIN BODY ----------------------------------------------------------------------- -->

<div style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin: 0 auto;">
<c:url var="search_url"  value="/product/search" />
		<form:form   id="productForm" name="productForm" modelAttribute="productForm"    method="post" action="${search_url}"
		cssClass="form-inline" role="form" style="margin-bottom: 50px;">
		    <fieldset>
		    	<div class="row">
		    	 <div class="col-md-4">
<%--	
				    	<div class="btn-group" role="group" style="margin-top: 0px; border: 1px solid #663399">
						  <button type="button" class="btn btn-default" style="font-size: 16px; color: purple;">สินค้าทั้งหมด</button>
						  <button type="button" class="btn btn-default" style="font-size: 16px; color: purple;">สินค้าขายดี</button>
						  <button type="button" class="btn btn-default" style="font-size: 16px; color: purple;">ขายล่าสุด</button>
						</div>
					--%>	
		        	</div> 
		        	<div class="col-md-4">
		        	 	<c:if test="${isAuthen==true}">
				        <div class="form-group">
				            <label for="select" class="col-md-4 col-md-offset-5 control-label"></label>
				            <div class="col-md-1">
				                <form:select path="productType" cssClass="textsize" id="productType" onchange="doSearch()">
				                	<option value="1">ข้อมูลเครือข่าย</option>
				                	<option value="0">My Product</option>
				                	
				                </form:select>
				            </div>
				        </div>
				        </c:if>
			        </div>
			        <%--
			        <div class="col-md-4">
				        <div class="form-group">
				            <label for="select" class="col-md-4 col-md-offset-5 control-label">เรียงตาม:</label>
				            <div class="col-md-1">
				                <select class="form-control textsize" id="select">
				                	<option>ทั้งหมด</option>
				                	<option>ชื่อสินค้า</option>
				                    <option>วันที่เสนอขายสินค้า</option>
				                </select>
				            </div>
				        </div>
			        </div>
			         --%>
			        <div class="col-md-4">
				        <div class="form-group has-warning">
						    <div class="input-group col-md-offset-2">
						        <form:input class="form-control input-lg textsize" path="keyword" placeholder="คำที่ต้องการค้นหา" type="text"/>
						        <span class="input-group-btn">
						            <button class="btn btn-material-amber btn-flat" type="button" onclick="doSearch()" style="padding: 5px 10px"><i class="mdi-action-search"></i></button>
						        </span>
						    </div>
						</div>
					</div>
				</div>
	        </fieldset>
	      </form:form>
	      <div class="col-md-4 col-md-offset-8">
	      	<c:if test="${isAuthen==true}">
	      	<a href="https://m.facebook.com/dbdbizclubthailand" class="btn btn-white" style="padding: 0px;"><img src="<c:url value="/resources/register/images/fb.png" />" width="30px" height="30px"/></a>
	      	<a href="#" class="btn btn-white" style="padding: 0px;"><img src="<c:url value="/resources/register/images/tw.png" />" width="30px" height="30px"/></a>
	      	<a href="#" class="btn btn-white" style="padding: 0px;"><img src="<c:url value="/resources/register/images/gp.png" />" width="30px" height="30px"/></a>
	      	<button type="button" class="btn btn-default" data-toggle="modal" onclick="showAdd()" style="font-size: 16px; color: orange; border: 1px solid orange; padding: 5px 10px 5px 10px;"><i class="mdi-content-add"></i> เพิ่มสินค้าใหม่ </button>
	      </c:if>
	      </div>
	      <div class="row">
	      	<div class="span8 offset2">
		      <div class="jumbotron">
		      	<div class="row">
		      		<div class="col-md-12">
		      			<div class="list-group">
		      			<c:if test="${not empty bizclubAssets}"> 
        	 				<c:forEach items="${bizclubAssets}" var="bizclubAsset" varStatus="loop"> 
		      				<div class="row">
			      				<div class="col-md-9" style="margin: 10px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								         <c:if test="${not empty bizclubAsset.baPictureName}">
												<img class="square"   width="100" height="100" src="<c:url value="/getfile/product/${bizclubAsset.baId}/xx" />">
										</c:if>
										<c:if test="${ empty bizclubAsset.baPictureName}">
												 <img class="square"   width="100" height="100"  src="" alt="icon">
										</c:if>
								           <%-- getfile/product/${bizclubAsset.baId}/xxx"  --%>
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">${bizclubAsset.baTitle}</h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">${bizclubAsset.baDetail}</p>
								         						        
								        </div>
								        <div>
								            	<a href="#" onclick="showMemeber('${bizclubAsset.user.userId}')" style="font-size: 20px;">สนใจติดต่อ..</a>						        
								        	</div>
								    </div>
							    </div>
							    <div class="col-md-3" style="margin: 10px 0px 0px 0px;">
								    <span style="float: right;">
								    	<%-- 
								    	<button class="btn btn-success btn-flat bton" data-toggle="modal" data-target="#item-popup"><i class="mdi-image-edit"></i></button>
										<button class="btn btn-danger btn-flat bton" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
										 --%>
										 	<c:if test="${isAuthen==true}">
										 <button class="btn btn-success btn-flat bton" type="button" onclick="editProductItem('${bizclubAsset.baId}')"><i class="mdi-image-edit"></i></button>
										<button class="btn btn-danger btn-flat bton" type="button"  onclick="showDelete('${bizclubAsset.baId}')"><i class="mdi-action-delete"></i></button>
										</c:if>
								    </span>
							    	<span class="rating">
								        <input type="radio" class="rating-input" id="rating-input-1-5" name="rating-input-1"/>
								        <label for="rating-input-1-5" class="rating-star"></label>
								        <input type="radio" class="rating-input" id="rating-input-1-4" name="rating-input-1"/>
								        <label for="rating-input-1-4" class="rating-star"></label>
								        <input type="radio" class="rating-input" id="rating-input-1-3" name="rating-input-1"/>
								        <label for="rating-input-1-3" class="rating-star"></label>
								        <input type="radio" class="rating-input" id="rating-input-1-2" name="rating-input-1"/>
								        <label for="rating-input-1-2" class="rating-star"></label>
								        <input type="radio" class="rating-input" id="rating-input-1-1" name="rating-input-1"/>
								        <label for="rating-input-1-1" class="rating-star"></label>
									</span>
									<br>
									   	<c:if test="${isAuthen==true &&   productForm.productType=='0'}">
									<br>
									<button class="btn btn-material-amber" onclick="promoteProduct('${bizclubAsset.baId}')" type="button" style="padding: 5px 7px; float: right;"><i class="mdi-action-loyalty">Promotion</i></button>
									</c:if>
						    	</div>
					    	</div>
						    <div class="list-group-separator"></div>
						   </c:forEach>
						  </c:if>
						</div>
		      		</div>
		      	</div>
		      </div>
	      	</div>
	      </div>
	      <ul class="pager">
		    <li class="previous disabled"><a href="javascript:void(0)">← Older</a></li>
		    <li class="next"><a href="javascript:void(0)">Newer →</a></li>
		</ul>
  		</div>
	</div>
<!-- ----------------------------------------------------ADD/EDIT ITEM------------------------------------------------------------------- -->
<div id="item-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <div class="modal-body">
      	<div class="row">
      		<div class="col-md-12">
      		<c:url var="post_add_url"  value="/product/add" />
      		<c:url var="post_update_url"  value="/product/update" />
      			 <form:form cssClass="form-horizontal"  id="productItemAddForm" name="productItemAddForm"  modelAttribute="productItemAddForm"    method="POST" action="${post_add_url}"  enctype="multipart/form-data">
				    <fieldset>
				    	<div>
				    
				    		<h4 class="col-md-6 col-md-offset-5" style="color:purple;">เพิ่มสินค้าใหม่</h4>
				    		
				    	</div>
				        <div class="form-group">
				        	<label class="col-md-4 control-label" style="color:purple;">ชื่อสินค้า: </label>
				            <div class="col-md-6">
				             <form:hidden path="bizclubAssetM.baId" id="baId"/>
				                 <input type="hidden" id="action">
				                 <form:input path="bizclubAssetM.baTitle" id="baTitle" cssClass="form-control textsize"/>
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-4 control-label" style="color:purple;">ภาพสินค้า: </label>
				            <div class="col-md-6">
				                <input readonly="" class="form-control floating-label" placeholder="Browse..." type="text">
                				<input id="productFile" name="productFile"  type="file" multiple>
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-4 control-label" style="color:purple;">ราคา: </label>
				            <div class="col-md-6">
				             <form:input path="bizclubAssetM.baPrice" id="baPrice" cssClass="form-control textsize"/>
				            </div>
				            <label class="control-label" style="color:purple;"> บาท</label>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-4 control-label" style="color:purple;">รายละเอียดสินค้า: </label>
				            <div class="col-md-6">
				              <form:textarea path="bizclubAssetM.baDetail" id="baDetail" cssClass="form-control textsize" rows="3"/>
				            </div>
				        </div>
				        <div class="form-group">
				        	<div class="col-md-8 col-md-offset-3">
					        	<button  class="btn btn-white" style="font-weight: bold; font-size: 22px;" data-dismiss="modal">cancel</button>
					        	<button type="button" onclick="doAction()" class="btn btn-material-indigo" style="font-weight: bold; font-size: 22px;">Submit</button>
				        	</div>
				        </div>
			        </fieldset>
		        </form:form>
      		</div>
      	</div>
      </div>
  	</div>
 </div>
</div>
 	<!-- ----------------------------------delete-popup------------------------------------------------------------- -->
<div id="delete-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
      <div class="modal-body">
      	<form:form   id="productItemForm" name="productItemForm"   method="GET" action=""
		cssClass="form-horizontal">
		     <input type="hidden" id="item_delete">
			<fieldset>
	          	<div class="form-group">
		            <label class="col-lg-10 col-md-offset-1 control-label" style="text-align: center; font-size: 18px;">Are you sure?</label>
	        	</div>
	      	</fieldset>
	      </form:form>
      </div>
      <div class="modal-footer">
        <button type="button" onclick="deleteProductItem()" class="btn btn-material-blue-700 btn-xs" data-dismiss="modal">Yes</button>
        <button class="btn btn-material-grey-100 btn-xs" data-dismiss="modal">No</button>
      </div>
    </div>
  </div>
</div>
<div id="member-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-md">
    <div class="modal-content">
      <div class="modal-body">
      	<div class="row">
      		<div class="col-md-11 col-md-offset-1">
      			<form class="form-horizontal">
				    <fieldset>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">เลขที่สมาชิก: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="userId_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">เลชบัตรประชาชน: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="cardId_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">ชื่อ-สกุล: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="fullName_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <%--
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">ลักษณะธุรกิจ: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="type" type="text" value="นิติบุคคล" disabled="disabled">
				            </div>
				        </div>
				         --%>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">เลขทะเบียนนิติบุคคล: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="corpId_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">ชื่อนิติบุคคล/ชื่อทางการค้า: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="corpName_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">สินค้า/บริการ: </label>
				            <div class="col-md-5">
				                <textarea rows="2" cols="" id="services_modal" class="form-control textsize" disabled="disabled"></textarea>
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">Website: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="website_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">Email: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="email_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">เบอร์โทรศัพท์: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="mobilePhone_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label" style="color:purple;">Line: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="lineId_modal" type="text" value="Tode Dream Jockey" disabled="disabled">
				            </div>
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
			<img class="img-thumbnail" id="profile" width="259" height="259"  src="<c:url value="/resources/register/images/5.png" />" >
		</div>
		
		<div class="col-md-8">
		<span class="form-horizontal">
				    <fieldset>
		<%--    <fieldset>  --%>
		    	 <%-- <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">เลขที่สมาชิก: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <input class="form-control textsize" id="id_member" type="text" value="" disabled="disabled">
		            </div>
	            </div>
	           
		    	<div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">เลขบัตรประชาชน: <span style="color: red;">*</span></label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <input class="form-control textsize" id="mcardId" value="" type="text" disabled="disabled">
		            </div>   
	            </div>
	            --%>
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
	           <%--  
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ชื่อเล่น: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                 <input class="form-control textsize" id="mnickName" value="" type="text" disabled="disabled">
		            </div>
	            </div>
	        --%>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Website: </label>
		            <div class="col-md-6" style="padding-bottom: 10px;">
		             <input class="form-control textsize" id="mwebsite" value="" type="text" disabled="disabled">
		           
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
	           
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Facebook: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                  <input class="form-control textsize" id="mfacebook" value="" type="text" disabled="disabled">
		            </div>
	            </div>
	             
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ID Line: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		              <input class="form-control textsize" id="mlineID" value="" type="text" disabled="disabled">
		          
		            </div>
	            </div>
	             <%--
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ชื่อ Line: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                 <input class="form-control textsize" id="mlineName" value="" type="text" disabled="disabled">
		                </div>
	            </div>
	          
	           --%> 
<!-- ----------------------------------EDIT MODE---------------------------------------------- -->	            
<!-- 	            <div class="form-group"> -->
<!-- 		            <div class="col-lg-10"> -->
<!-- 		                <button class="btn btn-default" style="font-weight: bold; font-size: 24px;">ยกเลิก</button> -->
<!-- 		                <button type="submit" class="btn btn-material-green" style="font-weight: bold; font-size: 22px;">บันทึก</button> -->
<!-- 		            </div> -->
<!-- 		        </div> -->
<!-- ----------------------------------------------------------------------------------------- -->
		<%--    </fieldset>  --%>
	</fieldset>
	</span>
		</div>
	
</div>
</div>
</div>
</div>
</div>
<!-- --------------------------------------------------------------------------------------------------------------- -->
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
<script>
      $(document).ready(function() {
          $.material.init();
          $("#productType").val('${productForm.productType}')
      });
      function doSearch(){
    	  document.getElementById('productForm').submit();
      }
      function promoteProduct(baId){
    	  window.location.href="<c:url value='/product/promote/"+baId+"'/>";
      }
      function showMemeber(uid){
    	  $("#store_element").show();
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
    		           
    		    if(msg.profileFileName!=null && msg.profileFileName.length>0){
   		    	 $("#profile").attr("src","/bizclub/getfile/logo/"+msg.userId+"/xxx");
   		    	 }else{
   		    		 $("#profile").attr("src",'<c:url value="/resources/register/images/img_logo.png" />');
   		    	 }
    		  
    		   //  $("#brId").val(brId);
    		    //$("#cardId_modal").val(msg.cardId);
    		  
    		             $("#member-popup2").modal('show')
    		           
    		  });
    	//  data-toggle="modal" data-target="#member-popup"
      }
      function doAction(){
    	  var action=$("#action").val();
    	  document.getElementById('productItemAddForm').action=action;
    	  document.getElementById('productItemAddForm').submit();
      }
      
      function editProductItem(itemID){
    	  $.ajax({
    		  type: "GET",
    		  contentType : 'application/json; charset=utf-8',
    		  url: "/bizclub/product/item/"+itemID,
    		  dataType : 'json'
    		})
    		  .done(function( msg ) {
    			  //alert(msg.baTitle)
    			  $("#baId").val(msg.baId)
    			 $("#baTitle").val(msg.baTitle);
    			  $("#baDetail").val(msg.baDetail);
    			  $("#baPrice").val(msg.baPrice);
    			  $("#action").val('${post_update_url}');
    			  $("#item-popup").modal('show')
    		  });
      }
      function showAdd(){
    	  $("#action").val('${post_add_url}');

		  $("#baId").val("")
		 $("#baTitle").val("");
		  $("#baDetail").val("");
		  $("#baPrice").val("");
    	  $("#item-popup").modal('show')
      }
      function showDelete(itemID){
    	  $("#item_delete").val(itemID)
    	  $("#delete-popup").modal('show')
      }
      function deleteProductItem(){
    	  	//alert(itemID);
    	  	var itemID=$("#item_delete").val();
    	  	  document.getElementById('productItemForm').action="/bizclub/product/delete/"+itemID;
     		  document.getElementById('productItemForm').submit();
    	  	
      }
     
</script>
<style>
body{
	font-family: 'th_k2d_july8regular';
}
.bton {
    padding: 2px;
    margin: 0px;
  }
</style>
</body>
</html>