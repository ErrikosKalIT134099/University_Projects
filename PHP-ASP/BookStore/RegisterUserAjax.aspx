<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.master" AutoEventWireup="true" CodeFile="RegisterUserAjax.aspx.cs" Inherits="RegisterAjax" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="LeftContent" Runat="Server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MainContent" Runat="Server">
     <asp:ScriptManager ID="ScriptManager1" runat="server">
    </asp:ScriptManager>
    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
        <ContentTemplate>

             <asp:Panel ID="RegisterP" runat="server">
                 <h3>Eγγραφη νεου Χρηστη</h3>
        <asp:MultiView ID="RegisterMV" runat="server">
            <asp:View ID="RegisterFormV" runat="server">
                
                <table>
                    <tr><h4> Εισαγωγη Στοιχειων Χρηστη:</h4></tr>
                    <tr>
                        <td>Ονομα:</td>
                        <td> <asp:TextBox ID="NameTB" runat="server"></asp:TextBox>
                            <asp:RequiredFieldValidator ID="RequiredFieldValidatorName" runat="server" ErrorMessage="Name is Required" ControlToValidate="NameTB" ForeColor="Red">
                            </asp:RequiredFieldValidator>
                        </td>
                        
                    </tr>
                    <tr>
                        <td>Επωνυμο:</td>
                        <td> <asp:TextBox ID="SurnameTB" runat="server"></asp:TextBox>
                            <asp:RequiredFieldValidator ID="RequiredFieldValidatorSur" runat="server" ErrorMessage="Surname is Required" ControlToValidate="SurnameTB" ForeColor="Red">
                            </asp:RequiredFieldValidator>
                        </td>
                    </tr>
                    <tr>
                        <td>E-mail:</td>
                        <td> <asp:TextBox ID="EmailTB" runat="server"></asp:TextBox>
                            <asp:RequiredFieldValidator ID="RequiredFieldValidatorEmail" runat="server" ErrorMessage="Email is Required" ControlToValidate="EmailTB" ForeColor="Red">
                            </asp:RequiredFieldValidator>
                            <asp:RegularExpressionValidator ID="regexEmailValid" runat="server" ValidationExpression="\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*" ControlToValidate="EmailTB" ErrorMessage="Invalid Email Format"></asp:RegularExpressionValidator>
                        </td>
                    </tr>
                    <tr>
                        <td>Username:</td>
                        <td> <asp:TextBox ID="UsernameTB" runat="server"></asp:TextBox>
                            <asp:RequiredFieldValidator ID="RequiredFieldValidatorUser" runat="server" ErrorMessage="Username is Required" ControlToValidate="UsernameTB" ForeColor="Red">
                            </asp:RequiredFieldValidator>
                        </td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td> <asp:TextBox ID="PasswordTB" runat="server" TextMode="Password"></asp:TextBox>
                            <asp:RequiredFieldValidator ID="RequiredFieldValidatorPass" runat="server" ErrorMessage="Password is Required" ControlToValidate="PasswordTB" ForeColor="Red">
                            </asp:RequiredFieldValidator>
                        </td>
                    </tr>
                    <tr>
                        <td>Confirm Password:</td>
                        <td> <asp:TextBox ID="ConfirmTB" runat="server" TextMode="Password"></asp:TextBox>
                            <asp:CompareValidator ID="CompareValidatorPass" runat="server" 
                              ControlToValidate="ConfirmTB"
                              ControlToCompare="PasswordTB"
                              ErrorMessage="No Match" 
                              ToolTip="Password must be the same" />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ErrorMessage="Confirm Password is Required" ControlToValidate="ConfirmTB" ForeColor="Red">
                            </asp:RequiredFieldValidator>
                        </td>
                    </tr>
                    <tr>
                        <td>Διευθυνση:</td>
                        <td> <asp:TextBox ID="AdressTB" runat="server"></asp:TextBox>
                            <asp:RequiredFieldValidator ID="RequiredFieldValidatorAdress" runat="server" ErrorMessage="Adress is Required" ControlToValidate="AdressTB" ForeColor="Red">
                            </asp:RequiredFieldValidator>
                        </td>
                    </tr>
                    <tr>
                        <td>Τηλεφωνο:</td>
                        <td> <asp:TextBox ID="ThlTB" runat="server"></asp:TextBox>
                            <asp:RequiredFieldValidator ID="RequiredFieldValidatoThl" runat="server" ErrorMessage="Thl is Required" ControlToValidate="ThlTB" ForeColor="Red">
                            </asp:RequiredFieldValidator>
                        </td>
                    </tr>
                    <tr>
                        <td>TK:</td>
                        <td> <asp:TextBox ID="TKTB" runat="server"></asp:TextBox>
                            <asp:RequiredFieldValidator ID="RequiredFieldValidatorTK" runat="server" ErrorMessage="TK is Required" ControlToValidate="TKTB" ForeColor="Red">
                            </asp:RequiredFieldValidator>
                        </td>
                    </tr>
                    <tr>
                        <td>Πολη:</td>
                        <td> <asp:TextBox ID="CityTB" runat="server"></asp:TextBox>
                            <asp:RequiredFieldValidator ID="RequiredFieldValidatorCity" runat="server" ErrorMessage="City is Required" ControlToValidate="CityTB" ForeColor="Red">
                            </asp:RequiredFieldValidator>
                        </td>
                    </tr>
                    <tr>
                        <td>Χωρα:</td>
                        <td> <asp:TextBox ID="CountryTB" runat="server"></asp:TextBox>
                            <asp:RequiredFieldValidator ID="RequiredFieldValidatorCountry" runat="server" ErrorMessage="Country is Required" ControlToValidate="CountryTB" ForeColor="Red">
                            </asp:RequiredFieldValidator>
                        </td>
                    </tr>
                </table>
                <asp:Button ID="NextB" runat="server" Text="Επομενο >>" OnClick="NextB_Click" />
            </asp:View>
            <asp:View ID="RegisterInfoV" runat="server">
               
                <table>
                    <caption>
                        <h4>Στοιχεια που δωθηκαν:</h4>
                    </caption>
                    <tr>
                        <td>Ονομα:</td>
                        <td><asp:Label ID="NameL" runat="server" Text=""></asp:Label></td>
                    </tr>
                    <tr>
                        <td>Επωνυμο:</td>
                        <td><asp:Label ID="SurnameL" runat="server" Text=""></asp:Label></td>
                    </tr>
                    <tr>
                        <td>E-mail:</td>
                        <td><asp:Label ID="emailL" runat="server" Text=""></asp:Label></td>
                    </tr>
                    <tr>
                        <td>Username:</td>
                        <td><asp:Label ID="UsernameL" runat="server" Text=""></asp:Label></td>
                    </tr>
                     <tr>
                        <td>Password:</td>
                        <td><asp:Label ID="PasswordL" runat="server" Text=""></asp:Label></td>
                    </tr>
                    <tr>
                        <td>Διευθυνση:</td>
                        <td><asp:Label ID="AddressL" runat="server" Text=""></asp:Label></td>
                    </tr>
                    <tr>
                        <td>Τηλεφωνο:</td>
                        <td><asp:Label ID="ThlL" runat="server" Text=""></asp:Label></td>
                    </tr>
                    <tr>
                        <td>TK:</td>
                        <td><asp:Label ID="TKL" runat="server" Text=""></asp:Label></td>
                    </tr>
                    <tr>
                        <td>Πολη:</td>
                        <td><asp:Label ID="CityL" runat="server" Text=""></asp:Label></td>
                    </tr>
                    <tr>
                        <td>Χωρα:</td>
                        <td><asp:Label ID="CountryL" runat="server" Text=""></asp:Label></td>
                    </tr>
                </table>
                
                <asp:Button ID="BackB" runat="server" Text="Πισω" OnClick="BackB_Click" />
                <asp:Button ID="Button1" runat="server" Text="Τελικη Υποβολη" OnClick="Button1_Click" />
                <asp:Button ID="Button2" runat="server" Text="Τελικη Υποβολη(DataSet)" 
                    onclick="Button2_Click"  />
            </asp:View>
        </asp:MultiView>

    </asp:Panel>
        </ContentTemplate>
    </asp:UpdatePanel>
</asp:Content>

