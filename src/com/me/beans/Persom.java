package com.me.beans;

import com.me.myinterface.Hello;

public class Persom {
	
	
	private Hello hello;


	public Persom() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Persom(Hello hello) {
		// TODO Auto-generated constructor stub
		this.hello=hello;
	}
	

	public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}
	
	public void sayHello(){
		this.hello.sayHello();
		
		
	}
	
}
