package annotationConfig.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * Asagidaki gibi xmlConfig yerine kullanilir
 * <beans>
 * <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" />
 * </beans>
 * 
 */
@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
