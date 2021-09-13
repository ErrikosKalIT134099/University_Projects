<form method="get" action="">
<input name="p" value="addtocart" type="hidden"/>


<table>
<tr>
	<th>Title</th>
	<th>Description</th>
	<th>Price</th>
	<th>Quantity</th>


	
</tr>
<?php
$cat = $_REQUEST['pid'];
$sql = "SELECT id,title,description,price FROM product WHERE id=?";

if( $stmt = $conn->prepare($sql) ) {
	$stmt->bind_param("i", $cat);
	$stmt->execute();
	$result = $stmt->get_result();
	$row = $result->fetch_assoc();
		echo "<tr><td>$row[title]</td>".
			"<td>$row[description]</td>".
		      "<td>$row[price]</td></tr>";
		}
		print "<td><input type='number' name='posotita' value='1'/></td>";
		print "<input type='hidden' name='prod_id' value='{$row['id']}'/>";
		print "<td><input type='submit' name='submit' value='Add to your cart'></td>";
		print "</tr>";



?>


</form>
</table>