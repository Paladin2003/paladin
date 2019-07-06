<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>userInfo</title>
<script type="text/javascript">
	function update(){
		document.userInfo.submit();
	}
</script>
</head>

<body>
	helloWorld!!!
	
	<form name="userInfo" action="updateUser.do" method="post">
	<input type="text" name="account" value="${user.account}"></input>
	<input type="text" name="name" value="${user.name}"></input>
	<input type="text" name="mail" value="${user.mail}"></input>
	<input type="text" name="phone" value="${user.phone}"></input>
	<input type="button" value="update" onclick="update()"/>
	</form>
</body>
</html>