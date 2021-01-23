package com.ms.springactuator.controller;

import com.ms.springactuator.dto.GreetingDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public ResponseEntity<GreetingDTO> greeting(){
        GreetingDTO greetingDTO =  new GreetingDTO("Hello Microservice Universal");
        return ResponseEntity.ok(greetingDTO);
    }
}
