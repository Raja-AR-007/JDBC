import java.sql.*;

public class _4_forName_concept {
public static void main(String []args) throws Exception {
	//Prt obj=new Prt();
	//Class.forName("Prt"); // Loding class only that is 'Ptr'
	Class.forName("Prt").newInstance(); // it is to execute 'instance block'
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	
	//Class.forName("com.mysql.jdbc.Driver");
}
}

class Prt{
	// 'static block' will execute only when the class load
	static {
		System.out.println("In static");
	}
	// 'instance block' will execute when the constructor created
	{
		System.out.println("In instance");
	}
}