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
using System.Data.OleDb;

public partial class Orders : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source=" + Server.MapPath("~/ebookstoredb.mdb");
        using (OleDbConnection con = new OleDbConnection(conString))
        {
            con.Open();
            String query = "SELECT * FROM customer INNER JOIN orders ON customer.[ID] = orders.[Customer];";
            using (OleDbCommand cmd = new OleDbCommand(query, con))
            {
                OleDbDataReader reader = cmd.ExecuteReader();
                String msg = "";
                msg += "<Table>";
                msg += "<th> Order ID </th>";
                msg += "<th> Customer ID </th>";
                msg += "<th> Name  </th>";
                msg += "<th> Fname </th>";
                msg += "<th> Date </th>";
                while (reader.Read())
                {
                    msg += "<tr><td>" + reader["Customer.ID"] + "</td><td> " + reader["Customer"] +
                        "</td>" + "<td> " + reader["Lname"] +"</td>"+ "<td> " + reader["Fname"] +"</td>"+ 
                        "<td> " + reader["oDate"] + "</td></tr>";
                }
                msg += "</table>";
                reader.Close();
                OrdersL.Text = msg;
            }
            con.Close();
        }
    }
}
