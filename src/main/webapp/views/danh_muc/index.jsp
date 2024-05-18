<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Ma</th>
        <th>Ten</th>
        <th colspan="2">Trang thai</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${ data }" var="cate">
        <tr>
            <td>${ cate.id }</td>
            <td>${ cate.ma }</td>
            <td>${ cate.ten }</td>
            <td>
                <a>Update</a>
            </td>
            <td>
                <a>Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>