<%@ page import="com_nf.entity.Phone" %>
<%@ page import="java.util.List" %>
<%@ page import="java.awt.print.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<head>
    <%
    List<Phone> phone= (List<Phone>) request.getAttribute("phone");
%>
    <title>手机列表</title>
</head>
<body>







<table class="table table-striped">
    <tr>
        <td colspan="2"></td>
        <td>手机名</td>
        <td>价格</td>
        <td colspan="2">操作</td>
    </tr>
    <%
        for (Phone phone1:phone) {
    %>
    <tr>
        <th><input type="checkbox" ></th>
        <td><%= phone1.getId()%></td>
        <td><%= phone1.getName()%></td>
        <td><%= phone1.getPrice()%></td>
        <td><a href="/PhoneDe?id=<%= phone1.getId()%>"><input type="button" value="删除" ></a>
        <a href="/PhoneUp?id=<%= phone1.getId()%>"><input type="button" value="更新" ></a></td>
    </tr>
    <%}%>
</table>
<a  href="/PhoneAdd">增加新的手机</a>
</body>
</html>
