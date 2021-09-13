<?php



$cID=$_REQUEST['cid'];
$sql = "select * from  product where Category=?";
echo "CID: ".$cID;

//$stmt = $mysqli->prepare($sql)
if( $stmt = $conn->prepare($sql) ) {
	$stmt->bind_param("i", $cID);
	$stmt->execute();
	$result = $stmt->get_result();
	echo "<table>";
	echo "<tr><th>Image</th><th>Title</th><th>Price</th></tr>";
	while ($row = $result->fetch_assoc()) {
		print "<tr><td>".'<img height=50px width=50px src="data:image/jpeg;base64,'.base64_encode( $row['Image'] ).'"/>'."</td><td><a href='index.php?p=cart&pid=$row[ID]'>$row[Title]</a></td><td>$row[Price]</td</tr>";
				}
		echo "</table>";
}





?>