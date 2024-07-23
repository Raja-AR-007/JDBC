/*
7 steps to JDBC

1. import sql package
2. Load & Register the drive
3. Create Connection
4. Create statements
5. Execute the query
6. Process the result
7. Close Connection 

*/
import java.sql.*;
public class _1_Fetching_single_data{
    public static void main(String []args)throws Exception{
    	
    	String url="jdbc:mysql://localhost:3306/stud?characterEncoding=latin1";
    	String userName="root";
    	String pass="@Raja007";
    	String query="select name from student where s_no=1"; 
    	
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con = DriverManager.getConnection(url, userName, pass);
    	Statement st= con.createStatement();
    	ResultSet rs= st.executeQuery(query);
    	
    	rs.next();
    	
    	String name1=rs.getString("sname"); // or getString(1)
    	
    	System.out.println(name1);
    	st.close();
    	con.close();
    	
    }
}
