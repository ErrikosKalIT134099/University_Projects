using System;
using System.Collections.Generic;
using System.Data.OleDb;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Customers : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source=" + Server.MapPath("~/ebookstoredb.mdb");
        using(OleDbConnection con=new OleDbConnection(conString)){
            con.Open();
            String query = "Select * from customer";
            //Emfanish pelatwn
            using(OleDbCommand cmd = new OleDbCommand(query,con)){
                OleDbDataReader reader = cmd.ExecuteReader();
                String msg = "";
                msg += "<Table>";
                msg += "<th> Client ID </th>";
                msg += "<th> First Name </th>";
                msg += "<th> Last Name  </th>";
                msg += "<th> User Name </th>";
                msg += "<th> PassWord </th>";
                while (reader.Read())
                {
                    msg += "<tr><td>" + reader["ID"] + "</td><td> " + reader["Fname"] +
                       "</td>" + "<td> " + reader["Lname"] + "</td>" + "<td> " + reader["uname"] + "</td>" +
                       "<td> " + reader["passwd"] + "</td></tr>";
                }
                msg += "</table>";
                reader.Close();
                ClientsLB.Text = msg;
            }

            con.Close();
        }

    }
    protected void ClientDelB_Click(object sender, EventArgs e)
    {
        string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data source=" + Server.MapPath("~/ebookstoredb.mdb");
        int result = 0;
        using (OleDbConnection con2 = new OleDbConnection(conString))
        {
            con2.Open();
            string query2 = "DELETE *  FROM customer WHERE ID = @ID";
            using (OleDbCommand cmd2 = new OleDbCommand(query2, con2))
            {
              cmd2.Parameters.AddWithValue("@ID", DeleteTB.Text);

             result= cmd2.ExecuteNonQuery();
             if (result == 1)
             {
                 inform.Text = "Διαγραφη Επιτυχης!";
                 Response.Redirect("Customers.aspx");
             }
             else
             {
                 inform.Text = "Διαγραφη Ανεπιτυχης!";
             }
                
            }
            con2.Close();
        }
    }
}