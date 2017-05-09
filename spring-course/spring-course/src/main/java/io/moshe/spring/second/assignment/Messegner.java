package io.moshe.spring.second.assignment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import java.io.OutputStream;

//@Component - would make the Bean annotation in config redundant.
public class Messegner {

    @Autowired
//    @Qualifier("preferred")
    public Encryptor encryptor;

    private OutputStream outputStream;

}
