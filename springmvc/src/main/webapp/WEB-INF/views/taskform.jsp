<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="taskModel" method="POST" action="task" >
	<table>
				<tr>
					<td>task Id:</td>
					<td><form:input path="taskId" /></td>
					<td><form:errors path="taskId" cssClass="error" /></td>
				</tr>
				<tr>
					<td>owner Id:</td>
					<td><form:input path="ownerId" /></td>
					<td><form:errors path="ownerId" cssClass="error" /></td>
				</tr>
				<tr>
					<td>creator Id:</td>
					<td><form:input path="creatorId" /></td>
					<td><form:errors path="creatorId" cssClass="error" /></td>
				</tr>
				<tr>
					<td>name:</td>
					<td><form:input path="name" /></td>
					<td><form:errors path="name" cssClass="error" /></td>
				</tr>
				<tr>
					<td>description:</td>
					<td><form:input path="description" /></td>
					<td><form:errors path="description" cssClass="error" /></td>
				</tr>
				<tr>
					<td>status:</td>
					<td><form:input path="status" /></td>
					<td><form:errors path="status" cssClass="error" /></td>
				</tr>
				<tr>
					<td>priority:</td>
					<td><form:input path="priority" /></td>
					<td><form:errors path="priority" cssClass="error" /></td>
				</tr>
				<tr>
					<td>notes:</td>
					<td><form:input path="notes" /></td>
					<td><form:errors path="notes" cssClass="error" /></td>
				</tr>
				<tr>
				
				<tr>
					<td colspan="3"><input type="submit" value="Submit" /></td>
				</tr>
	</table>
</form:form>



</body>
</html>