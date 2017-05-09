package io.moshe.spring.second.assignment.runner;

import io.moshe.spring.second.assignment.Messegner;
import io.moshe.spring.second.assignment.Rot13Encryptor;
import io.moshe.spring.second.assignment.Secured;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Messegner messegner = context.getBean(io.moshe.spring.second.assignment.Messegner.class);

        System.out.println(messegner.encryptor.encrypt("AAA FFF GGG NNN"));

        Annotation annotation = Rot13Encryptor.class.getAnnotation(Secured.class);
        System.out.println(annotation.toString());

    }
}
