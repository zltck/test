package com.me.testThread;

public class A  extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			System.out.println(this.getName()+"  "+i);
		}

	
  }
}
