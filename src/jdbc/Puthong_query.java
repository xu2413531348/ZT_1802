package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Puthong_query {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection lianjie=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.1:3306/jdbc","root","123456789");
		Statement yuju=lianjie.createStatement();
		String sql="select * from tb_user";
		ResultSet rs=yuju.executeQuery(sql);
		System.out.print("id | name | sex");
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			System.out.println(id+"   |    "+name+"   |    "+sex);
			
			
		}
		

	}

}
