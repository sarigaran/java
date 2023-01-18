package jdbc.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class jdbc_1 {
	public static void main(String[] args){
 String dburl="jdbc:mysql://localhost:3306/company"; 
 String dbuser="phpmyadmin";
 String dbpass="tamil";
 try {
	 	 Connection con=DriverManager.getConnection(dburl,dbuser,dbpass);
	 String query="select * from labour";
	 PreparedStatement pst=con.prepareStatement(query);
	 ResultSet rs=pst.executeQuery();
	 while(rs.next()) {
		 int id=rs.getInt(1);
		 String fname=rs.getString(2);
		 String lname=rs.getString(3);
		 
		 String jd=rs.getString(4);
		 String dept=rs.getString(5);
		 double salary=rs.getDouble(6);
		 
		 System.out.println(id+"\t"+fname+"\t"+lname+"\t"+jd+"\t"+dept+"\t"+salary);
	 }
	 System.out.println("--------------end--------------");
	 con.close();
 }
 catch(SQLException  e) {
	 
	 System.out.println("Reason"+e);
 }
 
	}

}
