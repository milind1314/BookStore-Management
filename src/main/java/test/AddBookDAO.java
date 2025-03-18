package test;

import java.sql.*;

public class AddBookDAO {

	public static BookStoreBean add(int id,String name,String aT,float price,int qty)
	{
		Connection con = DBConnection.getcon();
		BookStoreBean bk = null;

		try(con) {
			PreparedStatement ps = con.prepareStatement("insert into bookstore values(?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, aT);
			ps.setFloat(4, price);
			ps.setInt(5, qty);
			
			int k = ps.executeUpdate();
			
			if(k>0)
			{
				bk = new BookStoreBean();
				bk.setId(id);;
				bk.setName(name);
				bk.setAuthor(aT);
				bk.setPrice(price);
				bk.setQty(qty);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bk;
		
	}
}
