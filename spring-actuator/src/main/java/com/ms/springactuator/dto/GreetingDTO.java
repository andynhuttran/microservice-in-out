package com.ms.springactuator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class GreetingDTO {

    public GreetingDTO(String msg){
        this.message = msg;
    }

    private String message;
    private LocalDateTime timestamp = LocalDateTime.now();


}
