<%@ Page Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="productList.aspx.cs" Inherits="productList" Title="Untitled Page" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
    <asp:ScriptManager ID="ScriptManager1" runat="server">
    </asp:ScriptManager>
    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
    <ContentTemplate>
        <asp:DropDownList ID="DropDownList1" runat="server"  OnDataBound="Customer_2" 
            AutoPostBack="True" OnSelectedIndexChanged="Customer_Selected" 
            DataSourceID="ObjectDataSource1" DataTextField="Name" DataValueField="ID">
        </asp:DropDownList>
        <asp:ObjectDataSource ID="ObjectDataSource1" runat="server" 
            DeleteMethod="Delete" InsertMethod="Insert" 
            OldValuesParameterFormatString="original_{0}" SelectMethod="GetData" 
            TypeName="BookStoreDataSetTableAdapters.categoryTableAdapter" 
            UpdateMethod="Update">
            <DeleteParameters>
                <asp:Parameter Name="Original_ID" Type="Int32" />
            </DeleteParameters>
            <UpdateParameters>
                <asp:Parameter Name="Name" Type="String" />
                <asp:Parameter Name="Original_ID" Type="Int32" />
            </UpdateParameters>
            <InsertParameters>
                <asp:Parameter Name="Name" Type="String" />
            </InsertParameters>
        </asp:ObjectDataSource>
        <asp:Label ID="CustomerL" runat="server" Text=""></asp:Label>
    </ContentTemplate>
    </asp:UpdatePanel>



</asp:Content>

