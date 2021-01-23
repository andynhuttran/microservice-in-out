package com.ms.springactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.http.HttpServlet;

@SpringBootApplication
public class SpringActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringActuatorApplication.class, args);
    }

}
