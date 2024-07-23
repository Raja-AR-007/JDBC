import java.sql.*;

class StudentDAO{
	public void getStudent(int rollno) {
		try {
			String query="Select sname from student where rollNo="+rollno;
			Student s2=new Student();
			s2.rollno=rollno;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud2?characterEncoding=latin1","root","@Raja007");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String name=rs.getString(1);
			System.out.println(name);
			System.out.println(s2.rollno);
			st.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}		
	}
}
class Student{
	int rollno;
	String sname;
}
public class _5_Fetching_particular_data_using_DAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO dao=new StudentDAO();
		dao.getStudent(11);
	}
}


/*
	public static void main(String[] args)throws Exception {
		int rollno=11;
		String query="Select sname from student where rollNo="+rollno;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud2?characterEncoding=latin1","root","@Raja007");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString(1);
		System.out.println(name);
		st.close();
		con.close();
	}
}
*/

/*
class StudentDAO{
	public void getName(int rollno)throws Exception {
			String query="Select sname from student where rollNo="+rollno;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud2?characterEncoding=latin1","root","@Raja007");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String name=rs.getString(1);
			System.out.println(name);
			st.close();
			con.close();	
	}
}
public class _5_Fetching_particular_data {

public static void main(String[] args)throws Exception {
	StudentDAO dao=new StudentDAO();
	dao.getName(11);
}
}
*/

/*
class StudentDAO{
	public void getName(int rollno) {
			try {
			String query="Select sname from student where rollNo="+rollno;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud2?characterEncoding=latin1","root","@Raja007");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			
			String name1=rs.getString(1);
			System.out.println(name1);
			
			st.close();
			con.close();
			}catch(Exception e) {
				System.out.println(e);
			}	
	}
}

public class _5_Fetching_particular_data {

public static void main(String[] args) {
	StudentDAO dao=new StudentDAO();
	dao.getName(12);
}

}*/