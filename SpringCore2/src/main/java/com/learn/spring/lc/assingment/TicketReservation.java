package com.learn.spring.lc.assingment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TicketReservation [id=" + id + "]";
	}
	
	@PostConstruct
	public void initialize()
	{
		System.out.println("Inside Initialize");
	}
	
	@PreDestroy
	public void cleanUp()
	{
		System.out.println("Inside Clean Up");
	}

}
