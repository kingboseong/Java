package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; // 이걸로 클래스명하니까 오류났음. 다르게 만들기
import java.sql.ResultSet;

public class QueryByPreparedStatement {

	public static void main(String[] args) {

		Connection con = null;
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://Localhost:3306/world";
			String username = "scott";
			String password = "1234";

			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);

			PreparedStatement pt = con.prepareStatement(
					"select id, name, countrycode, district, population from city where name=? countryCode=?");
			pt.setString(1, "Seoul");
			pt.setString(1, "KOR");
			ResultSet rs = pt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("id") + ",");
				System.out.println(rs.getString("name") + ",");
				System.out.println(rs.getString("countrycode") + ",");
				System.out.println(rs.getString("district") + ",");
				System.out.println(rs.getInt("population") + "\n");
			}
			rs.close();
			pt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		}
	}
}
