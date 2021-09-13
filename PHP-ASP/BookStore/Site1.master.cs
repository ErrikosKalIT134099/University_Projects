using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Site1 : System.Web.UI.MasterPage
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if(Session["user"] != null){
            AdminOrdersB2.Visible = true;
            if (Session["user"].Equals("admin"))
            {
               
                TestL.Text = "Admin Menu";
                usernameL.Text = "Username: "+ (string)Session["user"];
                CustomersB.Visible = true;
                OrdersB.Visible = true;
                EditCatB.Visible = true;
                EditOrdB.Visible = true;
                EditProB.Visible = true;
            }
            else
            {
                TestL.Text = "User Menu";
                usernameL.Text = "Username: " + (string)Session["user"];
                MyOrdersB.Visible = true;
                MyDetailsB.Visible = true;
                MyDetailB.Visible = true;
            }
            LogOutB.Visible = true;
        }
        

    }
    protected void HomeB_Click(object sender, EventArgs e)
    {
        Response.Redirect("Default.aspx");
    }
    protected void ShopInfoB_Click(object sender, EventArgs e)
    {
        Response.Redirect("ShopInfo.aspx");
    }
    protected void Products_Click(object sender, EventArgs e)
    {
        Response.Redirect("Products.aspx");
    }
    protected void CartB_Click(object sender, EventArgs e)
    {
        Response.Redirect("Cart.aspx");
    }
    protected void LoginB_Click(object sender, EventArgs e)
    {
        Response.Redirect("Login.aspx");
    }
    protected void ContactB_Click(object sender, EventArgs e)
    {
        Response.Redirect("Contact.aspx");
    }

    protected void CustomersB_Click(object sender, EventArgs e)
    {
        Response.Redirect("Customers.aspx");
    }
    protected void MyDetailsB_Click(object sender, EventArgs e)
    {
        Response.Redirect("MyDetails.aspx");
    }
    protected void LogOutB_Click(object sender, EventArgs e)
    {
        Session.Abandon();
        Response.Redirect("Default.aspx");
    }
    protected void EditCatB_Click(object sender, EventArgs e)
    {
        Response.Redirect("AdminCategories.aspx");
    }
    protected void OrdersB_Click(object sender, EventArgs e)
    {
        Response.Redirect("Orders.aspx");
    }
    protected void EditProB_Click(object sender, EventArgs e)
    {
        Response.Redirect("AdminProductsV2.aspx");
    }
    protected void MyDetailB_Click(object sender, EventArgs e)
    {
        Response.Redirect("editaccount.aspx");
    }
    protected void AdminOrdersB2_Click(object sender, EventArgs e)
    {
        Response.Redirect("AdminOrderB2.aspx");
    }
}
