<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/common/header.jsp" %>


<div style="background:#5E3752; padding:50px 0 20px 0;">
	<div class="container" style="background:#fff; padding:30px; margin-bottom:20px; margin: 0 auto;">
		<div style="text-align: center;">
          <h3 style="color: green;"><i class="mdi-action-verified-user"></i> ทำการลงทะเบียนเรียบร้อยแล้ว</h3>
          <h3 style="color: blue;">กรุณาตรวจสอบการอนุมัติการลงทะเบียนผ่านทาง Email ของท่าน ภายในระยะเวลาหลังลงทะเบียน  7&nbsp;วัน</h3>
          <h3 style="color: orange;">ขอบคุณครับ/ค่ะ</h3>
     </div>
   </div>
</div>
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