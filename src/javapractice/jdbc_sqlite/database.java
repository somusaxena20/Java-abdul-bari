
package javapractice.jdbc_sqlite;

import java.sql.*;
import java.util.Scanner;

public class database {
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        PreparedStatement stm = con.prepareStatement("select * from students where deptNo=?");
        System.out.println("ENTER DEPT NUMBER : ");
        stm.setInt(1, new Scanner(System.in).nextInt());
        ResultSet rs = stm.executeQuery();
        System.out.println("ROLL NO : NAME : CITY : DEPT");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
        }
        rs.close();
        stm.close();
        
        
    }
}
