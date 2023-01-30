<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <body>
        <form method="post" action="${pageContext.request.contextPath}/reg.action">
            Username<input type="text" name="user.username"/><br/>
            Password<input type="password" name="user.password"/><br/>
            Email<input type="text" name="user.email"/><br/>
            <input type="submit" value="reg"/>
        </form>
    </body>
</html>