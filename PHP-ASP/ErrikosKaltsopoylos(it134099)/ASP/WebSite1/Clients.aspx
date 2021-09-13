<%@ Page Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="Clients.aspx.cs" Inherits="Clients" Title="Untitled Page" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
    <h1>Clients</h1>
    <asp:DropDownList ID="DropDownList1" runat="server" AutoPostBack="True" OnSelectedIndexChanged="Customer_Selected" 
        DataSourceID="ObjectDataSource1" DataTextField="CompanyName" 
        DataValueField="CustomerID" >
    </asp:DropDownList>
    <asp:Label ID="CustomerL" runat="server" Text="Label"></asp:Label>
    <asp:ObjectDataSource ID="ObjectDataSource1" runat="server" 
        DeleteMethod="Delete" InsertMethod="Insert" 
        OldValuesParameterFormatString="original_{0}" SelectMethod="GetData" 
        TypeName="NorthDataSetTableAdapters.CustomersTableAdapter" 
        UpdateMethod="Update">
        <DeleteParameters>
            <asp:Parameter Name="Original_CustomerID" Type="String" />
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
            <asp:Parameter Name="Original_CustomerID" Type="String" />
        </UpdateParameters>
        <InsertParameters>
            <asp:Parameter Name="CustomerID" Type="String" />
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
        </InsertParameters>
    </asp:ObjectDataSource><br />
    <asp:Button ID="ShowB" runat="server" Text="Show" onclick="ShowB_Click" />
    <asp:GridView ID="GridView1" Visible=False runat="server" AutoGenerateColumns="False" 
        DataKeyNames="CustomerID" DataSourceID="ObjectDataSource2">
        <Columns>
            <asp:CommandField ShowEditButton="True" />
            <asp:TemplateField HeaderText="CustomerID" SortExpression="CustomerID">
                <EditItemTemplate>
                    <asp:Label ID="Label1" runat="server" Text='<%# Eval("CustomerID") %>'></asp:Label>
                </EditItemTemplate>
                <ItemTemplate>
                    <asp:Label ID="Label1" runat="server" Text='<%# Bind("CustomerID") %>'></asp:Label>
                </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField HeaderText="CompanyName" SortExpression="CompanyName">
                <EditItemTemplate>
                    <asp:TextBox ID="TextBox1" runat="server" Text='<%# Bind("CompanyName") %>'></asp:TextBox>
                </EditItemTemplate>
                <ItemTemplate>
                    <asp:Label ID="Label2" runat="server" Text='<%# Bind("CompanyName") %>'></asp:Label>
                </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField HeaderText="ContactName" SortExpression="ContactName">
                <EditItemTemplate>
                    <asp:TextBox ID="TextBox2" runat="server" Text='<%# Bind("ContactName") %>'></asp:TextBox>
                </EditItemTemplate>
                <ItemTemplate>
                    <asp:Label ID="Label3" runat="server" Text='<%# Bind("ContactName") %>'></asp:Label>
                </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField HeaderText="ContactTitle" SortExpression="ContactTitle">
                <EditItemTemplate>
                    <asp:TextBox ID="TextBox3" runat="server" Text='<%# Bind("ContactTitle") %>'></asp:TextBox>
                </EditItemTemplate>
                <ItemTemplate>
                    <asp:Label ID="Label4" runat="server" Text='<%# Bind("ContactTitle") %>'></asp:Label>
                </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField HeaderText="Address" SortExpression="Address">
                <EditItemTemplate>
                    <asp:TextBox ID="TextBox4" runat="server" Text='<%# Bind("Address") %>'></asp:TextBox>
                </EditItemTemplate>
                <ItemTemplate>
                    <asp:Label ID="Label5" runat="server" Text='<%# Bind("Address") %>'></asp:Label>
                </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField HeaderText="City" SortExpression="City">
                <EditItemTemplate>
                    <asp:TextBox ID="TextBox5" runat="server" Text='<%# Bind("City") %>'></asp:TextBox>
                </EditItemTemplate>
                <ItemTemplate>
                    <asp:Label ID="Label6" runat="server" Text='<%# Bind("City") %>'></asp:Label>
                </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField HeaderText="Region" SortExpression="Region">
                <EditItemTemplate>
                    <asp:TextBox ID="TextBox6" runat="server" Text='<%# Bind("Region") %>'></asp:TextBox>
                </EditItemTemplate>
                <ItemTemplate>
                    <asp:Label ID="Label7" runat="server" Text='<%# Bind("Region") %>'></asp:Label>
                </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField HeaderText="PostalCode" SortExpression="PostalCode">
                <EditItemTemplate>
                    <asp:TextBox ID="TextBox7" runat="server" Text='<%# Bind("PostalCode") %>'></asp:TextBox>
                </EditItemTemplate>
                <ItemTemplate>
                    <asp:Label ID="Label8" runat="server" Text='<%# Bind("PostalCode") %>'></asp:Label>
                </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField HeaderText="Country" SortExpression="Country">
                <EditItemTemplate>
                    <asp:TextBox ID="TextBox8" runat="server" Text='<%# Bind("Country") %>'></asp:TextBox>
                </EditItemTemplate>
                <ItemTemplate>
                    <asp:Label ID="Label9" runat="server" Text='<%# Bind("Country") %>'></asp:Label>
                </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField HeaderText="Phone" SortExpression="Phone">
                <EditItemTemplate>
                    <asp:TextBox ID="TextBox9" runat="server" Text='<%# Bind("Phone") %>'></asp:TextBox>
                </EditItemTemplate>
                <ItemTemplate>
                    <asp:Label ID="Label10" runat="server" Text='<%# Bind("Phone") %>'></asp:Label>
                </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField HeaderText="Fax" SortExpression="Fax">
                <EditItemTemplate>
                    <asp:TextBox ID="TextBox10" runat="server" Text='<%# Bind("Fax") %>'></asp:TextBox>
                </EditItemTemplate>
                <ItemTemplate>
                    <asp:Label ID="Label11" runat="server" Text='<%# Bind("Fax") %>'></asp:Label>
                </ItemTemplate>
            </asp:TemplateField>
        </Columns>
    </asp:GridView>
    <asp:ObjectDataSource ID="ObjectDataSource2" runat="server" 
        DeleteMethod="Delete" InsertMethod="Insert" 
        OldValuesParameterFormatString="original_{0}" SelectMethod="GetDataByID" 
        TypeName="NorthDataSetTableAdapters.CustomersTableAdapter" 
        UpdateMethod="Update">
        <DeleteParameters>
            <asp:Parameter Name="Original_CustomerID" Type="String" />
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
            <asp:Parameter Name="Original_CustomerID" Type="String" />
        </UpdateParameters>
        <SelectParameters>
            <asp:SessionParameter Name="CustomerID" SessionField="custid" Type="String" />
        </SelectParameters>
        <InsertParameters>
            <asp:Parameter Name="CustomerID" Type="String" />
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
        </InsertParameters>
    </asp:ObjectDataSource>
</asp:Content>

