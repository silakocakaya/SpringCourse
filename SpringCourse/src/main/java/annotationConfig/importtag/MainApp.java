package annotationConfig.importtag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigB.class);
		
		A a = applicationContext.getBean(A.class);
		B b = applicationContext.getBean(B.class);
	}

}
