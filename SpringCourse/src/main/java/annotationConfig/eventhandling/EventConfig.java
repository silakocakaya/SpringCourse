package annotationConfig.eventhandling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfig {

	@Bean
	public CStartEventHandler cStartEventHandler() {
		return new CStartEventHandler();
	}
	
	@Bean
	public CStopEventHandler cStopEventHandler() {
		return new CStopEventHandler();
	}
	
	@Bean
	public HelloWorld helloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Annotation Hello!");
		return helloWorld;
		
	}
}
