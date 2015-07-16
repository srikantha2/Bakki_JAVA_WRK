<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
	<div align="center">
		<form:form action="showInfo.html" method="post" commandName="mailMe">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Test Mail Service </h2></td>
				</tr>
				<tr colspan="2">
					<td>Body:</td>
					<td><form:textarea path="body" /></td>
				</tr>
				<tr colspan="2">
					<td>Subject:</td>
					<td><form:textarea path="subject" /></td>
				</tr>
				<%-- <tr>
					<td>Recipient E-mail1:</td>
					<td><form:input path="email1" /></td>
				</tr>
				<tr>
					<td>Recipient E-mail2:</td>
					<td><form:input path="email2" /></td>
				</tr> --%>
       
        	<c:if test="${not empty mailMe.recipients}">
			<c:forEach items="${mailMe.recipients}" var="Person" varStatus="i" begin="0" >
                        <tr>    
						<td>Recipeint ${i.index+1} Email Address</td>
                            <td><form:input path="recipients[${i.index}]"  /></td>
                         <%--path="${recipients[i.index]}" --%>
                            
                        </tr>
                    </c:forEach>
			
</c:if>
				
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Send E-mail" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>