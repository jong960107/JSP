<%--
  Created by IntelliJ IDEA.
  User: jeongdahyeon
  Date: 2021/12/08
  Time: 7:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<center>
    <h2>로그인</h2>
    <form action="LoginProc.do" method="post">
        <table width="300" border="1">
            <tr height="40">
                <td width="120">아이디</td>
                <td width="180"><input type="text" name="id"></td>
            </tr>
            <tr height="40">
                <td width="120">패스워드</td>
                <td width="180"><input type="password" name="password"></td>
            </tr>
            <tr height="40">
                <td align="center" colspan="2"><input type="submit" value="로그인"></td>
            </tr>
        </table>
    </form>




</body>
</html>
