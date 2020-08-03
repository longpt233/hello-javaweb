package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
 
public class ConnUtis {
 
  public static Connection getMyConnection() throws SQLException,
          ClassNotFoundException { 
      // Bạn có thể thay thế bởi Database nào đó.
      return MySQLConn.getMySQLConnection();
  }
 
  //
  // Test Connection ...
  //
  public static void main(String[] args) throws SQLException,
          ClassNotFoundException {
 
      System.out.println("Get connection ... ");
 
      // Lấy ra đối tượng Connection kết nối vào database.
      Connection conn = ConnUtis.getMyConnection();
 
      System.out.println("Get connection " + conn);
 
      System.out.println("Done!");
  }
 
}
