package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class KORPopulation {

	public static void main(String[] args) {

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/world", "scott", "1234");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select countrycode, name, population " + "from city "
					+ "where countrycode = 'KOR' " + "order by population desc");
			ResultSetMetaData meta = rs.getMetaData();
			int count = meta.getColumnCount();

			while (rs.next()) {
				for (int i = 1; i <= count; i++) {
					System.out.println(rs.getString(i) + ((i == count) ? "" : ","));
				}
				System.out.println();
			}
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
