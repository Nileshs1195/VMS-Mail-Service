<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

   <h2 class="hello-title">Hello ${name}!</h2>
   
   <head class="hello-title">Visitor: ${visitors} </head> <Br> <Br>
<body>    
<table>                       
<c:forEach items="${visitors}" var="visitor">
    <tr>
        <td><B>Visitor Id </B> <c:out value="${visitor.id}"/></td>
        <td><B>Visitor Name </B><c:out value="${visitor.name}"/></td>
        <td><B>Visitor City </B><c:out value="${visitor.city}"/></td>   
    </tr>
</c:forEach>

</table>




</body>
</html>