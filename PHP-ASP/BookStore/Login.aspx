<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="Login.aspx.cs" Inherits="Login" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
    <asp:Panel ID="RegisterPanel" runat="server">
     <table>
         <tr>
             <td>Ονομα Χρηστη:</td>
             <td> <asp:TextBox ID="UsernameTB" runat="server"></asp:TextBox></td>
         </tr>
         <tr>
             <td>Κωδικος:</td>
             <td><asp:TextBox ID="PasswordTB" TextMode="Password" runat="server"></asp:TextBox></td>
         </tr>
     </table>
    <asp:Label ID="ErrorLB" runat="server" Text=""></asp:Label><br />

    <asp:Button ID="LoginSubmitB" runat="server" Text="Εισοδος" OnClick="LoginSubmitB_Click1" />
        <asp:Button ID="LoginDataSet" runat="server" Text="Login DataSet" 
            onclick="LoginDataSet_Click" />
    <br /><br />Εγγραφη? <asp:HyperLink ID="RegisterLB" NavigateUrl="RegisterUserAjax.aspx"  runat="server">εδω</asp:HyperLink>!
    <br /><br />Ξεχασες τον κωδικο?<br />
    <asp:LinkButton ID="PassReminderLB" runat="server" OnClick="PassReminderLB_Click"  >Ανακτηση Κωδικου </asp:LinkButton>
     </asp:Panel>
    
    <asp:ScriptManager ID="PassRem"  runat="server" > </asp:ScriptManager>
        <asp:UpdatePanel runat="server"  ID="PassReminderP" Visible="false" >
            <ContentTemplate>  Δωσε E-mail: <asp:TextBox ID="MailRetriveTB" runat="server"></asp:TextBox><br />
        <asp:Button ID="RetriveB" runat="server" Text="Ανακτηση" OnClick="RetriveB_Click" />   
                <br />
                <asp:Label ID="RetrievedPassLB" ForeColor="Green" runat="server" Text=""></asp:Label>
            </ContentTemplate>
        </asp:UpdatePanel>
   

    
</asp:Content>

