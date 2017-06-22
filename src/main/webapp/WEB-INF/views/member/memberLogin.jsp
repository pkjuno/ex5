<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn").click(function() {
			var path = '';
			
			$(".g").each(function() {
				if($(this).prop("checked")){
					path = $(this).val()+"Login";
				}
			});
			
			$("#frm").attr("action", path);
			$("#frm").submit();
		
		
		});
		
		
	});
</script>
</head>
<body>
	
	<form action="" method="post" id="frm">
		<p>ID : <input type="text" name="id"></p>
		<p>PW : <input type="password" name="pw"></p>
		<p>Student <input type="radio" name="grade" value="student" checked="checked" class="g"> </p>
		<p>Teacher <input type="radio" name="grade" value="teacher" class="g"></p>
		<input type="button" value="로그인" id="btn">
		
	</form>
</body>
</html>