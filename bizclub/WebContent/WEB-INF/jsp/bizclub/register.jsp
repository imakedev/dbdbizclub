<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>

<%@ include file="/WEB-INF/jsp/common/headerUnauthen.jsp" %>
<!-- -------------------------------------------------BODY------------------------------------------------------------------------------- -->

<div style="background:#58047d; padding:20px 0 20px 0;">
	<div class="row">
	<c:url var="post_url"  value="/register/action" />
	
		<form:form   id="registerForm" name="registerForm" modelAttribute="registerForm"    method="post" action="${post_url}"
		>
		<div class="col-md-10 col-md-offset-1" style="padding-top: 40px; padding-bottom: 40px;">
			<div class="col-md-12" style="background-color: #fff; padding-top: 30px;">
				<div class="col-md-2" style="border: 1px solid #fbb100; padding-top: 10px;">
					<p style="font-size: 22px; color: #fbb100; text-align: center;"><i class="mdi-communication-contacts"></i> สถานะทางธุรกิจ</p>
	          	</div>
          	</div> 
          	<div class="col-md-12" style="background-color: #fff; padding-top: 40px;">
				<span class="form-horizontal"> 
			    	<fieldset>
			    		<div class="form-group">
				            <div class="col-md-12">
				            	<div class="col-md-2 col-md-offset-1 radio radio-primary" style="margin-top: -5px">
				            	<span style="color: red; font-weight:bold; float: left;">*</span>
								    <label class="radio-inline">
								    <%--   --%>
								    <form:radiobutton path="bizclubRegisterM.corpType" value="1" onclick="showbizclubtype(this.value)" checked="true"  /> 
								    <%--
								       <input name="chk1" value="option1" checked="" type="radio">
								        --%>
								      <span style="margin-top: -5px; margin-left: 20px;">นิติบุคคล</span>
								    </label>
							    </div>
							    <div class="col-md-3 radio radio-primary">
								    <label class="radio-inline">
								      <form:radiobutton path="bizclubRegisterM.corpType" value="2"  onclick="showbizclubtype(this.value)" /> 
								      <span style="margin-top: -5px; margin-left: 20px; width: 250px;">บุคคลธรรมดา(จดทะเบียนพาณิชย์)</span>
								    </label>
								</div>
								<div class="col-md-3 radio radio-primary">
								    <label class="radio-inline">
								      <form:radiobutton path="bizclubRegisterM.corpType" value="3"  onclick="showbizclubtype(this.value)" /> 
								      <span style="margin-top: -5px; margin-left: 20px; width: 200px;">บุคคลธรรมดา(ผู้สนใจทั่วไป)</span>
								    </label>
							    </div>
						    </div>
			            </div>
			    	</fieldset>
		    	  </span> 
	    	</div>
			<div class="col-md-12" style="background-color: #fff; padding-top: 30px; box-shadow: 5px 5px 10px #000; ">
				<div class="col-md-2" style="border: 1px solid #fbb100; padding-top: 10px;">
					<p style="font-size: 22px; color: #fbb100; text-align: center;"><i class="mdi-social-person"></i> ข้อมูลส่วนบุคคล</p>
	          	</div>
          	</div>
          	<div class="col-md-12" style="background-color: #fff; box-shadow: 5px 5px 10px #000;">
				<div class="col-md-8" style="padding-top: 40px;">
					<span class="form-horizontal">
				    	<fieldset>
					    	<div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">เลขบัตรประชาชน: <span style="color: red;">*</span></label>
					            <div class="col-md-7" style="padding-bottom: 10px;">
					                 <form:input path="bizclubRegisterM.cardId" id="cardId" cssClass="form-control textsize"
		                 placeholder="เลขบัตรประชาชน" />
					              
					            </div>
					           	<button type="button" onclick="checkCardId()">check</button>
				            </div>
				            <div class="form-group">
					            <div class="col-md-10 col-md-offset-2">
					            	<span style="color: red; font-weight:bold; float: left;">*</span>
					            	<div class="col-md-2 radio radio-primary">
									    <label class="radio-inline">
									     <form:radiobutton path="bizclubRegisterM.titleType" value="1"   checked="true"  />									      <span style="margin-top: -5px; margin-left: 20px;">นาย</span>
									    </label>
								    </div>
								    <div class="col-md-2 radio radio-primary">
									    <label class="radio-inline">
									       <form:radiobutton path="bizclubRegisterM.titleType" value="2" />		
									      <span style="margin-top: -5px; margin-left: 20px;">นาง</span>
									    </label>
									</div>
									<div class="col-md-2 radio radio-primary">
									    <label class="radio-inline">
									       <form:radiobutton path="bizclubRegisterM.titleType" value="3" />		
									      <span style="margin-top: -5px; margin-left: 20px;">นางสาว</span>
									    </label>
								    </div>
								    <div class="col-md-2 radio radio-primary">
									    <label class="radio-inline">
									       <form:radiobutton path="bizclubRegisterM.titleType" value="4" />		
									      <span style="margin-top: -5px; margin-left: 20px; text-align: right;">อื่นๆ(ระบุ)</span>
									    </label>
								    </div>
								    <div class="col-md-3"> 
								      <form:input path="bizclubRegisterM.titleName" cssClass="form-control textsize"
		                 placeholder=""  /> 
									 
									</div>
							    </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">ชื่อ-สกุล: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					               <form:input path="bizclubRegisterM.brFirstName" cssClass="form-control textsize"
		                 placeholder="ชื่อ"  /> - 
		                     <form:input path="bizclubRegisterM.brLastName" cssClass="form-control textsize"
		                 placeholder="นามสกุล"  />
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">ชื่อเล่น: </label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.brNickName" cssClass="form-control textsize"
		                 placeholder="ชื่อเล่น"  /> 
					             
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">วัน เดือน ปีเกิด: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					             <form:input path="bizclubRegisterM.dateOfBirthStr" cssClass="form-control textsize"
		                 placeholder="วัน เดือน ปีเกิด" type="date" />
		                  <%--
					                <input class="form-control textsize" id="Birth" placeholder="วัน เดือน ปีเกิด" type="date">
					                 --%>
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">เบอร์โทรศัพท์ (มือถือ): <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.mobilePhone" cssClass="form-control textsize"
		                 placeholder="เบอร์โทรศัพท์ (มือถือ)"  /> 
					               
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">E-mail: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.email" cssClass="form-control textsize"
		                 placeholder="E-mail"  /> 
					            </div>
				            </div>
				            <div class="form-group">
				            	<div class="row">
				            		<div class="col-md-5 col-md-offset-2">
							            <label class="col-md-5 control-label" style="padding-bottom: 10px;">Line ID:</label>
							            <div class="col-md-7" style="padding-bottom: 10px;">
							              <form:input path="bizclubRegisterM.lineId" cssClass="form-control textsize"
		                 placeholder="Line ID"  /> 
							            </div>
						            </div>
						            <div class="col-md-5">
						            	<label class="col-md-5 control-label" style="padding-bottom: 10px;">Line Name: </label>
							            <div class="col-md-7" style="padding-bottom: 10px;">
							              <form:input path="bizclubRegisterM.lineName" cssClass="form-control textsize"
		                 placeholder="Line Name"  /> 
							            </div>
						            </div>
					            </div>
				            </div>
				            <div class="form-group">
				            	<div class="row">
				            		<div class="col-md-7">
							            <label class="col-md-7 control-label" style="padding-bottom: 10px;">ที่อยู่ที่สามารถติดต่อได้: <span style="color: red;">*</span></label>
							            <div class="col-md-5" style="padding-bottom: 10px;">
							              <form:input path="bizclubRegisterM.addressNo" cssClass="form-control textsize"
		                 placeholder="บ้านเลขที่"  /> 
							            </div>
						            </div>
						            <div class="col-md-5">
						            	<label class="col-md-5 control-label" style="padding-bottom: 10px;">ถนน/ซอย: </label>
							            <div class="col-md-7" style="padding-bottom: 10px;">
							              <form:input path="bizclubRegisterM.addressName" cssClass="form-control textsize"
		                 placeholder="ถนน/ซอย"  /> 
							             
							            </div>
						            </div>
					            </div>
				            </div>
				            <div class="form-group">
				            	<div class="row">
				            		<div class="col-md-7">
							            <label class="col-md-7 control-label" style="padding-bottom: 10px;">จังหวัด: <span style="color: red;">*</span></label>
							            <div class="col-md-5" style="padding-bottom: 10px;">
							                <form:select path="bizclubRegisterM.addressProvince" cssClass="form-control textsize">
							                	<form:option value="กรุงเทพมหานคร">กรุงเทพมหานคร</form:option>
							                </form:select>
							            </div>
						            </div>
						            <div class="col-md-5">
						            	<label class="col-md-5 control-label" style="padding-bottom: 10px;">อำเภอ/เขต: <span style="color: red;">*</span></label>
							            <div class="col-md-7" style="padding-bottom: 10px;">
							              <form:select path="bizclubRegisterM.addressDistrict" cssClass="form-control textsize">
							                	<form:option value="อำเภอ/เขต">อำเภอ/เขต</form:option>
							                </form:select>
							            </div>
						            </div>
					            </div>
				            </div>
				            <div class="form-group">
				            	<div class="row">
				            		<div class="col-md-7">
							            <label class="col-md-7 control-label" style="padding-bottom: 10px;">ตำบล/แขวง: <span style="color: red;">*</span></label>
							            <div class="col-md-5" style="padding-bottom: 10px;">
							            <form:select path="bizclubRegisterM.addressSubDistrict" cssClass="form-control textsize">
							                	<form:option value="ตำบล/แขวง">ตำบล/แขวง</form:option>
							                </form:select>
							            </div>
						            </div>
						            <div class="col-md-5">
						            	<label class="col-md-6 control-label" style="padding-bottom: 10px;">รหัสไปรษณีย์: <span style="color: red;">*</span></label>
							            <div class="col-md-6" style="padding-bottom: 10px;">
							              <form:input path="bizclubRegisterM.addressPostCode" cssClass="form-control textsize"
		                 placeholder="รหัสไปรษณีย์"  /> 
							            </div>
						            </div>
					            </div>
				            </div>
			            </fieldset>
		            </span>
	            </div>
<!-- ---------------------------------------------------- ADD PIX --------------------------------------------------------- -->            
	            <div class="col-md-4" style="padding:20px 0px 0px 100px;">
	            	<img class="img-thumbnail" id="profile" src="<c:url value="/resources/register/images/icon.png" />" alt="<c:url value="/resources/register/images/icon.png" />" data-src="holder.js"/>
	            	<input type='file' onchange="readURL(this);" style="font-size: 10px; "/>
	            </div>
			</div>
<!-- -------------------------------------- กรณี เป็นบุคคลธรรมดา/ผู้ประกอบกิจการ(ทั่วไป) ---------------------------------------------------- -->			
<div hidden="">
			<div class="col-md-12" style="background-color: #fff; padding-top: 30px; box-shadow: 5px 5px 10px #000; ">
				<div class="col-md-2" style="border: 1px solid #fbb100; padding-top: 10px;">
					<p style="font-size: 22px; color: #fbb100; text-align: center;"><i class="mdi-action-assignment-ind"></i> เกี่ยวข้องกับธุรกิจ</p>
	          	</div>
          	</div>
          	<div class="col-md-12" style="background-color: #fff; padding-top: 40px; box-shadow: 5px 5px 10px #000; ">
				<span class="form-horizontal">
			    	<fieldset>
				    	<div class="form-group">
				            <div class="col-md-10 col-md-offset-2">
				            	<span style="color: red; font-weight:bold; float: left;">*</span>
				            	<div class="col-md-3 radio radio-primary">
								    <label class="radio-inline">
								        <form:radiobutton path="bizclubRegisterM.corpConcerned" value="1"   checked=""/>		
								      <span style="margin-top: -5px; margin-left: 20px; width: 100px;">เจ้าของธุรกิจ</span>
								    </label>
							    </div>
							    <div class="col-md-3 radio radio-primary">
								    <label class="radio-inline">
								        <form:radiobutton path="bizclubRegisterM.corpConcerned" value="2"  />	
								      <span style="margin-top: -5px; margin-left: 20px; width: 100px;">ทายาทธุรกิจ</span>
								    </label>
								</div>
							    <div class="col-md-1 radio radio-primary">
								    <label class="radio-inline">
								         <form:radiobutton path="bizclubRegisterM.corpConcerned" value="3"  />	
								      <span style="margin-top: -5px; margin-left: 20px; text-align: right;">อื่นๆ </span>
								    </label>
							    </div>
							    <div class="col-md-3">
							    <form:input path="bizclubRegisterM.corpConcernedName" cssClass="form-control textsize"
		                 placeholder="รหัสระบุ"  /> 
								   
								</div>
						    </div>
			            </div>
			            <div class="form-group">
				            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ตำแหน่ง: <span style="color: red;">*</span></label>
				            <div class="col-md-4" style="padding-bottom: 10px;">
				               <form:input path="bizclubRegisterM.position" cssClass="form-control textsize"
		                 placeholder="ตำแหน่ง"  /> 
				            </div>
			            </div>
		            </fieldset>
	            </span>
            </div>
</div>
<!-- ==================================================== ข้อมูลการประกอบธุรกิจ =================================================================== -->
			<div class="col-md-12" style="background-color: #fff; padding-top: 30px; box-shadow: 5px 5px 10px #000; ">
				<div class="col-md-3" style="border: 1px solid #fbb100; padding-top: 10px;">
					<p style="font-size: 22px; color: #fbb100; text-align: center;"><i class="mdi-social-people"></i> ข้อมูลการประกอบธุรกิจ</p>
	          	</div>
          	</div>
          	<div class="col-md-12" style="background-color: #fff; box-shadow: 5px 5px 10px #000; ">
				<div class="col-md-8" style="padding-top: 40px;">
					<span class="form-horizontal">
				    	<fieldset>
<!-- ----------------------------------- กรณี เป็นนิติบุคคล ------------------------------------------------------------- -->
    					<div id="bizclubtype_1" >
					    	<div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">เลขทะเบียนนิติบุคคล: <span style="color: red;">*</span></label>
					            <div class="col-md-7" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.corpId" id="corpId" cssClass="form-control textsize"
		                 placeholder="เลขทะเบียนนิติบุคคล"  /> 
					            </div>
					           	<button type="button" onclick="getCrop('1')">check</button>
			<!-- 		           	  if(เลขทะเบียนนิติบุคคล){ -->
			<!-- 			           	<span style="color: green;"><i class="mdi-navigation-check"></i></span> -->
			<!-- 			           	}else{ -->
			<!-- 			           	<span style="color: red;"><i class="mdi-navigation-close"></i></span> -->
			<!-- 			           	} -->
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">ชื่อนิติบุคคล: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.corpName" id="corpName" cssClass="form-control textsize"
		                 placeholder="ชื่อนิติบุคคล"  />  
					            </div>
				            </div>
            			</div>
<!-- ----------------------------------- กรณี เป็นบุคคลธรรมดา/ผู้ประกอบธุรกิจ(จดทะเบียนพาณิชย์) ------------------------------------------------------------- -->
				    	<div id="bizclubtype_2" hidden="">
					    	<div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">เลขทะเบียนพาณิชย์: <span style="color: red;">*</span></label>
					            <div class="col-md-7" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.taxesId" id="taxesId" cssClass="form-control textsize"
		                 placeholder="เลขทะเบียนพาณิชย์"  /> 
					            </div>
					           	<button type="button" onclick="getCrop('2')">check</button>
			<!-- 		           	  if(เลขทะเบียนพาณิชย์){ -->
			<!-- 			           	<span style="color: green;"><i class="mdi-navigation-check"></i></span> -->
			<!-- 			           	}else{ -->
			<!-- 			           	<span style="color: red;"><i class="mdi-navigation-close"></i></span> -->
			<!-- 			           	} -->
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">ชื่อธุรกิจ: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.taxesCorpName" id="taxesCorpName" cssClass="form-control textsize"
		                 placeholder="ชื่อธุรกิจ"  /> 
					            </div>
				            </div>
			            </div>
<!-- ----------------------------------- กรณี เป็นบุคคลธรรมดา/ผู้ประกอบธุรกิจ(ทั่วไป) ------------------------------------------------------------- -->
				    	<div id="bizclubtype_3" hidden="">
				            <div class="form-group" style="margin-top: 20px;">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">ชื่อธุรกิจ: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.personCorpName" id="personCorpName" cssClass="form-control textsize"
		                 placeholder="ชื่อธุรกิจ"  /> 
					            </div>
				            </div>
			            </div>
<!-- ------------------------------------------------------------------------------------------------------------------------ -->
			            
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">สินค้า/บริการ: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.services" id="services" cssClass="form-control textsize"
		                 placeholder="สินค้า/บริการ"  /> 
					            </div>
				            </div>
			            </fieldset>
		            </span>
	            </div>
	            <!-- ---------------------------------- IMG LOGO --------------------------------- -->
        	    <div class="col-md-4" style="padding:20px 0px 1px 100px;">
	            	<img class="img-thumbnail" id="logo" src="<c:url value="/resources/register/images/img_logo.png" />" alt="<c:url value="/resources/register/images/icon.png" />" data-src="holder.js"/>
	            	<input type='file' onchange="readURL1(this);" style="font-size: 10px; "/>
	            </div>
	            <!-- ---------------------------------------------------------------------------- -->
	            <div class="col-md-11 col-md-offset-1">
		            <span class="form-horizontal">
				    	<fieldset>
					    	<div class="form-group">
						    	<label class="col-md-2 control-label" style="padding-bottom: 10px; margin-left: -15px;">ประเภทธุรกิจ: <span style="color: red;">*</span></label>
					            <div class="col-md-9" style="padding-bottom: 10px;">
					                <div class="col-md-3 checkbox checkbox-primary">
									  	<label>
									  	  <form:checkbox path="corpGroupIds" value="1"/> ผู้ผลิต
									    </label>
						            </div>
						            <div class="col-md-3 checkbox checkbox-primary">
									  	<label>
									      <form:checkbox path="corpGroupIds" value="2"/> ธุรกิจบริการ
									    </label>
						            </div>
						            <div class="col-md-3 checkbox checkbox-primary">
									  	<label>
									       <form:checkbox path="corpGroupIds" value="3"/> ค้าส่ง
									    </label>
						            </div>
					            	<div class="col-md-3 checkbox checkbox-primary">
									  	<label>
									       <form:checkbox path="corpGroupIds" value="4"/> ค้าปลีก
									    </label>
						            </div>
						            <div class="col-md-3 checkbox checkbox-primary">
									  	<label>
									       <form:checkbox path="corpGroupIds" value="5"/> นำเข้า
									    </label>
						            </div>
						            <div class="col-md-3 checkbox checkbox-primary">
									  	<label>
									       <form:checkbox path="corpGroupIds" value="6"/> ส่งออก
									    </label>
						            </div>
						            <div class="col-md-2 checkbox checkbox-primary">
									  	<label>
									       <form:checkbox path="corpGroupIds" value="7"/> อื่นๆ
									    </label>
						            </div>
					            </div>
				            </div>
				    	</fieldset>
			    	</span>
		    	</div>
	            <div class="col-md-8">
					<span class="form-horizontal">
				    	<fieldset>
					    	<div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">Facebook: </label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.facebook" cssClass="form-control textsize"
		                 placeholder="Facebook"  /> 
					               
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">Website: </label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.website" cssClass="form-control textsize"
		                 placeholder="Website"  /> 
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">เบอร์โทรศัพท์: </label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="bizclubRegisterM.corpMobile" cssClass="form-control textsize"
		                 placeholder="เบอร์โทรศัพท์"  /> 
					               
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">ศูนย์เครือข่ายธุรกิจ BizClub: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:select path="bizclubRegisterM.bizclubGroup" cssClass="form-control textsize">
							                		<form:option value="กรุงเทพมหานคร">กรุงเทพมหานคร</form:option>
							      </form:select>
					            </div>
				            </div>
			            </fieldset>
		            </span>
	            </div>
	            
	            <div class="form-group" style="padding-top: 50px;">
	            <div class="col-md-10 col-md-offset-4">
	                <button type="reset" class="btn btn-default" style="font-weight: bold; font-size: 24px;">ยกเลิก</button>
	                <button type="submit" class="btn btn-material-purple" style="font-weight: bold; font-size: 22px;">ลงทะเบียน</button>
	            </div>
	        </div> 
	            
            </div>
                   
		</div>
		</form:form>
	</div>
</div>

<!-- --------------------------------------------------------------------------- -->
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
<script>
      $(document).ready(function() {
          $.material.init();
      });
</script>
<script>
function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#profile')
                .attr('src', e.target.result)
                .width(170)
                .height(180);
        };

        reader.readAsDataURL(input.files[0]);
    }
}
</script>
<script>
$(document).ready(function() {
	$('#cardId').keyup(function() {
	    var dInput = this.value;
	   // alert(dInput.length)
	    if(dInput.length==13)
			checkCardId();
	});
});
function getCrop(corpType){
	var corpId="";
	if(corpType=='1'){
		corpId=jQuery.trim($("#corpId").val());
		if(corpId.length!=13){
			alert(" กรุณากรอก เลขทะเบียนนิติบุคคล 13 หลัก ");
			$("$corpId").focus();
			return false;
		}
	}
	else {
		corpId=jQuery.trim($("#taxesId").val());
		if(corpId.length!=13){
			alert(" กรุณากรอก เลขทะเบียนพาณิชย์ 13 หลัก ");
			$("$corpId").focus();
			return false;
		}
	}
	
	  $.ajax({
		  type: "GET",
		  contentType : 'application/json; charset=utf-8',
		  url: "ws/corp/"+corpId+"/"+corpType,
		  dataType : 'json'
		})
		  .done(function( msg ) {
			  if(corpType=='1'){
					$("#corpName").val(msg.corpName);
			  }else{
				    $("#taxesCorpName").val(msg.corpName);
			  }
			  $("#services").val(msg.corpServices);
			  var corpBizTypes=msg.corpBizType.split("-");
			  $("input[name=corpGroupIds]").each(function() { 
				  var  corpGroupId_value=$(this).val();
				  //alert(corpGroupId_value)
				   for(var i=0;i<corpBizTypes.length;i++){
					//   alert("inner->"+corpBizTypes[i])
					   if(corpBizTypes[i]==corpGroupId_value){
						  // corpBizTypes[i].checked=true;
						  
						   $(this).attr("checked","true");
						//   alert( $(this).attr("checked"));
					   }
				   }
				});
			
		
		  });
	//  data-toggle="modal" data-target="#member-popup"
}
function checkID(id) {
	
    if(id.length != 13) return false;
    for(i=0, sum=0; i < 12; i++)

        sum += parseFloat(id.charAt(i))*(13-i);
    if((11-sum%11)%10!=parseFloat(id.charAt(12))) return false;
    return true;
}
function ckeckCardIdKeypress(){
	if($("#cardId").val().length==13)
		checkCardId();
}
function checkCardId() {
    if(!checkID($("#cardId").val())){
        alert('รหัสบัตรประชาชนไม่ถูกต้อง โปรดกลับไปกรอกอีกครั้ง !!');
    return false;
    }
}
function resetbizclubtype(){
	var size=3;
	for(var i=0;i<size;i++)
		$("#bizclubtype_"+(i+1)).hide();
}
function showbizclubtype(type){
	resetbizclubtype();
	$("#bizclubtype_"+type).show();
}
function readURL1(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#logo')
                .attr('src', e.target.result)
                .width(150)
                .height(150);
        };

        reader.readAsDataURL(input.files[0]);
    }
}
</script>
<style>
body{
	font-family: 'th_k2d_july8regular';
	font-size: 20px;
}
</style>
</body>
</html>