<%@taglib prefix="i" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border = "1">

    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Quantity</th>
        <th>Price</th>
    </tr>

    <i:forEach items = "${iList}" var = "item">
        <tr>

            <td>
                    ${item.name}
            </td>

            <td>
                    ${item.description}
            </td>

            <td>
                    ${item.quantity}
            </td>

            <td>
                    ${item.price}
            </td>

        </tr>

    </i:forEach>


</table>


</body>
</html>
