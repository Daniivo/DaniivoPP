/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Servidor.AcessoBD;
import Servidor.Exceptions.LoginNotFoundExcepetion;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;


public class UserManager implements IUser{

    private ArrayList<User> users = new ArrayList<User>();
    private AcessoBD bd = new AcessoBD();

    public UserManager() throws RemoteException {

    }

    public void newUser(String login, String pass) {
        users.add(new User(login,pass));
    }

    @Override
    public boolean login(User login) throws RemoteException, SQLException{
        try {
            User newUser = bd.procuraUser(login.getLogin());
            System.out.println(login.getLogin() + " password certa." );
            return true;
        } catch (LoginNotFoundExcepetion loginNotFoundExcepetion) {
            System.out.println(login.getLogin() + " password errada.");
            return false;
        }
    }

    public boolean register(User user) throws RemoteException, SQLException {
        try {
            bd.registarUser(user.getName(), user.getLogin(), user.getPassword());
             System.out.println(user.getLogin() + " Registo" );
            return true;
        } catch (Exception e) {
            System.out.println("falhou - UserManager.java register()");
             return false;
        }
    }  
        
        
}
