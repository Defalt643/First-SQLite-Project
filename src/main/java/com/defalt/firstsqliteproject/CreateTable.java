package com.defalt.firstsqliteproject;

import java.sql.*;
//                                                                      .
//                         ....,,,,.....                               .,:,.
//                      .,,::::::::::::::,,..                       ,;1tLttf1:.
//                    .,::::::::::::::::::::,.                    .1CGCLCLftCCf:
//                   ,:::::::::::iLLLt:;::::,.                     1CGGCCLCttLLf.
//                 .::::::::;::i;LGGGGfL1;:,.                       :1LLt1LL:it:
//                ,::::::::11;11i11tGGCttf:.                          ..  .,.
//               .:::::::;tLtittti1itti111;.
//               .:::it1:;11iiC00tfi1f;Gft1.
//               .::1CLLftCCC1tfftt1LGttft:
//                .,tGCCLGGGGGCCCCCGGCCLGC:
//                  :fCCLCGGGGGGGGGCCCCGGC:          .,;,
//                  .:ittCGGGGGGGGCffttCGL.        :1LLt,
//                    ,,iGGCCGGGGGGCCLCGGi       .1CGL;.
//                  .:;11GGGCCCCGGGGGCGGt.      :LGGL:......,,:;i1i;.
//                 iLG0GLCCCCCCCCCCCCGGf,     .iCGGGCLLLLfLLCCCCCLft,
//                 ;11111fC00GGCCGCCCC00Cft;, ;GGGGGGGGGGGGGCCCLft;,
//                .111iiii1f0@0LffCGGC8@@@@@0LfGGGGGGGGGGGGGGCf1;,
//         .,;i1ttLGGGC1iiiiit1iiiLGGCG88@@@@GCGGGGGGGGGGGCf1:,
//       :1CGGG000000GGGL1iiiiiiiifGGGGCCG0@8CGGGGGGGGGCf1:.
//     ,tG00000GG00000GG0GLtiiiiiitGGGGGG0GGCCGGGGGGC1:,
//    ,C00000000GG00000GCG00Cf1iii1fLCG00GCCGGGGGGGCf;,..
//    t0000000000CG000000CG000GCf1iiii1LGCGGGGGGGGCCGGGC1i:,.
//    L0000000000GCG000000CG00000GL1ii1LGGGGGGGGGCt1LGGL1LL1;i;;:,,...
//    1000000000000GGG00000C000000GCLCCCCCCCCCGGGL1tG0C1tLf;1CLLLftt1i;;:,,.
//    .L0000000000000CG0000GG000GGG000000CG0GLCGL1100GL1ffi;fLLCfCLCtLCffLi:
//     ,L0000000000000GG0000G00CG00000000GLCGGLL1i1G0Gttft;;1ffLLCCCfCCffL;.
//      ,t0000000000000G000GGGGGGGGGGG00000CCGGtii1G0G1ffi;i1i;;;i11tffLLt:
//        ;C0000000000000GGGG00000000GG00000GG0Lii1G0Ltff;;itCLf1;;;;;;;;;.
//         .iLGG00000000000000000000000G00000GL1iiiCGtLLt;;;;1CGGL1;;;;;;:
//            ,:;i1tfLLLLCCCCCCCCCCLLLLftt11i:.....,,it1:,,,,,;tLCCfi;;::.
//                      ............                            .,:::..

public class CreateTable {
    public static void main(String[] args) {
        Connection c = null;
        String dbName = "user.db";
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:" + dbName);
            stmt = c.createStatement();
            String sql = "CREATE TABLE COMPANY"+
                    "(ID INT PRIMANY KEY NOT NULL,"+
                    "NAME TEXT NOT NULL,"+
                    "AGE INT NOT NULL,"+
                    "ADDRESS CHAR(50),"+
                    "SALARY REAL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error No Library org.sqlite.JDBC");
            System.exit(0);
        } catch (SQLException ex) {
            System.out.println("Unable to connection database");
            System.exit(0);
        }

    }
}
