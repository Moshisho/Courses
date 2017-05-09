package io.moshe.spring.first.assignment;

import io.moshe.spring.first.assignment.api.Dashboard;
import io.moshe.spring.first.assignment.api.Engine;
import io.moshe.spring.first.assignment.impl.MazdaDashboard;
import org.springframework.beans.factory.annotation.Autowired;

public class Car {

    @Autowired
    public Dashboard dashboard;

    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getEngine(){
        return this.engine.toString();
    }
}
