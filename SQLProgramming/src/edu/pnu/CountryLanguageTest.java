package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CountryLanguageTest {

	public static void main(String[] args) {

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/world", "scott", "1234");

			Statement st = con.createStatement();
			ResultSet rs = st
					.executeQuery("select countryCode, Language, isofficial, percentage from countrylanguage limit 10");

			while (rs.next()) {
				System.out.print(rs.getString("countryCode") + ",");
				System.out.print(rs.getString("Language") + ",");
				System.out.print(rs.getString("isofficial") + ",");
				System.out.print(rs.getString("percentage") + ",");
			}
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		}
	}
}
