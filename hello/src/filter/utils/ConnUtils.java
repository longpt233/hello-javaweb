package filter.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtils {
 
    public static Connection getConnection() throws SQLException,ClassNotFoundException{
 
        // Tạo một Connection (kết nối) tới Database.
       // Connection conn = null;
 
        // .....
        //return conn;
    	 String hostName = "localhost"; 
         String database = "Simplehr";
         String userName = "root";
         String password = "root";
         
         System.out.println("call get ");
     
         return getConnection(hostName, database,
                 userName, password);
    }
    public static Connection getConnection(String hostName,  String database, String userName,
            String password) throws ClassNotFoundException, SQLException {
        // Khai báo class Driver cho DB SQLServer
        // Việc này cần thiết với Java 5
        // Java6 tự động tìm kiếm Driver thích hợp.
        // Nếu bạn dùng Java6, thì ko cần dòng này cũng được.
       // Class.forName("com.mysql.jdbc.Driver");
    
     // Cấu trúc URL Connection dành cho Oracle
        // Ví dụ: jdbc:mysql://localhost:3306/simplehr
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + database;
    
        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }
 
    public static void closeQuietly(Connection conn) {
        try {
            conn.close();
        } catch (Exception e) {
        }
    }
 
    public static void rollbackQuietly(Connection conn) {
        try {
            conn.rollback();
        } catch (Exception e) {
        }
    }
}