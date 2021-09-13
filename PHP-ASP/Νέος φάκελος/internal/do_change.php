Changing your info...


<?php
	$u2 = $_REQUEST['username2'];
	$p2 = $_REQUEST['pass2'];
	
	

		print "Changed ".$_SESSION['username']." to ".$u2;
		$_SESSION['username'] = $u2;
		print "Changed password to ".$p2;
		$_SESSION['pass'] = $p2;

		$users = array
  		(
  		array("admin",123),
  		array("panos",456),
		);
		
	

?>