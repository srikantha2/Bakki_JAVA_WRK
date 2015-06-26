<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Content Management- Properties</title>
<style>
table, td, th {
    border: 1px solid green;
}
th {
    background-color: green;
    color: white;
}
</style>
</head>
<body>

<h2>Edit *.Properties Content-<spring:message code="label.zipcode" /> ${zipcode}</h2>
<form:form method="post" action="addProp.html" modelAttribute="reloadPropVO">
	<table>
	<tr>
		<th>Key</th>
		<th>Value</th>
	</tr>
	<c:forEach items="${reloadPropVO.propMap}" var="propMap" varStatus="status">
		<tr>
			<td>${propMap.key}</td>
			<td><input name="propMap['${propMap.key}']" value="${propMap.value}"/></td>
		</tr>
	</c:forEach>
</table>	
<br/>
<c:out value="${reloadPropVO.attribute} "/>
<input type="submit" value="Save" />
	
</form:form>
</body>
</html>