package classmapping;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
	public static Connection con() {
        java.sql.Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://ec2-3-216-113-109.compute-1.amazonaws.com/d17ine1i00j9d8","jirwafpelqqjpi","788d1e3bd8f63ddcc2271617e38c24639b7ddac4eb5739667f7ced5ffa220239");          
        } catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}

