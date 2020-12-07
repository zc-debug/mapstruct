package com.example.mapstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(scanBasePackages = {"com.example.mapstruct"})
public class MapstructApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapstructApplication.class, args);
    }

}
