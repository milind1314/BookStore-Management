package test;

import java.sql.*;

import java.util.*;

public class ViewAllBooksDAO {

	public ArrayList<BookStoreBean> al = new ArrayList<BookStoreBean>();
	
	public ArrayList<BookStoreBean> retrive()
	{
		try {
			Connection con = DBConnection.getcon();
			
			PreparedStatement ps = con.prepareStatement("select * from Bookstore");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				BookStoreBean bs = new BookStoreBean();
				
				bs.setId(rs.getInt(1));
				bs.setName(rs.getString(2));
				bs.setAuthor(rs.getString(3));
				bs.setPrice(rs.getFloat(4));
				bs.setQty(rs.getInt(5));
				al.add(bs);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
