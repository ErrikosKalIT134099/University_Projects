<table>
<tr>
<th>A/A</th>
<th> Order ID</th>
<th>Quantity</th>
<th>Product</th>
</tr>
<?php

//sundesi me tin vasi gia emfanisi olwn ton prointwn
$sql = "select * from orderdetails";
$result = $conn->query($sql);
$count=0;
if ($result->num_rows > 0) {
    // output data of each row
    
    while($row = $result->fetch_assoc()) {
    $count=$count+1;
    	echo "<tr><td>".$count."</td>";
    	echo "<td>$row[ID]</td>";
		echo "<td>$row[Quantity]</td>";
        echo "<td>$row[Product] </td></tr>";
	//print "<li><a href='index.php?p=pedit&pid=$row[ID]'>".
				//"$row[Title] ($row[ID])</a></li>";

    }
    
} else {
    echo "0 results";
}


?>
</table>