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
    protected void StartB_Click(object sender, EventArgs e)
    {
        Response.Redirect("Default.aspx");
    }
    protected void SupB_Click(object sender, EventArgs e)
    {
        Response.Redirect("ShowSuppliers.aspx");
    }
    protected void ClientsB_Click(object sender, EventArgs e)
    {
        Response.Redirect("Clients.aspx");
    }
}
