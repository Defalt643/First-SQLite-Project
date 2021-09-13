package com.defalt.firstsqliteproject;

import java.sql.*;
import java.util.logging.*;
//            ..,:;i;:::,,,..
//       ,:;ii11111111i11111ii;,                       ..,,::;:,,,...
//    :11t11iii;;;;;;;;;;;;;;iiii:                 ,;1111111111iiiiiii;:.
//  ,tt1i;;;;;;;;;;;;;;;;;iii;::;i;..           .;1t1ii;;;;;;;;;;;;;;;;ii;,
// i1i::::;;:::::::::::;1tffft1i:,:::;         it1i::;;;;:::::;;;;i1t1i:::;;,
// i::::::::::::::::::;1ttttttfft1i;i:        :1;:::::::::::::::i1ffffft1;::i,
// ,:::::,,,:,,,,,,::ittttttttttttt1;,        :::::::::::::::::itttttttttt1i;.
// ,::::,,,,,,,,,,,:;1ttttttttttttt1i.       ,:::::,,,,,,,,,,:;tttttttttttt1:
// ,:::,,,,,,,,,,,,,;tttttttftttttttLf;     .:::::,,,,,,,,,,,:1tttttt111ttt1i.
// ,:,,,,,.,,,,,,,,,,iffttt11G00GffLiL8,   .::::::,,,,,,,,,,,,ittttttLCCLttLGL.
// ,,,,........,,,.,.,;1ttt, G@0Gttf;1L.  .:::::,,...,,,,,,,,,:1ttttG801;tfC8i
// ,,..................,i11;;11iifftf;    .::,,,,.......,,,....,:1t1tti.:tft1,
// ,,,,................,:i111ii1ffffLt:.  .,,,.,,................:11i;;1tffft:
// .,;;................:ii1ttffffttttti:  .,...,;;,.............,;i1ttffffffft:
//  .,................,ii1tttttttt1:...,.  .,...::,............,;11ttttttt1;:,,
//   .................:;;:;;;iiiii:,..      .,.................,i;;iiii111;. .
//    ..  ......  ....,:;iiiiiiiii;;.        .,.. .........  ..,:;;;;;;;;;:::.
//     ...          ...,,,,,,,:::;:.          .:;,        ......,::;;:;;;i;:.
//      .1ft1i;,...     .........,.           .:1tii;:,,...      .......,,:
//       iftfttt1tttt11i;::,...  ..             1tfftttffftt1iii;:,,..   ..
//     :tLLft111ii;;iii1111111i;;;:           .tCLLf111iiiiii111ttt111i;::
// ::;L0GfLLCCCCCCLt1i;;;;;ittft111;:,,..,::;1G0LfLCCCCLLLft1ii;;;;iii1111;::::::::

public class InsertCompany {
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:user.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            
            String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
                    + "VALUES (1, 'Paul', 32, 'California', 20000.00 );";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
                    + "VALUES (2, 'Allen', 25, 'Texas', 15000.00 );";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
                    + "VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
                    + "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );";
            stmt.executeUpdate(sql);

            c.commit();
            stmt.close();
            c.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertCompany.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertCompany.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
