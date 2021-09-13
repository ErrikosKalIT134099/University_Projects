<?php
$user='root';
$pass='';
$host='localhost';
$db = 'bookstoredb';

$conn = new mysqli($host, $user, $pass,$db);
if ($conn->connect_errno) {
    echo "Failed to connect to MySQL: (" . 
    $conn ->connect_errno . ") " . $conn ->connect_error;
}else{
	echo "ok egine h syndesh !!!".$db;

}

?>