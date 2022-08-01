package helloworld.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldParentApp {

	public static void main(String[] args) {
		System.out.println("---ClassPathXmlApplicationContext");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.getMessage();
		helloWorld.getMessage2();;
		
		System.out.println("-----");
		HelloWorldIndia helloWorldIndia = (HelloWorldIndia) context.getBean("helloWorldIndia");
		helloWorldIndia.getMessage();
		helloWorldIndia.getMessage2();
		helloWorldIndia.getMessage3();
	}
}
