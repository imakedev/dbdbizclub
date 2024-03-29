<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<%@ include file="/WEB-INF/jsp/common/search.jsp" %>

<sec:authorize access="hasAnyRole('ROLE_ADMIN')" var="isAdmin"/>
<sec:authorize access="hasAnyRole('ROLE_STAFF')" var="isStaff"/>
<sec:authorize access="isAuthenticated()" var="isAuthen"/> 

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
        <script src='<c:url value="/resources/register/js/jquery.min.js" />'></script>
        <script src='<c:url value="/resources/calendar/fullcalendar.min.js" />' ></script>
        <script src='<c:url value="/resources/calendar/lang/th.js" />' ></script>
        <script src='<c:url value="/resources/register/material/js/material.min.js" />'></script>

        <script>
            
            function deleteAct(id , bcid){
                var url = '<c:url value="/news/delactivity/"/>'+bcid+'/'+id;
                location.href=url;
                
            }
            function editAct(id , bcid){
                var url = '<c:url value="/news/editactivity/" />'+bcid+'/'+id;
                location.href=url;
            }
        
            $(document).ready(function() {
                $.material.init();
                var obj = '';
                var thCurr = '${thCurent}';
                var jsonObj = '${calendarJSON}';
                if(jsonObj.length>0) obj =  $.parseJSON(jsonObj); 
                $('#calendar').fullCalendar({
                    header: {
                        left: 'prev,next today'
                        //center:'title',
                        //right: 'month,agendaWeek,agendaDay'
                        //right: 'month'
                    },
                    lang: 'th',
                    editable: true,
                    eventLimit: true, // allow "more" link when too many events
                    selectable: true,
                    eventClick: function(calEvent, jsEvent, view) {
                        var str = '';
                        var isStaff = '${isStaff}';
                        var isAdmin = '${isAdmin}';
                        var isAuthen = '${isAuthen}';
                        var currUrl = '<c:url value="/getfile/CalendarActivities/" />';
                        
                        if(isAuthen =='true' && isAdmin=='true'){
                            str = str +'<div class="col-md-12" style="margin: 0px 0px -50px 0px;">';
                            str = str +'<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete" onclick="deleteAct('+calEvent.activityId+','+calEvent.centerId+')"></i></button>';
                            str = str +'<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#activity-popup"><i class="mdi-image-edit" onclick="editAct('+calEvent.activityId+','+calEvent.centerId+')"></i></button>';
                            str = str +'</div>';
                        }
                        str = str +'<div><b>ชื่อ:</b> '+calEvent.title+'<br/>';
                        str = str +'<b>วันที่เริ่ม:</b> '+calEvent.sTime+'<br/>';
                        str = str +'<b>วันที่สิ้นสุด:</b> '+calEvent.eTime+'<br/>';
                        str = str +'<b>ประเภท:</b> '+calEvent.baType+'<br/>';
                        str = str +'<b>รายละเอียด:</b> '+calEvent.detail+'<br/>';
                        if(calEvent.imgPath!=undefined) str = str +'<img src="'+currUrl+calEvent.imgPath+'" alt="'+currUrl+calEvent.imgPath+'"/> </div>';
                        $('#actityDetail').html(str);
                    },
                    /* dayClick: function(date, jsEvent, view) {
                        alert('Clicked on: ' + date.format());
                        alert('Coordinates: ' + jsEvent.pageX + ',' + jsEvent.pageY);
                        alert('Current view: ' + view.name);
                        // change the day's background color just for fun
                        $(this).css('background-color', 'red');

                    }, */
                    events: obj
                });
                $('#newActivity').click(function(){
                    var url = '<c:url value="/news/addactivity/${bcId}" />';
                    location.href=url;
                });
                 $(".fc-right").html('<h2>'+thCurr+'</h2>');
                
                $('.fc-today-button').click(function(){
                    $(".fc-right").html('<h2>'+thCurr+'</h2>');
                });

                $('.fc-prev-button').click(function(){
                    var moment =  $('#calendar').fullCalendar('getDate');
                    var all = moment.format().split('-');
                    var month = parseInt(all[1]);
                    var year = parseInt(all[0])+543;
                    $(".fc-right").html('<h2>'+monthTh(month)+' '+year+'</h2>');
                });

                $('.fc-next-button').click(function(){
                   var moment =  $('#calendar').fullCalendar('getDate');
                    var all = moment.format().split('-');
                    var month = parseInt(all[1]);
                    var year = parseInt(all[0])+543;
                    $(".fc-right").html('<h2>'+monthTh(month)+' '+year+'</h2>');
                });
            });
            function monthTh(month){
                var mmStr = '';
                switch (month) {
                    case 1:
                        mmStr = "มกราคม";
                        break;
                    case 2:
                        mmStr = "กุมภาพันธ์";
                        break;
                    case 3:
                        mmStr = "มีนาคม";
                        break;
                    case 4:
                        mmStr = "เมษายน";
                        break;
                    case 5:
                        mmStr = "พฤษภาคม";
                        break;
                    case 6:
                        mmStr = "มิถุนายน";
                        break;
                    case 7:
                        mmStr = "กรกฎษาคม";
                        break;
                    case 8:
                        mmStr = "สิงหาคม";
                        break;
                    case 9:
                        mmStr = "กันยายน";
                        break;
                    case 10:
                        mmStr = "ตุลาคม";
                        break;
                    case 11:
                        mmStr = "พฤศจิกายน";
                        break;
                    case 12:
                        mmStr = "ธันวาคม";
                        break;
                    default:
                        break;
                } 
                return  mmStr;
            }

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
                            <c:if test="${isStaff || isAdmin || isAuthen}">
                            <div class="row">
                                <div class="col-md-12">
                                    <button type="button" class="btn btn-default" id="newActivity">Add</button>
                                </div>
                            </div>
                            </c:if>
                            
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