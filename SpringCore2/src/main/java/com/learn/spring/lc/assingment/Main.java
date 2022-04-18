package com.learn.spring.lc.assingment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/lc/assingment/config.xml");
		TicketReservation ticket=(TicketReservation) ctx.getBean("ticket");
		System.out.println(ticket.toString());;
		ctx.registerShutdownHook();
	}

}
