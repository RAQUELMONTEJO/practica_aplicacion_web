<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login de administrador</title>
<link rel="stylesheet" href="./css/styleLogin.css">
</head>
<body>
	<div id="clouds">
		<div class="cloud x1"></div>
		<div class="cloud x2"></div>
		<div class="cloud x3"></div>
		<div class="cloud x4"></div>
		<div class="cloud x5"></div>
	</div>
	<div class="container">
		<div id="login">
			<h2>Introduce tus datos de administrador:</h2>
			<br />
			<form action="ServletIdenAdmin" method="post">
				<fieldset class="clearfix">
					<p>
						<span class="fontawesome-user"></span><input type="text"
							value="Username" name="campoLogin" required>
					</p>
					<p>
						<span class="fontawesome-lock"></span><input type="password"
							value="Password" name="campoPass" required>
					</p>
					<p>
						<input type="submit" value="LOGIN">
					</p>
				</fieldset>
			</form>
		</div>
</body>
</html>