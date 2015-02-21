<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<!-- -------------------------------------------------------------------------------------------------------------------------------- -->

<div style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin: 0 auto;">
		<h3 style="text-align: center;">คำร้องขอทั้งหมด</h3><br>
	      <div class="row">
	      	<div class="span8 offset2">
		      <div class="jumbotron">
		      	<div class="row">
		      		<div class="col-md-12">
		      			<div class="list-group">
		      			<c:if test="${not empty bizclubRegisters}"> 
        	 				<c:forEach items="${bizclubRegisters}" var="bizclubRegister" varStatus="loop"> 
		      				<div class="row">
			      				<div class="col-md-9" style="margin: 10px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								            <img class="circle" src="<c:url value="/resources/register/images/5.png" />" alt="icon">
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
									<br><br><br>
									<a href="#" style="color: orange; float: right;" data-toggle="modal" data-target="#member-popup">more<i class="mdi-av-play-circle-fill"></i></a>
						    	</div>
					    	</div>
					    	<div class="list-group-separator"></div>
						    <div class="row">
			      				<div class="col-md-9" style="margin: 10px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								            <img class="circle" src="<c:url value="/resources/register/images/female1.png" />" alt="icon">
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">น.ส. จารุวรรณ ปั้นทอง <span style="color: #a8a6a5;">(นิติบุคคล)</span></h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">หจ. อกาวิกา</p>
								            <span>เครื่องประดับอัญมณีสังเคราะห์</span>						        
								        </div>
								    </div>
							    </div>
							    <div class="col-md-3" style="margin: 10px 0px 0px 0px;">
									<br><br><br>
									<a href="#" style="color: orange; float: right;" data-toggle="modal" data-target="#member-popup">more<i class="mdi-av-play-circle-fill"></i></a>
						    	</div>
					    	</div>
						    <div class="list-group-separator"></div>
						    --%>
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
	      <!-- ------------------------------------------------------ -->
<div id="member-popup" class="modal fade" tabindex="-1">
  <div class="modal-dialog modal-md">
    <div class="modal-content">
      <div class="modal-body">
      	<div class="row">
      		<div class="col-md-11 col-md-offset-1">
      			
      			<form:form   id="approveForm" name="approveForm" modelAttribute="approveForm"    method="post" action="/bizclub/approve/action"
		cssClass="form-horizontal" role="form" >
		    <form:hidden path="approveStatus" id="approveStatus"/>
		    <form:hidden path="brId" id="brId"/>
				    <fieldset>
				    	<div class="form-group">
				        	<label class="col-md-5 control-label">เลชบัตรประชาชน: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="cardId_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">ชื่อ-สกุล: </label>
				            <div class="col-md-5"> 
				                <input class="form-control textsize" id="firstName_modal" type="text" value="" disabled="disabled">
				                - <input class="form-control textsize" id="lastName_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">ลักษณะธุรกิจ: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="type" type="text" value="นิติบุคคล" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">เลขทะเบียนนิติบุคคล: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="corpId_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">ชื่อนิติบุคคล/ชื่อทางการค้า: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="corpName_modal" type="text" value="บจ. เคเค อินเตอร์แบรนด์" disabled="disabled">
				            </div>
				        </div>
				       
				        <div class="form-group">
				        	<label class="col-md-5 control-label">สินค้า/บริการ: </label>
				            <div class="col-md-5">
				                <textarea id="services_modal" rows="2" cols="" class="form-control textsize" disabled="disabled"></textarea>
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">Website: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="website_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">Email: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="email_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">เบอร์โทรศัพท์: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="mobilePhone_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">Line: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="line" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">ประเภทธุรกิจ: </label>
				            <div class="col-md-5">
				            	<textarea rows="2" cols="" class="form-control textsize" disabled="disabled">ผู้ผลิต</textarea>
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">เกี่ยวข้องในธุรกิจ: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="" type="text" value="เจ้าของธุรกิจ ตำแหน่งประธานกรรมการ" disabled="disabled">
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">ที่อยู่: </label>
				            <div class="col-md-5">
				            	<textarea id="address_modal" rows="2" cols="" class="form-control textsize" disabled="disabled">
				            	
				            	</textarea>
				            </div>
				        </div>
				        <div class="form-group">
				        	<label class="col-md-5 control-label">จังหวัด: </label>
				            <div class="col-md-5">
				                <input class="form-control textsize" id="addressProvince_modal" type="text" value="" disabled="disabled">
				            </div>
				        </div>
				    	<div class="form-group">
				            <label for="select" class="col-md-5 control-label">กำหนดสิทธิ์:</label>
				            <div class="col-md-5">
				                <form:select path="roleModal" class="form-control textsize" >
				                  <c:if test="${myUser.userid==1}">
				                   <form:option value="1" label="ทั้งหมด" />
				                  </c:if>
				                 <form:option value="2" label="เจ้าหน้าที่" />
				                  <form:option value="3" label="สมาชิก" />
				                </form:select>
				            </div>
				        </div>
				        <div class="form-group">
				            <div class="col-md-10 col-lg-offset-2">
				                <button type="button" onclick="doApprove('1')" class="btn btn-material-green btn_popup">อนุมัติ</button>
				                <button type="button" onclick="doApprove('2')" class="btn btn-material-amber btn_popup">อนุมัติแบบมีเงื่อนไข</button>
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

<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
<script>
      $(document).ready(function() {
          $.material.init();
      });
      function doApprove(status){
       $("#approveStatus").val(status)
       document.getElementById('approveForm').submit();
      }
      function showApprove(brId){
    	  $.ajax({
    		  type: "GET",
    		  contentType : 'application/json; charset=utf-8',
    		  url: "item/"+brId,
    		  dataType : 'json'
    		})
    		  .done(function( msg ) {
    		   // alert( "Data Saved: " + msg.brFirstName );
    		      
    		          
    		     $("#brId").val(brId);
    		     $("#cardId_modal").val(brId);
    		     $("#corpId_modal").val(msg.corpId);
    		     $("#firstName_modal").val(msg.brFirstName)
    		       $("#lastName_modal").val(msg.brLastName)
    		        $("#corpName_modal").val(msg.corpName)
    		         $("#services_modal").val(msg.services)
    		          $("#website_modal").val(msg.website)
    		           $("#email_modal").val(msg.email)
    		            $("#mobilePhone_modal").val(msg.mobilePhone)
    		             $("#addressProvince_modal").val(msg.addressProvince)
    		             $("#member-popup").modal('show')
    		  });
    	//  data-toggle="modal" data-target="#member-popup"
      }
      
     
</script>
<style>
body{
	font-family: 'th_k2d_july8regular';
}
</style>
</body>
</html>