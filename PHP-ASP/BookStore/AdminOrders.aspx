<%@ Page Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="AdminOrders.aspx.cs" Inherits="AdminOrders" Title="Untitled Page" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
    <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" 
        DataKeyNames="ID" DataSourceID="ObjectDataSource1" style="margin-bottom: 82px">
        <Columns>
            <asp:HyperLinkField DataNavigateUrlFields="ID" 
                DataNavigateUrlFormatString="AdminShowOrderDetails.aspx?oid={0}" 
                DataTextField="ID" Text="ID" />
            <asp:BoundField DataField="Customer" HeaderText="Customer" 
                SortExpression="Customer" />
            <asp:BoundField DataField="oDate" HeaderText="oDate" SortExpression="oDate" />
        </Columns>
    </asp:GridView>
    <asp:ObjectDataSource ID="ObjectDataSource1" runat="server" 
        DeleteMethod="Delete" InsertMethod="Insert" 
        OldValuesParameterFormatString="original_{0}" SelectMethod="GetData" 
        TypeName="BookStoreDataSetTableAdapters.ordersTableAdapter" 
        UpdateMethod="Update">
        <DeleteParameters>
            <asp:Parameter Name="Original_ID" Type="Int32" />
        </DeleteParameters>
        <UpdateParameters>
            <asp:Parameter Name="Customer" Type="Int32" />
            <asp:Parameter Name="oDate" Type="DateTime" />
            <asp:Parameter Name="Original_ID" Type="Int32" />
        </UpdateParameters>
        <InsertParameters>
            <asp:Parameter Name="Customer" Type="Int32" />
            <asp:Parameter Name="oDate" Type="DateTime" />
        </InsertParameters>
    </asp:ObjectDataSource>
</asp:Content>

