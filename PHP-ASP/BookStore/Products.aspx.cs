using System;
using System.Collections.Generic;
using System.Data.OleDb;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Products : System.Web.UI.Page
{   public static int count=0;
  //  List<CartObj> list = new List<CartObj>();
    protected void Page_Load(object sender, EventArgs e)
    {
        
        string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source=" + Server.MapPath("~/ebookstoredb.mdb");
        using(OleDbConnection con=new OleDbConnection(conString)){
              con.Open();
            String query = "Select * from category";
            String query2 = "Select * from product where Category=@catidsub";
            String query3 = "Select * from product where ID=@bookID"; 
            using(OleDbCommand cmd = new OleDbCommand(query,con)){
                OleDbDataReader reader = cmd.ExecuteReader();
                testLI.Text = "<ul>";
                while (reader.Read())
                {
                   
                    testLI.Text += "<li> <a href='Products.aspx?p=catinfo&catid=" + reader["ID"] + "'>" + reader["Name"] + "</a></li>";
                     
                }
                testLI.Text += "</ul>";
                reader.Close();
               
            }
            int CategoryID = 0; int CategoryInfo = 0;
            //test gia ulopoiish upomenou
            if (!String.IsNullOrEmpty(Request.QueryString["catid"]))
            {
                // Query string value is there so now use it
                CategoryID = Convert.ToInt32(Request.QueryString["catid"]);
                CatID.Text = "CatID: " + CategoryID;
            }
            if (CategoryID >= 1)
            {
                
                subLI.Visible = true;
            }

            using (OleDbCommand cmdsub = new OleDbCommand(query2, con))
            {
                cmdsub.Parameters.AddWithValue("@catidsub", CategoryID);
                OleDbDataReader subreader = cmdsub.ExecuteReader();
                
                subLI.Text = "<table>";
                subLI.Text += "<tr><th>Title</th>" +       
                              "</tr>";
                
                while (subreader.Read())
                {
                    subLI.Text += "<tr><td> <a  href='Products.aspx?p=catinfo&catinfo=" + subreader["ID"] + "'>" + subreader["Title"] + "</a></td>" +
                                       
                                  "</tr>";//"<tr><td>"+"</td></tr>"
                }
                subLI.Text += "</table>";
                subreader.Close();
            }
            //plhrofories desc timi  gia to ka8e book
            if (!String.IsNullOrEmpty(Request.QueryString["catinfo"]))
            {
                // Query string value is there so now use it
                CategoryInfo = Convert.ToInt32(Request.QueryString["catinfo"]);
                CatInfo.Text = "CatInfo: " + CategoryInfo;
            }
            if (CategoryInfo >= 1)
            {
                DescInfo.Visible = true;
                Table1.Visible = true;
            }
               

             using (OleDbCommand cmdinfo = new OleDbCommand(query3, con))
            {
                cmdinfo.Parameters.AddWithValue("@bookID", CategoryInfo);
                OleDbDataReader inforeader = cmdinfo.ExecuteReader();
               
                DescInfo.Text = "<table>";
                DescInfo.Text += "<tr><th>Title</th>" +
                                      "<th>Description</th>"+
                                      "<th>Price</th>" +    
                              "</tr>";
                  while (inforeader.Read())
                  {
                      DescInfo.Text += "<tr><td>"  + inforeader["Title"] + "</td>" +
                                            "<td>"  + inforeader["Description"] + "</td>"+
                                            "<td>"  + inforeader["Price"] + "</td>"+          
                                    "</tr>";
                  }
                  DescInfo.Text += "</table>";
                
                  {

                 }
                  inforeader.Close();
                 
            }
            con.Close();
        }
       

    }
    protected void Title_Dis(object sender, EventArgs e)
    {
        count++;
        int quantity =Convert.ToInt32(quantityTB.Text);
        int product = Convert.ToInt32(Request.QueryString["catinfo"]);

        Session["asd"] = 0;

        Session["product"+count] = product;
        Session["quantity"+count] =quantity;
        
        Session["counter"] = count;
        //Response.Redirect("Cart.aspx");

        //CartObj cart = new CartObj(product, quantity);
        
      //  list.Add(new CartObj(product, quantity));
        string test12 = "Periexomena:  ";


        test12 += quantity + "ID" + product;
       

        testLB.Text = test12;
      
    }

}