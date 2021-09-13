using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using System.Xml.Linq;

public partial class MasterPage : System.Web.UI.MasterPage
{
    protected void Page_Load(object sender, EventArgs e)
    {
    
    }

    protected void homeB_Click(object sender, EventArgs e)
    {
        Response.Redirect("Default.aspx");
    }
    protected void shopInfob_Click(object sender, EventArgs e)
    {
        Response.Redirect("ShopInfo.aspx");
    }
    protected void productsb_Click(object sender, EventArgs e)
    {
        Response.Redirect("Products.aspx");
    }
    protected void kalathib_Click(object sender, EventArgs e)
    {
        Response.Redirect("Kalathi.aspx");
    }
    protected void loginb_Click(object sender, EventArgs e)
    {
        Response.Redirect("Login.aspx");
    }
    protected void epikoinwniab_Click(object sender, EventArgs e)
    {
        Response.Redirect("Epikoinwnia.aspx");
    }
   
}
