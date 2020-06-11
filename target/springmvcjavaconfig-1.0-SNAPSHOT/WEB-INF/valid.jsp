
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>home</title>
</head>
<body>
    <h1>add person</h1>
    <div align="center">
        <h1>Valid</h1>
        <%--@elvariable id="person" type="com.spring.model.Person"--%>
        <form:form method="POST" modelAttribute="person" action="/success">
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
                    <td><form:button name="add" id="add">ADD</form:button> </td>
                    <td></td>
                </tr>
            </table>
        </form:form>

    </div>

</body>
</html>
