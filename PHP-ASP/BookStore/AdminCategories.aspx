<%@ Page Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="AdminCategories.aspx.cs" Inherits="AdminCategories" Title="Untitled Page" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="leftcontent" Runat="Server">

    
             
  

</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="maincontent" Runat="Server">
 <asp:GridView ID="CategoryView" runat="server" AutoGenerateColumns="False" DataKeyNames="ID" DataSourceID="SqlDataSource1" OnRowUpdating="CategoryView_RowUpdating" OnRowDeleting="CategoryView_RowDeleting" OnSelectedIndexChanged="CategoryView_SelectedIndexChanged">
    <Columns>
        <asp:BoundField DataField="ID" HeaderText="ID" InsertVisible="False" ReadOnly="True" SortExpression="ID" />
        <asp:HyperLinkField DataNavigateUrlFields="ID"  DataNavigateUrlFormatString="AdminProducts.aspx?id={0}" DataTextField="Name" HeaderText="Κατηγοριες" />
       
        
         <asp:TemplateField HeaderText="Controls">
            <ItemTemplate>
                <asp:Button ID="EditButton" Text="Edit" runat="server" CommandName="Edit" OnClick="Edit_OnClick" /> 
            </ItemTemplate>
               <EditItemTemplate>
                   <asp:Button ID="UpdateB" runat="server" Text="Update" CommandName="Update" />
                   <asp:Button ID="CancelB" runat="server" Text="Cancel" CommandName="Cancel" />
                    <asp:Button ID="DeleteB" runat="server" Text="Delete" CommandName="Delete" />
        </EditItemTemplate>
        </asp:TemplateField>

        <asp:TemplateField HeaderText="ID" Visible="false" >
            <ItemTemplate>
                <asp:Label ID="IDL" runat="server" Text='<%# Eval("ID") %>'></asp:Label>
            </ItemTemplate>
            <EditItemTemplate>
                 <asp:TextBox ID="IDTB" runat="server" Text='<%# Eval("ID") %>'></asp:TextBox>
             </EditItemTemplate>
        </asp:TemplateField>
      
        

         <asp:TemplateField HeaderText="NAME"  Visible="false" >
            <ItemTemplate>
                <asp:Label ID="NameL" runat="server" Text='<%# Eval("Name") %>'></asp:Label>
            </ItemTemplate>
             <EditItemTemplate>
                 <asp:TextBox ID="NameTB" runat="server" Text='<%# Eval("Name") %>'></asp:TextBox>
             </EditItemTemplate>
        </asp:TemplateField>

         </Columns>  
</asp:GridView>


<asp:AccessDataSource DataFile="~/ebookstoredb.mdb"  ID="SqlDataSource1" runat="server"  SelectCommand="SELECT * FROM [category]" UpdateCommand="">
      <UpdateParameters>
        <asp:Parameter Name="Name" Type="String" />
        <asp:Parameter Name="ID" Type="String" />
        
    </UpdateParameters>  
</asp:AccessDataSource>
</asp:Content>

