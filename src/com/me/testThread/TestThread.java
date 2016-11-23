package com.me.testThread;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.me.beans.HelloWorld;
import com.me.beans.Persom;
import com.me.config.AppConfig;
import com.me.myinterface.Hello;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	HelloWorld hello=(HelloWorld)context.getBean("helloworld");
	hello.sayHello();
	}

	
	
}
