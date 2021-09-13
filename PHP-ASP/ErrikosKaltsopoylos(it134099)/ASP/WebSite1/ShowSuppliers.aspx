<%@ Page Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="ShowSuppliers.aspx.cs" Inherits="ShowSuppliers" Title="Untitled Page" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
    <h1>Suppliers</h1>
    <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" 
        DataKeyNames="SupplierID" DataSourceID="ObjectDataSource1">
        <Columns>
            <asp:BoundField DataField="SupplierID" HeaderText="SupplierID" 
                InsertVisible="False" ReadOnly="True" SortExpression="SupplierID" />
            <asp:BoundField DataField="CompanyName" HeaderText="CompanyName" 
                SortExpression="CompanyName" />
            <asp:BoundField DataField="ContactName" HeaderText="ContactName" 
                SortExpression="ContactName" />
            <asp:BoundField DataField="ContactTitle" HeaderText="ContactTitle" 
                SortExpression="ContactTitle" />
            <asp:BoundField DataField="Address" HeaderText="Address" 
                SortExpression="Address" />
            <asp:BoundField DataField="City" HeaderText="City" SortExpression="City" />
            <asp:BoundField DataField="Region" HeaderText="Region" 
                SortExpression="Region" />
            <asp:BoundField DataField="PostalCode" HeaderText="PostalCode" 
                SortExpression="PostalCode" />
            <asp:BoundField DataField="Country" HeaderText="Country" 
                SortExpression="Country" />
            <asp:BoundField DataField="Phone" HeaderText="Phone" SortExpression="Phone" />
            <asp:BoundField DataField="Fax" HeaderText="Fax" SortExpression="Fax" />
            <asp:BoundField DataField="HomePage" HeaderText="HomePage" 
                SortExpression="HomePage" />
        </Columns>
    </asp:GridView>
    <asp:ObjectDataSource ID="ObjectDataSource1" runat="server" 
        DeleteMethod="Delete" InsertMethod="Insert" 
        OldValuesParameterFormatString="original_{0}" SelectMethod="GetData" 
        TypeName="NorthDataSetTableAdapters.SuppliersTableAdapter" 
        UpdateMethod="Update">
        <DeleteParameters>
            <asp:Parameter Name="Original_SupplierID" Type="Int32" />
        </DeleteParameters>
        <UpdateParameters>
            <asp:Parameter Name="CompanyName" Type="String" />
            <asp:Parameter Name="ContactName" Type="String" />
            <asp:Parameter Name="ContactTitle" Type="String" />
            <asp:Parameter Name="Address" Type="String" />
            <asp:Parameter Name="City" Type="String" />
            <asp:Parameter Name="Region" Type="String" />
            <asp:Parameter Name="PostalCode" Type="String" />
            <asp:Parameter Name="Country" Type="String" />
            <asp:Parameter Name="Phone" Type="String" />
            <asp:Parameter Name="Fax" Type="String" />
            <asp:Parameter Name="HomePage" Type="String" />
            <asp:Parameter Name="Original_SupplierID" Type="Int32" />
        </UpdateParameters>
        <InsertParameters>
            <asp:Parameter Name="CompanyName" Type="String" />
            <asp:Parameter Name="ContactName" Type="String" />
            <asp:Parameter Name="ContactTitle" Type="String" />
            <asp:Parameter Name="Address" Type="String" />
            <asp:Parameter Name="City" Type="String" />
            <asp:Parameter Name="Region" Type="String" />
            <asp:Parameter Name="PostalCode" Type="String" />
            <asp:Parameter Name="Country" Type="String" />
            <asp:Parameter Name="Phone" Type="String" />
            <asp:Parameter Name="Fax" Type="String" />
            <asp:Parameter Name="HomePage" Type="String" />
        </InsertParameters>
    </asp:ObjectDataSource>
</asp:Content>

