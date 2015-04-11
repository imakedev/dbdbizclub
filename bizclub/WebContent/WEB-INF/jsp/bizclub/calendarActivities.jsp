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
		<script src='<c:url value="/resources/calendar/lib/moment.min.js" />' ></script>
		<script src="<c:url value="/resources/register/js/jquery.min.js" />"></script>
		<script src='<c:url value="/resources/calendar/fullcalendar.min.js" />' ></script>

		<script src="<c:url value="/resources/register/material/js/material.min.js" />"></script>

		<script>
      		$(document).ready(function() {
        		$.material.init();
        		$('#calendar').fullCalendar({
        			header: {
        				left: 'prev,next today',
        				center: 'title',
        				right: 'month,agendaWeek,agendaDay'
        			},
        			defaultDate: '2015-02-12',
        			editable: true,
        			eventLimit: true, // allow "more" link when too many events
        			selectable: true,
        			eventClick: function(calEvent, jsEvent, view) {
        		        /* alert('Event: ' + calEvent.title);
        		        alert('Coordinates: ' + jsEvent.pageX + ',' + jsEvent.pageY);
        		        alert('View: ' + view.name);
        		        // change the border color just for fun
        		        $(this).css('border-color', 'red'); */
        		        $('#actityDetail').html('<b>Title:</b> '+calEvent.title);

        	    	},
        			/* dayClick: function(date, jsEvent, view) {
                		alert('Clicked on: ' + date.format());
                		alert('Coordinates: ' + jsEvent.pageX + ',' + jsEvent.pageY);
                		alert('Current view: ' + view.name);
                		// change the day's background color just for fun
                		$(this).css('background-color', 'red');

            		}, */
        			events: [
        				{
        					title: 'All Day Event',
        					start: '2015-02-01'
        				},
        				{
        					title: 'Long Event',
        					start: '2015-02-07',
        					end: '2015-02-10'
        				},
        				{
        					id: 999,
        					title: 'Repeating Event',
        					start: '2015-02-09T16:00:00'
        				},
        				{
        					id: 999,
        					title: 'Repeating Event',
        					start: '2015-02-16T16:00:00'
        				},
        				{
        					title: 'Conference',
        					start: '2015-02-11',
        					end: '2015-02-13'
        				},
        				{
        					title: 'Meeting',
        					start: '2015-02-12T10:30:00',
        					end: '2015-02-12T12:30:00'
        				},
        				{
        					title: 'Lunch',
        					start: '2015-02-12T12:00:00'
        				},
        				{
        					title: 'Meeting',
        					start: '2015-02-12T14:30:00'
        				},
        				{
        					title: 'Happy Hour',
        					start: '2015-02-12T17:30:00'
        				},
        				{
        					title: 'Dinner',
        					start: '2015-02-12T20:00:00'
        				},
        				{
        					title: 'Birthday Party',
        					start: '2015-02-13T07:00:00'
        				},
        				{
        					title: 'Click for Google',
        					url: 'http://google.com/',
        					start: '2015-02-28'
        				},
        				{
        					title: 'Test',
        					start: '2015-03-28'
        				}
        			]
        		});
        		
        		$('#newActivity').click(function(){
        			var url = '<c:url value="/news/addactivity/${bcId}" />';
        			location.href=url;
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
                                    <button type="button" class="btn btn-default" id="newActivity">Add</button>
                                </div>
                            </div>
                        
                        
                            <div class="row">
                                <div class="col-md-12">
                                    <div id='calendar'></div>
                                </div>
                            </div>
                            
                            <div class="row">
                                <div class="col-md-12">
                                    <div id='actityDetail' style="padding: 10 0 0 18;"></div>
                                </div>
                            </div>
                        </div>           
                    </div>   
                </div>
            </div>
         </div> 

        <div id="footer">
            <div class="container">
            <div id="footer_body" class="clear">
                <div  class="box_contact">
                     <div  class="topic_contact">กรมพัฒนาธุรกิจการค้า</div>
                    <div>เลขที่ 563 ถนน นนทบุรี ต.บางกระสอ อ.เมือง จ.นททบุรี 11000</div>
                    <div>โทรศัพท์: 02-547-5985</div>
                    <div>โทรสาร: 02-547-5963</div>
                    <div>email: dbdbizclub2015@gmail.com</div>
                </div>
                <div style="float:right;width:300px;" >
                    <div  style="text-align:right;">
                        <a href="#"><img src="<c:url value="/resources/register/images/btn_f.png" />"></a>&nbsp;<a href="#"><img src="<c:url value="/resources/register/images/btn_t.png" />"></a>
                    </div>
                </div>
            </div>
            </div>
        </div>
                           
	</body>
</html>