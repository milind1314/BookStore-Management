package test;

import java.sql.*;

public class RegisterServletDAO {

	public AdminBean register(String uN,String pW,String fN,String lN,String mI, Long mN)
	{
		Connection con = DBConnection.getcon();
		AdminBean ab = null;

		try(con) {
			PreparedStatement ps = con.prepareStatement("insert into AdminDemo values(?,?,?,?,?,?)");
			ps.setString(1, uN);
			ps.setString(2, pW);
			ps.setString(3, fN);
			ps.setString(4, lN);
			ps.setString(5, mI);
			ps.setLong(6, mN);
			
			int k = ps.executeUpdate();
			
			if(k>0)
			{
				ab = new AdminBean();
				ab.setUname(uN);
				ab.setPass(pW);
				ab.setFname(fN);
				ab.setLname(lN);
				ab.setMail(mI);
				ab.setMobNo(mN);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ab;
		
	}
}
