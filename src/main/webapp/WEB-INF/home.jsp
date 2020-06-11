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
    <title>home</title>
</head>
<body>
    <h1>home page</h1>
    <div align="center">
        <%--@elvariable id="person" type="com.spring.model.Person"--%>
        <form:form method="post" modelAttribute="person" action="person">
            <table>
                <tr>
                    <td>Name</td>
                    <td><form:input path="name" name="name" id="name"/></td>
                    <td style="color: red"><form:errors path="name" /></td>
                    <%--<td><p>${mes}</p></td>--%>
                </tr>

                <tr>
                    <td>Location</td>
                    <td><form:input path="location" name="location" id="location"/></td>
                    <td style="color: red"><form:errors path="location" /></td>
                </tr>

                <tr>
                    <td></td>
                    <td><form:button name="login" id="login">Login</form:button> </td>
                    <td></td>
                </tr>
            </table>
        </form:form>
        <h2>UPFILE</h2>
        <a href="fileupload">Upfile</a>
        <hr/>

            <h2>All person</h2>
            <a href="all-person">All person</a>

        <a href="valid">Valid</a>

    </div>

</body>
</html>
