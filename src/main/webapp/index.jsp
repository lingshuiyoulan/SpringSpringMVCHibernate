<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<h2>Hello World!</h2>
<form method="post" action="${pageContext.request.contextPath}/dept/add.do">
    <input type="text" name="deptno"><br>
    <input type="text" name="dname"><br>
    <input type="text" name="loc"><br>
    <input type="submit" value="添加dept">
</form>
<br>
<br>
<br>
<br>

<a href="${pageContext.request.contextPath}/dept/find.do">显示dept</a>
</body>
</html>
