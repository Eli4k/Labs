package finalLab.dbLink;
import java.sql.*;
import java.io.*;



public class conProcess{
	private static Connection con = null;
		static String driver = "com.mysql.jdbc.Driver";
	 	static String connectionUrl = "jdbc:mysql://localhost:3306/aiti_kaceattendance";
	 	static String userName = "root";
	 	static String pwd = "";

	static {
		
			try{
				Class.forName(driver).newInstance();
				con=DriverManager.getConnection(connectionUrl, userName, pwd);
			}catch(Exception e){
				System.out.print(e);
			}
	}
	public static Connection getCon(){
		return con;
	}
}