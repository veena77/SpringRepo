package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
	}

}
