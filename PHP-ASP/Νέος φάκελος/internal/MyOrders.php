<table>
<tr>
	<th>Title</th>
	<th>Price</th>
	<th>Quantity</th>
</tr>


<?php

$sql = "select title,price from product where id=?";
if(! isset($_SESSION['order']) || ! is_array($_SESSION['order'])) {
	print "den exw tpt";
} elseif( $stmt = $conn->prepare($sql) ) {
	$sum=0;
	foreach($_SESSION['order'] as $k=>$v) {
		$stmt->bind_param("i", $k);
		$stmt->execute();
		$result = $stmt->get_result();
		$row = $result->fetch_assoc();
		$result->free_result();
		print "<tr><td>$row[title]</td>";
		print "<td>$row[price]</td>";
		print "<td id='prod_$k'>$v</td>";
		$price=$row['price']* $v;
		$sum += $price;
		print "<td >$price</td>";
		print "</tr>";
	}
	print "<tr><th colspan='3'>Souma:</th><th>$sum</th></tr>";

}
?>
