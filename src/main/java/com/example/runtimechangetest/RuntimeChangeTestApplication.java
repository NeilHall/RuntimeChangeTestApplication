package com.example.runtimechangetest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class RuntimeChangeTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RuntimeChangeTestApplication.class, args);
    }
}
