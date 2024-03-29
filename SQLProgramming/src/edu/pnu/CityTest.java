package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CityTest {
// 이 코드 전체 암기 , 구현 순서 
	public static void main(String[] args) {

		Connection con = null;
		try {
//			jdbc 사용하겠다고 드라이브를 로딩하는거 , // mysql  jdbc 데이터베이스를 쓰게끔해줌
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://Localhost:3306/world";
			String username = "scott";
			String password = "1234";

			Class.forName(driver); // JDBC 드라이버 로딩
//			DriverManager 는 getConnection 을 사용하기 위한 용도 = 연결을 위함
			con = DriverManager.getConnection(url, username, password); // DBMS 서버와 접속

			Statement st = con.createStatement(); // SQL문 실행
			ResultSet rs = st.executeQuery("select id, name, countrycode, district, population from city limit 10");

			while (rs.next()) {
				System.out.println(rs.getString("id") + ",");
				System.out.println(rs.getString("name") + ",");
				System.out.println(rs.getString("countrycode") + ",");
				System.out.println(rs.getString("district") + ",");
				System.out.println(rs.getString("population") + ",");
			}
			// 자원 해재
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		}
	}
}