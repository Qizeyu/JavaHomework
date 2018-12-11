import java.sql.DriverManager;
import java.sql.SQLException;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.util.JDBCutil;

public class MainTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			
			//1.注册驱动
			
			//2.建立连接：协议+访问的数据库，参数2：用户名，参数3：密码
			conn = JDBCutil.getConn();
			System.out.println("连接成功");
			//3.创建statement，跟数据库打交道，一定需要这个对象
			st = (Statement) conn.createStatement();
			//4.执行查询，得到结果集
			String sql = "select * from student";
			rs = st.executeQuery(sql);
			while(rs.next())
				{
					String Sno = rs.getString("Sno");
					String Sname = rs.getString("Sname");
					String Ssex = rs.getString("Ssex");
					int Sage = rs.getInt("Sage");
					String sdept = rs.getString("sdept");
					System.out.println("Sno:"+Sno+" Sname:"+Sname+" Ssex: "+Ssex+" Sage："+Sage+" sdept："+sdept);
					
				}
			
		}catch(SQLException ex)
		{
				System.out.println("SQLException: " + ex.getMessage());
			    System.out.println("SQLState: " + ex.getSQLState());
			    System.out.println("VendorError: " + ex.getErrorCode());
		}finally{
			//5.查询完毕，关闭连接
		}
		JDBCutil.release(conn, rs, st);
		 System.out.println("连接关闭");
	}	
}


	
