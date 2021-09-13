using System;
using System.Collections.Generic;
using System.Data.OleDb;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;

public partial class Login : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void LoginSubmitB_Click1(object sender, EventArgs e)
    {
        string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data source=" + Server.MapPath("~/ebookstoredb.mdb");

        using(OleDbConnection con = new OleDbConnection(conString)){
            con.Open();
            string query = "SELECT count(*) From customer " +
                            "WHERE uname=@username AND passwd=@password";
            using(OleDbCommand cmd= new OleDbCommand(query,con))
            {
                cmd.Parameters.AddWithValue("@username",UsernameTB.Text);
                cmd.Parameters.AddWithValue("@passwd", PasswordTB.Text);
                int result = (int)cmd.ExecuteScalar();
                if (result == 1)
                {
                    Session["user"] = UsernameTB.Text;
                    Response.Redirect("Default.aspx");
                }
                else
                {
                    ErrorLB.Text = "Try again..!";
                }
            }
            con.Close();
        }

    }
    protected void PassReminderLB_Click(object sender, EventArgs e)
    {
        RegisterPanel.Visible = false;
        PassReminderP.Visible = true;
       // PassReminderP.Visible = true;
    }
    protected void RetriveB_Click(object sender, EventArgs e)
    {
        string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data source=" + Server.MapPath("~/ebookstoredb.mdb");
        using (OleDbConnection con = new OleDbConnection(conString))
        {
            con.Open();
            string query = "Select passwd from customer " +
                            " where uname=@uname";
            using (OleDbCommand cmd = new OleDbCommand(query, con))
            {
                cmd.Parameters.AddWithValue("@uname", MailRetriveTB.Text);
                OleDbDataReader reader = cmd.ExecuteReader();
                String msg = "";

                while (reader.Read())
                {
                    msg += reader["passwd"];
                }
                reader.Close();
                RetrievedPassLB.Text ="Ο Κωδικος σας ειναι: "+ msg;
              
            }
            con.Close();
        }

    }
    protected void LoginDataSet_Click(object sender, EventArgs e)
    {
       //dhmiourgia table adapter
        BookStoreDataSetTableAdapters.customerTableAdapter cta = new BookStoreDataSetTableAdapters.customerTableAdapter();
       
        //dhmiourgia Datatable
        DataTable customerDT = new DataTable();
        //dhmioyrgia stilwn
        DataColumn userColumn = new DataColumn();
        DataColumn passColumn = new DataColumn();

        userColumn.DataType = System.Type.GetType("System.String");
        userColumn.Caption = "uname";
        userColumn.ColumnName = "uname";
        customerDT.Columns.Add(userColumn);

        passColumn.DataType = System.Type.GetType("System.String");
        passColumn.Caption = "passwd";
        passColumn.ColumnName = "passwd";
        customerDT.Columns.Add(passColumn);
        

        DataRow row;

        int result = (int)cta.UserLogin(UsernameTB.Text,PasswordTB.Text);

        if (result == 1)
        {
            row = customerDT.NewRow();
            Session["user"] = UsernameTB.Text;
            Session["passwd"] = PasswordTB.Text;
            //gt antistrofa edw?
            row["passwd"] = Session["passwd"];
            row["uname"] =  Session["user"];
        }
        else
        {
            ErrorLB.Text = "Try Again!";
        }
    }
}