/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


public class Login {
    String loginname;
    String login_password;

    public Login(String loginname, String login_password) {
        this.loginname = loginname;
        this.login_password = login_password;
    }
      public Login() {
        this.loginname = "";
        this.login_password = "";
    }
        public Login(Login l) {
        this.loginname = l.loginname;
        this.login_password =l. login_password;
    }

    public String getLogin_name() {
        return loginname;
    }

    public void setLogin_name(String loginname) {
        this.loginname = loginname;
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }

    @Override
    public String toString() {
        return "Login{" + "loginname=" + loginname + ", login_password=" + login_password + '}';
    }
    
    
}
