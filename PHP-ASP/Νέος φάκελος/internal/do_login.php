Proccessing login.....




<?php
	$u = $_REQUEST['username'];
	$p = $_REQUEST['pass'];
	
	if($u == 'admin' && $p=='12345') {
		header("Location: index.php");
		print "Welcome admin";
		$_SESSION['username'] = 'admin';
	}
		
	
	$sql = "SELECT * FROM customer WHERE uname=? AND passwd=?";

	if( $stmt = $conn->prepare($sql) ) {
	$stmt->bind_param("ss",$u,$p);
	$stmt->execute();
	$result = $stmt->get_result();
		while ($row = $result->fetch_assoc()) {
				header("Location: index.php");
				print "Welcome ";
				$_SESSION['username'] = $row['uname'];
		}
	}else {
		print "Unknown user";
		$_SESSION['username'] = '?';
	
	}
	
    

	

?>