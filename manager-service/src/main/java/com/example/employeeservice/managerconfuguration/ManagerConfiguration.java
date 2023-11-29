package com.example.employeeservice.managerconfuguration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManagerConfiguration {


    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
