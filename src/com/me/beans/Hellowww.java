package com.me.beans;

import org.springframework.stereotype.Service;

import com.me.myinterface.Hello;
@Service("hellowww")
public class Hellowww implements Hello {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("ÄãºÃ");
	}

}
