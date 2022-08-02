package annotationConfig.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class HelloWorldMainApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
		applicationContext.close();
	}
}
