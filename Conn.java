
package cms;
import java.sql.*;

public class Conn {
    public static void main(String ar[]){
       Connection c=null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("1");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3308/cms","root","");
        System.out.println("2");
        String q="insert into students(st_id,name)values(97190025,'Shivam')";
        PreparedStatement p=c.prepareStatement(q);
        p.executeUpdate();
        
        
        }
        catch(Exception e){System.out.println(e);}
       try{ c.close();} catch(Exception e){System.out.println(e);}
    }
    }
