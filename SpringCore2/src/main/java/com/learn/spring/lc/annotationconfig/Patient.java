package com.learn.spring.lc.annotationconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient   {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@PostConstruct
	public void hi()
	{
		System.out.println("Inside Hie Function within Patient Class");
	}
	@PreDestroy
	public void bye()
	{
		System.out.println("Inside Bye Function within Patient Class");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}


}
