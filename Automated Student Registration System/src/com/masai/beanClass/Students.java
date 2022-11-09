package com.masai.beanClass;

import java.util.Objects;

public class Students {

	
	private String semail;
	private String spassword;
	private String sname;
	
	
	public Students(String semail, String spassword, String sname) {
		super();
		this.semail = semail;
		this.spassword = spassword;
		this.sname = sname;
	}


	public String getSemail() {
		return semail;
	}


	public void setSemail(String semail) {
		this.semail = semail;
	}


	public String getSpassword() {
		return spassword;
	}


	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	@Override
	public String toString() {
		return "Students [semail=" + semail + ", spassword=" + spassword + ", sname=" + sname + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(semail, sname, spassword);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(semail, other.semail) && Objects.equals(sname, other.sname)
				&& Objects.equals(spassword, other.spassword);
	}
	
	
	
}
