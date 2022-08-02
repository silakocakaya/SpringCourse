package annotationConfig.importtag;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ConfigA import edildigi icin config B uzerinden A'ya da erisilebilmektedir.
 * 
 *
 */
@Configuration
@Import(ConfigA.class)
public class ConfigB {

	@Bean
	public B b() {
		return new B();
	}
}
