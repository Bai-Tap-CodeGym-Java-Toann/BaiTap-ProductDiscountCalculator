<%--
  Created by IntelliJ IDEA.
  User: Surface Pro 4
  Date: 2018/10/18
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Discount</title>
    <style>
        .input {
            height: 230px;
            width: 230px;
            margin: auto;
            padding: 20px;
            border: 3px #CCC solid;
        }
    </style>
</head>
<body>
<form method="post" action="/display-discount">
    <div style="padding-top: 100px">
        <div class="input">
            <h2>Discount Calculator</h2>
            List Price:
            <input type="text" name="price" size="30" placeholder="Price">
            Discount Percent:
            <input type="text" name="percent" size="30" placeholder="Discount Percent">
            Product Description:
            <input type="text" name="description" size="30" placeholder="Description">
            <input type="submit" value="Calulate"/>
        </div>
    </div>
</form>
</body>
</html>
