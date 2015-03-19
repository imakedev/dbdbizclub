<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<!-- -------------------------------------------------------------------------------------------------------------------------------- -->
<div style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin: 0 auto;">
	      <div class="row">
	      	<div class="col-md-3" style="margin-right: 10px;">
	      		<div style="font-size: 22px;">
					<ul class="v_menu">
					   <c:if test="${not empty provinceCenters}"> 
        	 				<c:forEach items="${provinceCenters}" var="provinceCenter" varStatus="loop"> 
        	 				<c:if test="${provinceCenter.bcId==bcId}">
        	 					<li class="active"><a href='<c:url value="/product/activity/${provinceCenter.bcId}" />'>${provinceCenter.bcProviceName}</a></li>
        	 				</c:if>
        	 				<c:if test="${provinceCenter.bcId!=bcId}">
        	 					<li><a href='<c:url value="/product/activity/${provinceCenter.bcId}" />'>${provinceCenter.bcProviceName}</a></li>
        	 				</c:if>
        	 				</c:forEach>
        	 			</c:if>
					</ul>
				</div>
	      	</div>
	      	<div class="col-md-8">
		      <div class="jumbotron">
		      	<div class="row">
			      	<div class="col-md-4" style="background-color: #fbcb04; box-shadow: 1px 7px 15px #000; ">
						<div style="text-align: left;  color: #fff; font-size: 28px; font-weight: bold;">สมาชิก ${bizclubCenter.bcMemberSize} ราย</div>
					</div>
		      		<div class="col-md-12">
		      			<div class="list-group">
		      			<c:if test="${not empty users}"> 
        	 				<c:forEach items="${users}" var="user" varStatus="loop"> 
		      				<div class="row">
			      				<div class="col-md-9" style="margin: 20px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								          <c:if test="${not empty user.logoPath}">
								            <img class="circle"  width="56" height="56" src="<c:url value="/getfile/logo/${user.userId}/xxx" />" alt="icon">
								            </c:if>
								            <c:if test="${ empty user.logoPath}">
								              <img class="circle"  width="56" height="56"  src="<c:url value="/resources/register/images/5.png" />" alt="icon">
								            </c:if>
								        </div>
								        <div class="row-content">
								             <h4 class="list-group-item-heading">${user.corpName}</h4>
								          
<%-- 								            <span><c:out value="${user.services}"/></span>						         --%>
								        </div>
								    </div>
							    </div>
							    <div class="col-md-3" style="margin: 10px 0px 0px 0px;">
							     <c:if test="${isAuthen==true}">
		      					  	   <c:if test="${isStaff || isAdmin}">
		      					  	   		<c:if test="${userObj.bizclubProvince==bcId}">
							    				<button class="btn btn-danger btn-flat" style="padding: 5px 5px 5px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    				<button class="btn btn-success btn-flat" style="padding: 5px 5px 5px 5px; float: right; data-toggle="modal" data-target="#item-popup"><i class="mdi-image-edit"></i></button>
							    			</c:if>
							    		</c:if>
							    	</c:if>
									<br><br><br>
									<a href="<c:url value="/product/items/${bcId}/${user.userId}" />" style="color: orange; float: right;">รายละเอียด<i class="mdi-av-play-circle-fill"></i></a>
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
							    	<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    	<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right; data-toggle="modal" data-target="#item-popup"><i class="mdi-image-edit"></i></button>
									<br><br><br>
									<a href="Activity_item.html" style="color: orange; float: right;"><i class="mdi-action-shopping-cart"></i> สินค้า/บริการ</a>
						    	</div>
					    	</div>
					    	<div class="list-group-separator"></div>
						    <div class="row">
			      				<div class="col-md-9" style="margin: 10px 0px 10px 0px; padding-left: 30px;">
								    <div class="list-group-item" style="margin-left: 10px;">
								        <div class="row-picture">
								            <img class="circle" src="<c:url value="/resources/register/images/femail1.png" />" alt="icon">
								        </div>
								        <div class="row-content">
								            <h4 class="list-group-item-heading">น.ส. จารุวรรณ ปั้นทอง <span style="color: #a8a6a5;">(นิติบุคคล)</span></h4>
								            <p class="list-group-item-text" style="margin-bottom: 5px;">หจ. อกาวิกา</p>
								            <span>เครื่องประดับอัญมณีสังเคราะห์</span>						        
								        </div>
								    </div>
							    </div>
							    <div class="col-md-3" style="margin: 10px 0px 0px 0px;">
									<button class="btn btn-danger btn-flat" style="padding: 5px 5px 0px 5px; float: right;" data-toggle="modal" data-target="#delete-popup"><i class="mdi-action-delete"></i></button>
							    	<button class="btn btn-success btn-flat" style="padding: 5px 5px 0px 5px; float: right; data-toggle="modal" data-target="#item-popup"><i class="mdi-image-edit"></i></button>
									<br><br><br>
									<a href="Activity_item.html" style="color: orange; float: right;"><i class="mdi-action-shopping-cart"></i> สินค้า/บริการ</a>
						    	</div>
					    	</div>
						    <div class="list-group-separator"></div>
						     --%>
						</div>
						
		      		</div>
		      	</div>
		      	<ul class="pager">
				    <li class="previous disabled"><a href="javascript:void(0)">← Older</a></li>
				    <li class="next"><a href="javascript:void(0)">Newer →</a></li>
				</ul>
		      </div>
	      	</div>
	      </div>
  		</div>
	</div>
<!-- ----------------------------------------------------------------------------------------------------------- -->
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