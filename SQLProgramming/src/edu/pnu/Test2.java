package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Statement st = null;
		ResultSet rs = null;

		// 데이터베이스 연결 객체 가져오기
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306.world", "scott", "tiger")) {

			st = con.createStatement();
			rs = st.executeQuery("select Name,Population form city there CountryCode='KOR' order by population desc");
			while (rs.next()) {
				System.out.println(rs.getString("Name") + "," + rs.getInt("Population"));
			}
		} catch (Exception e) {
			try {
				st.close();
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}

//기본 틀
//Connection con;
//Statement st;
//ResultSet rs;
//
//while(rs.next()) {
//	
//}
//
//st.close();
//rs.close();
