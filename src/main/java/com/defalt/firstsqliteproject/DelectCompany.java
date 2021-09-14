package com.defalt.firstsqliteproject;
import java.sql.*;
import java.util.logging.*;
public class DelectCompany {
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:user.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            //Update
            stmt.executeUpdate("DELETE from COMPANY where ID=2;");
            c.commit();
            
            
            //Select
            ResultSet rs = stmt.executeQuery("SELECT * FROM COMPANY");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                float salary = rs.getFloat("salary");
                System.out.println("ID = " + id);
                System.out.println("NAME = " + name);
                System.out.println("AGE = " + age);
                System.out.println("ADDRESS = " + address);
                System.out.println("SALARY = " + salary);
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
