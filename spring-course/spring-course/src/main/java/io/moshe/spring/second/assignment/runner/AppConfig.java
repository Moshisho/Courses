package io.moshe.spring.second.assignment.runner;

import io.moshe.spring.second.assignment.Messegner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = { io.moshe.spring.second.assignment.Encryptor.class, io.moshe.spring.second.assignment.runner.AppConfig.class})
public class AppConfig {

    @Bean
    public Messegner messegner(){
        return new Messegner();
    }

}
