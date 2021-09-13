<%@ Page Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="AdminShowOrderDetails.aspx.cs" Inherits="AdminShowOrderDetails" Title="Untitled Page" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
 

    <asp:ListView ID="ListView1" runat="server" ItemPlaceholderID="PlaceHolder1" DataSourceID="AccessDataSource1">
     <LayoutTemplate>
       <table >
           <tr>
              <th>ID</th>
             <th>Order</th>
            <th>Quantity</th>
            <th>Order</th>
           </tr>
           
       
       <asp:PlaceHolder ID="PlaceHolder1" runat="server">
    </asp:PlaceHolder>
        </tr>
</table>
    </LayoutTemplate>
    <ItemTemplate>
     
     <tr>
      <td> <asp:Label ID="NameLabel" runat="server" Text='<%# Eval("ID") %>' /> </td>
      <td> <asp:Label ID="Label1" runat="server" Text='<%# Eval("Order") %>' /> </td>
      <td> <asp:Label ID="Label2" runat="server" Text='<%# Eval("Quantity") %>' /> </td>
      <td> <asp:Label ID="Label3" runat="server" Text='<%# Eval("Product") %>' /> </td>
 
    </ItemTemplate>
    </asp:ListView>
    <asp:AccessDataSource ID="AccessDataSource1" runat="server" 
        DataFile="~/ebookstoredb.mdb" 
        SelectCommand="SELECT * FROM [orderdetails] WHERE ([Order] = ?)">
        <SelectParameters>
            <asp:QueryStringParameter Name="Order" QueryStringField="oid" Type="Int32" />
        </SelectParameters>
    </asp:AccessDataSource>
    <asp:ObjectDataSource ID="ObjectDataSource1" runat="server" 
        DeleteMethod="Delete" InsertMethod="Insert" 
        OldValuesParameterFormatString="original_{0}" SelectMethod="GetDataByOrder" 
        TypeName="BookStoreDataSetTableAdapters.orderdetailsTableAdapter" 
        UpdateMethod="Update">
        <DeleteParameters>
            <asp:Parameter Name="Original_ID" Type="Int32" />
        </DeleteParameters>
        <UpdateParameters>
            <asp:Parameter Name="Order" Type="Int32" />
            <asp:Parameter Name="Quantity" Type="Int32" />
            <asp:Parameter Name="Product" Type="Int32" />
            <asp:Parameter Name="Original_ID" Type="Int32" />
        </UpdateParameters>
        <SelectParameters>
            <asp:QueryStringParameter Name="Order" QueryStringField="oid" Type="Int32" />
        </SelectParameters>
        <InsertParameters>
            <asp:Parameter Name="Order" Type="Int32" />
            <asp:Parameter Name="Quantity" Type="Int32" />
            <asp:Parameter Name="Product" Type="Int32" />
        </InsertParameters>
    </asp:ObjectDataSource> 
</asp:Content>

