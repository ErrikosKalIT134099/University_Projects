using System;
using System.Collections.Generic;
using System.Data.OleDb;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;

public partial class RegisterAjax : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
       // ValidationSettings.UnobtrusiveValidationMode = UnobtrusiveValidationMode.None;
        RegisterMV.ActiveViewIndex = 0;
    }
    protected void NextB_Click(object sender, EventArgs e)
    {
        NameL.Text = NameTB.Text;
        SurnameL.Text = SurnameTB.Text;
        emailL.Text = EmailTB.Text;
        UsernameL.Text = UsernameTB.Text;
        PasswordL.Text=PasswordTB.Text;
        AddressL.Text = AdressTB.Text;
        ThlL.Text = ThlTB.Text;
        TKL.Text = TKTB.Text;
        CityL.Text = CityTB.Text;
        CountryL.Text = CountryTB.Text;
        RegisterMV.ActiveViewIndex = 1;
    }

    protected void BackB_Click(object sender, EventArgs e)
    {
        RegisterMV.ActiveViewIndex = 0;
    }
    protected void Button1_Click(object sender, EventArgs e)
    {

        //INSERT INTO customer (Fname,Lname,Address,Phone,uname,passwd) VALUES ('Admin','Adminakos','Base',256897,'admin',123)
        string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data source=" + Server.MapPath("~/ebookstoredb.mdb");

        using (OleDbConnection con = new OleDbConnection(conString))
        {
            con.Open();
            string query = "INSERT INTO customer (Fname,Lname,Address,Phone,uname,passwd) VALUES (@name,@sname,@addr,@thl,@usern,@pass)";
            using (OleDbCommand cmd = new OleDbCommand(query, con))
            {
                cmd.Parameters.AddWithValue("@name", NameTB.Text);
                cmd.Parameters.AddWithValue("@sname", SurnameTB.Text);
                cmd.Parameters.AddWithValue("@addr", AdressTB.Text);
                cmd.Parameters.AddWithValue("@thl", ThlTB.Text);
                cmd.Parameters.AddWithValue("@usern", UsernameTB.Text);
                cmd.Parameters.AddWithValue("@pass", PasswordL.Text);
                int result= cmd.ExecuteNonQuery();
                if (result == 1)
                {
                    Response.Redirect("Login.aspx");
                }
            }
            con.Close();
        }
       
    }
    protected void Button2_Click(object sender, EventArgs e)
    {
        BookStoreDataSetTableAdapters.customerTableAdapter ctaInsert = new BookStoreDataSetTableAdapters.customerTableAdapter();


        int result = (int)ctaInsert.Insert(NameTB.Text, SurnameTB.Text, AdressTB.Text,ThlTB.Text, UsernameTB.Text, PasswordL.Text);

        if(result==1){
            
        }
    }
}