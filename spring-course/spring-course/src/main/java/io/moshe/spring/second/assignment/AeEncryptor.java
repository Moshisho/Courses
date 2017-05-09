package io.moshe.spring.second.assignment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary - also works
@Qualifier("preferred")
public class AeEncryptor implements Encryptor {

    @Override
    public String encrypt(String toEncrypt) {
        return toEncrypt.replaceAll("A", "X");
    }
}
