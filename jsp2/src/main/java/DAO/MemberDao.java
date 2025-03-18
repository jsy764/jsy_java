package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {
	
	private Connection conn;
	private PreparedStatement pt;
	private ResultSet rs;
	
	public MemberDao() {
		connect();
	}
	private void connect() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user= "jsy9845";
			String password= "1234";
			String url="jdbc:mysql://210.219.170.244:3306/jsy9845";
			conn=DriverManager.getConnection(url, user, password);
		}catch(Exception e){
			System.out.println("드라이버 로드 실패 및 접속 실패");
			e.printStackTrace();	
		}
	}
}
