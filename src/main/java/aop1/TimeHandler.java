package aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TimeHandler {
	public void printTime() {
		System.out.println("CurrentTime = " + System.currentTimeMillis());
	}
	
	public static void main(String[] args)
	{
	    ApplicationContext ctx = 
	            new ClassPathXmlApplicationContext("aop.xml");
	        
	    Hello hw1 = (Hello)ctx.getBean("helloImpl1");
	    Hello hw2 = (Hello)ctx.getBean("helloImpl2");
	    hw1.printHelloWorld();
	    System.out.println();
	    hw1.doPrint();
	    
	    System.out.println();
	    hw2.printHelloWorld();
	    System.out.println();
	    hw2.doPrint();
	}
}
