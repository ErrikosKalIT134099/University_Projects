

<?php

if(! isset($_SESSION['cart']) || ! is_array($_SESSION['cart'])) {
	$_SESSION['cart']=array();
}

$pid= $_REQUEST['prod_id'];
$a= $_REQUEST['posotita'];

$_SESSION['cart'][$pid] += $a;

if($_SESSION['cart'][$pid]<0) {
	$_SESSION['cart'][$pid]=0;
}

$sql = "select price from product where id=?";
$stmt = $conn->prepare($sql);
$stmt->bind_param("i", $pid);
$stmt->execute();
$result = $stmt->get_result();
$row = $result->fetch_assoc();
$result->free_result();

$price = $_SESSION['cart'][$pid] * $row['price'];

?>
<table>
<tr>
	<th>Title</th>
	<th>Price</th>
	<th>Quantity</th>
</tr>

<form method="post" action="">
<input name="p" value="empty_cart" type="hidden"/>

<?php

$sql = "select title,price,Image from product where id=?";
if(! isset($_SESSION['cart']) || ! is_array($_SESSION['cart'])) {
	print "den exw tpt";
} elseif( $stmt = $conn->prepare($sql) ) {
	$sum=0;
	foreach($_SESSION['cart'] as $k=>$v) {
		$stmt->bind_param("i", $k);
		$stmt->execute();
		$result = $stmt->get_result();
		$row = $result->fetch_assoc();
		$result->free_result();
		print "<tr>";
		print "<td>$row[title]</td>";
		print "<td>$row[price]</td>";
		print "<td id='prod_$k'>$v</td>";
		$price=$row['price']* $v;
		$sum += $price;
		print "<td >$price</td>";
		print "</tr>";
	}
	print "<tr><th colspan='3'>Souma:</th><th>$sum</th></tr>";
	print "<input type='submit' name='submit' value='Empty your cart'>";

}
//<td>".'<img height=50px width=50px src="data:image/jpeg;base64,'.base64_encode( $row['Image'] ).'"/>'."</td>";
?>


</form>

<form method="post" action="">
<input name="p" value="display_order" type="hidden"/>

<input type='submit' name='submit2' value='Make your Order'>

</form>