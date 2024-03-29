package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class CountryTest {

	public static void main(String[] args) {

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/world", "scott", "1234");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from country");
			// sysout 맣고 for 문 사용해서 출력하는 방법
			ResultSetMetaData meta = rs.getMetaData();
			int count = meta.getColumnCount();
			while (rs.next()) {// next를 하는 순간에 rs에서 값을 불려옴
				for (int i = 1; i <= count; i++) {
					System.out.print(rs.getString(i) + ((i == count) ? "" : ",")); // getString = 불론 값을 호출함
				}
				System.out.println();
			}
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		}
	}
}
