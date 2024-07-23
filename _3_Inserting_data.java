import java.sql.*;
public class _3_Inserting_data {

	public static void main(String[] args)throws Exception {
		/*
		// executeUpdate() Method
		String url="jdbc:mysql://localhost:3306/stud2?characterEncoding=latin1";
		String userName="root";
		String pass="@Raja007";
		String query="insert into student2 values(2,'gokulraj')";
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection(url, userName, pass);
		Statement s=c.createStatement();
		int insertQuery=s.executeUpdate(query);
		
		System.out.println(insertQuery+" row/s affected");
		
		s.close();
		c.close();
		*/
		
		/*
		String url="jdbc:mysql://localhost:3306/stud2?characterEncoding=latin1";
		String userName="root";
		String pass="@Raja007";
		
		int rollNo=3;
		String sname="kavin";
		
		String query="insert into student2 values("+rollNo+",'"+sname+"')"; // worst way if we have 10 columns
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection(url, userName, pass);
		Statement s=c.createStatement();
		int insertQuery=s.executeUpdate(query);
		
		System.out.println(insertQuery+" row/s affected");
		
		s.close();
		c.close();
		*/
		
		// PreparedStatement interface
		
		String url="jdbc:mysql://localhost:3306/stud2?characterEncoding=latin1";
		String userName="root";
		String pass="@Raja007";
		
		int rollNo=14;
		String sname="kavi";
		
		String query="insert into student values(?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection(url, userName, pass);
		PreparedStatement ps=c.prepareStatement(query);
		ps.setInt(1, rollNo);
		ps.setString(2, sname);
		int insertQuery=ps.executeUpdate();
		
		System.out.println(insertQuery+" row/s affected");
		
		ps.close();
		c.close();
		
	}

}
