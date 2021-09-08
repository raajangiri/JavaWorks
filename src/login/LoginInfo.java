/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

public class LoginInfo {
    Login login;
    Message message;

    public LoginInfo() {
        this.login = null;
        this.message =null;
    }
       public LoginInfo(Login login, Message message) {
        this.login = login;
        this.message = message;
    }
          public LoginInfo(LoginInfo li) {
        this.login = li.login;
        this.message = li.message;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LoginInfo{" + "login=" + login + ", message=" + message + '}';
    }
          
}
