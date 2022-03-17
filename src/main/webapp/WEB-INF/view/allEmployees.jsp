<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Migranov
  Date: 16.03.2022
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Employees</title>
    <style>
        table {
            border: 4px double #333; /* Рамка вокруг таблицы */
            border-collapse: separate; /* Способ отображения границы */
            width: 80%; /* Ширина таблицы */
            border-spacing: 5px 7px; /* Расстояние между ячейками */
        }
        td {
            padding: 5px; /* Поля вокруг текста */
            border: 1px solid #a52a2a; /* Граница вокруг ячеек */
        }
    </style>
</head>
<body>
<h2>All Employees </h2>
<br><br>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <c:forEach var="emp" items="${allEmps}">
            <tr>
                <td>${emp.name} </td>
                <td>${emp.surname}</td>
                <td>${emp.department}</td>
                <td>${emp.salary}</td>
            </tr>
        </c:forEach>
    </tr>
</table>

<br><br>
<input type="button" value="Add" onclick="window.location.href='addNewEmployee'"/>
</body>
</html>



