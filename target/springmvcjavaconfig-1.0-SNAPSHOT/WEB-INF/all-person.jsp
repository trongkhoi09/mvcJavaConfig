
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>ALL Person</title>
</head>
<body>

    <div align="center">
        <a href="<c:url value='add'/>"> Add Person</a>
       <table >
           <tr>
               <th>ID</th>
               <th>Name</th>
               <th>Location</th>
               <th></th>
           </tr>

           <c:forEach items="${list}" var="person">
               <tr>
                   <td>${person.id}</td>
                   <td>${person.name}</td>
                   <td>${person.location}</td>
                   <td><a href="<c:url value='person-detail/${person.id}'/>">Chi tiet</a>
                       <a href="<c:url value='delete/${person.id}'/>"> Xoa</a>
                       <a href="<c:url value='edit/${person.id}'/>"> Sua</a>
                   </td>
               </tr>
           </c:forEach>
       </table>
    </div>

</body>
</html>
