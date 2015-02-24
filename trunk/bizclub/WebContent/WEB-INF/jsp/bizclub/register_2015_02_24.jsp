<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>

<%@ include file="/WEB-INF/jsp/common/headerUnauthen.jsp" %>
<!-- -------------------------------------------------------------------------------------------------------------------------------- -->

<div style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin: 0 auto;">
		
		<form:form   id="registerForm" name="registerForm" modelAttribute="registerForm"    method="post" action="/bizclub/register/action"
		cssClass="form-horizontal" role="form" style="margin-bottom: 50px;">
		    <fieldset>
		    	<legend style="font-weight: bold; font-size: 32px;">สมัครสมาชิก</legend>
		    	<div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">เลขบัตรประชาชน: <span style="color: red;">*</span></label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		                <form:input path="bizclubRegisterM.cardId" cssClass="form-control textsize"
		                 placeholder="เลขบัตรประชาชน"  />
		               <%-- <input class="form-control textsize" id="id" placeholder="เลขบัตรประชาชน" type="text">  --%>
		            </div>
		           	<button>check</button>
<!-- 		           	  if(เลขบัตรประชาชนถูกต้อง){ -->
<!-- 			           	<span style="color: green;"><i class="mdi-navigation-check"></i></span> -->
<!-- 			           	}else{ -->
<!-- 			           	<span style="color: red;"><i class="mdi-navigation-close"></i></span> -->
<!-- 			           	} -->
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">ชื่อ-สกุล: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		                <form:input path="bizclubRegisterM.brFirstName" cssClass="form-control textsize"
		                 placeholder="ชื่อ"  /> - 
		                     <form:input path="bizclubRegisterM.brLastName" cssClass="form-control textsize"
		                 placeholder="นามสกุล"  />
		               <%--  <input class="form-control textsize" id="fname" placeholder="ชื่อ-สกุล" type="text">  --%>
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">วัน เดือน ปีเกิด: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		                <input class="form-control textsize" id="" placeholder="วัน เดือน ปีเกิด" type="date">
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">ที่อยู่: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		                <textarea class="form-control textsize" rows="3" id="textArea" placeholder="ที่อยู่"></textarea>
		            </div>
	            </div>
	            <div class="form-group">
					  <div class="col-md-2 col-md-offset-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox">
					    </label>
					    <label class="control-label" style="font-weight: bold;"> นิติบุคคล</label>
					  </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">เลขทะเบียนนิติบุคคล: <span style="color: red;">*</span></label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		             <form:input path="bizclubRegisterM.corpId" cssClass="form-control textsize"
		                 placeholder="เลขทะเบียนนิติบุคคล" /> 
		                <%-- <input class="form-control textsize" id="" placeholder="เลขทะเบียนนิติบุคคล" type="text">  --%>
		            </div>
        		    <button>check</button>
<!-- 		           	  if(เลขทะเบียนนิติบุคคลถูกต้อง){ -->
<!-- 			           	<span style="color: green;"><i class="mdi-navigation-check"></i></span> -->
<!-- 			           	}else{ -->
<!-- 			           	<span style="color: red;"><i class="mdi-navigation-close"></i></span> -->
<!-- 			           	} -->
	            </div>
         	    <div class="form-group">
		            <label class="col-md-3 col-md-offset-1 control-label" style="padding-bottom: 10px;">ชื่อนิติบุคคล/ชื่อทางการค้า: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		              <form:input path="bizclubRegisterM.corpName" cssClass="form-control textsize"
		                 placeholder="ชื่อนิติบุคคล/ชื่อทางการค้า" /> 
		               <%-- <input class="form-control textsize" id="" placeholder="ชื่อนิติบุคคล/ชื่อทางการค้า" type="text">  --%>
	                </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">สินค้า/บริการ: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		              <form:input path="bizclubRegisterM.services" cssClass="form-control textsize"
		                 placeholder="สินค้า/บริการ" /> 
		              <%--  <input class="form-control textsize" placeholder="></input>  --%>
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">ประเภทธุรกิจ: </label>
		            <div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> ผู้ผลิต
					    </label>
		            </div>
		            <div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> ธุรกิจบริการ
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
		            <div class="col-md-2 col-md-offset-4 checkbox checkbox-primary">
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
		            <label for="select" class="col-md-2 col-md-offset-2 control-label">ความเกี่ยวข้องกับธุรกิจ: </label>
		            <div class="col-lg-3" style="padding-top: 10px;">
		                <select class="form-control textsize" id="select">
		                    <option>เจ้าของธุรกิจ</option>
		                    <option>ทายาทธุรกิจ</option>
		                    <option>กรรมการ</option>
		                    <option>หุ้นส่วน</option>
		                    <option>อื่นๆ (ระบุ)</option>
		                </select>
		            </div>
		            <div class="col-md-3" style="padding-bottom: 10px;">
		                <input class="form-control textsize" placeholder="อื่นๆ (ระบุ)"></input><span style="color: red;"> (กรณีอื่นๆ โปรดระบุ)</span>
		            </div>
		        </div>
		        <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">ตำแหน่ง: </label>
		            <div class="col-md-3" style="padding-bottom: 10px;">
		                <input class="form-control textsize" id="" placeholder="ตำแหน่ง" type="text">
	                </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">กลุ่มธุรกิจ (Custer): </label>
		            <div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> Trader
					    </label>
		            </div>
		            <div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> ธุรกิจบริการ
					    </label>
		            </div>
		            <div class="col-md-2 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> แฟชั่น
					    </label>
		            </div>
	            	<div class="col-md-2 col-md-offset-4 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> สุขภาพและความงาม
					    </label>
		            </div>
		            <div class="col-md-3 checkbox checkbox-primary">
					  	<label>
					      <input type="checkbox"> ท่องเที่ยว+ร้านอาหาร+โรงแรม
					    </label>
		            </div>
	            </div>
	            <br><br>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">ชื่อเล่น: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		                <input class="form-control textsize" placeholder="ชื่อเล่น"></input>
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">รูปประจำตัว: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		                <input readonly="" class="form-control floating-label" placeholder="Browse..." type="text">
                		<input id="inputFile" multiple="" type="file">
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">Website: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		               <form:input path="bizclubRegisterM.website" cssClass="form-control textsize"
		                 placeholder="Website" /> 
		             <%--   <input class="form-control textsize" placeholder="Website"></input>  --%>
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">เบอร์โทรศัพท์: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		                  <form:input path="bizclubRegisterM.mobilePhone" cssClass="form-control textsize"
		                 placeholder="เบอร์โทรศัพท์" /> 
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">Email: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		              <form:input path="bizclubRegisterM.email" cssClass="form-control textsize"
		                 placeholder="Email" /> 
		              
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">Facebook: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		                <input class="form-control textsize" placeholder=Facebook></input>
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">ID Line: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		             <form:input path="bizclubRegisterM.lineId" cssClass="form-control textsize"
		                 placeholder="ID Line" /> 
		              
		            </div>
	            </div>
	            <div class="form-group">
		            <label class="col-md-2 col-md-offset-2 control-label" style="padding-bottom: 10px;">ชื่อ Line: </label>
		            <div class="col-md-4" style="padding-bottom: 10px;">
		                <input class="form-control textsize" placeholder="ชื่อ Line"></input>
		            </div>
	            </div>
	            <div class="form-group">
		            <div class="col-lg-10 col-lg-offset-4">
		                <button type="button" class="btn btn-default" style="font-weight: bold; font-size: 24px;">ยกเลิก</button>
		                <button type="submit" class="btn btn-material-purple" style="font-weight: bold; font-size: 22px;">ลงทะเบียน</button>
		            </div>
		        </div>
		    </fieldset>
		</form:form>
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