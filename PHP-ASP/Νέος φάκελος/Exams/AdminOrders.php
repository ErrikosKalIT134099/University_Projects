<?php
//erwthma A
if($_SESSION['username']=='admin'){

$sql = "select * from customer";
$result = $conn->query($sql);
echo "<br><select onchange='location = this.value;'>";
echo "<option selected>oles ta onomata </option>";
	if ($result->num_rows > 0) 
	{
	    // output data of each row
	    while($row = $result->fetch_assoc()) 
	    {
				 echo "<option value='index.php?p=AdminOrders&custid=$row[ID]'>"."$row[Fname]</option>";
		 }
  echo "</select>";	
	} else {
    echo "0 results";
	}
echo"<bR>Erwthma B";	
$custID=$_REQUEST['custid'];
$sql = "select * from orders where Customer=?";
echo "CustID: ".$custID;

//$stmt = $mysqli->prepare($sql)
if( $stmt = $conn->prepare($sql) ) {
	$stmt->bind_param("i", $custID);
	$stmt->execute();
	$result = $stmt->get_result();
	echo "<table>";
	echo "<tr><th>Order ID</th><th>Hmerominia</th></tr>";
	while ($row = $result->fetch_assoc()) {
		print "<tr><td><a href='index.php?p=AdminOrdersV2&oid=$row[ID]'>$row[ID]</a></td><td>$row[oDate]</td</tr>";
		}
		echo "</table>";

}

}else
{
print "Den exete Prosvash";
}
?>