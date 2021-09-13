<h4>Category List II</h4>
<?php

$sql = "select * from category";
$result = $conn->query($sql);
echo "<br><select onchange='location = this.value;'>";
echo "<option selected>All Categories</option>";
	if ($result->num_rows > 0) 
	{
	    // output data of each row
	    while($row = $result->fetch_assoc()) 
	    {
				 echo "<option value='index.php?p=productListV2&cid=$row[ID]'>"."$row[Name]</option>";
		 }
  echo "</select>";	
	} else {
    echo "0 results";
	}
	


?>