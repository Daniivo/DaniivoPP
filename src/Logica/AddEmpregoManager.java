/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Servidor.AcessoBD;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class AddEmpregoManager implements IAddEmprego{
    private ArrayList<AddEmprego> ofertaEmprego = new ArrayList<AddEmprego>();
    private AcessoBD bd = new AcessoBD();

    public AddEmpregoManager() {
    }

    @Override
    public void registarEmprego(AddEmprego ofertaEmprego) throws RemoteException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
