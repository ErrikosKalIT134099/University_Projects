<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="MyDetails.aspx.cs" Inherits="MyDetails" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
    <asp:Label ID="inform" runat="server" ForeColor="YellowGreen" Text=""></asp:Label>
    <table>
        <tr>
            <td>Ονομα:</td>
            <td><asp:TextBox ID="EditNameTB" ReadOnly="true" runat="server"></asp:TextBox></td>
        </tr>
         <tr>
            <td>Επωνημο:</td>
            <td><asp:TextBox ID="EditSNameTB" ReadOnly="true" runat="server"></asp:TextBox></td>
        </tr>
         <tr>
            <td>Διευθυνση:</td>
            <td><asp:TextBox ID="EditAdrTB" ReadOnly="true" runat="server"></asp:TextBox></td>
        </tr>
         <tr>
            <td>Τηλεφωνο:</td>
            <td><asp:TextBox ID="EditThlTB" ReadOnly="true" runat="server"></asp:TextBox></td>
        </tr>
         <tr>
            <td>Ονομα Χρηστη:</td>
            <td><asp:TextBox ID="EditUserNameTB" ReadOnly="true" runat="server"></asp:TextBox></td>
        </tr>
         <tr>
            <td>Κωδικος:</td>
            <td><asp:TextBox ID="EditPassTB" ReadOnly="true" runat="server"></asp:TextBox></td>
        </tr>
         <tr>
            <td><asp:Button ID="EditONTB" runat="server" Text="Επεξεργασια" Width="131px" OnClick="EditONTB_Click" /></td>
            <td>
                <asp:Button ID="DoneTB" runat="server" Text="Υποβολη" Width="163px" OnClick="DoneTB_Click" /></td>
        </tr>
    </table>
</asp:Content>

