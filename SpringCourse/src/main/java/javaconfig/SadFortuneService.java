package javaconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * prototype scope'unda destroy methodu otomatik cagrilmiyor.
 * Ek islemler gerekiyor.
 * 
 *
 */
@Component
@Scope("prototype")
public class SadFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is a sad day";
	}
	
	@PostConstruct
	public void runPostConstruct() {
		System.out.println();
		System.out.println("---SadFortuneService PostConstruct");
	}
	
	@PreDestroy
	public void runPreDestroy() {
		System.out.println();
		System.out.println("--SadFortuneService PreDestroy");
	}
	
	

}
