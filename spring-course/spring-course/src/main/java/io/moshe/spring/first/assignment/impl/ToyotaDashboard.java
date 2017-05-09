package io.moshe.spring.first.assignment.impl;

import io.moshe.spring.first.assignment.api.Dashboard;
import org.springframework.stereotype.Component;

//@Component this creates exception since there's more than one component.
// can be solved by using @Bean and return the wanted implementation.
//@Scope("prototype") - creates new instance for every getBean.
//@Qualifier("myQualifier") can solve it too and in the @Autowired field use this qualifier too.
public class ToyotaDashboard implements Dashboard {

    @Override
    public String toString(){
        return "Toyota Dash...";
    }
}
