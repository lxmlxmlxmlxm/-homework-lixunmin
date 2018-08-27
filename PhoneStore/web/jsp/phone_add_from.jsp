<%--
  Created by IntelliJ IDEA.
  User: lxm
  Date: 2018/8/26
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>添加手机</title>
</head>
<body>


<form action="/PhoneAdd" method="Post" >
    <div class="form-group">
        <label for="id">ID</label>
        <input type="text" class="form-control" id="id" name="id" placeholder="id">
    </div>
    <div class="form-group">
        <label for="name">名字</label>
        <input type="text" class="form-control" id="name" name="name" placeholder="name">
    </div>
    <div class="form-group">
        <label for="price">价格</label>
        <input type="text" class="form-control" id="price" name="price" placeholder="price">
    </div>
    <div><input type="submit" class="form-control"></div>
</form>
</body>
</html>
