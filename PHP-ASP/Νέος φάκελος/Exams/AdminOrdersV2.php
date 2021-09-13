<?php
$oid=$_REQUEST['oid'];
echo $oid;

$sql = "SELECT Title,Quantity FROM orderdetails INNER JOIN Product ON orderdetails.Product=Product.ID WHERE orderdetails.Orders=?";

//$stmt = $mysqli->prepare($sql)
if( $stmt = $conn->prepare($sql) ) {
	$stmt->bind_param("i", $oid);
	$stmt->execute();
	$result = $stmt->get_result();
	echo "<table>";
	echo "<tr><th>Product</th><th>Quantity</th></tr>";
	while ($row = $result->fetch_assoc()) {
		print "<tr><td>$row[Title]</td>";
		print "<td>$row[Quantity]</td></tr>";
		}
		echo "</table>";

}

?>