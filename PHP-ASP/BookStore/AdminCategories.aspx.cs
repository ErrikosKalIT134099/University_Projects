using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class AdminCategories : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Edit_OnClick(object sender, EventArgs e)
    {
        CategoryView.Columns[3].Visible = true;
        CategoryView.Columns[4].Visible = true;

    }
    protected void CategoryView_RowUpdating(object sender, GridViewUpdateEventArgs e)
    {
        TextBox txtCat = CategoryView.Rows[e.RowIndex].FindControl("NameTB") as TextBox;
        TextBox txtID = CategoryView.Rows[e.RowIndex].FindControl("IDTB") as TextBox;
        int id = Convert.ToInt32(txtID.Text);
        string cat = txtCat.Text;
        SqlDataSource1.UpdateCommand = "UPDATE category SET  Name = '" + cat + "' WHERE ID =" + id;
        CategoryView.Columns[3].Visible = false;
        CategoryView.Columns[4].Visible = false;
    }
    protected void CategoryView_RowDeleting(object sender, GridViewDeleteEventArgs e)
    {
        TextBox txtID = CategoryView.Rows[e.RowIndex].FindControl("IDTB") as TextBox;
        int id = Convert.ToInt32(txtID.Text);
        SqlDataSource1.DeleteCommand = "DELETE * FROM category WHERE ID=" + id;
    }
    protected void CategoryView_SelectedIndexChanged(object sender, EventArgs e)
    {
        Response.Redirect("AdminProducts.aspx");
    }
}