
import java.sql.*;


public class DbHelper {
    private String username = "root";
    private String password = "12345";
    private String dbUrl = "jdbc:mysql://localhost:3306/workers";

    
    public Connection getConnectin()throws SQLException{

        return DriverManager.getConnection(dbUrl,username,password);
        
      }
    
    public void showErrorMessage(SQLException exception){
        
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error code: " + exception.getErrorCode());
        
    
    }


}



