using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;

public partial class productList : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Customer_Selected(object sender, EventArgs e)
    {
        Session["cattid"] = DropDownList1.SelectedItem.Value;
        CustomerL.Text = "asasdd" + Convert.ToInt32(DropDownList1.SelectedItem.Value);
    }
    protected void Customer_2(object sender, EventArgs e)
    {
        DropDownList1.Items.Insert(0, new ListItem("Επιλογη Ολων", "0"));
    }
}
