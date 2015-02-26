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
			        <div class="col-md-4">
				        <div class="form-group has-warning">
						    <div class="input-group col-md-offset-2">
						        <form:input class="form-control input-lg textsize" path="keyword" placeholder="คำที่ต้องการค้นหา" type="text"/>
						        <span class="input-group-btn">
						            <button class="btn btn-material-amber btn-flat" type="button" style="padding: 5px 10px"><i class="mdi-action-search"></i></button>
						        </span>
						    </div>
						</div>
					</div>
				</div>
	        </fieldset>
	      </form:form>
	      <div class="col-md-4 col-md-offset-8">
	      	<c:if test="${isAuthen==true}">
	      	<a href="#" class="btn btn-white" style="padding: 0px;"><img src="<c:url value="/resources/register/images/fb.png" />" width="30px" height="30px"/></a>
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
								            <img class="square" src="" alt="icon">
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">${bizclubAsset.baTitle}</h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">${bizclubAsset.baDetail}</p>
								         						        
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
									   	<c:if test="${isAuthen==true}">
									<br>
									<button class="btn btn-material-amber" type="button" style="padding: 5px 7px; float: right;"><i class="mdi-action-loyalty">Promotion</i></button>
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
  <div class="modal-dialog modal-md">
    <div class="modal-content">
      <div class="modal-body">
      	<div class="row">
      		<div class="col-md-12">
      		<c:url var="post_add_url"  value="/product/add" />
      		<c:url var="post_update_url"  value="/product/update" />
      			 <form:form cssClass="form-horizontal"  id="productItemAddForm" name="productItemAddForm"  modelAttribute="productItemAddForm"    method="POST" action="${post_add_url}">
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
                				<input id="inputFile" multiple="" type="file">
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
<!-- --------------------------------------------------------------------------------------------------------------- -->
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
<script>
      $(document).ready(function() {
          $.material.init();
      });
      function doAction(){
    	  var action=$("#action").val();
    	  document.getElementById('productItemAddForm').action=action;
    	  document.getElementById('productItemAddForm').submit();
      }
      
      function editProductItem(itemID){
    	  $.ajax({
    		  type: "GET",
    		  contentType : 'application/json; charset=utf-8',
    		  url: "item/"+itemID,
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
    	  	  document.getElementById('productItemForm').action="delete/"+itemID;
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