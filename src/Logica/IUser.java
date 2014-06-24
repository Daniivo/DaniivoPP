/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

/**
 *
 * @author Leandro
 */
public interface IUser extends Remote{
    public boolean login(User user) throws RemoteException, SQLException;
    public boolean register(User user) throws RemoteException, SQLException;

}
