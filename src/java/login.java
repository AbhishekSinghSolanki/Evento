import java.sql.*;  

public class login {
    public static boolean validate(String username,String password){  
        boolean status=false;  
        try{    
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/evento", "root", "root");
        PreparedStatement ps=con.prepareStatement("select * from login where username=? and password=?");  
        ps.setString(1,username);  
        ps.setString(2,password);  
      
        ResultSet rs=ps.executeQuery();  
        status=rs.next();
        }
        catch(Exception e){System.out.println(e);}  
        return status;
    }  
}
