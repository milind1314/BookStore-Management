package test;

import java.io.*;

@SuppressWarnings("serial")
public class AdminBean implements Serializable {
	
	
	private String uname,pass,fname,lname,mail;
	private Long mobNo;
	
	
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Long getMobNo() {
		return mobNo;
	}
	public void setMobNo(Long mobNo) {
		this.mobNo = mobNo;
	}
	
	@Override
	public String toString() {
		return "AdminBean [uname=" + uname + ", pass=" + pass + ", fname=" + fname + ", lname=" + lname + ", mail="
				+ mail + ", mobNo=" + mobNo + "]";
	}

}
