import java.sql.*;
public class _2_Fetching_whole_data {

	public static void main(String[] args)throws Exception {
		/*
    	String url="jdbc:mysql://localhost:3306/stud?characterEncoding=latin1";
		String userName="root";
		String pass="@Raja007";
		String query="select * from student";
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection(url, userName, pass);
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery(query);
		
		String data1="";
		rs.next();
		data1=rs.getInt(s_no)+":"+rs.getString("sname");
		System.out.println(data1);
		
		rs.next();
		data1=rs.getInt(s_no)+":"+rs.getString("sname");
		System.out.println(data1);
		
		rs.next();
		data1=rs.getInt(s_no)+":"+rs.getString("sname");
		System.out.println(data1);
		
		s.close();
		c.close();
		*/
		
		// using while loop to avoid repeated lines 
		
		String url="jdbc:mysql://localhost:3306/stud?characterEncoding=latin1";
		String userName="root";
		String pass="@Raja007";
		String query="select * from student";
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection(url, userName, pass);
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery(query);
		
		String data1="";
		
		while(rs.next()) {
//		data1=rs.getInt("s_no")+" : "+rs.getString("sname");
		data1=rs.getInt(1)+" : "+rs.getString(2);
		System.out.println(data1);
		}
		
		s.close();
		c.close();
	}

}
