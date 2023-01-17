
package javapractice.jdbc_sqlite;

import java.sql.*;
import java.util.Scanner;

public class dml_queries {
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        PreparedStatement stm = con.prepareStatement("update dept set dName=? where deptNo=?");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE DATA : ");
        stm.setString(1,sc.nextLine());
        stm.setInt(2, sc.nextInt());
        stm.executeUpdate();
        Statement s = con.createStatement();
        
        ResultSet rs = s.executeQuery("select * from dept");
        
        while(rs.next())
        {
            System.out.println(rs.getString(1)+" "+rs.getInt(2));
        }
        rs.close();
        s.close();
        stm.close();
    }
}
