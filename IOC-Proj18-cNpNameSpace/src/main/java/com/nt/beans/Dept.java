package com.nt.beans;

import java.util.Date;

public class Dept {

	private int deptNo;
	private String name;
	private Date dop;
	public Dept(int deptNo, String name, Date dop) {
		super();
		this.deptNo = deptNo;
		this.name = name;
		this.dop = dop;
	}
	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", name=" + name + ", date=" + dop + "]";
	}
	
	
}
