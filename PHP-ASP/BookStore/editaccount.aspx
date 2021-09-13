<%@ Page Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="editaccount.aspx.cs" Inherits="editaccount" Title="Untitled Page" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
    <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" 
        DataKeyNames="ID" DataSourceID="ObjectDataSource1">
        <Columns>
            <asp:CommandField ShowEditButton="True" />
            <asp:BoundField DataField="ID" HeaderText="ID" InsertVisible="False" 
                ReadOnly="True" SortExpression="ID" />
            <asp:BoundField DataField="Fname" HeaderText="Fname" SortExpression="Fname" />
            <asp:BoundField DataField="Lname" HeaderText="Lname" SortExpression="Lname" />
            <asp:BoundField DataField="Address" HeaderText="Address" 
                SortExpression="Address" />
            <asp:BoundField DataField="Phone" HeaderText="Phone" SortExpression="Phone" />
            <asp:BoundField DataField="uname" HeaderText="uname" SortExpression="uname" />
            <asp:BoundField DataField="passwd" HeaderText="passwd" 
                SortExpression="passwd" />
        </Columns>
    </asp:GridView>
    <asp:ObjectDataSource ID="ObjectDataSource1" runat="server" 
        DeleteMethod="Delete" InsertMethod="Insert" 
        OldValuesParameterFormatString="original_{0}" SelectMethod="GetDataByUname" 
        TypeName="BookStoreDataSetTableAdapters.customerTableAdapter" 
        UpdateMethod="Update">
        <DeleteParameters>
            <asp:Parameter Name="Original_ID" Type="Int32" />
        </DeleteParameters>
        <UpdateParameters>
            <asp:Parameter Name="Fname" Type="String" />
            <asp:Parameter Name="Lname" Type="String" />
            <asp:Parameter Name="Address" Type="String" />
            <asp:Parameter Name="Phone" Type="String" />
            <asp:Parameter Name="uname" Type="String" />
            <asp:Parameter Name="passwd" Type="String" />
            <asp:Parameter Name="Original_ID" Type="Int32" />
        </UpdateParameters>
        <SelectParameters>
            <asp:SessionParameter Name="uname" SessionField="user" Type="String" />
        </SelectParameters>
        <InsertParameters>
            <asp:Parameter Name="Fname" Type="String" />
            <asp:Parameter Name="Lname" Type="String" />
            <asp:Parameter Name="Address" Type="String" />
            <asp:Parameter Name="Phone" Type="String" />
            <asp:Parameter Name="uname" Type="String" />
            <asp:Parameter Name="passwd" Type="String" />
        </InsertParameters>
    </asp:ObjectDataSource>
</asp:Content>

