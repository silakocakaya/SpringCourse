package annotationbased.withxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContextAnnotationBased.xml");
		
		TennisCoach tennisCoach = (TennisCoach) applicationContext.getBean("tennisCoachNewBeanId", Coach.class);
		
		System.out.println(tennisCoach.getDailyFortune());
		applicationContext.close();
	}
}
