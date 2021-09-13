<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="Cart.aspx.cs" Inherits="Cart" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
   
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
    <asp:Label ID="usersCartL" runat="server" Text=""></asp:Label>
    <asp:Label ID="test" runat="server" Text=""></asp:Label><br />
    <asp:Label ID="Sum" runat="server" Text=""></asp:Label><br /><br />
    <asp:Button ID="BuyB" runat="server" Text="Αγορα" onclick="BuyB_Click" />
    <asp:Button ID="Button1" runat="server" Text="Αδειασμα" onclick="Button1_Click" />
    
    <asp:Label ID="load" runat="server" Text="Label"></asp:Label>
</asp:Content>

