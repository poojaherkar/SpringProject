package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Answer;
import com.model.Qustion;

public class App {
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		Qustion Que1=(Qustion)context.getBean("question");
		
		
		Que1.display();
	}

}
