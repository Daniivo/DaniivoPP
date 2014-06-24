/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.io.Serializable;


public class User implements Serializable{
    private int id_conta;
    private String name;
    private String login;
    private String password;

    public User(int id_conta,String name,String login, String password) {
        this.id_conta=id_conta;
        this.name = name;
        this.login=login;
        this.password = password;
    }

    public User(String login, String password) {
        this(0,"",login,password);
    }
    public User(String name, String login, String password) {
        this(0,name,login,password);
    }

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
