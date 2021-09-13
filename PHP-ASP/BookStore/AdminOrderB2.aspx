<%@ Page Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="AdminOrderB2.aspx.cs" Inherits="AdminOrderB2" Title="Untitled Page" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">

    <asp:Label ID="ErrorL" runat="server" Text=""></asp:Label>
    
    <!--apo edw 3ekinaei ajax -->
    <asp:ScriptManager ID="ScriptManager1" runat="server">
    </asp:ScriptManager>
    <!--vazoume update panel -->
    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
    <ContentTemplate>
     <!--mesa sto update panel vazoume ena contenttemplate gia na valoume mesa ta mpixlibidia (dropdownlist) etc -->
     <asp:DropDownList ID="DropDownList1" runat="server"  OnDataBound="Customer_2" AutoPostBack="true"
            DataSourceID="ObjectDataSource1" DataTextField="Fname" DataValueField="ID" OnSelectedIndexChanged="Customer_Selected">
        </asp:DropDownList>
        <asp:Label ID="CustomerL" runat="server" ></asp:Label>  
    </ContentTemplate>
    
    
     
    </asp:UpdatePanel>
    <asp:ObjectDataSource ID="ObjectDataSource1" runat="server" 
        DeleteMethod="Delete" InsertMethod="Insert" 
        OldValuesParameterFormatString="original_{0}" SelectMethod="GetData" 
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
        <InsertParameters>
            <asp:Parameter Name="Fname" Type="String" />
            <asp:Parameter Name="Lname" Type="String" />
            <asp:Parameter Name="Address" Type="String" />
            <asp:Parameter Name="Phone" Type="String" />
            <asp:Parameter Name="uname" Type="String" />
            <asp:Parameter Name="passwd" Type="String" />
        </InsertParameters>
    </asp:ObjectDataSource>
     <!--vazoume allo update panel gia na emfanisoume ta orders -->
    <asp:UpdatePanel ID="UpdatePanel2" runat="server">
    <ContentTemplate>
        <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" 
            DataKeyNames="ID" DataSourceID="ObjectDataSource2">
            <Columns>
                <asp:HyperLinkField DataNavigateUrlFields="ID" 
                    DataNavigateUrlFormatString="AdminOrderB2.aspx?oid={0}" DataTextField="ID" 
                    HeaderText="ID" />
                <asp:BoundField DataField="ID" HeaderText="ID" InsertVisible="False" 
                    ReadOnly="True" SortExpression="ID" />
                <asp:BoundField DataField="oDate" HeaderText="oDate" SortExpression="oDate" />
            </Columns>
        </asp:GridView>
    </ContentTemplate>
    </asp:UpdatePanel>
    
    <asp:ObjectDataSource ID="ObjectDataSource2" runat="server" 
        DeleteMethod="Delete" InsertMethod="Insert" 
        OldValuesParameterFormatString="original_{0}" SelectMethod="GetDataByCustomer" 
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
        <SelectParameters>
            <asp:SessionParameter Name="Customer" SessionField="custid" Type="Int32" />
        </SelectParameters>
        <InsertParameters>
            <asp:Parameter Name="Customer" Type="Int32" />
            <asp:Parameter Name="oDate" Type="DateTime" />
        </InsertParameters>
 </asp:ObjectDataSource>
    
    
    <asp:UpdatePanel ID="UpdatePanel3" runat="server">
    <ContentTemplate>
        <asp:GridView ID="GridView2" runat="server" AutoGenerateColumns="False" 
            DataSourceID="ObjectDataSource3">
            <Columns>
                <asp:BoundField DataField="Title" HeaderText="Title" SortExpression="Title" />
                <asp:BoundField DataField="Quantity" HeaderText="Quantity" 
                    SortExpression="Quantity" />
            </Columns>
        </asp:GridView>
    
    </ContentTemplate>
    
    </asp:UpdatePanel>
    <asp:ObjectDataSource ID="ObjectDataSource3" runat="server" 
        OldValuesParameterFormatString="original_{0}" SelectMethod="GetDataByOrder" 
        TypeName="BookStoreDataSetTableAdapters.DataTable1TableAdapter">
        <SelectParameters>
            <asp:QueryStringParameter Name="Order" QueryStringField="oid" Type="Int32" />
        </SelectParameters>
    </asp:ObjectDataSource>
</asp:Content>

