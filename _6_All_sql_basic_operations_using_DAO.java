import java.sql.*;

public class _6_All_sql_basic_operations_using_DAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO2 dao=new StudentDAO2();
		Student2 s1=new Student2();
//		s1.rollno=15;
//		s1.sname="gpala krishnan";
//		dao.connect();
//		dao.addStudent(s1);
		
//		dao.connect();
//		dao.getStudent(13);
		
//		dao.connect();
//		dao.deleteStudent(13);
		
//		dao.connect();
//		dao.selectAllStudent();
		
		dao.connect();
		dao.selectSingleStudent();
	}
}
class StudentDAO2{
	Connection con=null;
	public void connect() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud2?characterEncoding=latin1","root","@Raja007");
		} catch(Exception ex) {
			System.out.println(ex);
		}
	}
	public void getStudent(int rollno) {
		try {
			String query="Select sname from student where rollNo="+rollno;
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String name=rs.getString(1);
			System.out.println(name);
		}
		catch(Exception e) {
			System.out.println(e);
		}		
	}
	
	public void addStudent(Student2 s1) {
		String query="insert into student values(?,?)";
		PreparedStatement pst;
		try {			
			pst=con.prepareStatement(query);
			pst.setInt(1, s1.rollno);
			pst.setString(2, s1.sname);
			int insertQuery =pst.executeUpdate();
			System.out.println(insertQuery+" row affected");
		} catch(Exception ex) {
			System.out.println(ex);
		}
	}
	public void deleteStudent(int rollno) {
		try {
		String query="delete from student where rollNo="+rollno;
		Statement st=con.createStatement();
		int deleteQuery=st.executeUpdate(query);
		System.out.println(deleteQuery+" row affected");
		st.close();
		con.close();
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
	public void selectAllStudent() {
		try {
		String query="select * from student";	
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String data1="";
		
		while(rs.next()) {
//		data1=rs.getInt("s_no")+" : "+rs.getString("sname");
		data1=rs.getInt(1)+" : "+rs.getString(2);
		System.out.println(data1);
		}		
		st.close();
		con.close();
		} catch(Exception ex) {
			System.out.println(ex);
		}
	}
	public void selectSingleStudent() {
		try {
    	String query="select sname from student where rollNo=11"; 
    	Statement st= con.createStatement();
    	ResultSet rs= st.executeQuery(query);
    	
    	rs.next();
    	
    	String name1=rs.getString("sname"); // or getString(1)
    	
    	System.out.println(name1);
    	st.close();
    	con.close();
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
}
class Student2{
	int rollno;
	String sname;
}
