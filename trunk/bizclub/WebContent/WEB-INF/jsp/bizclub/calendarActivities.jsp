<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
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
        		        alert('Event: ' + calEvent.title);
        		        alert('Coordinates: ' + jsEvent.pageX + ',' + jsEvent.pageY);
        		        alert('View: ' + view.name);

        		        // change the border color just for fun
        		        $(this).css('border-color', 'red');

        	    	},

        			dayClick: function(date, jsEvent, view) {
                		alert('Clicked on: ' + date.format());
                		alert('Coordinates: ' + jsEvent.pageX + ',' + jsEvent.pageY);
                		alert('Current view: ' + view.name);
                		// change the day's background color just for fun
                		$(this).css('background-color', 'red');

            		},
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
		<div id='calendar'></div>
	</body>
</html>