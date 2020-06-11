package com.nt.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.DateAndTimeGenerator;


public class Test {

	public static void main(String[] args) {

		Resource res=null;
		DateAndTimeGenerator generator=null;
		BeanFactory  factory=null;
		Object obj=null;
		try {
			
			 res=new FileSystemResource("src/com/nt/cfg/applicationContext.xml");
			 factory=new XmlBeanFactory(res);
			 obj=factory.getBean("dnt");
			  generator=(DateAndTimeGenerator) obj;
			 String result= generator.getDate("anvee");
			  System.out.println(result);
			  System.out.println(generator.printData());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
