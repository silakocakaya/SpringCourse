package javaconfig.properties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * HappyFortuneService component olmadigi icin autowire edemeyiz
 *
 */
@Component
public class TennisCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	
	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneServiceSad;
	
	// define a default constructor
	public TennisCoach() {
	}
	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return fortuneServiceSad.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
