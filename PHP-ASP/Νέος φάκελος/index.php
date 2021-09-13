<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<?php
session_start();
if( ! isset($_SESSION['username'])) {
	$_SESSION['username']='?';
}

require_once "internal/db_connect.php";

?>
<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>Untitled 1</title>
<link href="layout.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="top">
<a href="index.php?p=start">Αρχική</a>
<a href="?p=shopinfo">Κατάστημα</a>
<a href="?p=proionta">Προϊόντα</a>
<a href="?p=login">Login</a>
<a href="?p=contact">Επικοινωνία</a>
<a href="?p=cart">Καλάθι αγορών</a>
<a href="?p=AdminOrders">AdminOrders</a>
</div>
<div id="left">
<?php
	print "<p>This is user: $_SESSION[username]</p>";
	if($_SESSION['username']=='admin') {
		print "<h2>Admin MENU</h2>";
		include ('internal/admin_menu.php');
		include ('internal/admin_menu_2.php');
		//include('internal/product_menu.php');

		

	}

if($_SESSION['username']!='admin' && $_SESSION['username']!='?' ){
include ('internal/login_menu.php');
}
/* το μενου των κατηγοριων των προιωντων */
include ('internal/dispaly_Category.php');
//include('internal/productList.php');
?>

</div>
<div id="content">
<?php
if( ! isset($_REQUEST['p'])) {
	$_REQUEST['p']='start';
}
$p = $_REQUEST['p'];
print "must require page: internal/$p";
switch ($p){
case "start" :		require "internal/start.php";
					break;
case "shopinfo": 	require "internal/shopinfo.php";
					break;
case "login" :		require "internal/login.php";
					break;
case 'do_login':	require "internal/do_login.php";
					break;
case 'do_change':	require "internal/do_change.php";
					break;
case 'contact':		require "internal/contact.php";
					break;
case 'MyOrders':	require "internal/MyOrders.php";
					break;
case 'MyDetails':	require "internal/MyDetails.php";
					break;
case 'Logout':		require "internal/Logout.php";
					break;
case 'Order_list':	require "internal/Order_list.php";
					break;

case 'Client_list':	require "internal/Client_list.php";
					break;
					
case 'proionta':	require "internal/proionta.php";
					break;

case 'cart':	require "internal/cart.php";
					break;
case 'addtocart':	require "internal/addtocart.php";
					break;
					
case 'empty_cart':	require "internal/empty_cart.php";
					break;
case 'display_order':require "internal/display_order.php";
					break;
case 'add_item':	require "internal/add_item.php";
					break;
case 'product_menu':require "internal/product_menu.php";
					break;
case 'product_edit':require "internal/product_edit.php";
					break;
case 'do_productEdit':require "internal/do_productEdit.php";
					break;
case 'admin_orders':require "internal/admin_orders.php";
					break;
//case 'AdminOrders':require "internal/AdminOrders.php";
//					break;
//case 'AdminOrdersV2':require "internal/AdminOrdersV2.php";
//					break;

case 'display_Category':require "internal/dispaly_Category.php";
					break;

case 'productListV2':require "internal/productListV2.php";
					break;











default: 
	print "Η σελίδα δεν υπάρχει";
}
?>
</div>
<div id="footer"></div>
</body>
</html>
