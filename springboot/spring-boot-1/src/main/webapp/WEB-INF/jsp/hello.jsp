<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<hr>
<form id="form" action="/helloP3" method="post" enctype="multipart/form-data">
    First name: <input type="text" name="firstName" value="Mickey"><br>
    Last name: <input type="text" name="lastName" value="Mouse"><br>
    <input type="file" name="file">
    <input type="file" name="file">
    <input type="submit" value="提交">
</form>

</body>
</html>