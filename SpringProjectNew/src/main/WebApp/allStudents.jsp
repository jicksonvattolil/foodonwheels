<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
success

 <c:if test="${ not empty studentList}">
	<table>
<tr>
 <th>
	id
 </th>
 <th>
	name
 </th>
 <th>
	password
 </th>
</tr>
		<c:forEach items="${ studentList}" var="student">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.pass}</td>
				
			</tr>
		
		</c:forEach>


 	</table>
</c:if>
</body>
</html>