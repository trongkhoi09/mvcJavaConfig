
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>edit</title>
</head>
<body>

    <div align="center">
        <h1>EDIT PERSON</h1>
        <%--@elvariable id="person" type="com.spring.model.Person"--%>
        <form:form method="POST" modelAttribute="person" action="/edit">
            <table>
                <tr>
                    <td>ID</td>
                    <td><form:input path="id" name="id" id="id"/></td>


                </tr>
                <tr>
                    <td>Name</td>
                    <td><form:input path="name" name="name" id="name"/></td>
                    <td><form:errors path="name" cssStyle="color: red"/> </td>
                </tr>

                <tr>
                    <td>Location</td>
                    <td><form:input path="location" name="location" id="location"/></td>
                    <td><form:errors path="location" cssStyle="color: red"/> </td>
                </tr>

                <tr>
                    <td><form:button name="edit" id="edit">edit</form:button> </td>
                </tr>
            </table>
        </form:form>

    </div>

</body>
</html>
