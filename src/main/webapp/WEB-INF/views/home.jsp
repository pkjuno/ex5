<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<c:if test="${member eq null }">
<a href="member/memberJoin">join</a>
<a href="member/memberLogin">login</a>
</c:if>
<c:if test="${member ne null }">
<a href="member/memberPage">MyPage</a>
<a href="member/memberLogout">Logout</a>
</c:if>
</body>
</html>
