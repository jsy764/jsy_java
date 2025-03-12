package DBM;

import java.sql.*;

public class userDb {

	protected Connection conn;
	protected Statement st;
	protected ResultSet rs;
	
	protected userDb() {
		connection();
	}
	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "jsy9845";
			String password ="1234";
			String url = "jdbc:mysql://localhost:3306/jsy9845";
			
			try {
				conn=DriverManager.getConnection(url,user,password);
				
			}	catch (SQLException e) {
				System.out.println( "유저 접속 실패");
				e.printStackTrace();
			}
		}	catch(ClassNotFoundException e) {
				System.out.println("드라이버 실패");
				e.printStackTrace();
			}
		
		}
}




