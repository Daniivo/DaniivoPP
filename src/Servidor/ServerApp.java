package Servidor;

import Logica.IUser;
import Logica.UserManager;
import java.awt.Color;
import java.awt.Font;

import java.sql.*;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author Daniivo
 */
public class ServerApp extends JFrame{
    private static final int PORT = 1090;
    public static void main(String[] args) throws RemoteException, InterruptedException {
        JFrame mainFrame=new JFrame("RMI Server");
        JLabel label=new JLabel("Server is Running", (int) CENTER_ALIGNMENT);
        label.setFont(new Font("Serif", Font.BOLD, 15));
        label.setForeground(Color.GREEN);
        mainFrame.add(label);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(250, 100);
        mainFrame.setVisible(true);
        
        Connection conn = null;
        Statement stmt = null;


        //Registry.registry=LocateRegistry.createRegistry(PORT);
        //Thread.sleep(2000);
        try {
            UserManager um = new UserManager();

            IUser iuser = (IUser) UnicastRemoteObject.exportObject(um,0);

            Registry registry = LocateRegistry.createRegistry(PORT);
            registry.bind("user", iuser);
            System.out.println("Server ready!");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }finally{
            try{
                if(stmt!=null){
                    stmt.close();
                }
                if (conn!=null){
                    conn.close();
                }
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

    }
}
