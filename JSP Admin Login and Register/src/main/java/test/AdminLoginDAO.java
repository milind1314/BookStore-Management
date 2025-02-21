package test;

import java.sql.*;

public class AdminLoginDAO {
	
	public AdminBean login(String uN, String pW) {
		
		Connection con = DBConnection.getcon();
		AdminBean ab =null;
		
		try(con) {
			PreparedStatement ps = con.prepareStatement("select * from AdminDemo where USERNAME=? and PASSWORD=?");
			ps.setString(1, uN);
			
			ps.setString(2, pW);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				ab = new AdminBean();

				ab.setUname(rs.getString(1));
				ab.setPass(rs.getString(2));
				ab.setFname(rs.getString(3));
				ab.setLname(rs.getString(4));
				ab.setMail(rs.getString(5));
				ab.setMobNo(rs.getLong(6));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(ab);
		return ab;
	}

}
