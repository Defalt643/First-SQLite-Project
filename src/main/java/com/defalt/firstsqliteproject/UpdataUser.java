package com.defalt.firstsqliteproject;
import java.sql.*;
import java.util.logging.*;
public class UpdataUser {
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:user.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            //Update
            stmt.executeUpdate("UPDATE USER set PASSWORD = 'admin' where ID=1;");
            c.commit();
            
            
            //Select
            ResultSet rs = stmt.executeQuery("SELECT * FROM USER");

            while(rs.next()){
            String username = rs.getString("username");
            String password = rs.getString("password");
                System.out.println("USER = "+username);
                System.out.println("PASSWORD = "+password);

        }
            rs.close();
            stmt.close();
            c.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SelectCompany.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SelectCompany.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
