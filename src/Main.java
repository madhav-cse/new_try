//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/sample";
    private static final String pass = "Madhav@120403";
    private static final String user = "root";

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            String qry = "SELECT * FROM customers";
            ResultSet rs = stmt.executeQuery(qry);
            while(rs.next()){
                System.out.println(rs.getInt("id")+"  "+rs.getString("name"));
            }
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}