package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin");
		Statement stm=con.createStatement();
		//UpdateQuery
		stm.executeUpdate("update eproduct set name='TV' where ID=1");
		
		ResultSet result=stm.executeQuery("select * from eproduct");
		System.out.println("Name"+"\t Price");
		while(result.next()) {
			
			System.out.println(result.getString("name")+"\t"+ result.getString("price"));
			
		}
		con.close();
	
	
	}

}
