<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
<div style="background:#5E3752; padding:20px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin-bottom:20px; margin: 0 auto;">
		<div style="text-align: center;">
          <h3 style="color: green;"><i class="mdi-action-verified-user"></i> ทำการลงทะเบียนเรียบร้อยแล้ว</h3>
          <h3 style="color: blue;">กรุณาตรวจสอบการอนุมัติการลงทะเบียนผ่านทาง Email ของท่าน ภายในระยะเวลาหลังลงทะเบียน  7&nbsp;วัน</h3>
          <h3 style="color: orange;">ขอบคุณครับ/ค่ะ</h3>
     </div>
   </div>
</div>
<%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
</body>
</html>

<script>
     $(document).ready(function() {
         $.material.init();
     });
</script>