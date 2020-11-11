package com.kg.myapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		AbstractApplicationContext con = 
				new GenericXmlApplicationContext("app-config.xml");
		HelloController controller = con.getBean(HelloController.class);
		controller.sayHello("정제헌");
		con.close();
	}

}
