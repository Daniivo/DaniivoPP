package Servidor;

import Logica.User;
import Servidor.Exceptions.LoginNotFoundExcepetion;

import java.sql.*;
import static java.sql.Types.NULL;


public class AcessoBD {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs;

    public AcessoBD() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_app", "root", "");
            stmt = conn.createStatement();
            System.out.println("The connection to the database wass uccesfully opened."); 
        } catch (Exception ex) {
            System.err.println("Unable to find and load driver");
            System.out.println(ex.toString());
        }
    }

    public User procuraUser(String login) throws SQLException, LoginNotFoundExcepetion{
        String strSelect="Select * from contas where login=\""+login+"\"";
        rs= stmt.executeQuery(strSelect);
        if(rs.next()){
            User user=new User(rs.getInt("id_conta"),rs.getString("nome"),rs.getString("login"),rs.getString("password"));
            return user;
        }else{
            throw new LoginNotFoundExcepetion();
        }
    }
    
    public User registarUser(String nome, String login, String password) {
        try { 
            
            stmt.executeUpdate("INSERT INTO contas VALUES (\""+NULL+"\", \""+nome+"\", \""+login+"\", \""+password+"\")");
        
        } catch (SQLException ex) {
            System.out.println("erro - AcessoBD.java registarUse(...)");
        }
        return null;
    }
}
