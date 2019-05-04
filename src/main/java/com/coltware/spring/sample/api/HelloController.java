package com.coltware.spring.sample.api;

import com.coltware.spring.sample.model.WorldModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    WorldModel model;

    @GetMapping(value = "/world")
    public WorldModel world(){
        return model;
    }

    @PostMapping(value = "/world")
    public WorldModel setWorld(@RequestBody WorldModel world){
        model.setValue(world.getValue());
        log.info("set value : {}",model.getValue());
        return world;
    }
}