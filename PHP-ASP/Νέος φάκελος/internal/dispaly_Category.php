
<h4>Category List I</h4>
<?php

$sql = "SELECT Name,ID FROM category";
echo "<ul>";
if( $stmt = $conn->prepare($sql) ) {
		$stmt->execute();
	$result = $stmt->get_result();
	while ($row = $result->fetch_assoc()) {
		echo "<li><a href='index.php?p=proionta&catid=$row[ID]'>"."$row[Name]</a></li>";
		     		      }
}

echo "</ul>";
?>