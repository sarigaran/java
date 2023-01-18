package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class j_234 {
	public static void main(String[] args) {
		 String dburl="jdbc:mysql://localhost:3306/school"; 
		 String dbuser="root";
		 String dbpass="GhR6R3#h";
		 try {
			 	 Connection con=DriverManager.getConnection(dburl,dbuser,dbpass);
			 String query="select * from student";
			 PreparedStatement pst=con.prepareStatement(query);
			 ResultSet rs=pst.executeQuery();
			 while(rs.next()) {
				 int id=rs.getInt(1);
				 String name=rs.getString(2);
				 String dept=rs.getString(3);
				 int yop=rs.getInt(4);
				 double percentage=rs.getDouble(5);
				 
				 System.out.println(id+"\t"+name+"\t"+dept+"\t"+yop+"\t"+percentage);
			 }
			 System.out.println("--------------end--------------");
			 con.close();
		 }
		 catch(SQLException  e) {
			 
			 System.out.println("Reason"+e);
		 }
		 
			}

		}
	


