package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");  
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin");
		
		Statement stm = con.createStatement();
		//InsertQuery
		stm.executeUpdate("insert into eproduct(name,price,date_added)values('Tablet','3000',now())");
		ResultSet result = stm.executeQuery("select * from eproduct");
		
		System.out.println("Product Name"+"\t Price");
		while(result.next()) {
			
			System.out.println(result.getString("name")+"\t"+ result.getString("price"));
			
		}
		
		con.close();
	
	
	}
}
