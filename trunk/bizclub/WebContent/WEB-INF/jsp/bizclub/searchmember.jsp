<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>

<%@ include file="/WEB-INF/jsp/common/header.jsp" %>

<!-- -------------------------------------------------------------------------------------------------------------------------------- -->

<div style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin: 0 auto;">
	
		<form:form   id="userForm" name="userForm" modelAttribute="userForm"    method="post" action="/bizclub/member/search"
		cssClass="form-inline" role="form" style="margin-bottom: 50px;">
		    <fieldset>
		    	<div class="row">
		    	<div class="col-md-12">
		    		<div class="form-group col-md-2">
		    			<label for="select" class="col-md-4 control-label">กลุ่ม:</label>
				    	<div class="col-md-8">
				          	<form:select path="searchUserType" cssClass="textsize" >
				          	 <%--	<form:option value="0" label="ทั้งหมด" />  --%>
		                	  	<form:option value="3" label="สมาชิก" />
		                	  	<form:option value="2" label="เจ้าหน้าที่" />
				            </form:select>
				        </div>
		        	</div>
		        	<div class="form-group col-md-2">
		    			<label for="select" class="col-md-5 control-label">จังหวัด:</label>
				    	<div class="col-md-7">
				    	<form:select path="searchProvinceCenter" cssClass="textsize" cssStyle="width:80px">
				    	            <form:option value="0" label="ทั้งหมด" />
					             	 <form:options items="${provinceCenters}" itemValue="bcId" itemLabel="bcProviceName"/>
						</form:select>
				        </div>
		        	</div>
		    		<div class="col-md-3">
				    	<div class="form-group">
				            <label for="select" class="col-md-6 col control-label">ประเภทธุรกิจ:</label>
				            <div class="col-md-6"> 
				               <form:select path="searchType" cssClass="textsize"  >
				                	 <form:option value="0" label="ทั้งหมด" />
				                	 <form:option value="1" label="ผู้ผลิต" />
				                	 <form:option value="2" label="ธุรกิจบริการ" />
				                	 <form:option value="3" label="ค้าส่ง" />
				                	 <form:option value="4" label="ค้าปลีก" />
				                	 <form:option value="5" label="นำเข้า" />
				                	 <form:option value="6" label="ส่งออก" />
				                	 <form:option value="7" label="อื่นๆ" />
				                </form:select>
				            </div>
				        </div>
		        	</div>
			        <div class="form-group col-md-3">
			            <label for="select" class="col-md-5 control-label">ค้นหาจาก:</label>
			            <div class="col-md-4">
			                <form:select path="searchForm" cssClass="textsize"> 
			                  <form:option value="0" label="ทั้งหมด" />
			                 <%-- <form:option value="1" label="เลขที่สมาชิก" />  --%>
							 <%-- <form:option value="2" label="เลขบัตรประชาชน" /> --%>
			                  <form:option value="3" label="ชื่อสมาชิก" />
			                  <form:option value="4" label="ชื่อทางการค้า" />
			                  <form:option value="5" label="สินค้า/บริการ" />
			                </form:select>
			            </div>
			        </div>
			        <div class="col-md-1">
				        <div class="form-group has-warning">
						    <div class="input-group">
						        <form:input  class="form-control input-lg textsize" style="margin-top: -5px;" path="keyword" placeholder="คำที่ต้องการค้นหา" type="text"/>
						       <%-- <span class="input-group-btn col-md-1">
						            <button class="btn btn-material-amber btn-flat" type="submit" style="padding: 5px 10px 5px 10px"><i class="mdi-action-search"></i></button>
						        </span>
						         --%>
						    </div>
						</div>
					</div>
				</div> 
				</div>
	        </fieldset>
	      </form:form>
	      <div class="row">
	      	<div class="span8 offset2">
		      <div class="jumbotron">
		      	<div class="row">
		      		<div class="col-md-12">
		      			<div class="list-group">
		      			<c:if test="${not empty users}"> 
        	 				<c:forEach items="${users}" var="user" varStatus="loop"> 
		      				<div class="row">
			      				<div class="col-md-9" style="margin: 10px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">  
								          <c:if test="${not empty user.profileFileName}">
								            <img class="circle"  width="56" height="56" src="<c:url value="/getfile/profile/${user.userId}/xxx" />" alt="icon">
								            </c:if>
								            <c:if test="${ empty user.profileFileName}">
								              <img class="circle"  width="56" height="56"  src="<c:url value="/resources/register/images/5.png" />" alt="icon">
								            </c:if>
								            <%--
								            
								            <img id="candidate_photo" width="128" height="128" src="getfile/candidateImg/${candidateForm.missCandidate.mcaId}/${candidateForm.missCandidate.mcaPictureHotlink}" />
						--%>
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">${user.firstName}  ${user.lastName}
								             <c:if test="${isAuthen==true}">
								                 <c:if test="${isAdmin}">
								             	<button class="btn btn-success btn-flat" style="padding: 5px 5px 5px 5px;" type="button" onclick="editMember('${user.userId}')"><i class="mdi-image-edit"></i></button>
												<%-- style="left:-60" --%>
												<button  class="btn btn-danger btn-flat" style="padding: 5px 5px 5px 5px;" type="button"  onclick="showDelete('${user.userId}')"><i class="mdi-action-delete"></i></button>
								            	</c:if>
								             </c:if>
								            <c:if test="${user.isCorp=='1'}"> 
								            	<span style="color: #a8a6a5;">(นิติบุคคล)</span>
								            </c:if>
								            </h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">${user.corpName}</p>
								            <span><c:out value="${user.services}"/></span>						        
								        </div>
								    </div>
							    </div>
							    <div class="col-md-3" style="margin: 10px 0px 0px 0px;">
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
									<br>
									<br>
									<a href="#" style="color: orange; float: right;" onclick="showMemeber('${user.userId}')" >รายละเอียด<i class="mdi-av-play-circle-fill"></i></a>
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
								            <img class="circle" src="<c:url value="/resources/register/images/female1.png" />" alt="icon">
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">น.ส. สกนธ์ทิพย์ นามสง่า <span style="color: #a8a6a5;">(นิติบุคคล)</span></h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">บจ. เอาท์ดอร์อินโนเวชั่น</p>
								            <span>อุปกรณ์แค้มปิ้ง ,กระเป๋ากันน้ำ,อุปกรณ์ยังชีพ</span>						        
								        </div>
								    </div>
							    </div>
							    <div class="col-md-3" style="margin: 10px 0px 0px 0px;">
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
									<br>
									<br>
									<a href="#" style="color: orange; float: right;" data-toggle="modal" data-target="#member-popup">more<i class="mdi-av-play-circle-fill"></i></a>
						    	</div>
					    	</div>
					    	<div class="list-group-separator"></div>
						    <div class="row">
			      				<div class="col-md-9" style="margin: 10px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								            <img class="circle" src="<c:url value="/resources/register/images/5.png" />" alt="icon">
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">นาย พิสุทธิ์ อัจฉริยาภิมุข <span style="color: #a8a6a5;">(นิติบุคคล)</span></h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">หจ. แม็กซิม่าครีเอชั่น</p>
								            <span>เครื่องประดับอัญมณีสังเคราะห์</span>						        
								        </div>
								    </div>
							    </div>
							    <div class="col-md-3" style="margin: 10px 0px 0px 0px;">
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
									<br>
									<br>
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
    <div class="modal-content" style="border-top: 5px solid #f0bb18; border-bottom: 5px solid #7e06b4;">
      <div class="modal-body">
      	<div class="row">
   			<div class="col-md-7 col-md-offset-5">
				<img class="img-thumbnail" id="profile" width="120" height="120" src="<c:url value="/resources/register/images/icon.png" />" >
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
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
<script>
      $(document).ready(function() {
          $.material.init();
          $( "#keyword" ).keypress(function( event ) {
        	  if ( event.which == 13 ) {
        	     event.preventDefault();
        	     document.getElementById("userForm").submit();
        	  }
        	 
        	});
      });
    
      function editMember(userid){
    	  window.location.href="<c:url value='/bizmem/get/"+userid+"'/>";
      }
      function deleteMemberItem(){
  	  	//alert(itemID);
  	  	var itemID=$("#item_delete").val();
  	  	  document.getElementById('memberItemForm').action="/bizclub/member/delete/"+itemID;
   		  document.getElementById('memberItemForm').submit();
  	  	
    }
      function showMemeber(uid){
    	  $.ajax({
    		  type: "GET",
    		  contentType : 'application/json; charset=utf-8',
    		  url: "bizmem/item/"+uid,
    		  dataType : 'json'
    		})
    		  .done(function( msg ) {
    		   // alert( "Data Saved: " + msg.addressDistrict );
    		    $("#userId_modal").val(msg.userId);
    		    $("#cardId_modal").val(msg.cardId);
    		    $("#fullName_modal").val(msg.firstName+" "+msg.lastName);
    		    $("#corpId_modal").val(msg.corpId);
    		    $("#corpName_modal").val(msg.corpName);
    		    $("#services_modal").val(msg.services);
    		    $("#website_modal").val(msg.website);
    		    $("#email_modal").val(msg.email);
    		    $("#mobilePhone_modal").val(msg.mobilePhone);
    		    $("#lineId_modal").val(msg.lineId);
			       
    		          
    		   //  $("#brId").val(brId);
    		    //$("#cardId_modal").val(msg.cardId);
    		  
    		             $("#member-popup").modal('show')
    		           
    		  });
    	//  data-toggle="modal" data-target="#member-popup"
      }
      function showDelete(itemID){
    	  $("#item_delete").val(itemID)
    	  $("#delete-popup").modal('show')
      } 
</script>
<style>
body{
	font-family: 'th_k2d_july8regular';
}
</style>
</body>
</html>