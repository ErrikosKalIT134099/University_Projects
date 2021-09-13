<%@ Page Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="AdminProducts.aspx.cs" Inherits="AdminProducts" Title="Untitled Page" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
    <asp:Label ID="test" runat="server" Text="Label"></asp:Label>
    <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" 
        DataKeyNames="ID" DataSourceID="AccessDataSource1">
        <Columns>
            <asp:BoundField DataField="ID" HeaderText="ID" InsertVisible="False" 
                ReadOnly="True" SortExpression="ID" />
            <asp:BoundField DataField="Title" HeaderText="Title" SortExpression="Title" />
            <asp:BoundField DataField="Description" HeaderText="Description" 
                SortExpression="Description" />
            <asp:BoundField DataField="Price" HeaderText="Price" SortExpression="Price" />
            <asp:BoundField DataField="Category" HeaderText="Category" 
                SortExpression="Category" />
        </Columns>
    </asp:GridView>
    <asp:AccessDataSource ID="AccessDataSource1" runat="server" 
        DataFile="~/ebookstoredb.mdb" 
        SelectCommand="SELECT * FROM [product] WHERE ([Category] = ?)">
        <SelectParameters>
            <asp:QueryStringParameter Name="Category" QueryStringField="id" Type="Int32" />
        </SelectParameters>
    </asp:AccessDataSource>
    </asp:Content>

