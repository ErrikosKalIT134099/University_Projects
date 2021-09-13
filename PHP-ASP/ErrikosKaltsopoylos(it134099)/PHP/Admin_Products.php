<form action="index.php" method="post">
<input type="hidden" name="p" value="do_AdminProducts"/>


<?php

$sql = "select * from product ";
$result = $conn->query($sql);
echo "<table>";
echo"<th>Title</th>";
echo"<th>Price</th>";

	if ($result->num_rows > 0) 
	{
	    // output data of each row
	    while($row = $result->fetch_assoc()) 
	    {
				 echo "<tr><td><a href='index.php?p=Admin_Products&oid=$row[ID]'>$row[Title]</a></td><td>$row[Price]</td></tr>";
		 }
  echo "</table>";	
	} else {
    echo "0 results";
	}
if (isset($_REQUEST['oid']))
{
$Oid=$_REQUEST['oid'];
$sql = "select * from Product where ID=?";
echo "OID: ".$Oid;

//$stmt = $mysqli->prepare($sql)
if( $stmt = $conn->prepare($sql) ) {
	$stmt->bind_param("i", $Oid);
	$stmt->execute();
	$result = $stmt->get_result();
	echo "<table>";
	echo "<tr><th>Title</th><th>Price</th></tr>";
	while ($row = $result->fetch_assoc()) {
		print "<tr><td><input name='title' type='text' value='$row[Title]' /></td><td><input name='price' type='text' value='$row[Price]' /></td</tr>";
		 print "<input type='hidden' name='pid' value='$row[ID]'/>";
		}
		echo "</table>";
		echo"<input type='submit' value='Update'  />";
		echo"</form>";
		//<input type="submit" value="Update"  /></form>

}
}
?>

