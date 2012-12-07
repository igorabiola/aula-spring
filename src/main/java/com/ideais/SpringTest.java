package com.ideais;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Estagiario estagiario =  (Estagiario) context.getBean("estagiario");
		
		System.out.println( estagiario.getName() );
	}

}

