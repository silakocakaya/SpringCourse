package annotationBased.qualifiers;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 
 * HappyFortuneService component olmadigi icin autowire edemeyiz
 *
 */
@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneServiceSad;
	
	@PostConstruct
	public void runPostConstruct() {
		System.out.println("TennisCoach PostConstruct");
	}
	
	@PreDestroy
	public void runPreDestroy() {
		System.out.println("TennisCoach PreDestroy");
	}
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		System.out.println("SadFortune: " + fortuneServiceSad.getFortune());
		return fortuneService.getFortune();
	}

}
