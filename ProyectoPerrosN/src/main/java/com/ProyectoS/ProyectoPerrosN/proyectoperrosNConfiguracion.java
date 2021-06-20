package com.ProyectoS.ProyectoPerrosN;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class proyectoperrosNConfiguracion {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
