<%--
  Created by IntelliJ IDEA.
  User: khoipc
  Date: 1/31/19
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>uploadfile</title>
</head>
<body>
    <h1>upfile page</h1>
    <div align="center">
        <%--@elvariable id="person" type="com.spring.model.Person"--%>
        <form method="post" action="file-result" enctype="multipart/form-data">
            <input type="file" name="file"/>
            <button type="submit">submit</button>
        </form>
    </div>

</body>
</html>
