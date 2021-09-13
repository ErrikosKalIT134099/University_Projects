<?php

$sql = "update product set Title=?, Price=? where ID=?";

if( $stmt = $conn->prepare($sql) ) {
	$stmt->bind_param("sii", $_REQUEST['title'],$_REQUEST['price'], $_REQUEST['pid']);
	$r = $stmt->execute();
	if(! $r) {
		print "FAiled!";
	} else {
		print "OK! ";
	}
}

?>
