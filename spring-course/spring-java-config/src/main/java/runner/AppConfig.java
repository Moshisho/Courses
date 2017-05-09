package runner;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses= {						
						widgets.IWidget.class
						//,widgets.Config.class
						,tools.ToolsConfig.class
			  })
public class AppConfig {

}
