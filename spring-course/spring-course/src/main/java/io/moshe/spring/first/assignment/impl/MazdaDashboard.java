package io.moshe.spring.first.assignment.impl;

import io.moshe.spring.first.assignment.api.Dashboard;
import org.springframework.stereotype.Component;

@Component
public class MazdaDashboard implements Dashboard {

    @Override
    public String toString(){
        return "Mazda Dashboard Component success!";
    }
}
