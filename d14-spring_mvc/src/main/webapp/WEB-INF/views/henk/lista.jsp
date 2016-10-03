<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Henkilön tietojen näyttäminen</title>
<link rel="stylesheet" type="text/css" href="../resources/styles/common.css">
</head>	
<body>
	<h1>
		Lista kaikista henkilöistä!
	</h1>
	<c:forEach items="${henkilot}" var="h">
		<p><c:out value="${h.etunimi}" default="-----"/> <c:out value="${h.sukunimi}" default="-----"/></p>
	</c:forEach>
	<p><a href="uusi">Takaisin</a>
</body>
</html>