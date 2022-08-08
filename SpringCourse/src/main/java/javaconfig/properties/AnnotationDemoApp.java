package javaconfig.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		TennisCoach tennisCoach = (TennisCoach) context.getBean("tennisCoach", Coach.class);
		
		System.out.println("Name: " + tennisCoach.getName() + " Email: " + tennisCoach.getEmail());
				
		// close the context
		context.close();	
	}

}


