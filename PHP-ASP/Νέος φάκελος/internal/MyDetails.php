<!DOCTYPE html>
<html>

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>Untitled 1</title>
</head>

<body>
<form method="post" action="index.php">
	Τρέχον όνομα χρήστη:<?php echo $_SESSION['username'];?><br/>
	Παρακαλώ εισάγετε νέο όνομα χρήστη: <input name="username2"/><br/>
	Τρέχον κωδικός πρόσβασης:<?php echo $_SESSION['password'];?><br/>
	Παρακαλώ εισάγετε νέο κωδικό πρόσβασης: <input name="pass2" type="password"/><br/>
<input type="submit" name="change_details" value="Αλλαγή στοιχείων"/>
<input name="p" value="do_change" type="hidden">

</form>
</body>
</html>
