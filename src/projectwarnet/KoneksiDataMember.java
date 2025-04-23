package projectwarnet;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class KoneksiDataMember {
    
    private static Connection mysqlconfig;
    private static Statement stmt;
    public static Connection configDB() throws  SQLException {
        
        try {
            String url = "jdbc:mysql://localhost:3306/dbclient";
            String username = "root";
            String password = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, username, password);
            stmt = (Statement) mysqlconfig.createStatement();
            System.out.println("Koneksi Berhasil");
            
            
        } catch (Exception e){
            System.out.println("Koneksi Gagal "+e.getMessage());
        }
        return mysqlconfig;
    }
}
