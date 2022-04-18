package com.learn.spring.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void hi()
	{
		System.out.println("Inside Hie Function within Patient Class");
	}
	public void bye()
	{
		System.out.println("Inside Bye Function within Patient Class");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
