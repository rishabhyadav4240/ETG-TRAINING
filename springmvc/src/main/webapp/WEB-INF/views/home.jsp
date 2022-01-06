<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
HOME PAGE
<br>
 Taskid:${taskModel.taskId}
<br> 
<br>
Ownerid:${taskModel.ownerId}
<br> 
<br>
CreatorId:${taskModel.creatorId}
<br> 
<br>
TaskName:${taskModel.name}
<br> 
<br>
Description:${taskModel.description}
<br> 
<br>
Status:${taskModel.status}
<br> 
<br>
Priority:${taskModel.priority}
<br> 
<br>
Notes:${taskModel.notes}
<br> 

</body>
</html>