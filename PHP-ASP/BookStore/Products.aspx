<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="Products.aspx.cs" Inherits="Products" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
    <asp:Literal ID="testLI" runat="server"></asp:Literal>
    
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
    <p>Our Products</p>
    <asp:Literal ID="subLI"  Visible = "false"  runat="server"></asp:Literal>
    <asp:Label ID="CatID" runat="server" Text=""></asp:Label><br />
    <asp:Label ID="CatInfo" runat="server" Text=""></asp:Label>
    <asp:Literal ID="DescInfo" Visible = "false" runat="server"></asp:Literal>
    <asp:Table ID="Table1" Visible="false" runat="server">
        <asp:TableHeaderRow>
            <asp:TableHeaderCell>Ποσοτητα</asp:TableHeaderCell>
            <asp:TableHeaderCell>Καλαθι</asp:TableHeaderCell>
        </asp:TableHeaderRow>
        <asp:TableRow>
             <asp:TableCell><asp:TextBox ID="quantityTB" runat="server" Text="1"></asp:TextBox></asp:TableCell>
             <asp:TableCell><asp:Button ID="AddB" runat="server" Text="Προσθηκη"   OnClick="Title_Dis" /></asp:TableCell>
        </asp:TableRow>
    </asp:Table>
    <asp:Label ID="testLB" runat="server" Text=""></asp:Label>
    
</asp:Content>

