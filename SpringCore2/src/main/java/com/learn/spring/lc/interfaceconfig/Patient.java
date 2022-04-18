package com.learn.spring.lc.interfaceconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {
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

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Using Interface Inside afterPropertiesSet()");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Using Interface Inside Destroy");
	}
}
