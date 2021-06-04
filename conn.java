package hotel.management.system;
import java.sql.*;
public class conn {
	
	
	
	Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///projecthms","root","Imran@123"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  



//	Statement s;
//	Connection c;
//	public conn()throws Exception{
//		
//		String url = "jdbc:mysql://localhost:3306/projecthms";
//		String Username = "root";
//		String Password = "Imran@123";
//		String q = "SELECT * FROM login";
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		 c =DriverManager.getConnection(url,Username,Password);
//		 s = c.createStatement();
//	    ResultSet rs =  s.executeQuery(q);
////	    rs.next();
////	    String name = rs.getString("username");
////	    System.out.println(name);
//	    s.close();
//	    c.close();
//	}
//}