package exmethod;

import java.sql.*;

public class DBConnect {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnect() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			st = con.createStatement();
			
		}catch(Exception ex) {
			System.out.println("Eror: "+ex);
		}
	}
	
	public void getData() {
		try{
			String query = "select * from customers";
			rs =st.executeQuery(query);
			System.out.println("Records from Database");
			
			while(rs.next()) {
				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
				System.out.println("Name: "+name+"   "+"lastname: "+lastname);
			}
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
