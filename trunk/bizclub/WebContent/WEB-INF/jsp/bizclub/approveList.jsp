<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<!-- -------------------------------------------------------------------------------------------------------------------------------- -->

<div style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin: 0 auto;">
	      <div class="row">
	      	<div class="span8 offset2">
		      <div class="jumbotron">
		      	<div class="row">
			      	<div class="col-md-4" style="background-color: #fbcb04; box-shadow: 1px 7px 15px #000; ">
						<div style="text-align: left;  color: #fff; font-size: 28px; font-weight: bold;">คำร้องขอทั้งหมด</div>
					</div>
					<div class="col-md-4">
					
						<select id="type_select"  class="form-control textsize"  onchange="changeTypeSelect(this.value)">
					            	<option value="2">สมาชิก</option>
					            	<option  value="4">เจ้าหน้าที่</option>
					    </select>
					</div>
		      		<div class="col-md-12">
		      			<div class="list-group">
		      			<c:if test="${not empty bizclubRegisters}"> 
        	 				<c:forEach items="${bizclubRegisters}" var="bizclubRegister" varStatus="loop"> 
		      				<div class="row">
			      				<div class="col-md-9" style="margin: 20px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
    		     							<c:if test="${not empty bizclubRegister.profileFileName}">
								            	<img class="circle"  width="56" height="56" src="/bizclub/getfile/profile/${bizclubRegister.brId}/register" alt="icon">
								            </c:if>
								            <c:if test="${ empty bizclubRegister.profileFileName}">
								              	<img class="circle"  width="56" height="56"  src="<c:url value="/resources/register/images/5.png" />" alt="icon">
								            </c:if>
								            
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">${bizclubRegister.brFirstName}  ${bizclubRegister.brLastName}
								              <c:if test="${bizclubRegister.isCorp=='1'}"> 
								            	<span style="color: #a8a6a5;">(นิติบุคคล)</span>
								            </c:if>
								            </h4>
								             <p class="list-group-item-text" style="margin-bottom: 5px;">${bizclubRegister.corpName}</p>
								            <span><c:out value="${bizclubRegister.services}"/></span>						        
								        </div>
								    </div>
							    </div>
							    <div class="col-md-3" style="margin: 10px 0px 0px 0px;">
									<br><br><br>
										<a href="#" style="color: orange; float: right;" onclick="showApprove('${bizclubRegister.brId}')">more<i class="mdi-av-play-circle-fill"></i></a>
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
	      <!-- ------------------------ member-popup ------------------------------------- -->
<div id="member-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-lg">
    <div class="modal-content" style="border: 5px solid #fbb819;">
      <div class="modal-header" style="background-color: #fbb819">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <p class="modal-title" style="font-size: 26px; font-weight: bold; padding-bottom: 20px;">ข้อมูลผู้ขอลงทะเบียน</p>
      </div>
      <div class="modal-body">
      	<div class="row">
      		<div class="col-md-12">
      			<div class="col-md-6" style="padding-left: 200px;">
      				<img class="img-thumbnail" width="180" height="190"  id="profile" src="<c:url value="/resources/register/images/icon.png" />" alt="" />
      			</div>
      			<div class="col-md-6" style="padding-left: 0px;">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">เลขบัตรประชาชน: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
					                <input class="form-control textsize" id="cardId_modal" placeholder="เลขบัตรประชาชน" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
      			<div class="col-md-6" style="padding-left: 0px;">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">ชื่อ-นามสกุล: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
					                 <input class="form-control textsize" id="firstName_modal" type="text" value="" disabled="disabled">
				                - <input class="form-control textsize" id="lastName_modal" type="text" value="" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
      			<div class="col-md-6" style="padding-left: 0px;">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">ชื่อเล่น: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
					                <input class="form-control textsize" id="nickname_modal" placeholder="ชื่อเล่น" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6" style="padding-left: 0px;">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">วัน เดือน ปีเกิด: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
					                <input class="form-control textsize" id="dateofbirth_modal" placeholder="วัน เดือน ปีเกิด" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6" style="padding-left: 0px;">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">เบอร์โทรศัพท์(มือถือ): </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
					                <input class="form-control textsize" id="mobilePhone_modal" placeholder="เบอร์โทรศัพท์(มือถือ)" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6" style="padding-left: 0px;">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">E-mail: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
					                <input class="form-control textsize" id="email_modal" placeholder="E-mail" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6" style="padding-left: 0px;">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">Line ID: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
					                <input class="form-control textsize" id="lineid_modal" placeholder="Line ID" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6" style="padding-left: 0px;">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">Line Name: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
					                <input class="form-control textsize" id="linename_modal" placeholder="Line Name" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-12">
		            <div class="col-md-6">
		            	<form class="form-horizontal">
			    			<fieldset>
			    				<div class="form-group">
						            <label class="col-md-5 control-label" style="padding-bottom: 10px;">ที่อยู่ที่สามารถติดต่อได้: </label>
						            <div class="col-md-6" style="padding-bottom: 10px;">
										<textarea style="width:500px" class="form-control textsize" id="address_modal" rows="2" cols="3" disabled="disabled"></textarea>
						            </div>
					            </div>
				            </fieldset>
			            </form>
		            </div>
	            </div>
<!-- ------------------------ กรณี เป็นบุคคลธรรมดา/ผู้ประกอบกิจการ(ทั่วไป) ------------------------------- -->
			<div hidden="">
	            <div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">ความเกี่ยวข้องกับธุรกิจ: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="corpConcerned_show_modal" placeholder="ความเกี่ยวข้องกับธุรกิจ" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">ตำแหน่ง: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="position_modal" placeholder="ตำแหน่ง" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
    		</div>
<!-- -------------------------- LOGO ----------------------------------------------------------- -->
				<div id="bizPhoto" class="col-md-6" style="padding-left: 230px; padding-bottom: 10px;">
      				<img class="img-thumbnail" width="160" height="160"  id="logo" src="<c:url value="/resources/register/images/img_logo.png" />" alt="" />
      			</div>
<!-- ----------------- ข้อมูลการประกอบธุรกิจ ==> กรณี เป็นนิติบุคคล ----------------------------------------- -->
			<div id="bizclubtype_1" hidden="">
				<div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">เลขทะเบียนนิติบุคคล: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="corpId_modal" placeholder="เลขทะเบียนนิติบุคคล" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">ชื่อนิติบุคคล: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="corpName_modal" placeholder="ชื่อนิติบุคคล" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
            </div>
<!-- ----------------- ข้อมูลการประกอบธุรกิจ ==> กรณี เป็นบุคคลธรรมดา/ผู้ประกอบธุรกิจ(จดทะเบียนพาณิชย์) ----------------------------------------- -->
			<div id="bizclubtype_2" hidden="">
				<div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">เลขทะเบียนพาณิชย์: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="taxesId_modal" placeholder="เลขทะเบียนพาณิชย์" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">ชื่อธุรกิจ: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="taxesCorpName_modal" placeholder="ชื่อธุรกิจ" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
            </div>
<!-- ----------------- ข้อมูลการประกอบธุรกิจ ==> กรณี เป็นบุคคลธรรมดา/ผู้ประกอบธุรกิจ(ทั่วไป) ----------------------------------------- -->
			<div id="bizclubtype_3" hidden=""> 
				<div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">ชื่อธุรกิจ: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="personCorpName_modal" placeholder="ชื่อธุรกิจ" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
            </div>
<!-- ---------------------------------------------------------------------------------------------------------------------- -->
				<div id="product_elelment" class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">สินค้า/บริการ: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="services_modal" placeholder="สินค้า/บริการ" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div id="biztype_element" class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">ประเภทธุรกิจ: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="corpGroupId_show_modal" placeholder="ประเภทธุรกิจ" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">Facebook: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="facebook_modal" placeholder="Facebook" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">Website: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="website_modal" placeholder="Website" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">เบอร์โทรศัพท์: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="corpMobile_modal" placeholder="เบอร์โทรศัพท์" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">ศูนย์เครือข่ายธุรกิจ BizClub: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
									<input class="form-control textsize" id="bizclubGroup_modal" placeholder="ศูนย์เครือข่ายธุรกิจ BizClub" type="text" disabled="disabled">
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">Level: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
					            <select id="level_modal" class="form-control textsize">
					             	<option  value="gold" selected="selected" >gold</option> 
					             	 <option  value="silver">silver</option> 
 									 <option  value="bronze">bronze</option> 
							      </select>
									
								</div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
	            <div class="col-md-6">
	            	<form class="form-horizontal">
		    			<fieldset>
		    				<div class="form-group">
					            <label class="col-md-5 control-label" style="padding-bottom: 10px;">สิทธิ์การเข้าใช้งาน: </label>
					            <div class="col-md-6" style="padding-bottom: 10px;">
					            <select id="role_select" class="form-control textsize" disabled="disabled">
					            	<option  value="2">เจ้าหน้าที่</option>
					            	<option value="3">สมาชิก</option>
					            </select>
					            </div>
				            </div>
			            </fieldset>
		            </form>
	            </div>
				<div class="col-md-12">
	      				<form:form   id="approveForm" name="approveForm" modelAttribute="approveForm"    method="post" action="/bizclub/approve/action"
		cssClass="form-horizontal" role="form" >
		    <form:hidden path="approveStatus" id="approveStatus"/>
		   <form:hidden path="approveCondition" id="approveCondition"/> 
		    <form:hidden path="approveRole" id="approveRole"/> 
		    <form:hidden path="level" id="level"/> 
		    <form:hidden path="brId" id="brId"/>
					    <fieldset>
					        <div class="form-group">
					            <div class="col-md-9 col-md-offset-3">
					               <button type="button" onclick="doApprove('1')" class="btn btn-material-green btn_popup">อนุมัติ</button>
				                <button type="button" onclick="showApproveCondtion()" class="btn btn-material-amber btn_popup">อนุมัติแบบมีเงื่อนไข</button>
				                <button type="button" onclick="doApprove('0')" class="btn btn-material-red btn_popup">ไม่อนุมัติ</button>
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
</div>
<!-- ------------------------------------------ case-popup --------------------------------------------------------- -->
<div id="case-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-md">
    <div class="modal-content">
      <div class="modal-header" style="background-color: green; color: #fff;">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <p class="modal-title" style="font-size: 24px; font-weight: bold; padding-bottom: 20px;">อนุมัติแบบมีเงื่อนไข</p>
      </div>
      <div class="modal-body">
      	<div class="col-md-12">
           	<form class="form-horizontal">
    			<fieldset>
    				<div class="form-group">
			            <label class="col-md-2 control-label" style="padding-bottom: 10px;">เงื่อนไข: </label>
			            <div class="col-md-9" style="padding-bottom: 10px;">
							<textarea id="approveConditionPrepare" class="form-control textsize" rows="" cols=""></textarea>
			            </div>
		            </div>
	            </fieldset>
            </form>
         </div>
      </div>
      <div class="modal-footer">
     
        <button  type="button" onclick="doApprove('2')" class="btn btn-material-green btn-md btn_popup" >Submit</button>
      </div>
    </div>
  </div>
</div>

<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
<script>
      $(document).ready(function() {
          $.material.init();
          $("#type_select").val('${approveForm.typeSelect}');
      });
      function changeTypeSelect(type){
    	  window.location.href="<c:url value='/approve/type/"+type+"'/>";
      }
      function doApprove(status){
    	if(status=='2'){
    		$("#approveCondition").val($("#approveConditionPrepare").val())
    	}
    	//alert($("#role_select").val())
    	$("#approveRole").val($("#role_select").val())
    	
    	$("#level").val($("#level_modal").val())
       $("#approveStatus").val(status)
       document.getElementById('approveForm').submit();
      }
      function showApproveCondtion(){
    	  $("#case-popup").modal('show')
      }
      function showApprove(brId){
    	  $.ajax({
    		  type: "GET",
    		  contentType : 'application/json; charset=utf-8',
    		  url: "/bizclub/approve/item/"+brId,
    		  dataType : 'json'
    		})
    		  .done(function( msg ) {
    		    //alert( "Data Saved: " + msg.brFirstName );
    		      
    		          
    		     $("#brId").val(brId);
    		    $("#cardId_modal").val(msg.cardId);
    		     $("#corpId_modal").val(msg.corpId);
    		     $("#nickname_modal").val(msg.brNickName);
    		     $("#firstName_modal").val(msg.brFirstName);
    		       $("#lastName_modal").val(msg.brLastName);
    		       $("#dateofbirth_modal").val(msg.dateOfBirthStr);
    		        $("#corpName_modal").val(msg.corpName);
    		         $("#services_modal").val(msg.services);
    		          $("#website_modal").val(msg.website);
    		           $("#email_modal").val(msg.email);
    		            $("#lineid_modal").val(msg.lineId);
    		           $("#linename_modal").val(msg.lineName) ;
    		            $("#mobilePhone_modal").val(msg.mobilePhone);
    		        
    		        	
    		             $("#address_modal").val(msg.addressNo+" "+msg.addressName+" "+msg.addressSubDistrictShow+" "+msg.addressDistrictShow+" "+msg.addressProvinceShow+" "+msg.addressPostCodeShow);
    		              $("#corpConcerned_modal").val(msg.corpConcerned);
    		              $("#corpConcernedName_modal").val(msg.corpConcernedName);
    		               $("#corpConcerned_show_modal").val(msg.corpConcerned);
    		               $("#position_modal").val(msg.position);
    		     $("#taxesId_modal").val(msg.taxesId);
    		     $("#taxesCorpName_modal").val(msg.taxesCorpName);
    		     $("#personCorpName_modal").val(msg.personCorpName);
    		     $("#corpGroupId_show_modal").val(msg.corpGroupIdShow);
    		     $("#facebook_modal").val(msg.facebook);
    		     $("#corpMobile_modal").val(msg.corpMobile);
    		     $("#bizclubGroup_modal").val(msg.bizclubProvinceShow);
    		     if(msg.level!=null && msg.level.length>0)
    		    	 $("#level_modal").val(msg.level);  
    		     if(msg.profileFileName!=null && msg.profileFileName.length>0){
    		    	 $("#profile").attr("src","/bizclub/getfile/profile/"+brId+"/register");
    		     }
    		     if(msg.logoFileName!=null && msg.logoFileName.length>0){
    		    	 $("#logo").attr("src","/bizclub/getfile/logo/"+brId+"/register");
    		     }
    		     if(msg.corpType=='4'){
    		    	 $("#role_select").val("2");
    		     }else
    		    	 $("#role_select").val("3");
    		     //$("#role_select").attr("disable","true");
    		             $("#member-popup").modal('show')
    		             $("#bizclubtype_"+msg.corpType).show();
    		             if(msg.corpType=='4'){
    		         		showForStaft(false);
    		         	}else
    		         		showForStaft(true);      
    		  });
    	//  data-toggle="modal" data-target="#member-popup"
      }
      
           
      var elements_staft=["biztype_element","product_elelment","bizclubtype_3","bizclubtype_2","bizclubtype_1","bizPhoto"];
      function showForStaft(isShow){
      	
      	   for(var i=0;i<elements_staft.length;i++){
      		   if(isShow)
      		  	 $("#"+elements_staft[i]).show();
      		   else
      			 $("#"+elements_staft[i]).hide();
      	   }
      } 
</script>
<style>
body{
	font-family: 'th_k2d_july8regular';
}
</style>
</body>
</html>