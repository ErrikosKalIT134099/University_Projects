/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Errikos
 */
public class Eggrafi {
    String onoma,eponymo,mail,pass,username,filo,hm;
    int userid,age,mobile;

    public Eggrafi(int userid) {
        this.userid = userid;
    }

    public Eggrafi( String username,String pass) {
        this.pass = pass;
        this.username = username;
    }
    
    
public Eggrafi(int userid,String pass) {
        this.userid = userid;
        this.pass=pass;
    }

    public Eggrafi(String eponymo, String pass, String username, int userid) {
        this.eponymo = eponymo;
        this.pass = pass;
        this.username = username;
        this.userid = userid;
    }


    
    public Eggrafi(String onoma, String eponymo, String mail, String pass, String username, String filo, String hm, int userid, int age, int mobile) {
        this.onoma = onoma;
        this.eponymo = eponymo;
        this.mail = mail;
        this.pass = pass;
        this.username = username;
        this.filo = filo;
        this.hm = hm;
        this.userid = userid;
        this.age = age;
        this.mobile = mobile;
    }

     public boolean validate(String username, String password) {
        if (this.username.equals(username) && this.pass.equals(password))
            return true;
        return false;
    }
     
    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEponymo() {
        return eponymo;
    }

    public void setEponymo(String eponymo) {
        this.eponymo = eponymo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public String getHm() {
        return hm;
    }

    public void setHm(String hm) {
        this.hm = hm;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "\nUsername :"+username+ "\nPassword: "+pass;
//return "Eggrafi{" +"UserID="+userid+ "onoma=" + onoma + ", eponymo=" + eponymo + ", mail=" + mail + ", pass=" + pass + ", username=" + username + ", filo=" + filo + ", hm=" + hm + "age=" + age + ", mobile=" + mobile + '}';
    }
    
    public String accountPrint(){
        return "Username :"+username+ "Password: "+pass;
    }
    
    
    
}
