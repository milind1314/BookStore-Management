package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static Connection con = null;
	
	private DBConnection() {}
	
	static
	{
		try {
			Class.forName(DBInfo.driver);
			con = DriverManager.getConnection(DBInfo.dburl,DBInfo.dbuser,DBInfo.dbpass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getcon() {
	    try {
	        if (con == null || con.isClosed()) {
	            Class.forName(DBInfo.driver);
	            con = DriverManager.getConnection(DBInfo.dburl, DBInfo.dbuser, DBInfo.dbpass);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return con;
	}

}
