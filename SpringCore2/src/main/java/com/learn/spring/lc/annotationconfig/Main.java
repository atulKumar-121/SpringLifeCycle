package com.learn.spring.lc.annotationconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new  ClassPathXmlApplicationContext("com/learn/spring/lc/annotationconfig/config.xml");
		Patient pat=(Patient) ctx.getBean("pat");
		System.out.println(pat.toString());
		ctx.registerShutdownHook();
		 
	}

}
