package tools;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ToolsConfig {	
	
	@Bean
	Toolbox acme(){
		return new Toolbox();
	}
	
	@Bean
	Toolbox spring(){
		return new Toolbox("Java Spring");
	}
}
