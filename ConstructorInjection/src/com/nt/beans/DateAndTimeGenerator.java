package com.nt.beans;

import java.util.Date;

public class DateAndTimeGenerator {

	private Date date;
	private String user;
	public DateAndTimeGenerator(Date date) {
		System.out.println("1-param");
		this.date=date;
	}
	public DateAndTimeGenerator(Date date,String user) {
		System.out.println("2-param");
		this.date=date;
		this.user=user;
	}

	public void setDate(Date date) {
		System.out.println("set method");
		this.date=date;
	}
	public void setUser(String user) {
		System.out.println("set method");
		this.user=user;
	}
	
	public String getDate(String user) {
		
		return "Hello "+user+", this is todays Date and Time "+date;
	}
	public String printData() {
		return "***"+user+"****"+date;
	}
}
