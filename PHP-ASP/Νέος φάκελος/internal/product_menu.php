<?php

//sundesi me tin vasi gia emfanisi olwn ton prointwn
$sql = "select * from product order by Title";
$result = $conn->query($sql);
if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
        echo "<li><a href='index.php?p=product_edit&pid=$row[ID]'>".
				"$row[Title]</a></li>";
				// echo "<li><input name='$row[ID]' type='checkbox' /></li>";

	//print "<li><a href='index.php?p=pedit&pid=$row[ID]'>".
				//"$row[Title] ($row[ID])</a></li>";
    }
    
} else {
    echo "0 results";
}


?>