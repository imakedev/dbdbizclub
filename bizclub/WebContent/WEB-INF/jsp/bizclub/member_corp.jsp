<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<%@ include file="/WEB-INF/jsp/common/search.jsp" %>
<sec:authorize access="hasAnyRole('ROLE_STAFF')" var="isStaff"/>
<!-- -------------------------------------------------BODY------------------------------------------------------------------------------- -->
<div style="background:#5E3752; padding:0px 0 20px 0;">
	<div class="row">
	<c:url var="post_url"  value="/bizmem/update" />
	
		<form:form   id="memberForm" name="memberForm" modelAttribute="memberForm"    method="post" action="${post_url}" enctype="multipart/form-data">
		<div class="col-md-10 col-md-offset-1" style="padding-top: 0px; padding-bottom: 40px;">
			<div class="col-md-12" style="background-color: #fff; padding-top: 30px;">
				<div class="col-md-2" style="border: 2px solid #FFB400; background-color:#000; padding-top: 10px;">
					<p style="font-size: 22px; font-weight:bold; color: #FFB400; text-align: center;"><i class="mdi-communication-contacts"></i> สถานะทางธุรกิจ</p>
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
								    <%-- onclick="showbizclubtype(this.value)"  --%>
								    <form:radiobutton path="userM.corpType" value="1" disabled="true"  /> 
								      <span style="margin-top: -5px; margin-left: 20px;">นิติบุคคล</span>
								    </label>
							    </div>
							    <div class="col-md-3 radio radio-primary">
								    <label class="radio-inline">
								      <form:radiobutton path="userM.corpType" value="2"  disabled="true"  /> 
								      <span style="margin-top: -5px; margin-left: 20px; width: 250px;">บุคคลธรรมดา(จดทะเบียนพาณิชย์)</span>
								    </label>
								</div>
								<div class="col-md-3 radio radio-primary">
								    <label class="radio-inline">
								      <form:radiobutton path="userM.corpType" value="3"  disabled="true"  /> 
								      <span style="margin-top: -5px; margin-left: 20px; width: 200px;">บุคคลธรรมดา(ผู้สนใจทั่วไป)</span>
								    </label>
							    </div>
							     <div class="col-md-3 radio radio-primary">
								    <label class="radio-inline">
								      <form:radiobutton path="userM.corpType" value="4" disabled="true"  /> 
								      <span style="margin-top: -5px; margin-left: 20px; width: 200px;">เจ้าหน้าที่กรมพัฒฯ</span>
								    </label>
							    </div>
						    </div>
			            </div>
			    	</fieldset>
		    	  </span> 
	    	</div>
			
<!-- -------------------------------------- กรณี เป็นบุคคลธรรมดา/ผู้ประกอบกิจการ(ทั่วไป) ---------------------------------------------------- -->			
<div hidden="">
			
			<div class="col-md-12" style="background-color: #fff; padding-top: 30px; ">
				<div class="col-md-2" style="border: 2px solid #FFB400; background-color:#000; padding-top: 10px;">
					<p style="font-size: 22px; color: #FFB400; text-align: center;"><i class="mdi-action-assignment-ind"></i> เกี่ยวข้องกับธุรกิจ</p>
	          	</div>
          	</div>
          	
          	 	<div class="col-md-12" style="background-color: #fff; padding-top: 40px;">
				<span class="form-horizontal">
			    	<fieldset>
				    	<div class="form-group">
				            <div class="col-md-10 col-md-offset-2">
				            	<span style="color: red; font-weight:bold; float: left;">*</span>
				            	<div class="col-md-3 radio radio-primary">
								    <label class="radio-inline">
								        <form:radiobutton path="userM.corpConcerned" value="1"   checked=""/>		
								      <span style="margin-top: -5px; margin-left: 20px; width: 100px;">เจ้าของธุรกิจ</span>
								    </label>
							    </div>
							    <div class="col-md-3 radio radio-primary">
								    <label class="radio-inline">
								        <form:radiobutton path="userM.corpConcerned" value="2"  />	
								      <span style="margin-top: -5px; margin-left: 20px; width: 100px;">ทายาทธุรกิจ</span>
								    </label>
								</div>
							    <div class="col-md-1 radio radio-primary">
								    <label class="radio-inline">
								         <form:radiobutton path="userM.corpConcerned" value="3"  />	
								      <span style="margin-top: -5px; margin-left: 20px; text-align: right;">อื่นๆ </span>
								      
								    </label>
							    </div>
							    <div class="col-md-3">
							    <form:input path="userM.corpConcernedName" cssClass="form-control textsize"
		                 placeholder="รหัสระบุ"  /> 
								   
								</div>
						    </div>
			            </div>
			            <div class="form-group">
				            <label class="col-md-3 control-label" style="padding-bottom: 10px;">ตำแหน่ง: <span style="color: red;">*</span></label>
				            <div class="col-md-4" style="padding-bottom: 10px;">
				               <form:input path="userM.position" cssClass="form-control textsize"
		                 placeholder="ตำแหน่ง"  /> 
				            </div>
			            </div>
		            </fieldset>
	            </span>
            </div>
</div>
<!-- ==================================================== ข้อมูลการประกอบธุรกิจ =================================================================== -->
				<div id="bizinfo_element" class="col-md-12" style="background-color: #fff; padding-top: 30px;  ">
				<div class="col-md-3" style="border: 2px solid #FFB400; background-color:#000; padding-top: 10px;">
					<p style="font-size: 22px; font-weight:bold; color: #FFB400; text-align: center;"><i class="mdi-social-people"></i> ข้อมูลการประกอบธุรกิจ</p>
	          	</div>
          	</div>
          	<div class="col-md-12" style="background-color: #fff;  ">
				<div id="bizinfo2_element" class="col-md-8" style="padding-top: 40px;">
					<span class="form-horizontal">
				    	<fieldset>
<!-- ----------------------------------- กรณี เป็นนิติบุคคล ------------------------------------------------------------- -->
    					<div id="bizclubtype_1" >
					    	<div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">เลขทะเบียนนิติบุคคล: <span style="color: red;">*</span></label>
					            <div class="col-md-7" style="padding-bottom: 10px;">
					              <form:input path="userM.corpId" id="corpId" cssClass="form-control textsize"
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
					              <form:input path="userM.corpName" id="corpName" cssClass="form-control textsize"
		                 placeholder="ชื่อนิติบุคคล"  />  
					            </div>
				            </div>
            			</div>
<!-- ----------------------------------- กรณี เป็นบุคคลธรรมดา/ผู้ประกอบธุรกิจ(จดทะเบียนพาณิชย์) ------------------------------------------------------------- -->
				    	<div id="bizclubtype_2" hidden="">
					    	<div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">เลขทะเบียนพาณิชย์: <span style="color: red;">*</span></label>
					            <div class="col-md-7" style="padding-bottom: 10px;">
					              <form:input path="userM.taxesId" id="taxesId" cssClass="form-control textsize"
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
					              <form:input path="userM.taxesCorpName" id="taxesCorpName" cssClass="form-control textsize"
		                 placeholder="ชื่อธุรกิจ"  /> 
					            </div>
				            </div>
			            </div>
<!-- ----------------------------------- กรณี เป็นบุคคลธรรมดา/ผู้ประกอบธุรกิจ(ทั่วไป) ------------------------------------------------------------- -->
				    	<div id="bizclubtype_3" hidden="">
				            <div class="form-group" style="margin-top: 20px;">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">ชื่อธุรกิจ: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="userM.personCorpName" id="personCorpName" cssClass="form-control textsize"
		                 placeholder="ชื่อธุรกิจ"  /> 
					            </div>
				            </div>
			            </div>
<!-- ------------------------------------------------------------------------------------------------------------------------ -->
			            
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">สินค้า/บริการ: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="userM.services" id="services" cssClass="form-control textsize"
		                 placeholder="สินค้า/บริการ"  /> 
					            </div>
				            </div>
				              <div id="group_biz_element"  class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">รหัสหมวดธุรกิจ: <span style="color: red;"></span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					                <form:input path="userM.btCode" id="btCode" cssClass="form-control textsize" placeholder="รหัสหมวดธุรกิจ"/>
					            </div>
							 </div>
							 <div id="group_biz_detail_element" class="form-group">
					            <label  class="col-md-4 control-label" style="padding-bottom: 10px;">รายละเอียดหมวดธุรกิจ: <span style="color: red;"></span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					                <form:textarea path="userM.btDesc"  id="btDesc" cssClass="form-control textsize" placeholder="รายละเอียดหมวดธุรกิจ" rows="2" cols="3"/>
					                
					            </div>
							 </div>
							 
						           
			            </fieldset>
		            </span>
	            </div>
	          
	            <!-- ---------------------------------- IMG LOGO --------------------------------- -->
        	    <div id="bizphoto_elment" class="col-md-4" style="padding:20px 0px 1px 100px;">
	            	  <c:if test="${not empty memberForm.userM.logoFileName}">
			<img class="img-thumbnail"  id="logo"  width="259" height="259" src="<c:url value="/getfile/logo/${memberForm.userM.userId}/xx" />">
		</c:if>
		<c:if test="${ empty memberForm.userM.logoFileName}">
			<img class="img-thumbnail"  id="logo"  width="259" height="259"  src="<c:url value="/resources/register/images/img_logo.png" />" >
		</c:if>
	            	<input type='file' id="corp_upload" name="corp_upload" onchange="readURL1(this);" style="font-size: 10px; "/>
	            	<%-- <input id="corp_upload" type="file" name="userfile" multiple>   --%>
	            </div>
	            <!-- ---------------------------------------------------------------------------- -->
	           <div id="biztype_element" class="col-md-11 col-md-offset-1">
		            <span class="form-horizontal">
		            <input type="hidden" id="corpGroupIdInit" value="${memberForm.userM.corpGroupId}">
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
						            <div class="col-md-3 checkbox checkbox-primary">
									  	<label>
									       <form:checkbox path="corpGroupIds" value="7"/> อื่นๆ
									      
									    </label>
						            </div>
						             <div class="col-md-3 checkbox checkbox-primary">
									  	<label>
									      <form:input path="userM.corpGroupDesc" cssClass="form-control textsize"
		                 placeholder="ระบุ" />
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
					              <form:input path="userM.facebook" cssClass="form-control textsize"
		                 placeholder="Facebook"  /> 
					               
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">Website: </label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="userM.website" cssClass="form-control textsize"
		                 placeholder="Website"  /> 
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">เบอร์โทรศัพท์: </label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="userM.corpMobile" cssClass="form-control textsize"
		                 placeholder="เบอร์โทรศัพท์"  /> 
					               
					            </div>
				            </div>	
				           
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">ศูนย์เครือข่ายธุรกิจ BizClub:<span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					             <c:if test="${isStaff}">
					              <form:select path="userM.bizclubProvince" cssClass="textsize"  disabled="true">
					             	 <form:options items="${provinceCenters}" itemValue="bcId" itemLabel="bcProviceName"/>
							      </form:select>
							     </c:if> 
							     <c:if test="${!isStaff}">
					              <form:select path="userM.bizclubProvince" cssClass="textsize" >
					             	 <form:options items="${provinceCenters}" itemValue="bcId" itemLabel="bcProviceName"/>
							      </form:select>
							     </c:if> 
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">Level: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					            <form:select path="userM.level" cssClass="textsize">
					             	 <form:option value="gold" label="gold" /> 
					             	 <form:option value="silver" label="silver" /> 
 									 <form:option value="bronze" label="bronze" /> 
							      </form:select>
					              
					            </div>
				            </div>
			            </fieldset>
		            </span>
	            </div>
	           
	           <div class="col-md-12" style="background-color: #fff; padding-top: 30px;  ">
				<div class="col-md-3" style="border: 2px solid #FFB400; background-color:#000; padding-top: 10px;">
					<p style="font-size: 22px; font-weight:bold; color: #FFB400; text-align: center;"><i class="mdi-social-person"></i> ข้อมูลส่วนบุคคล</p>
	          	</div>
          	</div>
          	<div class="col-md-12" style="background-color: #fff; ">
				<div class="col-md-8" style="padding-top: 40px;">
					<span class="form-horizontal">
				    	<fieldset>
					    	<div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">เลขบัตรประชาชน: <span style="color: red;">*</span></label>
					            <div class="col-md-7" style="padding-bottom: 10px;">
					                 <form:input path="userM.cardId" id="cardId" cssClass="form-control textsize"
		                 placeholder="เลขบัตรประชาชน" />
					              
					            </div>
					           	<button type="button" onclick="checkCardId()">check</button>
				            </div>
				            <div class="form-group">
					            <div class="col-md-10 col-md-offset-2">
					            	<span style="color: red; font-weight:bold; float: left;">*</span>
					            	<div class="col-md-2 radio radio-primary">
									    <label class="radio-inline">
									     <form:radiobutton path="userM.titleType" value="1"   checked="true"  />									      <span style="margin-top: -5px; margin-left: 20px;">นาย</span>
									    </label>
								    </div>
								    <div class="col-md-2 radio radio-primary">
									    <label class="radio-inline">
									       <form:radiobutton path="userM.titleType" value="2" />		
									      <span style="margin-top: -5px; margin-left: 20px;">นาง</span>
									    </label>
									</div>
									<div class="col-md-2 radio radio-primary">
									    <label class="radio-inline">
									       <form:radiobutton path="userM.titleType" value="3" />		
									      <span style="margin-top: -5px; margin-left: 20px;">นางสาว</span>
									    </label>
								    </div>
								    <div class="col-md-2 radio radio-primary">
									    <label class="radio-inline">
									       <form:radiobutton path="userM.titleType" value="4" />		
									      <span style="margin-top: -5px; margin-left: 20px; text-align: right;">อื่นๆ(ระบุ)</span>
									    </label>
								    </div>
								    <div class="col-md-3"> 
								      <form:input path="userM.titleName" cssClass="form-control textsize"
		                 placeholder=""  /> 
									 
									</div>
							    </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">ชื่อ-สกุล: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					               <form:input path="userM.firstName" cssClass="form-control textsize"
		                 placeholder="ชื่อ"  /> - 
		                     <form:input path="userM.lastName" cssClass="form-control textsize"
		                 placeholder="นามสกุล"  />
					            </div>
				            </div>
				               <div class="form-group">
		            <label class="col-md-4 control-label" style="padding-bottom: 10px;">Password (แก้ไข): </label>
		            <div class="col-md-8" style="padding-bottom: 10px;">
		              <input type="password" id="userM.password" name="userM.password"  value="${userM.password}" class="form-control textsize" placeholder="Password (แก้ไข)" />
		           <%--   <form: path="userM.password" value="${userM.password}" cssClass="form-control textsize"/>
		               <input class="form-control textsize" id="bd" value="" type="date">  --%>
		            </div>
	            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">ชื่อเล่น: </label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="userM.brNickName" cssClass="form-control textsize"
		                 placeholder="ชื่อเล่น"  /> 
					             
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">วัน เดือน ปีเกิด: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
<%-- 					             <form:input path="userM.dateOfBirthStr" cssClass="form-control textsize" --%>
<%-- 		                 placeholder="วัน เดือน ปีเกิด" type="date" /> --%>
<form:hidden path="userM.dateOfBirthStr"/>	
<div id="birthday" class='birthday-picker'>
</div>
   <%--
									<div class="col-md-2">
										<select class="form-control textsize" id="select">
						                    <option>วัน</option>
						                    <option>1</option>
						                    <option>2</option>
						                </select>
					                </div>
					                <div class="col-md-3">
						                <select class="form-control textsize" id="select">
						                    <option>เดือน</option>
						                    <option>มกราคม</option>
						                    <option>กุมภาพันธ์</option>
						                </select>
					                </div>
					                <div class="col-md-3">
						                <select class="form-control textsize" id="select">
						                    <option>ปี</option>
						                    <option>2557</option>
						                    <option>2556</option>
						                </select>
					                </div>
					                 --%>
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">เบอร์โทรศัพท์ (มือถือ): <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="userM.mobilePhone" cssClass="form-control textsize"
		                 placeholder="เบอร์โทรศัพท์ (มือถือ)"  /> 
					               
					            </div>
				            </div>
				            <div class="form-group">
					            <label class="col-md-4 control-label" style="padding-bottom: 10px;">E-mail: <span style="color: red;">*</span></label>
					            <div class="col-md-8" style="padding-bottom: 10px;">
					              <form:input path="userM.email" id="email" cssClass="form-control textsize"
		                 placeholder="E-mail"  /> 
					            </div>
				            </div>
				            <div class="form-group">
				            	<div class="row">
				            		<div class="col-md-5 col-md-offset-2">
							            <label class="col-md-5 control-label" style="padding-bottom: 10px;">Line ID:</label>
							            <div class="col-md-7" style="padding-bottom: 10px;">
							              <form:input path="userM.lineId" cssClass="form-control textsize"
		                 placeholder="Line ID"  /> 
							            </div>
						            </div>
						            <div class="col-md-5">
						            	<label class="col-md-5 control-label" style="padding-bottom: 10px;">Line Name: </label>
							            <div class="col-md-7" style="padding-bottom: 10px;">
							              <form:input path="userM.lineName" cssClass="form-control textsize"
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
							              <form:input path="userM.addressNo" cssClass="form-control textsize"
		                 placeholder="บ้านเลขที่"  /> 
							            </div>
						            </div>
						            <div class="col-md-5">
						            	<label class="col-md-5 control-label" style="padding-bottom: 10px;">ถนน/ซอย: </label>
							            <div class="col-md-7" style="padding-bottom: 10px;">
							              <form:input path="userM.addressName" cssClass="form-control textsize"
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
							          
							            <input type="hidden" value="${memberForm.userM.addressProvince}" id="addressProvinceInit" />
							                <form:select path="userM.addressProvince" id="addressProvince" cssClass="textsize" onchange="loadAddressAmphur(this.value,false)" >
							                	<%-- <form:option value="กรุงเทพมหานคร">กรุงเทพมหานคร</form:option>  --%>
							                	<form:options items="${provinces}" itemValue="provinceId" itemLabel="provinceName"/>
							                </form:select>
							            </div>
						            </div>
						            <div class="col-md-5">
						            	<label class="col-md-5 control-label" style="padding-bottom: 10px;">อำเภอ/เขต: <span style="color: red;">*</span></label>
							             <input type="hidden" value="${memberForm.userM.addressDistrict}" id="addressDistrictInit" />
							              
							            <div class="col-md-7" style="padding-bottom: 10px;" id="addressDistrictElement">
							              <form:select path="userM.addressDistrict" id="addressDistrict" onchange="loadAddressDistrict(this.value,false)" cssClass="textsize">
							                	
							                </form:select>
							            </div>
						            </div>
					            </div>
				            </div>
				            <div class="form-group">
				            	<div class="row">
				            		<div class="col-md-7">
							            <label class="col-md-7 control-label" style="padding-bottom: 10px;">ตำบล/แขวง: <span style="color: red;">*</span></label>
							           <input type="hidden" value="${memberForm.userM.addressSubDistrict}" id="addressSubDistrictInit" />
							            
							            <div class="col-md-5" style="padding-bottom: 10px;"  id="addressSubDistrictElement">
							            	<form:select path="userM.addressSubDistrict" id="addressSubDistrict" onchange="loadAddressZipcode(this,false)" cssClass="textsize">
							                	
							                </form:select>
							            </div>
						            </div>
						            <div class="col-md-5">
						            	<label class="col-md-6 control-label" style="padding-bottom: 10px;">รหัสไปรษณีย์: <span style="color: red;">*</span></label>
							            
							               <input type="hidden" value="${memberForm.userM.addressPostCode}" id="addressPostCodeInit" /> 
							            <div class="col-md-6" style="padding-bottom: 10px;"  id="addressPostCodeElement">
							             <%-- <form:input path="userM.addressPostCode" cssClass="form-control textsize"
		                 placeholder="รหัสไปรษณีย์"  />  --%> 
		                 				<form:select path="userM.addressPostCode" id="addressPostCode" cssClass="textsize">
							                	
							                </form:select>
							            </div>
						            </div>
					            </div>
				            </div>
			            </fieldset>
		            </span>
	            </div>
<!-- ---------------------------------------------------- ADD PIX --------------------------------------------------------- -->            
	            <div class="col-md-4" style="padding:20px 0px 0px 100px;">
	             <c:if test="${not empty memberForm.userM.profileFileName}">
			<img class="img-thumbnail"  id="profile"  width="259" height="259" src="<c:url value="/getfile/profile/${memberForm.userM.userId}/xx" />">
		</c:if>
		<c:if test="${ empty memberForm.userM.profileFileName}">
			<img class="img-thumbnail"  id="profile"  width="259" height="259"  src="<c:url value="/resources/register/images/5.png" />" >
		</c:if>
	            	 <input type='file' id="profile_upload" name="profile_upload" onchange="readURL(this);" style="font-size: 10px; "/>
	            </div>
			</div>
			 
	            <div class="form-group" style="padding-top: 50px;">
	            <div class="col-md-10 col-md-offset-4">
	                <button type="reset" class="btn btn-default" style="font-weight: bold; font-size: 24px;">ยกเลิก</button>
	                <button type="button" onclick="doAction()" class="btn btn-material-red" style="font-weight: bold; font-size: 22px;">แก้ไขข้อมูล</button>
	            </div>
	        </div> 
	            
            </div>
                   
		</div>
		</form:form>
	</div>
</div>
<!-- ----------------------------------------------------success Message กรณีบันทึกข้อมูลแล้ว------------------------------------------------------------------- -->
				<div id="success-popup" class="modal fade" tabindex="-1">
				  <div class="modal-dialog modal-sm">
				    <div class="modal-content">
				      <div class="modal-body" style="background-color: green;">
				      	<div class="row">
				      		<div class="col-md-12">
				      			<p style="text-align: center; font-size: 24px; font-weight: 500; color: #ffffff;">บันทึกข้อมูลเรียบร้อยแล้ว !</p>
							</div>
						</div>
				      </div>
				  	</div>
				 </div>
				</div>
<!-- ----------------------------------------------------------------------------------------------------------------------- -->
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
<script>
      $(document).ready(function() {
          $.material.init();
          $("#birthday").birthdaypicker(options={
        		  dateFormat:"littleEndian"
          });
          if("${save_success}"=='1'){
        	  //$("#success-popup").show();
        	  $("#success-popup").modal('show')
          }
          //alert("${save_success}")
          var dateOfBirthStr=$.trim($('input[id="userM.dateOfBirthStr"]').val());
          //alert(dateOfBirthStr)
          if(dateOfBirthStr!=null && dateOfBirthStr.length>0){
        	  var dateOfBirthStrArray=dateOfBirthStr.split("/");
        	//  alert(parseInt(dateOfBirthStrArray[1],10))
        	  $('select[name="birth[day]"]').val(parseInt(dateOfBirthStrArray[0],10));
        	  $('select[name="birth[month]"]').val(parseInt(dateOfBirthStrArray[1],10));
        	  $('select[name="birth[year]"]').val(parseInt(dateOfBirthStrArray[2],10));
          }
          
          /*
    	  var birth_day=$('select[name="birth[day]"]').val();
    		var birth_month=$('select[name="birth[month]"]').val();
    		var birth_year=$('select[name="birth[year]"]').val();
    		//alert(birth_day+","+birth_month+","+birth_year)
    		if(birth_day=='0'){
    			alert("กรุณากรอก วัน เกิด");
    			$('select[name="birth[day]"]').focus();
    			  return false;
    		}
    		if(birth_month=='0'){
    			alert("กรุณากรอก เดือน เกิด");
    			$('select[name="birth[month]"]').focus();
    			  return false;
    		}
    		if(birth_year=='0'){
    			alert("กรุณากรอก ปี เกิด");
    			$('select[name="birth[year]"]').focus();
    			  return false;
    		}
    		*/
    		//$('input[id="bizclubRegisterM.dateOfBirthStr"]').val(birth_day+"/"+birth_month+"/"+birth_year);
    		//alert($('input[id="userM.dateOfBirthStr"]').val());
       
          $('#cardId').keyup(function() {
        	    var dInput = this.value;
        	   // alert(dInput.length)
        	   if ($.trim(dInput).length > 0 && !validateDigit2(dInput)) {
      	  		alert('กรอก  เฉพาะตัวเลขเท่านั้น.');
      	  		$("#cardId").val("");
      	  		$("#cardId").focus();
      	  		return false;
     			 }
        	    if(dInput.length==13)
        			checkCardId();
        	});
            $('#corpId').keyup(function() {
          	    var dInput = this.value;
          	   // alert(dInput.length)
          	   if ($.trim(dInput).length > 0 && !validateDigit2(dInput)) {
        	  		alert('กรอก  เฉพาะตัวเลขเท่านั้น.');
        	  		$("#corpId").val("");
        	  		$("#corpId").focus();
        	  		return false;
       			 }
          	   
          	});
            $('#taxesId').keyup(function() {
        	    var dInput = this.value;
        	   // alert(dInput.length)
        	   if ($.trim(dInput).length > 0 && !validateDigit2(dInput)) {
      	  		alert('กรอก  เฉพาะตัวเลขเท่านั้น.');
      	  		$("#taxesId").val("");
      	  		$("#taxesId").focus();
      	  		return false;
     			 }
        	   
        	});
           
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
	
	 var corpType= $('input[name="userM.corpType"]:checked').val();
	
	loadAddressAmphur($("#addressProvince").val(),true);
	initCorpGroup();
	 resetbizclubtype();
 	//resetFormBizclubType();
 	$("#bizclubtype_"+corpType).show();
 	$("#group_biz_element").show();
 	$("#group_biz_detail_element").show();
 	if(corpType=='4'){
 		showForStaft(false);
 	}else
 		showForStaft(true);
 	if(corpType=='4' || corpType=='3' ){
 		$("#group_biz_element").hide();
 		$("#group_biz_detail_element").hide();
 	}
	 //showbizclubtype(corpType);
});
function initCorpGroup(){
	  var corpBizTypes=$("#corpGroupIdInit").val();
	  if(corpBizTypes!=null && corpBizTypes.length>0){
		  corpBizTypes=corpBizTypes.split("-");
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
	  }
	
}

function doAction(){
	
	var birth_day=$('select[name="birth[day]"]').val();
	var birth_month=$('select[name="birth[month]"]').val();
	var birth_year=$('select[name="birth[year]"]').val();
	//alert(birth_day+","+birth_month+","+birth_year)
	if(birth_day=='0'){
		alert("กรุณากรอก วัน เกิด");
		$('select[name="birth[day]"]').focus();
		  return false;
	}
	if(birth_month=='0'){
		alert("กรุณากรอก เดือน เกิด");
		$('select[name="birth[month]"]').focus();
		  return false;
	}
	if(birth_year=='0'){
		alert("กรุณากรอก ปี เกิด");
		$('select[name="birth[year]"]').focus();
		  return false;
	}
	$('input[id="userM.dateOfBirthStr"]').val(birth_day+"/"+birth_month+"/"+birth_year);
	
	var cardId=$("#cardId").val();
	if ($.trim(cardId).length == 0) {
        alert('กรุณากรอก เลขบัตรประชาชน');
        $("#cardId").focus();
        return false;
    }
    if (!validateDigit(cardId)) {
    	  alert('กรอก  เลขบัตรประชาชน ผิด.');
    	  $("#cardId").focus();
    	  return false;
    }
    if ($.trim($('input[id="userM.firstName"]').val()).length == 0) {
        alert('กรุณากรอก ชื่อ');
        $('input[id="userM.firstName"]').focus();
        return false;
    }
    if ($.trim($('input[id="userM.lastName"]').val()).length == 0) {
        alert('กรุณากรอก นามสกุล');
        $('input[id="userM.lastName"]').focus();
        return false;
    }
    if ($.trim($('input[id="userM.dateOfBirthStr"]').val()).length == 0) {
        alert('กรุณากรอก วัน เดือน ปีเกิด');
        $('input[id="userM.dateOfBirthStr"]').focus();
        return false;
    }
    if ($.trim($('input[id="userM.mobilePhone"]').val()).length == 0) {
        alert('กรุณากรอก วัน เบอร์โทรศัพท์ (มือถือ)');
        $('input[id="userM.mobilePhone"]').focus();
        return false;
    }
    var sEmail=$("#email").val();
	if ($.trim(sEmail).length == 0) {
            alert('กรุณากรอก Email Address');
            $("#email").focus();
            return false;
        }
        if (!validateEmail(sEmail)) {
        	  alert('กรอก  Email Address ผิด.');
        	  $("#email").focus();
        	  return false;
        }
    
    if ($.trim($('input[id="userM.addressNo"]').val()).length == 0) {
        alert('กรุณากรอก ที่อยู่ที่สามารถติดต่อได้');
        $('input[id="userM.addressNo"]').focus();
        return false;
    }
   
   var corpType= $('input[name="userM.corpType"]:checked').val();
  
    if(corpType=='1'){
    	var corpId=$("#corpId").val();
    	if ($.trim(corpId).length == 0) {
            alert('กรุณากรอก เลขทะเบียนนิติบุคคล');
            $("#corpId").focus();
            return false;
        }
        if (!validateDigit(corpId)) {
        	  alert('กรอก  เลขทะเบียนนิติบุคคล ผิด.');
        	  $("#corpId").focus();
        	  return false;
        }
        if ($.trim($('#corpName').val()).length == 0) {
            alert('กรุณากรอก ชื่อธุรกิจ');
            $('#corpName').focus();
            return false;
        }
        if ($.trim($('#services').val()).length == 0) {
            alert('กรุณากรอก สินค้า/บริการ');
            $('#services').focus();
            return false;
        }
    }else if(corpType=='2'){
    	var taxesId=$("#taxesId").val();
    	if ($.trim(taxesId).length == 0) {
            alert('กรุณากรอก เลขทะเบียนพาณิชย์');
            $("#taxesId").focus();
            return false;
        }
        if (!validateDigit(taxesId)) {
        	  alert('กรอก  เลขทะเบียนพาณิชย์ ผิด.');
        	  $("#taxesId").focus();
        	  return false;
        }
        if ($.trim($('#taxesCorpName').val()).length == 0) {
            alert('กรุณากรอก ชื่อธุรกิจ');
            $('#taxesCorpName').focus();
            return false;
        }
        if ($.trim($('#services').val()).length == 0) {
            alert('กรุณากรอก สินค้า/บริการ');
            $('#services').focus();
            return false;
        }
        
    }else if(corpType=='3'){
    	 if ($.trim($('#services').val()).length == 0) {
             alert('กรุณากรอก สินค้า/บริการ');
             $('#services').focus();
             return false;
         }
    }
    
    if(corpType!='4' && corpType!='1'){
    	var isCorpGroupCheck=false;
     	 $("input[name=corpGroupIds]").each(function() { 
     			//  var  corpGroupId_value=$(this).val();
     			if($(this).prop('checked'))
     				isCorpGroupCheck=true;
     			
     	});
     	
     	 if(!isCorpGroupCheck){
     		  alert('กรุณากรอก ประเภทธุรกิจ');
     		  $("input[name=corpGroupIds]")[0].focus()
     		  return false;
     	 }
     	 
    }
    
    
    var valueCheck="";
    
    if(corpType=='1'){
    	valueCheck=jQuery.trim($("#corpId").val());;
    }else if(corpType=='2'){
    	valueCheck=jQuery.trim($("#taxesId").val());
    }else if(corpType=='3'){
    	valueCheck=jQuery.trim($("#cardId").val());
    }else if(corpType=='4'){
    	valueCheck=jQuery.trim($("#cardId").val());
    }
    
    document.getElementById("memberForm").submit(); 
    /*
    		$.ajax({
    			  type: "GET",
    			  contentType : 'application/json; charset=utf-8',
    			  url: "ws/check/"+valueCheck+"/"+corpType,
    			  dataType : 'json'
    			})
    			  .done(function( msg ) {
    				  //alert(msg)
    			     	if(msg!='0'){
    			     		alert("มีข้อมูลสมาชิกในระบบแล้ว")
    			     		return false;
    			     	}
    				
    			  });
    	*/	       

}

function validateDigit2(sDigit) {
	var filter = /^\d*[0-9](|.\d*[0-9]|,\d*[0-9])?$/;
   // var filter=/^\d$/;
    if (filter.test(sDigit)) {
        return true;
    }
    else {
        return false;
    }
}
function validateDigit(sDigit) {
    
    var filter=/^\d{13}$/;
    if (filter.test(sDigit)) {
        return true;
    }
    else {
        return false;
    }
}
function validateEmail(sEmail) {
	    //var filter = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
	    var filter=/^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
	    if (filter.test(sEmail)) {
	        return true;
	    }
	    else {
	        return false;
	    }
}
function loadAddressAmphur(provinceId,isinit){
	  $.ajax({
		  type: "GET",
		  contentType : 'application/json; charset=utf-8',
		  url: "/bizclub/ws/addr/amphur/"+provinceId,
		  dataType : 'json'
		})
		  .done(function( msg ) {
			 // alert(msg)
			  var listAmphur=msg;
			  var first_id= "";
			  if(isinit)
				  first_id= $("#addressDistrictInit").val();
			 
			  var str="<select id=\"addressDistrict\" name=\"userM.addressDistrict\" class=\"textsize\" onchange=\"loadAddressDistrict(this.value,false)\">";
			  for(var i=0;i<listAmphur.length;i++){
				
				  if(!isinit){
					  str=str+"<option value=\""+listAmphur[i].amphurId+"\">"+listAmphur[i].amphurName+"</option>";
					  if(i==0)
						  first_id=listAmphur[i].amphurId;
					  }else{
						  var selected="";
						  if(first_id!=null && first_id==listAmphur[i].amphurId){
							  selected=" selected ";
						  }
						  str=str+"<option value=\""+listAmphur[i].amphurId+"\" "+selected+">"+listAmphur[i].amphurName+"</option>";
					  }
			  }
			  str=str+"</select>";
			  $("#addressDistrictElement").html(str);
			  loadAddressDistrict(first_id,isinit)
			  /*
			  if(first_id!=null && first_id.length>0){
				  $("#addressDistrict").val(first_id);
				  //alert(first_id)
				  loadAddressDistrict(first_id,isinit)
			  }else{
				  alert("aumphur is null")
			  }
			 */
			  /*amphurId;
				 amphurName;
				 */
		
		  });
}
function loadAddressDistrict(districtId,isinit){
	  $.ajax({
		  type: "GET",
		  contentType : 'application/json; charset=utf-8',
		  url: "/bizclub/ws/addr/district/"+districtId,
		  dataType : 'json'
		})
		  .done(function( msg ) {
			  var listDistrict=msg;
			  var str="<select id=\"addressSubDistrict\" name=\"userM.addressSubDistrict\" class=\"textsize\" onchange=\"loadAddressZipcode(this.value,false)\">";
			  var first_id="";
			  if(isinit)
				  first_id=$("#addressSubDistrictInit").val();
			 
			  for(var i=0;i<listDistrict.length;i++){
				 
				  if(!isinit){
					  str=str+"<option value=\""+listDistrict[i].districtId+"\">"+listDistrict[i].districtName+"</option>";
				  if(i==0)
					  first_id=listDistrict[i].districtId;
				  }else{
					  var selected="";
					  if(first_id!=null && first_id==listDistrict[i].districtId){
						  selected=" selected ";
					  }
					  str=str+"<option value=\""+listDistrict[i].districtId+"\" "+selected+">"+listDistrict[i].districtName+"</option>";
				  }
			  }
			  str=str+"</select>";
			  $("#addressSubDistrictElement").html(str);
			  loadAddressZipcode(first_id,isinit)
			  /*
			  if(first_id!=null && first_id.length>0){
				  $("#addressSubDistrict").val(first_id);
				  loadAddressZipcode(first_id,isinit)
			  }else{
				  alert("tumbon is null")
			  }
			  */
			 // loadAddressZipcode(first_id,isinit)
			  /*
				private Integer districtId;
				private String districtName;	
		   */
		  });
}
function loadAddressZipcode(districtId,isinit){
	  $.ajax({
		  type: "GET",
		  contentType : 'application/json; charset=utf-8',
		  url: "/bizclub/ws/addr/zipcode/"+districtId,
		  dataType : 'json'
		})
		  .done(function( msg ) {
			  var listZipcode=msg;
			  var str="<select id=\"addressPostCode\" name=\"userM.addressPostCode\" class=\"textsize\" >";
			  var first_id="";
			   if(isinit)
				   first_id=$("#addressPostCodeInit").val();
			 
			  for(var i=0;i<listZipcode.length;i++){
					  var selected="";
					  if(first_id!=null && first_id==listZipcode[i].zipcodeId){
						  selected=" selected ";
					  }
					  str=str+"<option value=\""+listZipcode[i].zipcodeId+"\" "+selected+">"+listZipcode[i].zipcode+"</option>";
				 
			  }
			  str=str+"</select>";
			  $("#addressPostCodeElement").html(str);
			 /*
			  if(isinit){
				  $("#addressPostCode").val(first_id);
				  }
			 */
			  
			 
		  });
}

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
	if(corpType=='1'){	
	  $.ajax({
		  type: "GET",
		  contentType : 'application/json; charset=utf-8',
		  url: "/bizclub/ws/juristic/"+corpId,
		  dataType : 'json'
		})
		  .done(function( msg ) {
			  if(msg.corpCount==0){
				  alert("ไม่พบข้อมูล");
				  return false;
			  }
			  if(corpType=='1'){
					$("#corpName").val(msg.corpName);
			  }else{
				    $("#taxesCorpName").val(msg.corpName);
			  }
			  var isCommittee=false;
			  if(msg.committeeNames.length>0){
					$('input[id="userM.firstName"]').val()==msg.committeeNames[0]
					$('input[id="userM.lastName"]').val()==msg.committeeLastNames[0]
				}
			  /*
				for(var i=0;i<msg.committeeNames.length;i++){
					if(corpType=='1'){
						  if($('input[id="userM.lastName"]').val()==msg.committeeNames[i]){
							  isCommittee=true;
							break;
						  }
					  } 
				}
			  */
				/*
				if(!isCommittee){
					 alert("เฉพาะกรรมการเท่านั้น")
					  $('input[id="userM.brFirstName"]').focus();
					  $("#spec_name").html("(เฉพาะกรรมการเท่านั้น)")	
				}
				*/
		
		  });
	}
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
function resetFormBizclubType(){
	  $("input[name=corpGroupIds]").each(function() { 
		//  var  corpGroupId_value=$(this).val();
		  $(this).attr("checked",false);
		});
	  $("#corpId").val("");
	  $("#corpName").val("");
	  $("#services").val("");
	  $("#btCode").val("");
	  $("#btDesc").val("");
	  $("#taxesCorpName").val("");
	  $("#personCorpName").val("");
}
function showbizclubtype(type){
	
	window.location.href="<c:url value='/bizmem/get/"+${memberForm.userM.userId}+"/"+type+"'/>";
	
}
var elements_staft=["bizinfo_element","biztype_element","bizphoto_elment","bizinfo2_element"];
function showForStaft(isShow){
	   for(var i=0;i<elements_staft.length;i++){
		   if(isShow)
		  	 $("#"+elements_staft[i]).show();
		   else
			 $("#"+elements_staft[i]).hide();
	   }
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
