package com.coltware.spring.sample.config;

import com.coltware.spring.sample.model.WorldModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfiguration {

    @Value("${sample.world:World}")
    String world;

    @Bean
    public WorldModel worldModel(){
        WorldModel model =  new WorldModel();
        model.setValue(world);
        return model;
    }
}
