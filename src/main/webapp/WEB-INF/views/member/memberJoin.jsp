<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function() {
	/* 	$("#stuForm").hide();
		$("#teaForm").hide();
		var g = $(".g").val();
		if(g=='student'){
			$("#stuForm").show();
		}else{
			$("#teaForm").sho();
		} */
		
		$("#btn").click(function() {
			var path = '';
			
			$(".g").each(function() {
				if($(this).prop("checked")){
					path = $(this).val()+"Join";
				}
			});
			
			$("#frm").attr("action", path);
			$("#frm").submit();
		
		
		});
	});
	
	
</script>
</head>
<body>
	<form action="" method="post" id="frm" enctype="multipart/form-data">
		<div>
			STUDENT <input type="radio" checked="checked" name="grade" value="student" class="g">
			TEACHER <input type="radio" name="grade" value="teacher" class="g">
		</div>
		
		<!-- 공 통  -->
		<div>
			<p>ID : <input type="text" name="id"></p>
			<p>PW : <input type="password" name="pw"></p>
			<p>NAME : <input type="text"  name="name"></p>
			<p>AGE : <input type="text" name="age"></p>
			<p>FILE : <input type="file" name="f1"></p>
		</div>
		<br>
		<br>
		<br>
		<!--학생전용  -->
		<div id="stuForm">
			
			<p>PHONE : <input type="text" name="phone"></p>
			<p>TID : <input type="text" name="tid"></p>
		</div>
		<br>
		<br>
		<br>
		<!--선생전용  -->
		<div id="teaForm">
			
			<p>SUBJECT : <input type="text" name="subject"></p>
			<p>HIREDATE : <input type="date" name="hiredate"></p>
		</div>
		<input type="button" value="전송" id="btn">
	</form>
</body>
</html>