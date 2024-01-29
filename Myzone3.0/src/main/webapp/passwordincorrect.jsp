
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Myzone Login</title>
<link rel="icon" type="image/x-icon" href="./image.jfif">
<link rel="stylesheet" href="./login.css">
</head>
<body>
	<div class="header">
		<nav>
			<h1>MyZone</h1>
		</nav>
	</div>
	<div class=body>
		<div class="login_wrapper-inner">
			<div>
				<div class="login_logo">Login</div>
				<form action="login.do" method="post">
					<input type="hidden" name="formid" value="login">
					<div class="form_group">
						<input class="form_input" placeholder="Username" type="text"
							name="uname">
					</div>
					<div class="form_group">
						<input class="form_input" placeholder="Password" type="password"
							name="pass">
					</div>
					<input type="submit" class="submit-button" value="Login">
				</form>
				<h5 style="color: red">incorrect password</h5>
				<div>
					<a href="./register.jsp">Registor</a>
				</div>

			</div>

		</div>

	</div>
	<script src="nouser.js"></script>
</body>
</html>