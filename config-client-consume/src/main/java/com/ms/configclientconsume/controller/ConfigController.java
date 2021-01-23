package com.ms.configclientconsume.controller;

import com.ms.configclientconsume.dto.ProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    ProfileConfiguration configuration;

    @GetMapping("/configurations")
    public ProfileConfiguration getConfig(){
        return configuration;
    }
}
