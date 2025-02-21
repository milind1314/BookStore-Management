package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateBookDAO {

	public static boolean update(int bookId, String bookName, String bookAuthorName, double price, int qty) {

		Connection con = DBConnection.getcon();
		try {
			PreparedStatement ps = con.prepareStatement("select * from Bookstore where BOOKID = ? ");
			ps.setInt(1, bookId);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				
				PreparedStatement pr = con.prepareStatement("update Bookstore set BOOKNAME = ?,BOOKAUTHOR = ?, BOOKPRICE = ?, BOOKQTY = ? where BOOKID = ?");
				
				pr.setString(1, bookName);
				pr.setString(2, bookAuthorName);
				pr.setDouble(3, price);
				pr.setInt(4, qty);
				pr.setInt(5, bookId);
				
				int k = pr.executeUpdate();
				
				if (k>0) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
