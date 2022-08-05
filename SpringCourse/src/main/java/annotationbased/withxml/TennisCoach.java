package annotationbased.withxml;

import org.springframework.stereotype.Component;

/**
 * 
 * tennisCoach default beanId'dir, yeni bir beanId verilerek ezilmistir.
 *
 */
@Component("tennisCoachNewBeanId")
public class TennisCoach implements Coach {

	public String getDailyWorkout() {
		return "TennisCoach getDailyWorkout";
	}

	public String getDailyFortune() {
		return "TennisCoach getDailyFortune";
	}


}
