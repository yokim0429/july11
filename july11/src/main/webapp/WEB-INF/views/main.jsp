<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<h1>main 입니다.</h1>
	${name } <br>
	JSTL tag / EL tag <br>
	<c:forEach begin="1" end="10" var="i" >
		<c:choose>
			<c:when test="${i eq 3}">
				3 맞아요 <br>
			</c:when>
			<c:otherwise>
				${i } <br>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	
	set <br>
	<c:set var="k" value="케이"></c:set>
	<c:set var="k">새로운 값</c:set>
	${k }
	<br>
	out = ${var }
	<c:out value="스페셜 K"></c:out>
	<c:out value="${k }"></c:out>
	<br>
	M(model: Data)<br>
	V(view: JSP)<br>
	C(controller: Ctrl)<br>
	
	<c:remove var="k"/>
	${k }
	<hr>
	
	<c:forEach items="${list }" var="i">
		${i }
	</c:forEach>
	
</body>
</html>