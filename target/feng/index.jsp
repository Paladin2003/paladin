<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>userInfo</title>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">

	function login(){
		document.formInput.submit();
	}

</script>
</head>
<body>
	helloWorld!!!
	<form name="formInput" action="login.do" method="post">
		<input type="text" name="account" ></input>
		<input type="button" onclick="login();" value="login"/>
	</form>
</body>
</html>