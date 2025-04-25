<%--
  Created by IntelliJ IDEA.
  User: 86198
  Date: 2025/3/1
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table,td{
            border:1px solid black;
            border-collapse: collapse;
        }
        table{
            margin: 0 auto;
            text-align: center;
            width: 800px;
            height: 600px;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>地址</td>
        <td>年龄</td>
        <td>工作</td>
        <td>薪水</td>
        <td>删除</td>
        <td>更新</td>
    </tr>
    <c:forEach items="${list}" varStatus="vs" var="teacher">
    <tr>
        <td>
            <input type="text" name="id" value="${teacher.id}">
        </td>
        <td>
            <input type="text" name="name" value="${teacher.name}">
        </td>
        <td>
            <input type="text" name="addr" value="${teacher.addr}">
        </td>
        <td>
            <input type="number" name="age" value="${teacher.age}">
        </td>
        <td>
            <input type="text" name="job" value="${teacher.job}">
        </td>
        <td>
            <input type="number" name="id" value="${teacher.sal}">
        </td>
        <td>
            <a href="javascript:;" onclick="doDel(${teacher.id})">删除数据</a>
        </td>
    </tr>
    </c:forEach>
</table>
<script>
    function doDel(id){
        if (confirm()){
            location = "delete/"+id
        }
    }
</script>
</body>
</html>
