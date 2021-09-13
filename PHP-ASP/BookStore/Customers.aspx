<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="Customers.aspx.cs" Inherits="Customers" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
    
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
    <asp:Label ID="ClientsLB" runat="server" Text=""></asp:Label><br/>
    <asp:Label ID="Label1" runat="server" Text="Δωσε ID για την Διαγραφη:"></asp:Label>
    <asp:TextBox ID="DeleteTB" runat="server" Width="131px"></asp:TextBox>
    <asp:Button ID="ClientDelB" runat="server" Text="Delete" onclick="ClientDelB_Click" /><br />
    <asp:Label ID="inform" runat="server" Text=""></asp:Label>
        
</asp:Content>

