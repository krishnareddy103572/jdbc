package com.example.demo.jdbc;
import java.sql.*; //1.importing package

public class JDBCDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url ="jdbc:mysql://localhost:3306/interviewisghts";
		String uname ="root";
		String password ="Welcome@123";
		String query ="select * from project";
		Class.forName("com.mysql.cj.jdbc.Driver"); //2.Load and Register the connection
		Connection con = DriverManager.getConnection(url,uname,password);//3.Establish connection
		Statement st = con.createStatement();	//4.Creating statement
		//st.executeQuery(query);//5.execution of statement
		
		ResultSet rs = st.executeQuery(query); //6.Processing the statement
		//String userData="";
		while(rs.next()) {
			String userData1 = rs.getString(2)+":"+rs.getString(4);
			System.out.println(userData1);
		}
		
		
		
		
		st.close();//7.close 
		con.close();
	}

}
