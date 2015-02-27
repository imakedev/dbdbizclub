<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<!-- -------------------------------------------------------------------------------------------------------------------------------- -->

<div style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin: 0 auto;">
	<div class="col-md-9 col-md-offset-1" style="font-weight: bold; font-size: 32px; margin-bottom: 30px; text-align: center;">ข้อมูลสมาชิก
	<div class="list-group">
		<div class="list-group-separator"></div>
	</div>
	</div>
		<div class="row">
		<div class="col-md-3 col-md-offset-1">
		 <c:if test="${not empty memberForm.userM.profileFileName}">
			<img class="img-thumbnail"  width="259" height="259" src="<c:url value="/getfile/profile/${memberForm.userM.userId}/xx" />">
		</c:if>
		<c:if test="${ empty memberForm.userM.profileFileName}">
			<img class="img-thumbnail" width="259" height="259"  src="<c:url value="/resources/register/images/5.png" />" >
		</c:if>
		<%-- /bizclub/getfile/profile/${memberForm.userM.userId}/xxx	<img src="<c:url value="/resources/register/images/5.png" />" class="img-thumbnail" >
		 --%>
		</div>
		<div class="col-md-8">
		
		<form:form   id="memberForm" name="memberForm" modelAttribute="memberForm"    method="post" action="/bizclub/bizmem/update"
		cssClass="form-horizontal" role="form" >
		    <fieldset>
		    	<div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">เลขที่สมาชิก: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <input class="form-control textsize" id="id_member" type="text" value="${memberForm.userM.userId}" disabled="disabled">
		            </div>
	            </div>
		    	<div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">เลขบัตรประชาชน: <span style="color: red;">*</span></label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <input class="form-control textsize" id="id" value="${memberForm.userM.cardId}" type="text" disabled="disabled">
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ชื่อ-สกุล: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <form:input path="userM.firstName" cssClass="form-control textsize"
		                 placeholder="ชื่อ"  /> - 
		                     <form:input path="userM.lastName" cssClass="form-control textsize"
		                 placeholder="นามสกุล"  />
					        
					   </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Password </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		              <input type="password" id="userM.password" name="userM.password"  value="${userM.password}" class="form-control textsize"/>
		           <%--   <form: path="userM.password" value="${userM.password}" cssClass="form-control textsize"/>
		               <input class="form-control textsize" id="bd" value="" type="date">  --%>
		            </div>
	            </div>
	            <%--
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ที่อยู่: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <textarea class="form-control textsize" rows="3" id="textArea" disabled="disabled">
		                ${memberForm.userM.addressNo}  ${memberForm.userM.addressName} ${memberForm.userM.addressDistrict}
		                 ${memberForm.userM.addressSubDistrict} ${memberForm.userM.addressPostCode}  ${memberForm.userM.addressProvince}
		                </textarea>
		            </div>
	            </div>
	             --%>
	             <%--
	            <div class="form-group">
					  <div class="col-md-3 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox" value="">
					    </label>
					    <label class="control-label" style="font-weight: bold;"> นิติบุคคล</label>
					  </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">เลขทะเบียนนิติบุคคล: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <input class="form-control textsize" id="" value="${memberForm.userM.corpId}" type="text" disabled="disabled">
		            </div>
	            </div>
         	    <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ชื่อนิติบุคคล/ชื่อทางการค้า: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <input class="form-control textsize" id="" value="${memberForm.userM.corpName}" type="text" disabled="disabled">
	                </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">สินค้า/บริการ: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <form:input path="userM.services" cssClass="form-control textsize"/>

		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ประเภทธุรกิจ: </label>
		            <div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> ผู้ผลิต
					    </label>
		            </div>
		            <div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> ค้าส่ง
					    </label>
		            </div>
	            	<div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> ค้าปลีก
					    </label>
		            </div>
		            <div class="col-md-3 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> ธุรกิจบริการ
					    </label>
		            </div>
		            <div class="col-md-2 col-md-offset-3 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> นำเข้า
					    </label>
		            </div>
		            <div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> ส่งออก
					    </label>
		            </div>
		            <div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> อื่นๆ
					    </label>
		            </div>
	            </div>
	            <div class="form-group">
		            <label for="select" class="col-md-3 control-label">ความเกี่ยวข้องกับธุรกิจ: </label>
		            <div class="col-lg-5" style="padding-top: 10px;">
		                <select class="form-control textsize" id="select">
		                    <option>เจ้าของธุรกิจ</option>
		                    <option>ทายาทธุรกิจ</option>
		                    <option>กรรมการ</option>
		                    <option>หุ้นส่วน</option>
		                    <option>อื่นๆ (ระบุ)</option>
		                </select>
		            </div>
		            <div class="col-md-3" style="padding-bottom: 10px;">
		                <input class="form-control textsize"  value="" disabled="disabled"></input><span style="color: red;"> (กรณีอื่นๆ โปรดระบุ)</span>
		            </div>
		        </div>
		        <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ตำแหน่ง: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <input class="form-control textsize" id=""  value="" disabled="disabled" type="text">
	                </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">กลุ่มธุรกิจ (Custer): </label>
		            <div class="col-md-3 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> ธุรกิจบริการ
					    </label>
		            </div>
		            <div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> Trader
					    </label>
		            </div>
		            <div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> แฟชั่น
					    </label>
		            </div>
	            	<div class="col-md-3 col-md-offset-3 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> สุขภาพและความงาม
					    </label>
		            </div>
		            <div class="col-md-4 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> ท่องเที่ยว+ร้านอาหาร+โรงแรม
					    </label>
		            </div>
	            </div>
	            <br><br>
	            --%>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ชื่อเล่น: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                  <form:input path="userM.brNickName" cssClass="form-control textsize"/>
		            </div>
	            </div>
	            <%--
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">รูปประจำตัว: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <input readonly="" class="form-control floating-label" value="" type="text">
                		<input id="inputFile" multiple="" type="file" disabled="disabled">
		            </div>
	            </div>
	             --%>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Website: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		             <form:input path="userM.website" cssClass="form-control textsize"/>
		            
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">เบอร์โทรศัพท์: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		             <form:input path="userM.mobilePhone" cssClass="form-control textsize"/>
		         
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Email: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <form:input path="userM.email" cssClass="form-control textsize"/>
		               
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">Facebook: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                  <form:input path="userM.facebook" cssClass="form-control textsize"/>
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ID Line: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		             <form:input path="userM.lineId" cssClass="form-control textsize"/>
		              
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ชื่อ Line: </label>
		            <div class="col-md-5" style="padding-bottom: 10px;">
		                <form:input path="userM.lineName" cssClass="form-control textsize"/></div>
	            </div>
	          
	            <div class="form-group">
		            <div class="col-lg-10">
		                <button  type="button" class="btn btn-default" style="font-weight: bold; font-size: 24px;"><i class="mdi-content-reply"></i>กลับหน้าหลัก</button>
		                <button type="submit" class="btn btn-material-red" style="font-weight: bold; font-size: 22px;">แก้ไขข้อมูล</button>
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
		</form:form>
		</div>
		</div>
	</div>
</div>
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