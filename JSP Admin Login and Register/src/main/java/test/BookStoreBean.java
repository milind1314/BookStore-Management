package test;

import java.io.*;

@SuppressWarnings("serial")
public class BookStoreBean implements Serializable{

	private String name,author;
	private Integer id,qty;
	private Float price;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "BookStoreBean [name=" + name + ", author=" + author + ", id=" + id + ", qty=" + qty + ", price=" + price
				+ "]";
	}
	
	
	
}
