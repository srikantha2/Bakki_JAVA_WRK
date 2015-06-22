<%@ page import="org.apache.log4j.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Dynamic Log4J Control</title>
</head>
<body>
<h1>Dynamic Log4J Control</h1>
<%String logName = request.getParameter("log");
	if (null != logName) {
		Logger log = ("".equals(logName) ? Logger.getRootLogger()
				: Logger.getLogger(logName));
		log.setLevel(Level.toLevel(request.getParameter("level"),
				Level.DEBUG));
	}
%>
<c:set var="rootLogger" value="<%= Logger.getRootLogger() %>" />
Show
<a href="UpdateLogger?showAll=true">all known loggers</a>
<br>
Show
<a href="UpdateLogger?showConfig=true">Current Configuration</a>
<br>
Show
<a href="UpdateLogger?showAll=true&showConfig=true">all known loggers and current configuration</a>
<form>
<table border="1">
	<tr>
		<th>Level</th>
		<th>Logger</th>
		<th>Set New Level</th>
	</tr>
	<tr>
		<td>${rootLogger.level}</td>
		<td>${rootLogger.name}</td>
		<td><c:forTokens var="level" delims=","
			items="DEBUG,INFO,WARN,ERROR,OFF">
			<a href="UpdateLogger?log=&level=${level}">${level}</a>
		</c:forTokens></td>
	</tr>
	<c:forEach var="logger"
		items="${rootLogger.loggerRepository.currentLoggers}">
		<c:if test="${!empty logger.level.syslogEquivalent || param.showAll}">
			<tr>
				<td>${logger.level}</td>
				<td>${logger.name}</td>
				<td><c:forTokens var="level" delims=","
					items="DEBUG,INFO,WARN,ERROR,OFF">
					<a href="UpdateLogger?log=${logger.name}&level=${level}">${level}</a>
				</c:forTokens></td>
			</tr>
		</c:if>
	</c:forEach>
	<tr>
		<td></td>
		<td><input type="text" name="log" /></td>
		<td><select name="level">
			<c:forTokens var="level" delims="," items="DEBUG,INFO,WARN,ERROR,OFF">
				<option>${level}</option>
			</c:forTokens>
		</select> <input type="submit" value="Add New Logger" /></td>
	</tr>
</table>
</form>

<br><br>
<c:if test="${param.showConfig}">
<%
    java.io.PrintWriter pw = new java.io.PrintWriter(out, true);
    org.apache.log4j.config.PropertyPrinter pp = new org.apache.log4j.config.PropertyPrinter(pw, true);
    pp.print(pw);
 %>
</c:if>
</body>
</html>
