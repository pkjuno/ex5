<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>마이페이지</h1>

	<h2> 아이디 : ${member.id}</h2>
	<h2> 이름 : ${member.name }</h2>
	<h2> 나이 : ${member.age }</h2>
	<h2> 그레이드 : ${member.grade }</h2>
	<h2> 사진 : ${member.oriname}</h2>
	<img alt="" src="../resources/upload/${member.filename}">
	

	< <!-- 학생  -->
	
	<c:if test="${member.grade == 'student'}">
		<div>
			<h2> 담당 선생님 : ${student.tid}</h2>
			<h2> 전화번호 : ${student.phone }</h2>
		</div>
	</c:if>
	
	<!-- 선생님 -->
	<c:if test="${member.grade == 'teacher'}">
	
	<h2> 과목 : ${member.subject}</h2>
	<h2> 부임날짜 : ${member.hiredate}</h2>
	</c:if>  
	





</body>
</html>