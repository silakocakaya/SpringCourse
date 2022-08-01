package xmlconfig.helloworld;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyBeanApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorldInitDestroy");
		helloWorld.getMessage();
		
		context.registerShutdownHook();
	}
}
