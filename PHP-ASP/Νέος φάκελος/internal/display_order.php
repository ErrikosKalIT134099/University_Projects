<?php

if(! isset($_SESSION['order']) || ! is_array($_SESSION['order'])) {
	$_SESSION['order']=array();
}


	$pid= $_REQUEST['prod_id'];
	$a= $_REQUEST['posotita'];

$_SESSION['order'][$pid] += $a;

if($_SESSION['order'][$pid]<0) {
	$_SESSION['order'][$pid]=0;
}

$sql = "select price from product where id=?";
$stmt = $conn->prepare($sql);
$stmt->bind_param("i", $pid);
$stmt->execute();
$result = $stmt->get_result();
$row = $result->fetch_assoc();
$result->free_result();

$price = $_SESSION['order'][$pid] * $row['price'];

?>

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
