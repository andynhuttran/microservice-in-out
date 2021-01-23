package com.ms.springactuator.actuator;

import com.ms.springactuator.dto.StageDTO;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id="stage")
public class StageEndpoint {
    Map<String, StageDTO> map = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, StageDTO> getAllMap(){
        System.out.println("Run in getAllMap()");
        return this.map;
    }

    @ReadOperation
    public StageDTO getStage(@Selector String key){
        System.out.println("Run in getStage()");
        System.out.println("\tkey: " + key);

        return map.get(key);
    }

    @WriteOperation
    public void addStage(String key, String id, int status){
        StageDTO stage = new StageDTO(id, status);
        System.out.println("In addStage, stage: " + stage);
        map.put(key, stage);
    }

}
