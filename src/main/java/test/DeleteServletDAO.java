package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteServletDAO {

	public static int delete(int bookId) {

		Connection con = DBConnection.getcon();
		
		try {
			PreparedStatement pr  = con.prepareStatement("DELETE FROM bookstore WHERE bookid = ?");
			
			pr.setInt(1, bookId);
			
			int k = pr.executeUpdate();
			
			if (k>0) {
				return k;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	
	}

}
