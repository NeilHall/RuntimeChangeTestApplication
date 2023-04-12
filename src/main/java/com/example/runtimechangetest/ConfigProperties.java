package com.example.runtimechangetest;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties(prefix = "agent")
@Configuration
public class ConfigProperties {
    private String value;
}

