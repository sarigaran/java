package jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
 String dburl="jdbc:mysql://localhost:3306/javademodb"; 
 String dbuser="root";
 String dbpass="";
 try {
	 Connection con=DriverManager.getConnection(dburl,dbuser,dbpass);
	 String query="select * from product";
	 PreparedStatement pst=con.prepareStatement(query);
	 ResultSet rs=pst.executeQuery();
	 while(rs.next()) {
		 int empid=rs.getInt(1);
		 String empname=rs.getString(2);
		 String empdept=rs.getString(3);
		 String emplocation=rs.getString(4);
		 System.out.println(emplocation+"\t"+empname+"\t"+empdept+"\t"+emplocation);
	 }
	 System.out.println("--------------end--------------");
	 con.close();
 }
 catch(SQLException e) {
	 
	 System.out.println("Reason"+e);
 }
 
	}

}
