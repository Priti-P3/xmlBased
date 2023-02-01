package com.app.spring.xmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		Employee e = (Employee) context.getBean("manager");
		e.work();
    }
}
