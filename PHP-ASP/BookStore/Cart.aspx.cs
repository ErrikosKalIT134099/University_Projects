using System;
using System.Collections.Generic;
using System.Data.OleDb;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public class CartItems {
    private string itemID;
    
    public string ItemID
    {
        get { return itemID; }
        set { itemID = value; }
    }
    private string itemQuan;

    public string ItemQuan
    {
        get { return itemQuan; }
        set { itemQuan = value; }
    }


}
public partial class Cart : System.Web.UI.Page
{
     //List<CartItems> list = new List<CartItems>();
     string gamw,emf;
     int totalPrice = 0;
       
     protected void Page_Load(object sender, EventArgs e)
     {
         if (Convert.ToInt32( Session["asd"]).Equals(0))
         {


             int session = Convert.ToInt32(Session["asd"]);
             string BookID = "1";
             //string pid = (string)Session["product"];
             //string qty = (string)Session["quantity"];
             string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source=" + Server.MapPath("~/ebookstoredb.mdb");
             using (OleDbConnection con = new OleDbConnection(conString))
             {
                 con.Open();

                 emf = "<table>";
                 emf += "<th>ID</th>";
                 emf += "<th>Title</th>";
                 emf += "<th>Quantity</th>";
                 emf += "<th>Price</th>";
                 for (int i = 1; i <= Convert.ToInt32(Session["counter"]); i++)
                 {
                     // CartItems items = new CartItems();
                     // items.ItemID = Session["product" + i].ToString();
                     // items.ItemQuan =Session["quantity" +i].ToString();
                     // list.Add(items);
                     BookID = Convert.ToString(Session["product" + i]);
                     String query = "Select * from product where ID=@BookID";
                     using (OleDbCommand cmd = new OleDbCommand(query, con))
                     {
                         cmd.Parameters.AddWithValue("@BookID", BookID);
                         OleDbDataReader reader = cmd.ExecuteReader();
                         while (reader.Read())
                         {

                             emf += "<tr><td>" + Session["product" + i] + "</td>" +
                                 "<td>" + reader["Title"] + "</td>"
                                 + "<td>" + Session["quantity" + i] + "</td>"
                                  + "<td>" + reader["Price"] + "</td>";
                             totalPrice += Convert.ToInt32(reader["Price"]) * Convert.ToInt32(Session["quantity" + i]);

                         }
                         emf += "</tr>";
                         reader.Close();


                     }
                 }
                 con.Close();
                 emf += "</table>";



                 test.Text += emf;
                 load.Text = "To se: " + session;

                 Sum.Text += "Συνολο: " + Convert.ToString(totalPrice);

             }
         }
         Session["asd"] = 1;
         }

     protected void Button1_Click(object sender, EventArgs e)
     {
         for (int i = 1; i <= Convert.ToInt32(Session["counter"]); i++)
         {
             Session["product"+i] = null;
             Session["quantity"+i] = null;
             Session["counter"+i] = null;

         }

        
         Response.Redirect ("cart.aspx");
     }

     protected void BuyB_Click(object sender, EventArgs e)
     {
         String date = DateTime.Now.ToString("dd/MM/yyyy");
         if( (Session["user"] != null)){

             string findUser =Convert.ToString(Session["user"]);
             int userID = 0;
             int orderID = 0;
             string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data source=" + Server.MapPath("~/ebookstoredb.mdb");

             using (OleDbConnection con = new OleDbConnection(conString))
             {
                 con.Open();
                 //euresi toy id toy user
                 string findquery = "Select * from customer where uname=@name";

                 using (OleDbCommand findcmd = new OleDbCommand(findquery, con))
                 {
                     findcmd.Parameters.AddWithValue("@name",findUser);
                     OleDbDataReader reader = findcmd.ExecuteReader();
                     while (reader.Read())
                     {

                         userID =Convert.ToInt32(reader["ID"]);

                     }
                    
                     reader.Close();

                 }
                 //insert ston pinaka Orders//
                 string IDquery = "INSERT INTO orders (Customer,oDate) VALUES (@ID,@date)";
                 using (OleDbCommand cmd = new OleDbCommand(IDquery, con))
                 {
                     cmd.Parameters.AddWithValue("@ID",userID );
                     cmd.Parameters.AddWithValue("@date",date);
                     
                     int result = cmd.ExecuteNonQuery();
                     if (result == 1)
                     {
                        
                     }
                 }

                 //euresh tou orderID
                 string findIDquery = "Select * from orders where oDate=@date";
                 using (OleDbCommand findIDcmd = new OleDbCommand(findIDquery, con))
                 {
                     findIDcmd.Parameters.AddWithValue("@date", date);
                     OleDbDataReader reader2 = findIDcmd.ExecuteReader();
                     while (reader2.Read())
                     {

                         orderID = Convert.ToInt32(reader2["ID"]);

                     }

                     reader2.Close();

                 }
                 //eisagwgi dedomenwn ston order details
                 for (int i = 1; i <= Convert.ToInt32(Session["counter"]); i++)
                 {
                     string Insertquery = "INSERT INTO orderdetails ([Order],Quantity,Product) VALUES (@order,@qua,@product)";
                     using (OleDbCommand Insertcmd = new OleDbCommand(Insertquery, con))
                     {
                         Insertcmd.Parameters.AddWithValue("@order", orderID);
                         Insertcmd.Parameters.AddWithValue("@qua", Convert.ToInt32(Session["Quantity" + i]));
                         Insertcmd.Parameters.AddWithValue("@product",Convert.ToInt32(Session["product" + i]));

                         load.Text += "OrderID" + orderID + " Product: " + Convert.ToInt32(Session["product" + i]);

                         int result = Insertcmd.ExecuteNonQuery();
                        
                     }
                 }



                 con.Close();
             }
            

         }else{
             load.Text = "Πρεπει να συνδεθεις για να ολοκληρωθει!";
         }

     }
}
 