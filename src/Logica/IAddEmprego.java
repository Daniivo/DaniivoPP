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
 * @author Daniel
 */
public interface IAddEmprego extends Remote {
    public void registarEmprego(AddEmprego ofertaEmprego) throws RemoteException, SQLException;
}
