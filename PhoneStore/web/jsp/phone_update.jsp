<%@ page import="com_nf.entity.Phone" %><%--
  Created by IntelliJ IDEA.
  User: lxm
  Date: 2018/8/26
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<% Phone phone = (Phone) request.getAttribute("phone");%>
<head>
    <title>书籍修改表单</title>
</head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<body>
<form action="/PhoneUp" method="Post" >
    <div class="form-group">
        <label for="id">ID</label>
        <input type="text" class="form-control" id="id" name="id" placeholder="id" value=<%=phone.getId()%>>
    </div>
    <div class="form-group">
        <label for="name">名字</label>
        <input type="text" class="form-control" id="name" name="name" placeholder="name" value=<%=phone.getName()%>>
    </div>
    <div class="form-group">
        <label for="price">价格</label>
        <input type="text" class="form-control" id="price" name="price" placeholder="price" value=<%=phone.getPrice()%>>
    </div>
    <div><input type="submit" class="form-control" value="更改"></div>
</form>

</body>
</html>
