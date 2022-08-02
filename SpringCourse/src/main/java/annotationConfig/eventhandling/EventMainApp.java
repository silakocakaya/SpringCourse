package annotationConfig.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventMainApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(EventConfig.class);
		
		applicationContext.start();
		applicationContext.getBean(HelloWorld.class).getMessage();
		applicationContext.stop();
	}
}
