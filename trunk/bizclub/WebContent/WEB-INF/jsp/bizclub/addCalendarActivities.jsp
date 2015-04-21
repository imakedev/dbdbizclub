<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<%@ include file="/WEB-INF/jsp/common/search.jsp" %>
<%-- <%@ include file="/WEB-INF/jsp/common/footer.jsp" %> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<style>
			body{
				font-family: 'th_k2d_july8regular';
			}
			#calendar {
				max-width: 900px;
				margin: 0 auto;
				background-color: #f5f5f5;
                margin-left: 18px;
			}
		</style>
		<link href='<c:url value="/resources/calendar/fullcalendar.css" />' rel='stylesheet'/>
		<link href='<c:url value="/resources/calendar/fullcalendar.print.css" />' rel='stylesheet"'media='print' />
		
		<%-- <link href="<c:url value="/resources/register/css/bootstrap.min.css" />" rel="stylesheet">
		<link href='<c:url value="/resources/calendar/css/bootstrap-datetimepicker.min.css" />' rel="stylesheet"/>
		<link href='<c:url value="/resources/register/css/bootstrap-combined.min.css" />' rel="stylesheet"> 
		
		<script src="<c:url value="/resources/register/js/bootstrap.min.js" />"></script>--%>
		
		<script src='<c:url value="/resources/calendar/lib/moment.min.js" />' ></script>
		<script src='<c:url value="/resources/register/js/jquery.min.js" />'></script>
		<script src='<c:url value="/resources/calendar/fullcalendar.min.js" />' ></script>
		<script src='<c:url value="/resources/register/material/js/material.min.js" />'></script>
		<script src='<c:url value="/resources/calendar/js/bootstrap-datetimepicker.min.js" />'></script>

		<script>
      		$(document).ready(function() {
        		$.material.init();
        		//$('#startDatepicker').datepicker();
        		//$('#endDatepicker').datepicker();

				$('#commit').click(function(){
					var checkValidate = true;
					var checkFormat = false;
					var checkSelect = false;
					var errMsg = '';
					var errFmt = '';
					var title = $('#title').val();
					var detail = $('#detail').val();
					var sDate = $('#startDatepicker').val();
					var eDate = $('#endDatepicker').val()
					var type = $("input[type='radio']");

					var baType = type.filter(":checked").val();
					
					if(baType.length>0) checkSelect = true;

					var dateformat = /^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/;

					if(title.length==0) {
						checkValidate = false;
						errMsg = ' Title';
					}
					if(sDate.length==0){
						checkValidate = false;
						errMsg = errMsg + ' StartDate';
					}else{
               			if(sDate.match(dateformat)) checkFormat = true;
               			else errFmt = errFmt + ' StartDate';
					}
					if(eDate.length==0){
						checkValidate = false;
						errMsg = errMsg + ' EndDate';
					}else{
						if(eDate.match(dateformat)) checkFormat = true;
               			else errFmt = errFmt + ' EndDate';
					}

					if(checkValidate && checkFormat && checkSelect){
						document.activityForm.submit;
					}else{
						if(!checkValidate) alert(' Please insert'+errMsg);
						else if (!checkSelect) alert(' Please Select'+errMsg);
						else alert(' Wrong Format'+errFmt);
						return false;
					}
					
				});
				$('#cancel').click(function(){
					var url = '<c:url value="/news/activity/${bcId}" />';
        			location.href=url;
				});
				$('#datetimepicker').datetimepicker({
		        	format: 'dd/MM/yyyy hh:mm:ss'
		      	});
      		});
      		function goToPage(page){
				if(page.length>0){
	    	  		window.open(
	    			  page,
	    			  '_blank' // <- This is what makes it open in a new window.
	    			);
    	  		}
      		}
		</script>
		<script>
		function URLact(input) {
		    if (input.files && input.files[0]) {
		        var reader = new FileReader();
		
		        reader.onload = function (e) {
		            $('#activity')
		                .attr('src', e.target.result)
		                .width(190)
		                .height(130);
		        };
		
		        reader.readAsDataURL(input.files[0]);
		    }
		}
		</script>
		
	</head>
	<body>
		<c:url var="post_url"  value="/news/saveactivity" />
		<form:form   id="activityForm" name="activityForm" modelAttribute="calendarActivityForm"    method="post" action="${post_url}" enctype="multipart/form-data">
        <div style="background:#5E3752; padding:10px 0 20px 0;">
            <div class="container" style="background:#fff; margin-top: 40px; margin-bottom: 40px;"> 
                <div class="row">
                    <div class="col-md-3" style="margin-right: 10px;">
                        <div style="font-size: 22px;">
                            <ul class="v_menu col-md-12">
                              	<c:if test="${not empty provinceCenters}"> 
	        	 					<c:forEach items="${provinceCenters}" var="provinceCenter" varStatus="loop"> 
	        	 						<c:if test="${provinceCenter.bcId==bcId}">
	        	 							<li class="active">
	        	 								<a href='<c:url value="/news/activity/${provinceCenter.bcId}" />' style="color:#fff;">
	        	 									${provinceCenter.bcProviceName}
	        	 								</a>
	        	 							</li>
	        	 						</c:if>
	        	 						<c:if test="${provinceCenter.bcId!=bcId}">
	        	 							<li>
	        	 								<a href='<c:url value="/news/activity/${provinceCenter.bcId}" />'>${provinceCenter.bcProviceName}</a>
	        	 							</li>
	        	 						</c:if>
	        	 					</c:forEach>
        	 					</c:if>
                            </ul>
                        </div>
                    </div>           

                    <div class="col-md-8">
                        <div class="jumbotron">
                        	<div class="row">
                                <div class="col-md-12">
      								<div class="col-md-8">
						      			<span class="form-horizontal">
									    	<fieldset>
							      				<div class="form-group">
										        	<label class="col-md-3 control-label">ชื่อ: </label>
										            <div class="col-md-7">
										                <div class="form-control-wrapper">
										                 	<form:input path="baTitle" class="form-control textsize empty" id="title"/>
										                	<span class="material-input"></span>
										                </div>
										            </div>
										        </div>
										        
										        <div class="form-group">
										        	<label class="col-md-3 control-label">วันที่เริ่ม: </label>
										            <div class="col-md-2">
														<div class="input-append date" id="dp3" data-date="12-02-2012" data-date-format="dd/mm/yyyy">
															<form:input path="baStartTime" id="startDatepicker" readonly=""/>
										                	<span class="add-on"><i class="icon-calendar"></i></span>
										                </div>
										            </div>   
										            <label class="col-md-3 control-label" style="padding-left:10px;">ถึง: </label> 
										            <div class="col-md-2">
										            	<div class="input-append date" id="dp4" data-date="12-02-2012" data-date-format="dd/mm/yyyy">
															<form:input path="baEndTime" id="endDatepicker" readonly=""/>
										                	<span class="add-on"><i class="icon-calendar"></i></span>
										                </div>
										            </div>    
										        </div>
										    
										        <div class="form-group">
										        	<label class="col-md-3 control-label">รายละเอียด: </label>
										            <div class="col-md-7">
										                <div class="form-control-wrapper">
										                	<form:textarea path="baDetail" class="form-control textsize empty" id="detail" cols="5" rows="5"/>
										                	<span class="material-input"></span></div>
										            </div>
										        </div>

												<div class="form-group">
										        	<label class="col-md-3 control-label">ประเภท: </label>
										            <div class="col-md-7">
										                <div class="col-md-4 radio radio-primary">
														    <label class="radio-inline">
														    	<form:radiobutton path="baType" name="type" value="กิจกรรม" /> 
														      	<span class="circle"></span><span class="check"></span>
														      	<span style="margin-top: -5px; margin-left: 20px; width: 250px;">กิจกรรม</span>
														    </label>
														</div>
														<div class="col-md-3 radio radio-primary">
														    <label class="radio-inline">
														      	<form:radiobutton path="baType" name="type" value="อบรม" /> 
														      	<span class="circle"></span><span class="check"></span>
														      	<span style="margin-top: -5px; margin-left: 20px; width: 250px;">อบรม</span>
														    </label>
													    </div>
										            </div>
										        </div>
								        	</fieldset>
										</span>
      								</div>
						      		<div class="col-md-4">
						      			<c:choose>
						      				<c:when test="${not empty calendarActivityForm.baPicturePath}">
						      					<img class="img-thumbnail" id="activity" src='<c:url value="/getfile/CalendarActivities/${calendarActivityForm.baPicturePath}" />' alt='<c:url value="/getfile/CalendarActivities/${calendarActivityForm.baPicturePath}" />' data-src="holder.js">
						      				</c:when>
						      				<c:otherwise>
						      					<img class="img-thumbnail" id="activity" src='<c:url value="/resources/calendar/calender-icon.png" />' alt='<c:url value="/resources/calendar/calender-icon.png" />' data-src="holder.js">	
						      				</c:otherwise>
						      			</c:choose>
							           	<input type="file" id="activity_upload" name="activity_upload" onchange="URLact(this);" style="font-size: 10px; ">
						      		</div>
                                </div>
                                
                                
                                <div class="col-md-offset-4">
							        <button class="btn btn-default btn-flat" id="cancel" data-dismiss="modal" style="font-weight: bold; font-size: 20px;">
							        	ยกเลิก<div class="ripple-wrapper">
							        		<div class="ripple ripple-on ripple-out" style="left: 48.015625px; top: 28px; -webkit-transform: scale(12.125); transform: scale(12.125); background-color: rgba(0, 0, 0, 0.843137);"></div>
							        	</div>
							        </button>
							        <button type="submit" id="commit" class="btn btn-material-purple-800 btn-xs" data-dismiss="modal" style="font-weight: bold; font-size: 20px;">บันทึก</button>
						      	</div>
                                
                            </div>
                        </div>           
                    </div>   
                </div>
            </div>
         </div>
         </form:form> 
	       <div id="datetimepicker" class="input-append date">
	      <input type="text"></input>
	      <span class="add-on">
	        <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
	      </span>
	    </div>
	</body>
</html>