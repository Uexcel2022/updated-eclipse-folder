<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
   <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <c:url value="get"  scope="session" var="resource"  >
  </c:url>
  <a href="${resource}">Get resource</a>

</body>
</html>