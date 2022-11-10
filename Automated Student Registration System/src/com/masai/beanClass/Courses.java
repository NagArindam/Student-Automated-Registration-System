package com.masai.beanClass;

import java.util.Objects;

public class Courses {

	private int cid;
	private String cname;
	private int cfees;
	private String cinformation;
	
	public Courses(int cid, String cname, int cfees, String cinformation) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfees = cfees;
		this.cinformation = cinformation;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCfees() {
		return cfees;
	}

	public void setCfees(int cfees) {
		this.cfees = cfees;
	}

	public String getCinformation() {
		return cinformation;
	}

	public void setCinformation(String cinformation) {
		this.cinformation = cinformation;
	}

	@Override
	public String toString() {
		return "Courses [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + ", cinformation=" + cinformation + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cfees, cid, cinformation, cname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courses other = (Courses) obj;
		return cfees == other.cfees && cid == other.cid && Objects.equals(cinformation, other.cinformation)
				&& Objects.equals(cname, other.cname);
	}
	
	
}
