package mySQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	
		Connection set= DriverManager.getConnection("jdbc:mysql://localhost:3306/viyaan", "root", "suresh123");
		Statement s= set.createStatement();
		
		ResultSet rs= s.executeQuery("select name,subjects,marks from students where name='suresh'");
		rs.next();
		
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("subjects"));
		System.out.println(rs.getString("marks"));

	}

}
