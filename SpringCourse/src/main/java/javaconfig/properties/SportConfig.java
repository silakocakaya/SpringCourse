package javaconfig.properties;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("javaconfig.properties")
@PropertySource("classpath:sport.properties")
public class SportConfig {

}
