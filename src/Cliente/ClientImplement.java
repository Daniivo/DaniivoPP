package Cliente;

import Logica.IUser;
import Logica.User;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLException;

/**
 * Created by Daniel on 11/05/2014.
 */
public class ClientImplement {

    private final static int DEFAULT_PORT = 1090;
    private final static String DEFAULT_IP = "localhost";

    private final IUser um;

    public ClientImplement(String ip, int port) throws RemoteException, NotBoundException {

        Registry reg = LocateRegistry.getRegistry(ip, port);
        um = (IUser) reg.lookup("user");

    }

    public ClientImplement() throws RemoteException, NotBoundException {
       this(DEFAULT_IP,DEFAULT_PORT);
    }

    public boolean login(String username, String password) throws RemoteException, SQLException {

         return this.um.login(new User(username, password));

    }
}