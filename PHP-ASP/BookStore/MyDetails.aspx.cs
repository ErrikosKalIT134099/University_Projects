using System;
using System.Collections.Generic;
using System.Data.OleDb;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class MyDetails : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
      string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source=" + Server.MapPath("~/ebookstoredb.mdb");
        using(OleDbConnection con=new OleDbConnection(conString)){
            con.Open();
            String query = "Select * from customer "+
                            "where uname=@username";
             using(OleDbCommand cmd = new OleDbCommand(query,con)){
                 string sname = " ";
                 sname=""+(string)Session["user"];
                 cmd.Parameters.AddWithValue("@username",sname);
                OleDbDataReader reader = cmd.ExecuteReader();
                while (reader.Read())
                {
                    EditNameTB.Text = (string)reader["Fname"];
                    EditSNameTB.Text = (string)reader["Lname"];
                    EditAdrTB.Text = (string)reader["Address"];
                    EditThlTB.Text = (string)reader["Phone"];
                    EditUserNameTB.Text = (string)reader["uname"];
                    EditPassTB.Text = (string)reader["passwd"];
                }
                reader.Close();
             }
             con.Close();
        }
    }
    protected void DoneTB_Click(object sender, EventArgs e)
    {
       //UPDATE customer SET Fname='errikos', Lname='Kalt', Address='Maronias', Phone=2536, uname='errikos', passwd='123' WHERE uname='qw';
        string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data source=" + Server.MapPath("~/ebookstoredb.mdb");

        using (OleDbConnection con = new OleDbConnection(conString))
        {
            con.Open();
            string query = "UPDATE customer SET Fname=@ename, Lname=@esname, Address=@eaddr, Phone=@ethl, passwd=@epass WHERE uname=@eusern";
            using (OleDbCommand cmd = new OleDbCommand(query, con))
            {
                string sname = " ";
                sname = "" + (string)Session["user"];
                cmd.Parameters.AddWithValue("@ename", EditNameTB.Text);
                cmd.Parameters.AddWithValue("@esname", EditSNameTB.Text);
                cmd.Parameters.AddWithValue("@eaddr", EditAdrTB.Text);
                cmd.Parameters.AddWithValue("@ethl", EditThlTB.Text);
                cmd.Parameters.AddWithValue("@eusern", sname);
                cmd.Parameters.AddWithValue("@epass", EditPassTB.Text);
                int result = cmd.ExecuteNonQuery();
                if (result == 1)
                {
                    
                    inform.Text = "Αλλαγη επιτυχης!";
                }
            }
            con.Close();
        }

    }
    protected void EditONTB_Click(object sender, EventArgs e)
    {
        EditNameTB.ReadOnly = false;
        EditSNameTB.ReadOnly = false;
        EditAdrTB.ReadOnly = false;
        EditThlTB.ReadOnly = false;
        //EditUserNameTB.ReadOnly = false;
        EditPassTB.ReadOnly = false;
    }
}