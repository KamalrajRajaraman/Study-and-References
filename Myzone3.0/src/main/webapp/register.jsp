<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Myzone Register</title>
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
				<div class="login_logo">Register</div>
				<form action="register.do" method="post" onsubmit="return validate()">
					<input type="hidden" name="formid" value="register">
					<div class="form_group">
						<input class="form_input" placeholder="Username" type="text"
							name="uname">
					</div>
					<div class="form_group">
						<input class="form_input" placeholder="Password" type="password"
							name="pass">
					</div>
					<input type="submit" class="submit-button" value="Register">
				</form>
				<div>
					<a href="./login.jsp">Login</a>
				</div>

			</div>

		</div>
	</div>

<script src="registervalidation.js"></script>

</body>

</html>