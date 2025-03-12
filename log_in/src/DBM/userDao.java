package DBM;

import java.sql.SQLException;

public class userDao extends userDb{
	
	public boolean loginIp(String uId, String uPw) {
		string sql= "select * from " xx where 
				
				
		try {
			st =conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				return true;
			}
			
			
		}catch(SQLException e) {
			System.out.println( "계정 조회 실패");
			e.printStackTrace();
		}
	}

	
}
