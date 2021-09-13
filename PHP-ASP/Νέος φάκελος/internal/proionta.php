<table>
<tr>
	<th>Title</th>
	<th>Price</th>
</tr>

<?php
$cat = $_REQUEST['catid'];
$sql = "SELECT id,title,price FROM product WHERE category=?";

if( $stmt = $conn->prepare($sql) ) {
	$stmt->bind_param("i", $cat);
	$stmt->execute();
	$result = $stmt->get_result();
	while ($row = $result->fetch_assoc()) {
		echo "<tr><td><a href='index.php?p=cart&pid=$row[id]'>".
				"$row[title]</a></td>".
		      "<td>$row[price]</td></tr>";
		      }
}


?>

</table>