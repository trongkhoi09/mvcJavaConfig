<%--
  Created by IntelliJ IDEA.
  User: khoipc
  Date: 1/31/19
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>file-result</title>
</head>
<body>
    <h1>file-result page</h1>
    <div align="center">
        <h1>file infor:</h1>
        <%--<img src="${fileResult.originalFilename}" alt=""/>--%>
        <p>${fileResult.originalFilename}</p>
        <%--<form  action="savefile/${fileResult.originalFilename} " method="get">--%>
            <%--<button type="submit" >Save</button>--%>
        <%--</form>--%>
        <a href="<c:url value='savefile/${fileResult.originalFilename}'/> ">save</a>
    </div>

</body>
</html>
