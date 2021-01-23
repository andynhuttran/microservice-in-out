package com.ms.configclientconsume.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ProfileConfiguration {

    @Autowired
    private Environment environment;

    public String getUid(){
        return environment.getProperty("database.username");
    }

    public String getPwd(){
        return environment.getProperty("database.password");
    }

    public String getLength(){
        return environment.getProperty("order.value.length");
    }



}
